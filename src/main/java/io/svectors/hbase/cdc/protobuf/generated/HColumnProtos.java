// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HColumn.proto

package io.svectors.hbase.cdc.protobuf.generated;

import com.google.protobuf.AbstractMessage;

public final class HColumnProtos {
  private HColumnProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface HColumnOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional bytes family = 1;
    /**
     * <code>optional bytes family = 1;</code>
     */
    boolean hasFamily();
    /**
     * <code>optional bytes family = 1;</code>
     */
    com.google.protobuf.ByteString getFamily();

    // optional bytes qualifier = 2;
    /**
     * <code>optional bytes qualifier = 2;</code>
     */
    boolean hasQualifier();
    /**
     * <code>optional bytes qualifier = 2;</code>
     */
    com.google.protobuf.ByteString getQualifier();

    // optional uint64 timestamp = 3;
    /**
     * <code>optional uint64 timestamp = 3;</code>
     */
    boolean hasTimestamp();
    /**
     * <code>optional uint64 timestamp = 3;</code>
     */
    long getTimestamp();

    // optional bytes value = 4;
    /**
     * <code>optional bytes value = 4;</code>
     */
    boolean hasValue();
    /**
     * <code>optional bytes value = 4;</code>
     */
    com.google.protobuf.ByteString getValue();
  }
  /**
   * Protobuf type {@code HColumn}
   *
   * <pre>
   **
   * Protocol buffer of each HColumn.
   * </pre>
   */
  public static final class HColumn extends
      com.google.protobuf.GeneratedMessage
      implements HColumnOrBuilder {
    // Use HColumn.newBuilder() to construct.
    private HColumn(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private HColumn(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final HColumn defaultInstance;
    public static HColumn getDefaultInstance() {
      return defaultInstance;
    }

    public HColumn getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private HColumn(
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
            case 10: {
              bitField0_ |= 0x00000001;
              family_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              qualifier_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              timestamp_ = input.readUInt64();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              value_ = input.readBytes();
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
      return HColumnProtos.internal_static_HColumn_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HColumnProtos.internal_static_HColumn_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HColumn.class, Builder.class);
    }

    public static com.google.protobuf.Parser<HColumn> PARSER =
        new com.google.protobuf.AbstractParser<HColumn>() {
      public HColumn parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HColumn(input, extensionRegistry);
      }
    };

    @Override
    public com.google.protobuf.Parser<HColumn> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional bytes family = 1;
    public static final int FAMILY_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString family_;
    /**
     * <code>optional bytes family = 1;</code>
     */
    public boolean hasFamily() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional bytes family = 1;</code>
     */
    public com.google.protobuf.ByteString getFamily() {
      return family_;
    }

    // optional bytes qualifier = 2;
    public static final int QUALIFIER_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString qualifier_;
    /**
     * <code>optional bytes qualifier = 2;</code>
     */
    public boolean hasQualifier() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bytes qualifier = 2;</code>
     */
    public com.google.protobuf.ByteString getQualifier() {
      return qualifier_;
    }

    // optional uint64 timestamp = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    private long timestamp_;
    /**
     * <code>optional uint64 timestamp = 3;</code>
     */
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional uint64 timestamp = 3;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }

    // optional bytes value = 4;
    public static final int VALUE_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString value_;
    /**
     * <code>optional bytes value = 4;</code>
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional bytes value = 4;</code>
     */
    public com.google.protobuf.ByteString getValue() {
      return value_;
    }

    private void initFields() {
      family_ = com.google.protobuf.ByteString.EMPTY;
      qualifier_ = com.google.protobuf.ByteString.EMPTY;
      timestamp_ = 0L;
      value_ = com.google.protobuf.ByteString.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, family_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, qualifier_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt64(3, timestamp_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, value_);
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
          .computeBytesSize(1, family_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, qualifier_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, timestamp_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, value_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    protected Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof HColumn)) {
        return super.equals(obj);
      }
      HColumn other = (HColumn) obj;

      boolean result = true;
      result = result && (hasFamily() == other.hasFamily());
      if (hasFamily()) {
        result = result && getFamily()
            .equals(other.getFamily());
      }
      result = result && (hasQualifier() == other.hasQualifier());
      if (hasQualifier()) {
        result = result && getQualifier()
            .equals(other.getQualifier());
      }
      result = result && (hasTimestamp() == other.hasTimestamp());
      if (hasTimestamp()) {
        result = result && (getTimestamp()
            == other.getTimestamp());
      }
      result = result && (hasValue() == other.hasValue());
      if (hasValue()) {
        result = result && getValue()
            .equals(other.getValue());
      }
      result = result &&
          getUnknownFields().equals(other.getUnknownFields());
      return result;
    }

    private int memoizedHashCode = 0;
    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasFamily()) {
        hash = (37 * hash) + FAMILY_FIELD_NUMBER;
        hash = (53 * hash) + getFamily().hashCode();
      }
      if (hasQualifier()) {
        hash = (37 * hash) + QUALIFIER_FIELD_NUMBER;
        hash = (53 * hash) + getQualifier().hashCode();
      }
      if (hasTimestamp()) {
        hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getTimestamp());
      }
      if (hasValue()) {
        hash = (37 * hash) + VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getValue().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static HColumn parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HColumn parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HColumn parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HColumn parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HColumn parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HColumn parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static HColumn parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static HColumn parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static HColumn parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HColumn parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(HColumn prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code HColumn}
     *
     * <pre>
     **
     * Protocol buffer of each HColumn.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements HColumnOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HColumnProtos.internal_static_HColumn_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HColumnProtos.internal_static_HColumn_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HColumn.class, Builder.class);
      }

      // Construct using com.sv.hbase.cdc.protobuf.generated.HColumnProtos.HColumn.newBuilder()
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
        family_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        qualifier_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        timestamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        value_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HColumnProtos.internal_static_HColumn_descriptor;
      }

      public HColumn getDefaultInstanceForType() {
        return HColumn.getDefaultInstance();
      }

      public HColumn build() {
        HColumn result = buildPartial();
        if (!result.isInitialized()) {
          throw AbstractMessage.Builder.newUninitializedMessageException(result);
        }
        return result;
      }

      public HColumn buildPartial() {
        HColumn result = new HColumn(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.family_ = family_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.qualifier_ = qualifier_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.timestamp_ = timestamp_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.value_ = value_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof HColumn) {
          return mergeFrom((HColumn)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HColumn other) {
        if (other == HColumn.getDefaultInstance()) return this;
        if (other.hasFamily()) {
          setFamily(other.getFamily());
        }
        if (other.hasQualifier()) {
          setQualifier(other.getQualifier());
        }
        if (other.hasTimestamp()) {
          setTimestamp(other.getTimestamp());
        }
        if (other.hasValue()) {
          setValue(other.getValue());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        HColumn parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HColumn) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional bytes family = 1;
      private com.google.protobuf.ByteString family_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes family = 1;</code>
       */
      public boolean hasFamily() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional bytes family = 1;</code>
       */
      public com.google.protobuf.ByteString getFamily() {
        return family_;
      }
      /**
       * <code>optional bytes family = 1;</code>
       */
      public Builder setFamily(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        family_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes family = 1;</code>
       */
      public Builder clearFamily() {
        bitField0_ = (bitField0_ & ~0x00000001);
        family_ = getDefaultInstance().getFamily();
        onChanged();
        return this;
      }

      // optional bytes qualifier = 2;
      private com.google.protobuf.ByteString qualifier_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes qualifier = 2;</code>
       */
      public boolean hasQualifier() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional bytes qualifier = 2;</code>
       */
      public com.google.protobuf.ByteString getQualifier() {
        return qualifier_;
      }
      /**
       * <code>optional bytes qualifier = 2;</code>
       */
      public Builder setQualifier(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        qualifier_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes qualifier = 2;</code>
       */
      public Builder clearQualifier() {
        bitField0_ = (bitField0_ & ~0x00000002);
        qualifier_ = getDefaultInstance().getQualifier();
        onChanged();
        return this;
      }

      // optional uint64 timestamp = 3;
      private long timestamp_ ;
      /**
       * <code>optional uint64 timestamp = 3;</code>
       */
      public boolean hasTimestamp() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional uint64 timestamp = 3;</code>
       */
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>optional uint64 timestamp = 3;</code>
       */
      public Builder setTimestamp(long value) {
        bitField0_ |= 0x00000004;
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 timestamp = 3;</code>
       */
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000004);
        timestamp_ = 0L;
        onChanged();
        return this;
      }

      // optional bytes value = 4;
      private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes value = 4;</code>
       */
      public boolean hasValue() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional bytes value = 4;</code>
       */
      public com.google.protobuf.ByteString getValue() {
        return value_;
      }
      /**
       * <code>optional bytes value = 4;</code>
       */
      public Builder setValue(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes value = 4;</code>
       */
      public Builder clearValue() {
        bitField0_ = (bitField0_ & ~0x00000008);
        value_ = getDefaultInstance().getValue();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:HColumn)
    }

    static {
      defaultInstance = new HColumn(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:HColumn)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_HColumn_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_HColumn_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\rHColumn.proto\"N\n\007HColumn\022\016\n\006family\030\001 \001" +
      "(\014\022\021\n\tqualifier\030\002 \001(\014\022\021\n\ttimestamp\030\003 \001(\004" +
      "\022\r\n\005value\030\004 \001(\014B9\n#com.sv.hbase.cdc.prot" +
      "obuf.generatedB\rHColumnProtosH\001\240\001\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_HColumn_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_HColumn_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_HColumn_descriptor,
              new String[] { "Family", "Qualifier", "Timestamp", "Value", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
