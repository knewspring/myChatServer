// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: heartBeat.proto

package com.tao.protobuf.message.othres.heartbeat;

public final class Heartbeat {
  private Heartbeat() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code MsgType}
   */
  public enum MsgType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Ping = 1;</code>
     */
    Ping(0, 1),
    /**
     * <code>Pong = 2;</code>
     */
    Pong(1, 2),
    ;

    /**
     * <code>Ping = 1;</code>
     */
    public static final int Ping_VALUE = 1;
    /**
     * <code>Pong = 2;</code>
     */
    public static final int Pong_VALUE = 2;


    public final int getNumber() { return value; }

    public static MsgType valueOf(int value) {
      switch (value) {
        case 1: return Ping;
        case 2: return Pong;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MsgType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<MsgType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MsgType>() {
            public MsgType findValueByNumber(int number) {
              return MsgType.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.tao.protobuf.message.othres.heartbeat.Heartbeat.getDescriptor().getEnumTypes().get(0);
    }

    private static final MsgType[] VALUES = values();

    public static MsgType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private MsgType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MsgType)
  }

  public interface HeartOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Heart)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .MsgType type = 1;</code>
     */
    boolean hasType();
    /**
     * <code>required .MsgType type = 1;</code>
     */
    com.tao.protobuf.message.othres.heartbeat.Heartbeat.MsgType getType();
  }
  /**
   * Protobuf type {@code Heart}
   */
  public static final class Heart extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Heart)
      HeartOrBuilder {
    // Use Heart.newBuilder() to construct.
    private Heart(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Heart(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Heart defaultInstance;
    public static Heart getDefaultInstance() {
      return defaultInstance;
    }

    public Heart getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Heart(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              com.tao.protobuf.message.othres.heartbeat.Heartbeat.MsgType value = com.tao.protobuf.message.othres.heartbeat.Heartbeat.MsgType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                type_ = value;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tao.protobuf.message.othres.heartbeat.Heartbeat.internal_static_Heart_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tao.protobuf.message.othres.heartbeat.Heartbeat.internal_static_Heart_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart.class, com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart.Builder.class);
    }

    public static com.google.protobuf.Parser<Heart> PARSER =
        new com.google.protobuf.AbstractParser<Heart>() {
      public Heart parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Heart(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Heart> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private com.tao.protobuf.message.othres.heartbeat.Heartbeat.MsgType type_;
    /**
     * <code>required .MsgType type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .MsgType type = 1;</code>
     */
    public com.tao.protobuf.message.othres.heartbeat.Heartbeat.MsgType getType() {
      return type_;
    }

    private void initFields() {
      type_ = com.tao.protobuf.message.othres.heartbeat.Heartbeat.MsgType.Ping;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, type_.getNumber());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_.getNumber());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Heart}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Heart)
        com.tao.protobuf.message.othres.heartbeat.Heartbeat.HeartOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.tao.protobuf.message.othres.heartbeat.Heartbeat.internal_static_Heart_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.tao.protobuf.message.othres.heartbeat.Heartbeat.internal_static_Heart_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart.class, com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart.Builder.class);
      }

      // Construct using com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        type_ = com.tao.protobuf.message.othres.heartbeat.Heartbeat.MsgType.Ping;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.tao.protobuf.message.othres.heartbeat.Heartbeat.internal_static_Heart_descriptor;
      }

      public com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart getDefaultInstanceForType() {
        return com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart.getDefaultInstance();
      }

      public com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart build() {
        com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart buildPartial() {
        com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart result = new com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart) {
          return mergeFrom((com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart other) {
        if (other == com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasType()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.tao.protobuf.message.othres.heartbeat.Heartbeat.Heart) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.tao.protobuf.message.othres.heartbeat.Heartbeat.MsgType type_ = com.tao.protobuf.message.othres.heartbeat.Heartbeat.MsgType.Ping;
      /**
       * <code>required .MsgType type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .MsgType type = 1;</code>
       */
      public com.tao.protobuf.message.othres.heartbeat.Heartbeat.MsgType getType() {
        return type_;
      }
      /**
       * <code>required .MsgType type = 1;</code>
       */
      public Builder setType(com.tao.protobuf.message.othres.heartbeat.Heartbeat.MsgType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .MsgType type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = com.tao.protobuf.message.othres.heartbeat.Heartbeat.MsgType.Ping;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Heart)
    }

    static {
      defaultInstance = new Heart(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Heart)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Heart_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Heart_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017heartBeat.proto\"\037\n\005Heart\022\026\n\004type\030\001 \002(\016" +
      "2\010.MsgType*\035\n\007MsgType\022\010\n\004Ping\020\001\022\010\n\004Pong\020" +
      "\002B6\n)com.tao.protobuf.message.othres.hea" +
      "rtbeatB\tHeartbeat"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Heart_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Heart_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Heart_descriptor,
        new java.lang.String[] { "Type", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
