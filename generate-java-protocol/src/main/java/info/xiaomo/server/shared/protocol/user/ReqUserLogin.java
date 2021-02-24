// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserMessage.proto

package info.xiaomo.server.shared.protocol.user;

/**
 * Protobuf type {@code ReqUserLogin}
 */
public final class ReqUserLogin extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ReqUserLogin)
    ReqUserLoginOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReqUserLogin.newBuilder() to construct.
  private ReqUserLogin(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReqUserLogin() {
    msgId_ = 0;
    loginName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReqUserLogin();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReqUserLogin(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            msgId_ = rawValue;
            break;
          }
          case 16: {

            sex_ = input.readInt32();
            break;
          }
          case 24: {

            userId_ = input.readInt64();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            loginName_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return info.xiaomo.server.shared.protocol.user.UserMessage.internal_static_ReqUserLogin_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return info.xiaomo.server.shared.protocol.user.UserMessage.internal_static_ReqUserLogin_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            info.xiaomo.server.shared.protocol.user.ReqUserLogin.class, info.xiaomo.server.shared.protocol.user.ReqUserLogin.Builder.class);
  }

  public static final int MSGID_FIELD_NUMBER = 1;
  private int msgId_;
  /**
   * <code>.UserMsgId msgId = 1;</code>
   * @return The enum numeric value on the wire for msgId.
   */
  @java.lang.Override public int getMsgIdValue() {
    return msgId_;
  }
  /**
   * <code>.UserMsgId msgId = 1;</code>
   * @return The msgId.
   */
  @java.lang.Override public info.xiaomo.server.shared.protocol.msg.UserMsgId getMsgId() {
    @SuppressWarnings("deprecation")
    info.xiaomo.server.shared.protocol.msg.UserMsgId result = info.xiaomo.server.shared.protocol.msg.UserMsgId.valueOf(msgId_);
    return result == null ? info.xiaomo.server.shared.protocol.msg.UserMsgId.UNRECOGNIZED : result;
  }

  public static final int SEX_FIELD_NUMBER = 2;
  private int sex_;
  /**
   * <code>int32 sex = 2;</code>
   * @return The sex.
   */
  @java.lang.Override
  public int getSex() {
    return sex_;
  }

  public static final int USERID_FIELD_NUMBER = 3;
  private long userId_;
  /**
   * <code>int64 userId = 3;</code>
   * @return The userId.
   */
  @java.lang.Override
  public long getUserId() {
    return userId_;
  }

  public static final int LOGINNAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object loginName_;
  /**
   * <code>string loginName = 4;</code>
   * @return The loginName.
   */
  @java.lang.Override
  public java.lang.String getLoginName() {
    java.lang.Object ref = loginName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      loginName_ = s;
      return s;
    }
  }
  /**
   * <code>string loginName = 4;</code>
   * @return The bytes for loginName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLoginNameBytes() {
    java.lang.Object ref = loginName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      loginName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (msgId_ != info.xiaomo.server.shared.protocol.msg.UserMsgId.KNOWN.getNumber()) {
      output.writeEnum(1, msgId_);
    }
    if (sex_ != 0) {
      output.writeInt32(2, sex_);
    }
    if (userId_ != 0L) {
      output.writeInt64(3, userId_);
    }
    if (!getLoginNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, loginName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (msgId_ != info.xiaomo.server.shared.protocol.msg.UserMsgId.KNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, msgId_);
    }
    if (sex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, sex_);
    }
    if (userId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, userId_);
    }
    if (!getLoginNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, loginName_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof info.xiaomo.server.shared.protocol.user.ReqUserLogin)) {
      return super.equals(obj);
    }
    info.xiaomo.server.shared.protocol.user.ReqUserLogin other = (info.xiaomo.server.shared.protocol.user.ReqUserLogin) obj;

    if (msgId_ != other.msgId_) return false;
    if (getSex()
        != other.getSex()) return false;
    if (getUserId()
        != other.getUserId()) return false;
    if (!getLoginName()
        .equals(other.getLoginName())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MSGID_FIELD_NUMBER;
    hash = (53 * hash) + msgId_;
    hash = (37 * hash) + SEX_FIELD_NUMBER;
    hash = (53 * hash) + getSex();
    hash = (37 * hash) + USERID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUserId());
    hash = (37 * hash) + LOGINNAME_FIELD_NUMBER;
    hash = (53 * hash) + getLoginName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static info.xiaomo.server.shared.protocol.user.ReqUserLogin parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.user.ReqUserLogin parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.user.ReqUserLogin parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.user.ReqUserLogin parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.user.ReqUserLogin parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.user.ReqUserLogin parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.user.ReqUserLogin parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.user.ReqUserLogin parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.user.ReqUserLogin parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.user.ReqUserLogin parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.user.ReqUserLogin parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.user.ReqUserLogin parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(info.xiaomo.server.shared.protocol.user.ReqUserLogin prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ReqUserLogin}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ReqUserLogin)
      info.xiaomo.server.shared.protocol.user.ReqUserLoginOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return info.xiaomo.server.shared.protocol.user.UserMessage.internal_static_ReqUserLogin_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.xiaomo.server.shared.protocol.user.UserMessage.internal_static_ReqUserLogin_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.xiaomo.server.shared.protocol.user.ReqUserLogin.class, info.xiaomo.server.shared.protocol.user.ReqUserLogin.Builder.class);
    }

    // Construct using info.xiaomo.server.shared.protocol.user.ReqUserLogin.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      msgId_ = 0;

      sex_ = 0;

      userId_ = 0L;

      loginName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return info.xiaomo.server.shared.protocol.user.UserMessage.internal_static_ReqUserLogin_descriptor;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.user.ReqUserLogin getDefaultInstanceForType() {
      return info.xiaomo.server.shared.protocol.user.ReqUserLogin.getDefaultInstance();
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.user.ReqUserLogin build() {
      info.xiaomo.server.shared.protocol.user.ReqUserLogin result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.user.ReqUserLogin buildPartial() {
      info.xiaomo.server.shared.protocol.user.ReqUserLogin result = new info.xiaomo.server.shared.protocol.user.ReqUserLogin(this);
      result.msgId_ = msgId_;
      result.sex_ = sex_;
      result.userId_ = userId_;
      result.loginName_ = loginName_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof info.xiaomo.server.shared.protocol.user.ReqUserLogin) {
        return mergeFrom((info.xiaomo.server.shared.protocol.user.ReqUserLogin)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(info.xiaomo.server.shared.protocol.user.ReqUserLogin other) {
      if (other == info.xiaomo.server.shared.protocol.user.ReqUserLogin.getDefaultInstance()) return this;
      if (other.msgId_ != 0) {
        setMsgIdValue(other.getMsgIdValue());
      }
      if (other.getSex() != 0) {
        setSex(other.getSex());
      }
      if (other.getUserId() != 0L) {
        setUserId(other.getUserId());
      }
      if (!other.getLoginName().isEmpty()) {
        loginName_ = other.loginName_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      info.xiaomo.server.shared.protocol.user.ReqUserLogin parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (info.xiaomo.server.shared.protocol.user.ReqUserLogin) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int msgId_ = 0;
    /**
     * <code>.UserMsgId msgId = 1;</code>
     * @return The enum numeric value on the wire for msgId.
     */
    @java.lang.Override public int getMsgIdValue() {
      return msgId_;
    }
    /**
     * <code>.UserMsgId msgId = 1;</code>
     * @param value The enum numeric value on the wire for msgId to set.
     * @return This builder for chaining.
     */
    public Builder setMsgIdValue(int value) {
      
      msgId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.UserMsgId msgId = 1;</code>
     * @return The msgId.
     */
    @java.lang.Override
    public info.xiaomo.server.shared.protocol.msg.UserMsgId getMsgId() {
      @SuppressWarnings("deprecation")
      info.xiaomo.server.shared.protocol.msg.UserMsgId result = info.xiaomo.server.shared.protocol.msg.UserMsgId.valueOf(msgId_);
      return result == null ? info.xiaomo.server.shared.protocol.msg.UserMsgId.UNRECOGNIZED : result;
    }
    /**
     * <code>.UserMsgId msgId = 1;</code>
     * @param value The msgId to set.
     * @return This builder for chaining.
     */
    public Builder setMsgId(info.xiaomo.server.shared.protocol.msg.UserMsgId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      msgId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.UserMsgId msgId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMsgId() {
      
      msgId_ = 0;
      onChanged();
      return this;
    }

    private int sex_ ;
    /**
     * <code>int32 sex = 2;</code>
     * @return The sex.
     */
    @java.lang.Override
    public int getSex() {
      return sex_;
    }
    /**
     * <code>int32 sex = 2;</code>
     * @param value The sex to set.
     * @return This builder for chaining.
     */
    public Builder setSex(int value) {
      
      sex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 sex = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSex() {
      
      sex_ = 0;
      onChanged();
      return this;
    }

    private long userId_ ;
    /**
     * <code>int64 userId = 3;</code>
     * @return The userId.
     */
    @java.lang.Override
    public long getUserId() {
      return userId_;
    }
    /**
     * <code>int64 userId = 3;</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(long value) {
      
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 userId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      
      userId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object loginName_ = "";
    /**
     * <code>string loginName = 4;</code>
     * @return The loginName.
     */
    public java.lang.String getLoginName() {
      java.lang.Object ref = loginName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        loginName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string loginName = 4;</code>
     * @return The bytes for loginName.
     */
    public com.google.protobuf.ByteString
        getLoginNameBytes() {
      java.lang.Object ref = loginName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        loginName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string loginName = 4;</code>
     * @param value The loginName to set.
     * @return This builder for chaining.
     */
    public Builder setLoginName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      loginName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string loginName = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLoginName() {
      
      loginName_ = getDefaultInstance().getLoginName();
      onChanged();
      return this;
    }
    /**
     * <code>string loginName = 4;</code>
     * @param value The bytes for loginName to set.
     * @return This builder for chaining.
     */
    public Builder setLoginNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      loginName_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ReqUserLogin)
  }

  // @@protoc_insertion_point(class_scope:ReqUserLogin)
  private static final info.xiaomo.server.shared.protocol.user.ReqUserLogin DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new info.xiaomo.server.shared.protocol.user.ReqUserLogin();
  }

  public static info.xiaomo.server.shared.protocol.user.ReqUserLogin getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReqUserLogin>
      PARSER = new com.google.protobuf.AbstractParser<ReqUserLogin>() {
    @java.lang.Override
    public ReqUserLogin parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReqUserLogin(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReqUserLogin> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReqUserLogin> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public info.xiaomo.server.shared.protocol.user.ReqUserLogin getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
