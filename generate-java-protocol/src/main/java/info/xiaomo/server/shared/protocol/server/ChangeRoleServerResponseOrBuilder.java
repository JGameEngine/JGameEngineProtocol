// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServerMessage.proto

package info.xiaomo.server.shared.protocol.server;

public interface ChangeRoleServerResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ChangeRoleServerResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.MsgId msgId = 1;</code>
   * @return The enum numeric value on the wire for msgId.
   */
  int getMsgIdValue();
  /**
   * <code>.MsgId msgId = 1;</code>
   * @return The msgId.
   */
  info.xiaomo.server.shared.protocol.msg.MsgId getMsgId();

  /**
   * <pre>
   *结果 0成功 1角色为登录 2未找到服务器
   * </pre>
   *
   * <code>int32 result = 2;</code>
   * @return The result.
   */
  int getResult();
}
