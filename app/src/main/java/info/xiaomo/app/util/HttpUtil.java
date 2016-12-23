package info.xiaomo.app.util;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import info.xiaomo.app.model.base.Result;
import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;

/**
 * @author 小莫 (https://xiaomo.info) (https://github.com/syoubaku)
 * @version : 2016/6/12 15:15
 */
public class HttpUtil implements HttpLoggingInterceptor.Logger, Interceptor {

    private static final String TAG = "HttpUtil";
    private static HttpUtil mInstance;
    private final Cache cache;
    private Retrofit mRetrofit;
    private Context mContext;
    private static final String BASE_URL = "http://api.xiaomo.info:8080/";
    private Action1<String> onNextAction;

    private HttpUtil(Context context) {
        this.mContext = context;
        createSubscriberByAction();
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd HH:mm:ss")
                .create();
        HttpLoggingInterceptor mHttpLogInterceptor = new HttpLoggingInterceptor(this);
        mHttpLogInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        Interceptor mUrlInterceptor = this;
        File cacheFile = new File(context.getCacheDir(), "HttpCache");
        Log.d(TAG, "cacheFile=====" + cacheFile.getAbsolutePath());
        cache = new Cache(cacheFile, 1024 * 1024 * 100); //100Mb
        OkHttpClient mOkHttpClient = new OkHttpClient.Builder()
                .connectTimeout(12, TimeUnit.SECONDS)
                .writeTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .addInterceptor(mHttpLogInterceptor)
                .addInterceptor(mUrlInterceptor)
                .cache(cache)
                .build();

        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(mOkHttpClient)
                .build();
    }


    /**
     * 获取实例
     *
     * @param context context
     * @return instance
     */
    public static HttpUtil getInstance(Context context) {
        if (mInstance == null) {
            synchronized (HttpUtil.class) {
                if (mInstance == null) {
                    mInstance = new HttpUtil(context);
                }
            }
        }
        return mInstance;
    }

    /**
     * 获取service
     *
     * @param service service
     * @param <T>     T
     * @return T
     */
    public <T> T getAPIService(Class<T> service) {
        return mRetrofit.create(service);
    }

    /**
     * 回调
     *
     * @param call             call
     * @param retrofitCallBack retrofitCallBack
     * @param <D>              <D>
     */
    public <D> void enqueueCall(Call<Result<D>> call, final RetrofitCallBack<D> retrofitCallBack) {
        call.enqueue(new Callback<Result<D>>() {
            @Override
            public void onResponse(Call<Result<D>> call, Response<Result<D>> response) {
                Result<D> resp = response.body();
                if (resp == null) {
                    Toast.makeText(mContext, "暂时没有最新数据!", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (resp.getResultCode() == 200) {
                    if (retrofitCallBack != null)
                        retrofitCallBack.onSuccess(resp);
                } else {
                    if (retrofitCallBack != null)
                        retrofitCallBack.onFailure(resp.getMessage());
                }
            }

            @Override
            public void onFailure(Call<Result<D>> call, Throwable t) {
                if (retrofitCallBack != null) {
                    retrofitCallBack.onFailure(t.toString());
                }
            }
        });
    }

    @Override
    public void log(String message) {
        Log.d(TAG, "OkHttp: " + message);
    }

    @Override
    public okhttp3.Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        //缓存
        if (NetUtil.checkNetwork(mContext) == NetUtil.NO_NETWORK) {
            request = request.newBuilder()
                    .cacheControl(CacheControl.FORCE_CACHE)
                    .build();
            Log.d(TAG, "no network");
        }

        okhttp3.Response response = chain.proceed(request);
        String requestUrl = response.request().url().uri().getPath();
        if (!TextUtils.isEmpty(requestUrl)) {
            if (requestUrl.contains("LoginDataServlet")) {
                if (Looper.myLooper() == null) {
                    Looper.prepare();
                }
                createObservable("现在请求的是登录接口");
            }
        }
        //缓存响应
        if (NetUtil.checkNetwork(mContext) != NetUtil.NO_NETWORK) {
            //有网的时候读接口上的@Headers里的配置，你可以在这里进行统一的设置
            String cacheControl = request.cacheControl().toString();
            Log.d(TAG, "cacheControl=====" + cacheControl);
            return response.newBuilder()
                    .header("Cache-Control", cacheControl)
                    .removeHeader("Pragma")
                    .build();
        } else {
            return response.newBuilder()
                    .header("Cache-Control", "public, only-if-cached, max-stale=120")
                    .removeHeader("Pragma")
                    .build();
        }
    }

    public interface RetrofitCallBack<D> {
        void onSuccess(Result<D> result);

        void onFailure(String error);
    }

    private void createSubscriberByAction() {
        onNextAction = new Action1<String>() {
            @Override
            public void call(String s) {
                Log.d(TAG, "s==========" + s);
                Toast.makeText(mContext, s, Toast.LENGTH_SHORT).show();
            }
        };
    }

    private void createObservable(String msg) {
        Observable.just(msg).map(new Func1<String, String>() {
            @Override
            public String call(String s) {
                return s;
            }
        })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(onNextAction);
    }

    /**
     * 获取缓存
     *
     * @return cache
     */
    public Cache getCache() {
        return cache;
    }

    /**
     * 清除缓存
     *
     * @throws IOException
     */
    public void clearCache() throws IOException {
        cache.delete();
    }
}