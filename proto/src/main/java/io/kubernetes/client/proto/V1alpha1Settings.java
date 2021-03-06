/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.proto;

public final class V1alpha1Settings {
  private V1alpha1Settings() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface PodPresetOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.settings.v1alpha1.PodPreset)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMeta getMetadata();
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.settings.v1alpha1.PodPresetSpec spec = 2;</code>
     */
    boolean hasSpec();
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.settings.v1alpha1.PodPresetSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec getSpec();
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.settings.v1alpha1.PodPresetSpec spec = 2;</code>
     */
    io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpecOrBuilder getSpecOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * PodPreset is a policy resource that defines additional runtime
   * requirements for a Pod.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.settings.v1alpha1.PodPreset}
   */
  public static final class PodPreset extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.settings.v1alpha1.PodPreset)
      PodPresetOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use PodPreset.newBuilder() to construct.
    private PodPreset(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private PodPreset() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private PodPreset(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 10:
              {
                io.kubernetes.client.proto.Meta.ObjectMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ObjectMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = spec_.toBuilder();
                }
                spec_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(spec_);
                  spec_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1alpha1Settings
          .internal_static_k8s_io_api_settings_v1alpha1_PodPreset_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1alpha1Settings
          .internal_static_k8s_io_api_settings_v1alpha1_PodPreset_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1alpha1Settings.PodPreset.class,
              io.kubernetes.client.proto.V1alpha1Settings.PodPreset.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ObjectMeta metadata_;
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int SPEC_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec spec_;
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.settings.v1alpha1.PodPresetSpec spec = 2;</code>
     */
    public boolean hasSpec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.settings.v1alpha1.PodPresetSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec getSpec() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec.getDefaultInstance()
          : spec_;
    }
    /**
     *
     *
     * <pre>
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.settings.v1alpha1.PodPresetSpec spec = 2;</code>
     */
    public io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpecOrBuilder getSpecOrBuilder() {
      return spec_ == null
          ? io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec.getDefaultInstance()
          : spec_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getSpec());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSpec());
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
      if (!(obj instanceof io.kubernetes.client.proto.V1alpha1Settings.PodPreset)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1alpha1Settings.PodPreset other =
          (io.kubernetes.client.proto.V1alpha1Settings.PodPreset) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && (hasSpec() == other.hasSpec());
      if (hasSpec()) {
        result = result && getSpec().equals(other.getSpec());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (hasSpec()) {
        hash = (37 * hash) + SPEC_FIELD_NUMBER;
        hash = (53 * hash) + getSpec().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPreset parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPreset parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPreset parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPreset parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPreset parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPreset parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPreset parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPreset parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPreset parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPreset parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPreset parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPreset parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1alpha1Settings.PodPreset prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * PodPreset is a policy resource that defines additional runtime
     * requirements for a Pod.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.settings.v1alpha1.PodPreset}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.settings.v1alpha1.PodPreset)
        io.kubernetes.client.proto.V1alpha1Settings.PodPresetOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1alpha1Settings
            .internal_static_k8s_io_api_settings_v1alpha1_PodPreset_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1alpha1Settings
            .internal_static_k8s_io_api_settings_v1alpha1_PodPreset_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1alpha1Settings.PodPreset.class,
                io.kubernetes.client.proto.V1alpha1Settings.PodPreset.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1alpha1Settings.PodPreset.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getSpecFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (specBuilder_ == null) {
          spec_ = null;
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1alpha1Settings
            .internal_static_k8s_io_api_settings_v1alpha1_PodPreset_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1alpha1Settings.PodPreset getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1alpha1Settings.PodPreset.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1alpha1Settings.PodPreset build() {
        io.kubernetes.client.proto.V1alpha1Settings.PodPreset result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1alpha1Settings.PodPreset buildPartial() {
        io.kubernetes.client.proto.V1alpha1Settings.PodPreset result =
            new io.kubernetes.client.proto.V1alpha1Settings.PodPreset(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (specBuilder_ == null) {
          result.spec_ = spec_;
        } else {
          result.spec_ = specBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1alpha1Settings.PodPreset) {
          return mergeFrom((io.kubernetes.client.proto.V1alpha1Settings.PodPreset) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1alpha1Settings.PodPreset other) {
        if (other == io.kubernetes.client.proto.V1alpha1Settings.PodPreset.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (other.hasSpec()) {
          mergeSpec(other.getSpec());
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
        io.kubernetes.client.proto.V1alpha1Settings.PodPreset parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1alpha1Settings.PodPreset) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ObjectMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(
          io.kubernetes.client.proto.Meta.ObjectMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ObjectMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ObjectMeta,
                  io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
                  io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec spec_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec,
              io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec.Builder,
              io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpecOrBuilder>
          specBuilder_;
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.settings.v1alpha1.PodPresetSpec spec = 2;</code>
       */
      public boolean hasSpec() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.settings.v1alpha1.PodPresetSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec getSpec() {
        if (specBuilder_ == null) {
          return spec_ == null
              ? io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec.getDefaultInstance()
              : spec_;
        } else {
          return specBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.settings.v1alpha1.PodPresetSpec spec = 2;</code>
       */
      public Builder setSpec(io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec value) {
        if (specBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          spec_ = value;
          onChanged();
        } else {
          specBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.settings.v1alpha1.PodPresetSpec spec = 2;</code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec.Builder builderForValue) {
        if (specBuilder_ == null) {
          spec_ = builderForValue.build();
          onChanged();
        } else {
          specBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.settings.v1alpha1.PodPresetSpec spec = 2;</code>
       */
      public Builder mergeSpec(io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec value) {
        if (specBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && spec_ != null
              && spec_
                  != io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec
                      .getDefaultInstance()) {
            spec_ =
                io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec.newBuilder(spec_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            spec_ = value;
          }
          onChanged();
        } else {
          specBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.settings.v1alpha1.PodPresetSpec spec = 2;</code>
       */
      public Builder clearSpec() {
        if (specBuilder_ == null) {
          spec_ = null;
          onChanged();
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.settings.v1alpha1.PodPresetSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec.Builder getSpecBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSpecFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.settings.v1alpha1.PodPresetSpec spec = 2;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpecOrBuilder getSpecOrBuilder() {
        if (specBuilder_ != null) {
          return specBuilder_.getMessageOrBuilder();
        } else {
          return spec_ == null
              ? io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec.getDefaultInstance()
              : spec_;
        }
      }
      /**
       *
       *
       * <pre>
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.settings.v1alpha1.PodPresetSpec spec = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec,
              io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec.Builder,
              io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpecOrBuilder>
          getSpecFieldBuilder() {
        if (specBuilder_ == null) {
          specBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec,
                  io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec.Builder,
                  io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpecOrBuilder>(
                  getSpec(), getParentForChildren(), isClean());
          spec_ = null;
        }
        return specBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.settings.v1alpha1.PodPreset)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.settings.v1alpha1.PodPreset)
    private static final io.kubernetes.client.proto.V1alpha1Settings.PodPreset DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1alpha1Settings.PodPreset();
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPreset getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<PodPreset> PARSER =
        new com.google.protobuf.AbstractParser<PodPreset>() {
          @java.lang.Override
          public PodPreset parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new PodPreset(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<PodPreset> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PodPreset> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1alpha1Settings.PodPreset getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface PodPresetListOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.settings.v1alpha1.PodPresetList)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMeta getMetadata();
    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * Items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1alpha1Settings.PodPreset> getItemsList();
    /**
     *
     *
     * <pre>
     * Items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
     */
    io.kubernetes.client.proto.V1alpha1Settings.PodPreset getItems(int index);
    /**
     *
     *
     * <pre>
     * Items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
     */
    int getItemsCount();
    /**
     *
     *
     * <pre>
     * Items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1alpha1Settings.PodPresetOrBuilder>
        getItemsOrBuilderList();
    /**
     *
     *
     * <pre>
     * Items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
     */
    io.kubernetes.client.proto.V1alpha1Settings.PodPresetOrBuilder getItemsOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * PodPresetList is a list of PodPreset objects.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.settings.v1alpha1.PodPresetList}
   */
  public static final class PodPresetList extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.settings.v1alpha1.PodPresetList)
      PodPresetListOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use PodPresetList.newBuilder() to construct.
    private PodPresetList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private PodPresetList() {
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private PodPresetList(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 10:
              {
                io.kubernetes.client.proto.Meta.ListMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ListMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  items_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1alpha1Settings.PodPreset>();
                  mutable_bitField0_ |= 0x00000002;
                }
                items_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1alpha1Settings.PodPreset.PARSER,
                        extensionRegistry));
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = java.util.Collections.unmodifiableList(items_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1alpha1Settings
          .internal_static_k8s_io_api_settings_v1alpha1_PodPresetList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1alpha1Settings
          .internal_static_k8s_io_api_settings_v1alpha1_PodPresetList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1alpha1Settings.PodPresetList.class,
              io.kubernetes.client.proto.V1alpha1Settings.PodPresetList.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ListMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * Standard list metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int ITEMS_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1alpha1Settings.PodPreset> items_;
    /**
     *
     *
     * <pre>
     * Items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1alpha1Settings.PodPreset> getItemsList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * Items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1alpha1Settings.PodPresetOrBuilder>
        getItemsOrBuilderList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * Items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     *
     *
     * <pre>
     * Items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
     */
    public io.kubernetes.client.proto.V1alpha1Settings.PodPreset getItems(int index) {
      return items_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Items is a list of schema objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
     */
    public io.kubernetes.client.proto.V1alpha1Settings.PodPresetOrBuilder getItemsOrBuilder(
        int index) {
      return items_.get(index);
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        output.writeMessage(2, items_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, items_.get(i));
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
      if (!(obj instanceof io.kubernetes.client.proto.V1alpha1Settings.PodPresetList)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1alpha1Settings.PodPresetList other =
          (io.kubernetes.client.proto.V1alpha1Settings.PodPresetList) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && getItemsList().equals(other.getItemsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (getItemsCount() > 0) {
        hash = (37 * hash) + ITEMS_FIELD_NUMBER;
        hash = (53 * hash) + getItemsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPresetList parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPresetList parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPresetList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPresetList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPresetList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPresetList parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPresetList parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPresetList parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPresetList parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPresetList parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPresetList parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPresetList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1alpha1Settings.PodPresetList prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * PodPresetList is a list of PodPreset objects.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.settings.v1alpha1.PodPresetList}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.settings.v1alpha1.PodPresetList)
        io.kubernetes.client.proto.V1alpha1Settings.PodPresetListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1alpha1Settings
            .internal_static_k8s_io_api_settings_v1alpha1_PodPresetList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1alpha1Settings
            .internal_static_k8s_io_api_settings_v1alpha1_PodPresetList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1alpha1Settings.PodPresetList.class,
                io.kubernetes.client.proto.V1alpha1Settings.PodPresetList.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1alpha1Settings.PodPresetList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getItemsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1alpha1Settings
            .internal_static_k8s_io_api_settings_v1alpha1_PodPresetList_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1alpha1Settings.PodPresetList getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1alpha1Settings.PodPresetList.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1alpha1Settings.PodPresetList build() {
        io.kubernetes.client.proto.V1alpha1Settings.PodPresetList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1alpha1Settings.PodPresetList buildPartial() {
        io.kubernetes.client.proto.V1alpha1Settings.PodPresetList result =
            new io.kubernetes.client.proto.V1alpha1Settings.PodPresetList(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (itemsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            items_ = java.util.Collections.unmodifiableList(items_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.items_ = items_;
        } else {
          result.items_ = itemsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1alpha1Settings.PodPresetList) {
          return mergeFrom((io.kubernetes.client.proto.V1alpha1Settings.PodPresetList) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1alpha1Settings.PodPresetList other) {
        if (other == io.kubernetes.client.proto.V1alpha1Settings.PodPresetList.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (itemsBuilder_ == null) {
          if (!other.items_.isEmpty()) {
            if (items_.isEmpty()) {
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureItemsIsMutable();
              items_.addAll(other.items_);
            }
            onChanged();
          }
        } else {
          if (!other.items_.isEmpty()) {
            if (itemsBuilder_.isEmpty()) {
              itemsBuilder_.dispose();
              itemsBuilder_ = null;
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
              itemsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getItemsFieldBuilder()
                      : null;
            } else {
              itemsBuilder_.addAllMessages(other.items_);
            }
          }
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
        io.kubernetes.client.proto.V1alpha1Settings.PodPresetList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1alpha1Settings.PodPresetList) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ListMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ListMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * Standard list metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ListMeta,
                  io.kubernetes.client.proto.Meta.ListMeta.Builder,
                  io.kubernetes.client.proto.Meta.ListMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V1alpha1Settings.PodPreset> items_ =
          java.util.Collections.emptyList();

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1alpha1Settings.PodPreset>(
                  items_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Settings.PodPreset,
              io.kubernetes.client.proto.V1alpha1Settings.PodPreset.Builder,
              io.kubernetes.client.proto.V1alpha1Settings.PodPresetOrBuilder>
          itemsBuilder_;

      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1alpha1Settings.PodPreset> getItemsList() {
        if (itemsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(items_);
        } else {
          return itemsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
       */
      public int getItemsCount() {
        if (itemsBuilder_ == null) {
          return items_.size();
        } else {
          return itemsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Settings.PodPreset getItems(int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
       */
      public Builder setItems(
          int index, io.kubernetes.client.proto.V1alpha1Settings.PodPreset value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.set(index, value);
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
       */
      public Builder setItems(
          int index,
          io.kubernetes.client.proto.V1alpha1Settings.PodPreset.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
       */
      public Builder addItems(io.kubernetes.client.proto.V1alpha1Settings.PodPreset value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
       */
      public Builder addItems(
          int index, io.kubernetes.client.proto.V1alpha1Settings.PodPreset value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(index, value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V1alpha1Settings.PodPreset.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
       */
      public Builder addItems(
          int index,
          io.kubernetes.client.proto.V1alpha1Settings.PodPreset.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
       */
      public Builder addAllItems(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1alpha1Settings.PodPreset>
              values) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, items_);
          onChanged();
        } else {
          itemsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
       */
      public Builder clearItems() {
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
       */
      public Builder removeItems(int index) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.remove(index);
          onChanged();
        } else {
          itemsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Settings.PodPreset.Builder getItemsBuilder(
          int index) {
        return getItemsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Settings.PodPresetOrBuilder getItemsOrBuilder(
          int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
       */
      public java.util.List<
              ? extends io.kubernetes.client.proto.V1alpha1Settings.PodPresetOrBuilder>
          getItemsOrBuilderList() {
        if (itemsBuilder_ != null) {
          return itemsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(items_);
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Settings.PodPreset.Builder addItemsBuilder() {
        return getItemsFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1alpha1Settings.PodPreset.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
       */
      public io.kubernetes.client.proto.V1alpha1Settings.PodPreset.Builder addItemsBuilder(
          int index) {
        return getItemsFieldBuilder()
            .addBuilder(
                index, io.kubernetes.client.proto.V1alpha1Settings.PodPreset.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Items is a list of schema objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.settings.v1alpha1.PodPreset items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1alpha1Settings.PodPreset.Builder>
          getItemsBuilderList() {
        return getItemsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1alpha1Settings.PodPreset,
              io.kubernetes.client.proto.V1alpha1Settings.PodPreset.Builder,
              io.kubernetes.client.proto.V1alpha1Settings.PodPresetOrBuilder>
          getItemsFieldBuilder() {
        if (itemsBuilder_ == null) {
          itemsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1alpha1Settings.PodPreset,
                  io.kubernetes.client.proto.V1alpha1Settings.PodPreset.Builder,
                  io.kubernetes.client.proto.V1alpha1Settings.PodPresetOrBuilder>(
                  items_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          items_ = null;
        }
        return itemsBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.settings.v1alpha1.PodPresetList)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.settings.v1alpha1.PodPresetList)
    private static final io.kubernetes.client.proto.V1alpha1Settings.PodPresetList DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1alpha1Settings.PodPresetList();
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPresetList getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<PodPresetList> PARSER =
        new com.google.protobuf.AbstractParser<PodPresetList>() {
          @java.lang.Override
          public PodPresetList parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new PodPresetList(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<PodPresetList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PodPresetList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1alpha1Settings.PodPresetList getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface PodPresetSpecOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.settings.v1alpha1.PodPresetSpec)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Selector is a label query over a set of resources, in this case pods.
     * Required.
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 1;</code>
     */
    boolean hasSelector();
    /**
     *
     *
     * <pre>
     * Selector is a label query over a set of resources, in this case pods.
     * Required.
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 1;</code>
     */
    io.kubernetes.client.proto.Meta.LabelSelector getSelector();
    /**
     *
     *
     * <pre>
     * Selector is a label query over a set of resources, in this case pods.
     * Required.
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 1;</code>
     */
    io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getSelectorOrBuilder();

    /**
     *
     *
     * <pre>
     * Env defines the collection of EnvVar to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1.EnvVar> getEnvList();
    /**
     *
     *
     * <pre>
     * Env defines the collection of EnvVar to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
     */
    io.kubernetes.client.proto.V1.EnvVar getEnv(int index);
    /**
     *
     *
     * <pre>
     * Env defines the collection of EnvVar to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
     */
    int getEnvCount();
    /**
     *
     *
     * <pre>
     * Env defines the collection of EnvVar to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1.EnvVarOrBuilder> getEnvOrBuilderList();
    /**
     *
     *
     * <pre>
     * Env defines the collection of EnvVar to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
     */
    io.kubernetes.client.proto.V1.EnvVarOrBuilder getEnvOrBuilder(int index);

    /**
     *
     *
     * <pre>
     * EnvFrom defines the collection of EnvFromSource to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1.EnvFromSource> getEnvFromList();
    /**
     *
     *
     * <pre>
     * EnvFrom defines the collection of EnvFromSource to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
     */
    io.kubernetes.client.proto.V1.EnvFromSource getEnvFrom(int index);
    /**
     *
     *
     * <pre>
     * EnvFrom defines the collection of EnvFromSource to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
     */
    int getEnvFromCount();
    /**
     *
     *
     * <pre>
     * EnvFrom defines the collection of EnvFromSource to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1.EnvFromSourceOrBuilder>
        getEnvFromOrBuilderList();
    /**
     *
     *
     * <pre>
     * EnvFrom defines the collection of EnvFromSource to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
     */
    io.kubernetes.client.proto.V1.EnvFromSourceOrBuilder getEnvFromOrBuilder(int index);

    /**
     *
     *
     * <pre>
     * Volumes defines the collection of Volume to inject into the pod.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1.Volume> getVolumesList();
    /**
     *
     *
     * <pre>
     * Volumes defines the collection of Volume to inject into the pod.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
     */
    io.kubernetes.client.proto.V1.Volume getVolumes(int index);
    /**
     *
     *
     * <pre>
     * Volumes defines the collection of Volume to inject into the pod.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
     */
    int getVolumesCount();
    /**
     *
     *
     * <pre>
     * Volumes defines the collection of Volume to inject into the pod.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1.VolumeOrBuilder>
        getVolumesOrBuilderList();
    /**
     *
     *
     * <pre>
     * Volumes defines the collection of Volume to inject into the pod.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
     */
    io.kubernetes.client.proto.V1.VolumeOrBuilder getVolumesOrBuilder(int index);

    /**
     *
     *
     * <pre>
     * VolumeMounts defines the collection of VolumeMount to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1.VolumeMount> getVolumeMountsList();
    /**
     *
     *
     * <pre>
     * VolumeMounts defines the collection of VolumeMount to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
     */
    io.kubernetes.client.proto.V1.VolumeMount getVolumeMounts(int index);
    /**
     *
     *
     * <pre>
     * VolumeMounts defines the collection of VolumeMount to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
     */
    int getVolumeMountsCount();
    /**
     *
     *
     * <pre>
     * VolumeMounts defines the collection of VolumeMount to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1.VolumeMountOrBuilder>
        getVolumeMountsOrBuilderList();
    /**
     *
     *
     * <pre>
     * VolumeMounts defines the collection of VolumeMount to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
     */
    io.kubernetes.client.proto.V1.VolumeMountOrBuilder getVolumeMountsOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * PodPresetSpec is a description of a pod preset.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.settings.v1alpha1.PodPresetSpec}
   */
  public static final class PodPresetSpec extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.settings.v1alpha1.PodPresetSpec)
      PodPresetSpecOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use PodPresetSpec.newBuilder() to construct.
    private PodPresetSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private PodPresetSpec() {
      env_ = java.util.Collections.emptyList();
      envFrom_ = java.util.Collections.emptyList();
      volumes_ = java.util.Collections.emptyList();
      volumeMounts_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private PodPresetSpec(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 10:
              {
                io.kubernetes.client.proto.Meta.LabelSelector.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = selector_.toBuilder();
                }
                selector_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.LabelSelector.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(selector_);
                  selector_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  env_ = new java.util.ArrayList<io.kubernetes.client.proto.V1.EnvVar>();
                  mutable_bitField0_ |= 0x00000002;
                }
                env_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1.EnvVar.PARSER, extensionRegistry));
                break;
              }
            case 26:
              {
                if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                  envFrom_ = new java.util.ArrayList<io.kubernetes.client.proto.V1.EnvFromSource>();
                  mutable_bitField0_ |= 0x00000004;
                }
                envFrom_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1.EnvFromSource.PARSER, extensionRegistry));
                break;
              }
            case 34:
              {
                if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                  volumes_ = new java.util.ArrayList<io.kubernetes.client.proto.V1.Volume>();
                  mutable_bitField0_ |= 0x00000008;
                }
                volumes_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1.Volume.PARSER, extensionRegistry));
                break;
              }
            case 42:
              {
                if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                  volumeMounts_ =
                      new java.util.ArrayList<io.kubernetes.client.proto.V1.VolumeMount>();
                  mutable_bitField0_ |= 0x00000010;
                }
                volumeMounts_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1.VolumeMount.PARSER, extensionRegistry));
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          env_ = java.util.Collections.unmodifiableList(env_);
        }
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          envFrom_ = java.util.Collections.unmodifiableList(envFrom_);
        }
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          volumes_ = java.util.Collections.unmodifiableList(volumes_);
        }
        if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
          volumeMounts_ = java.util.Collections.unmodifiableList(volumeMounts_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1alpha1Settings
          .internal_static_k8s_io_api_settings_v1alpha1_PodPresetSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1alpha1Settings
          .internal_static_k8s_io_api_settings_v1alpha1_PodPresetSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec.class,
              io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec.Builder.class);
    }

    private int bitField0_;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.LabelSelector selector_;
    /**
     *
     *
     * <pre>
     * Selector is a label query over a set of resources, in this case pods.
     * Required.
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 1;</code>
     */
    public boolean hasSelector() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Selector is a label query over a set of resources, in this case pods.
     * Required.
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelector getSelector() {
      return selector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : selector_;
    }
    /**
     *
     *
     * <pre>
     * Selector is a label query over a set of resources, in this case pods.
     * Required.
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getSelectorOrBuilder() {
      return selector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : selector_;
    }

    public static final int ENV_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1.EnvVar> env_;
    /**
     *
     *
     * <pre>
     * Env defines the collection of EnvVar to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1.EnvVar> getEnvList() {
      return env_;
    }
    /**
     *
     *
     * <pre>
     * Env defines the collection of EnvVar to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1.EnvVarOrBuilder>
        getEnvOrBuilderList() {
      return env_;
    }
    /**
     *
     *
     * <pre>
     * Env defines the collection of EnvVar to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
     */
    public int getEnvCount() {
      return env_.size();
    }
    /**
     *
     *
     * <pre>
     * Env defines the collection of EnvVar to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
     */
    public io.kubernetes.client.proto.V1.EnvVar getEnv(int index) {
      return env_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Env defines the collection of EnvVar to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
     */
    public io.kubernetes.client.proto.V1.EnvVarOrBuilder getEnvOrBuilder(int index) {
      return env_.get(index);
    }

    public static final int ENVFROM_FIELD_NUMBER = 3;
    private java.util.List<io.kubernetes.client.proto.V1.EnvFromSource> envFrom_;
    /**
     *
     *
     * <pre>
     * EnvFrom defines the collection of EnvFromSource to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1.EnvFromSource> getEnvFromList() {
      return envFrom_;
    }
    /**
     *
     *
     * <pre>
     * EnvFrom defines the collection of EnvFromSource to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1.EnvFromSourceOrBuilder>
        getEnvFromOrBuilderList() {
      return envFrom_;
    }
    /**
     *
     *
     * <pre>
     * EnvFrom defines the collection of EnvFromSource to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
     */
    public int getEnvFromCount() {
      return envFrom_.size();
    }
    /**
     *
     *
     * <pre>
     * EnvFrom defines the collection of EnvFromSource to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
     */
    public io.kubernetes.client.proto.V1.EnvFromSource getEnvFrom(int index) {
      return envFrom_.get(index);
    }
    /**
     *
     *
     * <pre>
     * EnvFrom defines the collection of EnvFromSource to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
     */
    public io.kubernetes.client.proto.V1.EnvFromSourceOrBuilder getEnvFromOrBuilder(int index) {
      return envFrom_.get(index);
    }

    public static final int VOLUMES_FIELD_NUMBER = 4;
    private java.util.List<io.kubernetes.client.proto.V1.Volume> volumes_;
    /**
     *
     *
     * <pre>
     * Volumes defines the collection of Volume to inject into the pod.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1.Volume> getVolumesList() {
      return volumes_;
    }
    /**
     *
     *
     * <pre>
     * Volumes defines the collection of Volume to inject into the pod.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1.VolumeOrBuilder>
        getVolumesOrBuilderList() {
      return volumes_;
    }
    /**
     *
     *
     * <pre>
     * Volumes defines the collection of Volume to inject into the pod.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
     */
    public int getVolumesCount() {
      return volumes_.size();
    }
    /**
     *
     *
     * <pre>
     * Volumes defines the collection of Volume to inject into the pod.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
     */
    public io.kubernetes.client.proto.V1.Volume getVolumes(int index) {
      return volumes_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Volumes defines the collection of Volume to inject into the pod.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
     */
    public io.kubernetes.client.proto.V1.VolumeOrBuilder getVolumesOrBuilder(int index) {
      return volumes_.get(index);
    }

    public static final int VOLUMEMOUNTS_FIELD_NUMBER = 5;
    private java.util.List<io.kubernetes.client.proto.V1.VolumeMount> volumeMounts_;
    /**
     *
     *
     * <pre>
     * VolumeMounts defines the collection of VolumeMount to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1.VolumeMount> getVolumeMountsList() {
      return volumeMounts_;
    }
    /**
     *
     *
     * <pre>
     * VolumeMounts defines the collection of VolumeMount to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1.VolumeMountOrBuilder>
        getVolumeMountsOrBuilderList() {
      return volumeMounts_;
    }
    /**
     *
     *
     * <pre>
     * VolumeMounts defines the collection of VolumeMount to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
     */
    public int getVolumeMountsCount() {
      return volumeMounts_.size();
    }
    /**
     *
     *
     * <pre>
     * VolumeMounts defines the collection of VolumeMount to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
     */
    public io.kubernetes.client.proto.V1.VolumeMount getVolumeMounts(int index) {
      return volumeMounts_.get(index);
    }
    /**
     *
     *
     * <pre>
     * VolumeMounts defines the collection of VolumeMount to inject into containers.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
     */
    public io.kubernetes.client.proto.V1.VolumeMountOrBuilder getVolumeMountsOrBuilder(int index) {
      return volumeMounts_.get(index);
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getSelector());
      }
      for (int i = 0; i < env_.size(); i++) {
        output.writeMessage(2, env_.get(i));
      }
      for (int i = 0; i < envFrom_.size(); i++) {
        output.writeMessage(3, envFrom_.get(i));
      }
      for (int i = 0; i < volumes_.size(); i++) {
        output.writeMessage(4, volumes_.get(i));
      }
      for (int i = 0; i < volumeMounts_.size(); i++) {
        output.writeMessage(5, volumeMounts_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getSelector());
      }
      for (int i = 0; i < env_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, env_.get(i));
      }
      for (int i = 0; i < envFrom_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, envFrom_.get(i));
      }
      for (int i = 0; i < volumes_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, volumes_.get(i));
      }
      for (int i = 0; i < volumeMounts_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, volumeMounts_.get(i));
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
      if (!(obj instanceof io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec other =
          (io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec) obj;

      boolean result = true;
      result = result && (hasSelector() == other.hasSelector());
      if (hasSelector()) {
        result = result && getSelector().equals(other.getSelector());
      }
      result = result && getEnvList().equals(other.getEnvList());
      result = result && getEnvFromList().equals(other.getEnvFromList());
      result = result && getVolumesList().equals(other.getVolumesList());
      result = result && getVolumeMountsList().equals(other.getVolumeMountsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasSelector()) {
        hash = (37 * hash) + SELECTOR_FIELD_NUMBER;
        hash = (53 * hash) + getSelector().hashCode();
      }
      if (getEnvCount() > 0) {
        hash = (37 * hash) + ENV_FIELD_NUMBER;
        hash = (53 * hash) + getEnvList().hashCode();
      }
      if (getEnvFromCount() > 0) {
        hash = (37 * hash) + ENVFROM_FIELD_NUMBER;
        hash = (53 * hash) + getEnvFromList().hashCode();
      }
      if (getVolumesCount() > 0) {
        hash = (37 * hash) + VOLUMES_FIELD_NUMBER;
        hash = (53 * hash) + getVolumesList().hashCode();
      }
      if (getVolumeMountsCount() > 0) {
        hash = (37 * hash) + VOLUMEMOUNTS_FIELD_NUMBER;
        hash = (53 * hash) + getVolumeMountsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * PodPresetSpec is a description of a pod preset.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.settings.v1alpha1.PodPresetSpec}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.settings.v1alpha1.PodPresetSpec)
        io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpecOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1alpha1Settings
            .internal_static_k8s_io_api_settings_v1alpha1_PodPresetSpec_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1alpha1Settings
            .internal_static_k8s_io_api_settings_v1alpha1_PodPresetSpec_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec.class,
                io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getSelectorFieldBuilder();
          getEnvFieldBuilder();
          getEnvFromFieldBuilder();
          getVolumesFieldBuilder();
          getVolumeMountsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (selectorBuilder_ == null) {
          selector_ = null;
        } else {
          selectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (envBuilder_ == null) {
          env_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          envBuilder_.clear();
        }
        if (envFromBuilder_ == null) {
          envFrom_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          envFromBuilder_.clear();
        }
        if (volumesBuilder_ == null) {
          volumes_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          volumesBuilder_.clear();
        }
        if (volumeMountsBuilder_ == null) {
          volumeMounts_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          volumeMountsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1alpha1Settings
            .internal_static_k8s_io_api_settings_v1alpha1_PodPresetSpec_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec build() {
        io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec buildPartial() {
        io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec result =
            new io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (selectorBuilder_ == null) {
          result.selector_ = selector_;
        } else {
          result.selector_ = selectorBuilder_.build();
        }
        if (envBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            env_ = java.util.Collections.unmodifiableList(env_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.env_ = env_;
        } else {
          result.env_ = envBuilder_.build();
        }
        if (envFromBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            envFrom_ = java.util.Collections.unmodifiableList(envFrom_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.envFrom_ = envFrom_;
        } else {
          result.envFrom_ = envFromBuilder_.build();
        }
        if (volumesBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)) {
            volumes_ = java.util.Collections.unmodifiableList(volumes_);
            bitField0_ = (bitField0_ & ~0x00000008);
          }
          result.volumes_ = volumes_;
        } else {
          result.volumes_ = volumesBuilder_.build();
        }
        if (volumeMountsBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010)) {
            volumeMounts_ = java.util.Collections.unmodifiableList(volumeMounts_);
            bitField0_ = (bitField0_ & ~0x00000010);
          }
          result.volumeMounts_ = volumeMounts_;
        } else {
          result.volumeMounts_ = volumeMountsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec) {
          return mergeFrom((io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec other) {
        if (other == io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec.getDefaultInstance())
          return this;
        if (other.hasSelector()) {
          mergeSelector(other.getSelector());
        }
        if (envBuilder_ == null) {
          if (!other.env_.isEmpty()) {
            if (env_.isEmpty()) {
              env_ = other.env_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureEnvIsMutable();
              env_.addAll(other.env_);
            }
            onChanged();
          }
        } else {
          if (!other.env_.isEmpty()) {
            if (envBuilder_.isEmpty()) {
              envBuilder_.dispose();
              envBuilder_ = null;
              env_ = other.env_;
              bitField0_ = (bitField0_ & ~0x00000002);
              envBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getEnvFieldBuilder()
                      : null;
            } else {
              envBuilder_.addAllMessages(other.env_);
            }
          }
        }
        if (envFromBuilder_ == null) {
          if (!other.envFrom_.isEmpty()) {
            if (envFrom_.isEmpty()) {
              envFrom_ = other.envFrom_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureEnvFromIsMutable();
              envFrom_.addAll(other.envFrom_);
            }
            onChanged();
          }
        } else {
          if (!other.envFrom_.isEmpty()) {
            if (envFromBuilder_.isEmpty()) {
              envFromBuilder_.dispose();
              envFromBuilder_ = null;
              envFrom_ = other.envFrom_;
              bitField0_ = (bitField0_ & ~0x00000004);
              envFromBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getEnvFromFieldBuilder()
                      : null;
            } else {
              envFromBuilder_.addAllMessages(other.envFrom_);
            }
          }
        }
        if (volumesBuilder_ == null) {
          if (!other.volumes_.isEmpty()) {
            if (volumes_.isEmpty()) {
              volumes_ = other.volumes_;
              bitField0_ = (bitField0_ & ~0x00000008);
            } else {
              ensureVolumesIsMutable();
              volumes_.addAll(other.volumes_);
            }
            onChanged();
          }
        } else {
          if (!other.volumes_.isEmpty()) {
            if (volumesBuilder_.isEmpty()) {
              volumesBuilder_.dispose();
              volumesBuilder_ = null;
              volumes_ = other.volumes_;
              bitField0_ = (bitField0_ & ~0x00000008);
              volumesBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getVolumesFieldBuilder()
                      : null;
            } else {
              volumesBuilder_.addAllMessages(other.volumes_);
            }
          }
        }
        if (volumeMountsBuilder_ == null) {
          if (!other.volumeMounts_.isEmpty()) {
            if (volumeMounts_.isEmpty()) {
              volumeMounts_ = other.volumeMounts_;
              bitField0_ = (bitField0_ & ~0x00000010);
            } else {
              ensureVolumeMountsIsMutable();
              volumeMounts_.addAll(other.volumeMounts_);
            }
            onChanged();
          }
        } else {
          if (!other.volumeMounts_.isEmpty()) {
            if (volumeMountsBuilder_.isEmpty()) {
              volumeMountsBuilder_.dispose();
              volumeMountsBuilder_ = null;
              volumeMounts_ = other.volumeMounts_;
              bitField0_ = (bitField0_ & ~0x00000010);
              volumeMountsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getVolumeMountsFieldBuilder()
                      : null;
            } else {
              volumeMountsBuilder_.addAllMessages(other.volumeMounts_);
            }
          }
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
        io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.LabelSelector selector_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          selectorBuilder_;
      /**
       *
       *
       * <pre>
       * Selector is a label query over a set of resources, in this case pods.
       * Required.
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 1;
       * </code>
       */
      public boolean hasSelector() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Selector is a label query over a set of resources, in this case pods.
       * Required.
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 1;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector getSelector() {
        if (selectorBuilder_ == null) {
          return selector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : selector_;
        } else {
          return selectorBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Selector is a label query over a set of resources, in this case pods.
       * Required.
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 1;
       * </code>
       */
      public Builder setSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (selectorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          selector_ = value;
          onChanged();
        } else {
          selectorBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Selector is a label query over a set of resources, in this case pods.
       * Required.
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 1;
       * </code>
       */
      public Builder setSelector(
          io.kubernetes.client.proto.Meta.LabelSelector.Builder builderForValue) {
        if (selectorBuilder_ == null) {
          selector_ = builderForValue.build();
          onChanged();
        } else {
          selectorBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Selector is a label query over a set of resources, in this case pods.
       * Required.
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 1;
       * </code>
       */
      public Builder mergeSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (selectorBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && selector_ != null
              && selector_ != io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()) {
            selector_ =
                io.kubernetes.client.proto.Meta.LabelSelector.newBuilder(selector_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            selector_ = value;
          }
          onChanged();
        } else {
          selectorBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Selector is a label query over a set of resources, in this case pods.
       * Required.
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 1;
       * </code>
       */
      public Builder clearSelector() {
        if (selectorBuilder_ == null) {
          selector_ = null;
          onChanged();
        } else {
          selectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Selector is a label query over a set of resources, in this case pods.
       * Required.
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 1;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector.Builder getSelectorBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getSelectorFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Selector is a label query over a set of resources, in this case pods.
       * Required.
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 1;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getSelectorOrBuilder() {
        if (selectorBuilder_ != null) {
          return selectorBuilder_.getMessageOrBuilder();
        } else {
          return selector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : selector_;
        }
      }
      /**
       *
       *
       * <pre>
       * Selector is a label query over a set of resources, in this case pods.
       * Required.
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 1;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          getSelectorFieldBuilder() {
        if (selectorBuilder_ == null) {
          selectorBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.LabelSelector,
                  io.kubernetes.client.proto.Meta.LabelSelector.Builder,
                  io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>(
                  getSelector(), getParentForChildren(), isClean());
          selector_ = null;
        }
        return selectorBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V1.EnvVar> env_ =
          java.util.Collections.emptyList();

      private void ensureEnvIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          env_ = new java.util.ArrayList<io.kubernetes.client.proto.V1.EnvVar>(env_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1.EnvVar,
              io.kubernetes.client.proto.V1.EnvVar.Builder,
              io.kubernetes.client.proto.V1.EnvVarOrBuilder>
          envBuilder_;

      /**
       *
       *
       * <pre>
       * Env defines the collection of EnvVar to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1.EnvVar> getEnvList() {
        if (envBuilder_ == null) {
          return java.util.Collections.unmodifiableList(env_);
        } else {
          return envBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * Env defines the collection of EnvVar to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
       */
      public int getEnvCount() {
        if (envBuilder_ == null) {
          return env_.size();
        } else {
          return envBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * Env defines the collection of EnvVar to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
       */
      public io.kubernetes.client.proto.V1.EnvVar getEnv(int index) {
        if (envBuilder_ == null) {
          return env_.get(index);
        } else {
          return envBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Env defines the collection of EnvVar to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
       */
      public Builder setEnv(int index, io.kubernetes.client.proto.V1.EnvVar value) {
        if (envBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEnvIsMutable();
          env_.set(index, value);
          onChanged();
        } else {
          envBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Env defines the collection of EnvVar to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
       */
      public Builder setEnv(
          int index, io.kubernetes.client.proto.V1.EnvVar.Builder builderForValue) {
        if (envBuilder_ == null) {
          ensureEnvIsMutable();
          env_.set(index, builderForValue.build());
          onChanged();
        } else {
          envBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Env defines the collection of EnvVar to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
       */
      public Builder addEnv(io.kubernetes.client.proto.V1.EnvVar value) {
        if (envBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEnvIsMutable();
          env_.add(value);
          onChanged();
        } else {
          envBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Env defines the collection of EnvVar to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
       */
      public Builder addEnv(int index, io.kubernetes.client.proto.V1.EnvVar value) {
        if (envBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEnvIsMutable();
          env_.add(index, value);
          onChanged();
        } else {
          envBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Env defines the collection of EnvVar to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
       */
      public Builder addEnv(io.kubernetes.client.proto.V1.EnvVar.Builder builderForValue) {
        if (envBuilder_ == null) {
          ensureEnvIsMutable();
          env_.add(builderForValue.build());
          onChanged();
        } else {
          envBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Env defines the collection of EnvVar to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
       */
      public Builder addEnv(
          int index, io.kubernetes.client.proto.V1.EnvVar.Builder builderForValue) {
        if (envBuilder_ == null) {
          ensureEnvIsMutable();
          env_.add(index, builderForValue.build());
          onChanged();
        } else {
          envBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Env defines the collection of EnvVar to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
       */
      public Builder addAllEnv(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1.EnvVar> values) {
        if (envBuilder_ == null) {
          ensureEnvIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, env_);
          onChanged();
        } else {
          envBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Env defines the collection of EnvVar to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
       */
      public Builder clearEnv() {
        if (envBuilder_ == null) {
          env_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          envBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Env defines the collection of EnvVar to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
       */
      public Builder removeEnv(int index) {
        if (envBuilder_ == null) {
          ensureEnvIsMutable();
          env_.remove(index);
          onChanged();
        } else {
          envBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Env defines the collection of EnvVar to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
       */
      public io.kubernetes.client.proto.V1.EnvVar.Builder getEnvBuilder(int index) {
        return getEnvFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Env defines the collection of EnvVar to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
       */
      public io.kubernetes.client.proto.V1.EnvVarOrBuilder getEnvOrBuilder(int index) {
        if (envBuilder_ == null) {
          return env_.get(index);
        } else {
          return envBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Env defines the collection of EnvVar to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1.EnvVarOrBuilder>
          getEnvOrBuilderList() {
        if (envBuilder_ != null) {
          return envBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(env_);
        }
      }
      /**
       *
       *
       * <pre>
       * Env defines the collection of EnvVar to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
       */
      public io.kubernetes.client.proto.V1.EnvVar.Builder addEnvBuilder() {
        return getEnvFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1.EnvVar.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Env defines the collection of EnvVar to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
       */
      public io.kubernetes.client.proto.V1.EnvVar.Builder addEnvBuilder(int index) {
        return getEnvFieldBuilder()
            .addBuilder(index, io.kubernetes.client.proto.V1.EnvVar.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Env defines the collection of EnvVar to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvVar env = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1.EnvVar.Builder> getEnvBuilderList() {
        return getEnvFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1.EnvVar,
              io.kubernetes.client.proto.V1.EnvVar.Builder,
              io.kubernetes.client.proto.V1.EnvVarOrBuilder>
          getEnvFieldBuilder() {
        if (envBuilder_ == null) {
          envBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1.EnvVar,
                  io.kubernetes.client.proto.V1.EnvVar.Builder,
                  io.kubernetes.client.proto.V1.EnvVarOrBuilder>(
                  env_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          env_ = null;
        }
        return envBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V1.EnvFromSource> envFrom_ =
          java.util.Collections.emptyList();

      private void ensureEnvFromIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          envFrom_ = new java.util.ArrayList<io.kubernetes.client.proto.V1.EnvFromSource>(envFrom_);
          bitField0_ |= 0x00000004;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1.EnvFromSource,
              io.kubernetes.client.proto.V1.EnvFromSource.Builder,
              io.kubernetes.client.proto.V1.EnvFromSourceOrBuilder>
          envFromBuilder_;

      /**
       *
       *
       * <pre>
       * EnvFrom defines the collection of EnvFromSource to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1.EnvFromSource> getEnvFromList() {
        if (envFromBuilder_ == null) {
          return java.util.Collections.unmodifiableList(envFrom_);
        } else {
          return envFromBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * EnvFrom defines the collection of EnvFromSource to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
       */
      public int getEnvFromCount() {
        if (envFromBuilder_ == null) {
          return envFrom_.size();
        } else {
          return envFromBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * EnvFrom defines the collection of EnvFromSource to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
       */
      public io.kubernetes.client.proto.V1.EnvFromSource getEnvFrom(int index) {
        if (envFromBuilder_ == null) {
          return envFrom_.get(index);
        } else {
          return envFromBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * EnvFrom defines the collection of EnvFromSource to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
       */
      public Builder setEnvFrom(int index, io.kubernetes.client.proto.V1.EnvFromSource value) {
        if (envFromBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEnvFromIsMutable();
          envFrom_.set(index, value);
          onChanged();
        } else {
          envFromBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * EnvFrom defines the collection of EnvFromSource to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
       */
      public Builder setEnvFrom(
          int index, io.kubernetes.client.proto.V1.EnvFromSource.Builder builderForValue) {
        if (envFromBuilder_ == null) {
          ensureEnvFromIsMutable();
          envFrom_.set(index, builderForValue.build());
          onChanged();
        } else {
          envFromBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * EnvFrom defines the collection of EnvFromSource to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
       */
      public Builder addEnvFrom(io.kubernetes.client.proto.V1.EnvFromSource value) {
        if (envFromBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEnvFromIsMutable();
          envFrom_.add(value);
          onChanged();
        } else {
          envFromBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * EnvFrom defines the collection of EnvFromSource to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
       */
      public Builder addEnvFrom(int index, io.kubernetes.client.proto.V1.EnvFromSource value) {
        if (envFromBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEnvFromIsMutable();
          envFrom_.add(index, value);
          onChanged();
        } else {
          envFromBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * EnvFrom defines the collection of EnvFromSource to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
       */
      public Builder addEnvFrom(
          io.kubernetes.client.proto.V1.EnvFromSource.Builder builderForValue) {
        if (envFromBuilder_ == null) {
          ensureEnvFromIsMutable();
          envFrom_.add(builderForValue.build());
          onChanged();
        } else {
          envFromBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * EnvFrom defines the collection of EnvFromSource to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
       */
      public Builder addEnvFrom(
          int index, io.kubernetes.client.proto.V1.EnvFromSource.Builder builderForValue) {
        if (envFromBuilder_ == null) {
          ensureEnvFromIsMutable();
          envFrom_.add(index, builderForValue.build());
          onChanged();
        } else {
          envFromBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * EnvFrom defines the collection of EnvFromSource to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
       */
      public Builder addAllEnvFrom(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1.EnvFromSource> values) {
        if (envFromBuilder_ == null) {
          ensureEnvFromIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, envFrom_);
          onChanged();
        } else {
          envFromBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * EnvFrom defines the collection of EnvFromSource to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
       */
      public Builder clearEnvFrom() {
        if (envFromBuilder_ == null) {
          envFrom_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          envFromBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * EnvFrom defines the collection of EnvFromSource to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
       */
      public Builder removeEnvFrom(int index) {
        if (envFromBuilder_ == null) {
          ensureEnvFromIsMutable();
          envFrom_.remove(index);
          onChanged();
        } else {
          envFromBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * EnvFrom defines the collection of EnvFromSource to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
       */
      public io.kubernetes.client.proto.V1.EnvFromSource.Builder getEnvFromBuilder(int index) {
        return getEnvFromFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * EnvFrom defines the collection of EnvFromSource to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
       */
      public io.kubernetes.client.proto.V1.EnvFromSourceOrBuilder getEnvFromOrBuilder(int index) {
        if (envFromBuilder_ == null) {
          return envFrom_.get(index);
        } else {
          return envFromBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * EnvFrom defines the collection of EnvFromSource to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1.EnvFromSourceOrBuilder>
          getEnvFromOrBuilderList() {
        if (envFromBuilder_ != null) {
          return envFromBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(envFrom_);
        }
      }
      /**
       *
       *
       * <pre>
       * EnvFrom defines the collection of EnvFromSource to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
       */
      public io.kubernetes.client.proto.V1.EnvFromSource.Builder addEnvFromBuilder() {
        return getEnvFromFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1.EnvFromSource.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * EnvFrom defines the collection of EnvFromSource to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
       */
      public io.kubernetes.client.proto.V1.EnvFromSource.Builder addEnvFromBuilder(int index) {
        return getEnvFromFieldBuilder()
            .addBuilder(index, io.kubernetes.client.proto.V1.EnvFromSource.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * EnvFrom defines the collection of EnvFromSource to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.EnvFromSource envFrom = 3;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1.EnvFromSource.Builder>
          getEnvFromBuilderList() {
        return getEnvFromFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1.EnvFromSource,
              io.kubernetes.client.proto.V1.EnvFromSource.Builder,
              io.kubernetes.client.proto.V1.EnvFromSourceOrBuilder>
          getEnvFromFieldBuilder() {
        if (envFromBuilder_ == null) {
          envFromBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1.EnvFromSource,
                  io.kubernetes.client.proto.V1.EnvFromSource.Builder,
                  io.kubernetes.client.proto.V1.EnvFromSourceOrBuilder>(
                  envFrom_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          envFrom_ = null;
        }
        return envFromBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V1.Volume> volumes_ =
          java.util.Collections.emptyList();

      private void ensureVolumesIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          volumes_ = new java.util.ArrayList<io.kubernetes.client.proto.V1.Volume>(volumes_);
          bitField0_ |= 0x00000008;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1.Volume,
              io.kubernetes.client.proto.V1.Volume.Builder,
              io.kubernetes.client.proto.V1.VolumeOrBuilder>
          volumesBuilder_;

      /**
       *
       *
       * <pre>
       * Volumes defines the collection of Volume to inject into the pod.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1.Volume> getVolumesList() {
        if (volumesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(volumes_);
        } else {
          return volumesBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * Volumes defines the collection of Volume to inject into the pod.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
       */
      public int getVolumesCount() {
        if (volumesBuilder_ == null) {
          return volumes_.size();
        } else {
          return volumesBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * Volumes defines the collection of Volume to inject into the pod.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
       */
      public io.kubernetes.client.proto.V1.Volume getVolumes(int index) {
        if (volumesBuilder_ == null) {
          return volumes_.get(index);
        } else {
          return volumesBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Volumes defines the collection of Volume to inject into the pod.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
       */
      public Builder setVolumes(int index, io.kubernetes.client.proto.V1.Volume value) {
        if (volumesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureVolumesIsMutable();
          volumes_.set(index, value);
          onChanged();
        } else {
          volumesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Volumes defines the collection of Volume to inject into the pod.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
       */
      public Builder setVolumes(
          int index, io.kubernetes.client.proto.V1.Volume.Builder builderForValue) {
        if (volumesBuilder_ == null) {
          ensureVolumesIsMutable();
          volumes_.set(index, builderForValue.build());
          onChanged();
        } else {
          volumesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Volumes defines the collection of Volume to inject into the pod.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
       */
      public Builder addVolumes(io.kubernetes.client.proto.V1.Volume value) {
        if (volumesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureVolumesIsMutable();
          volumes_.add(value);
          onChanged();
        } else {
          volumesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Volumes defines the collection of Volume to inject into the pod.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
       */
      public Builder addVolumes(int index, io.kubernetes.client.proto.V1.Volume value) {
        if (volumesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureVolumesIsMutable();
          volumes_.add(index, value);
          onChanged();
        } else {
          volumesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Volumes defines the collection of Volume to inject into the pod.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
       */
      public Builder addVolumes(io.kubernetes.client.proto.V1.Volume.Builder builderForValue) {
        if (volumesBuilder_ == null) {
          ensureVolumesIsMutable();
          volumes_.add(builderForValue.build());
          onChanged();
        } else {
          volumesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Volumes defines the collection of Volume to inject into the pod.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
       */
      public Builder addVolumes(
          int index, io.kubernetes.client.proto.V1.Volume.Builder builderForValue) {
        if (volumesBuilder_ == null) {
          ensureVolumesIsMutable();
          volumes_.add(index, builderForValue.build());
          onChanged();
        } else {
          volumesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Volumes defines the collection of Volume to inject into the pod.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
       */
      public Builder addAllVolumes(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1.Volume> values) {
        if (volumesBuilder_ == null) {
          ensureVolumesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, volumes_);
          onChanged();
        } else {
          volumesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Volumes defines the collection of Volume to inject into the pod.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
       */
      public Builder clearVolumes() {
        if (volumesBuilder_ == null) {
          volumes_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
          onChanged();
        } else {
          volumesBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Volumes defines the collection of Volume to inject into the pod.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
       */
      public Builder removeVolumes(int index) {
        if (volumesBuilder_ == null) {
          ensureVolumesIsMutable();
          volumes_.remove(index);
          onChanged();
        } else {
          volumesBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Volumes defines the collection of Volume to inject into the pod.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
       */
      public io.kubernetes.client.proto.V1.Volume.Builder getVolumesBuilder(int index) {
        return getVolumesFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Volumes defines the collection of Volume to inject into the pod.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
       */
      public io.kubernetes.client.proto.V1.VolumeOrBuilder getVolumesOrBuilder(int index) {
        if (volumesBuilder_ == null) {
          return volumes_.get(index);
        } else {
          return volumesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Volumes defines the collection of Volume to inject into the pod.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1.VolumeOrBuilder>
          getVolumesOrBuilderList() {
        if (volumesBuilder_ != null) {
          return volumesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(volumes_);
        }
      }
      /**
       *
       *
       * <pre>
       * Volumes defines the collection of Volume to inject into the pod.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
       */
      public io.kubernetes.client.proto.V1.Volume.Builder addVolumesBuilder() {
        return getVolumesFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1.Volume.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Volumes defines the collection of Volume to inject into the pod.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
       */
      public io.kubernetes.client.proto.V1.Volume.Builder addVolumesBuilder(int index) {
        return getVolumesFieldBuilder()
            .addBuilder(index, io.kubernetes.client.proto.V1.Volume.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Volumes defines the collection of Volume to inject into the pod.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.Volume volumes = 4;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1.Volume.Builder> getVolumesBuilderList() {
        return getVolumesFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1.Volume,
              io.kubernetes.client.proto.V1.Volume.Builder,
              io.kubernetes.client.proto.V1.VolumeOrBuilder>
          getVolumesFieldBuilder() {
        if (volumesBuilder_ == null) {
          volumesBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1.Volume,
                  io.kubernetes.client.proto.V1.Volume.Builder,
                  io.kubernetes.client.proto.V1.VolumeOrBuilder>(
                  volumes_,
                  ((bitField0_ & 0x00000008) == 0x00000008),
                  getParentForChildren(),
                  isClean());
          volumes_ = null;
        }
        return volumesBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V1.VolumeMount> volumeMounts_ =
          java.util.Collections.emptyList();

      private void ensureVolumeMountsIsMutable() {
        if (!((bitField0_ & 0x00000010) == 0x00000010)) {
          volumeMounts_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1.VolumeMount>(volumeMounts_);
          bitField0_ |= 0x00000010;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1.VolumeMount,
              io.kubernetes.client.proto.V1.VolumeMount.Builder,
              io.kubernetes.client.proto.V1.VolumeMountOrBuilder>
          volumeMountsBuilder_;

      /**
       *
       *
       * <pre>
       * VolumeMounts defines the collection of VolumeMount to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1.VolumeMount> getVolumeMountsList() {
        if (volumeMountsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(volumeMounts_);
        } else {
          return volumeMountsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * VolumeMounts defines the collection of VolumeMount to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
       */
      public int getVolumeMountsCount() {
        if (volumeMountsBuilder_ == null) {
          return volumeMounts_.size();
        } else {
          return volumeMountsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * VolumeMounts defines the collection of VolumeMount to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
       */
      public io.kubernetes.client.proto.V1.VolumeMount getVolumeMounts(int index) {
        if (volumeMountsBuilder_ == null) {
          return volumeMounts_.get(index);
        } else {
          return volumeMountsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * VolumeMounts defines the collection of VolumeMount to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
       */
      public Builder setVolumeMounts(int index, io.kubernetes.client.proto.V1.VolumeMount value) {
        if (volumeMountsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureVolumeMountsIsMutable();
          volumeMounts_.set(index, value);
          onChanged();
        } else {
          volumeMountsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * VolumeMounts defines the collection of VolumeMount to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
       */
      public Builder setVolumeMounts(
          int index, io.kubernetes.client.proto.V1.VolumeMount.Builder builderForValue) {
        if (volumeMountsBuilder_ == null) {
          ensureVolumeMountsIsMutable();
          volumeMounts_.set(index, builderForValue.build());
          onChanged();
        } else {
          volumeMountsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * VolumeMounts defines the collection of VolumeMount to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
       */
      public Builder addVolumeMounts(io.kubernetes.client.proto.V1.VolumeMount value) {
        if (volumeMountsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureVolumeMountsIsMutable();
          volumeMounts_.add(value);
          onChanged();
        } else {
          volumeMountsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * VolumeMounts defines the collection of VolumeMount to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
       */
      public Builder addVolumeMounts(int index, io.kubernetes.client.proto.V1.VolumeMount value) {
        if (volumeMountsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureVolumeMountsIsMutable();
          volumeMounts_.add(index, value);
          onChanged();
        } else {
          volumeMountsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * VolumeMounts defines the collection of VolumeMount to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
       */
      public Builder addVolumeMounts(
          io.kubernetes.client.proto.V1.VolumeMount.Builder builderForValue) {
        if (volumeMountsBuilder_ == null) {
          ensureVolumeMountsIsMutable();
          volumeMounts_.add(builderForValue.build());
          onChanged();
        } else {
          volumeMountsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * VolumeMounts defines the collection of VolumeMount to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
       */
      public Builder addVolumeMounts(
          int index, io.kubernetes.client.proto.V1.VolumeMount.Builder builderForValue) {
        if (volumeMountsBuilder_ == null) {
          ensureVolumeMountsIsMutable();
          volumeMounts_.add(index, builderForValue.build());
          onChanged();
        } else {
          volumeMountsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * VolumeMounts defines the collection of VolumeMount to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
       */
      public Builder addAllVolumeMounts(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1.VolumeMount> values) {
        if (volumeMountsBuilder_ == null) {
          ensureVolumeMountsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, volumeMounts_);
          onChanged();
        } else {
          volumeMountsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * VolumeMounts defines the collection of VolumeMount to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
       */
      public Builder clearVolumeMounts() {
        if (volumeMountsBuilder_ == null) {
          volumeMounts_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
          onChanged();
        } else {
          volumeMountsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * VolumeMounts defines the collection of VolumeMount to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
       */
      public Builder removeVolumeMounts(int index) {
        if (volumeMountsBuilder_ == null) {
          ensureVolumeMountsIsMutable();
          volumeMounts_.remove(index);
          onChanged();
        } else {
          volumeMountsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * VolumeMounts defines the collection of VolumeMount to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
       */
      public io.kubernetes.client.proto.V1.VolumeMount.Builder getVolumeMountsBuilder(int index) {
        return getVolumeMountsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * VolumeMounts defines the collection of VolumeMount to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
       */
      public io.kubernetes.client.proto.V1.VolumeMountOrBuilder getVolumeMountsOrBuilder(
          int index) {
        if (volumeMountsBuilder_ == null) {
          return volumeMounts_.get(index);
        } else {
          return volumeMountsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * VolumeMounts defines the collection of VolumeMount to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1.VolumeMountOrBuilder>
          getVolumeMountsOrBuilderList() {
        if (volumeMountsBuilder_ != null) {
          return volumeMountsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(volumeMounts_);
        }
      }
      /**
       *
       *
       * <pre>
       * VolumeMounts defines the collection of VolumeMount to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
       */
      public io.kubernetes.client.proto.V1.VolumeMount.Builder addVolumeMountsBuilder() {
        return getVolumeMountsFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1.VolumeMount.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * VolumeMounts defines the collection of VolumeMount to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
       */
      public io.kubernetes.client.proto.V1.VolumeMount.Builder addVolumeMountsBuilder(int index) {
        return getVolumeMountsFieldBuilder()
            .addBuilder(index, io.kubernetes.client.proto.V1.VolumeMount.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * VolumeMounts defines the collection of VolumeMount to inject into containers.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.core.v1.VolumeMount volumeMounts = 5;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1.VolumeMount.Builder>
          getVolumeMountsBuilderList() {
        return getVolumeMountsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1.VolumeMount,
              io.kubernetes.client.proto.V1.VolumeMount.Builder,
              io.kubernetes.client.proto.V1.VolumeMountOrBuilder>
          getVolumeMountsFieldBuilder() {
        if (volumeMountsBuilder_ == null) {
          volumeMountsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1.VolumeMount,
                  io.kubernetes.client.proto.V1.VolumeMount.Builder,
                  io.kubernetes.client.proto.V1.VolumeMountOrBuilder>(
                  volumeMounts_,
                  ((bitField0_ & 0x00000010) == 0x00000010),
                  getParentForChildren(),
                  isClean());
          volumeMounts_ = null;
        }
        return volumeMountsBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.settings.v1alpha1.PodPresetSpec)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.settings.v1alpha1.PodPresetSpec)
    private static final io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec();
    }

    public static io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<PodPresetSpec> PARSER =
        new com.google.protobuf.AbstractParser<PodPresetSpec>() {
          @java.lang.Override
          public PodPresetSpec parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new PodPresetSpec(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<PodPresetSpec> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PodPresetSpec> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1alpha1Settings.PodPresetSpec getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_settings_v1alpha1_PodPreset_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_settings_v1alpha1_PodPreset_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_settings_v1alpha1_PodPresetList_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_settings_v1alpha1_PodPresetList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_settings_v1alpha1_PodPresetSpec_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_settings_v1alpha1_PodPresetSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,k8s.io/api/settings/v1alpha1/generated"
          + ".proto\022\034k8s.io.api.settings.v1alpha1\032\"k8"
          + "s.io/api/core/v1/generated.proto\0324k8s.io"
          + "/apimachinery/pkg/apis/meta/v1/generated"
          + ".proto\032/k8s.io/apimachinery/pkg/runtime/"
          + "generated.proto\0326k8s.io/apimachinery/pkg"
          + "/runtime/schema/generated.proto\"\212\001\n\tPodP"
          + "reset\022B\n\010metadata\030\001 \001(\01320.k8s.io.apimach"
          + "inery.pkg.apis.meta.v1.ObjectMeta\0229\n\004spe"
          + "c\030\002 \001(\0132+.k8s.io.api.settings.v1alpha1.P"
          + "odPresetSpec\"\211\001\n\rPodPresetList\022@\n\010metada"
          + "ta\030\001 \001(\0132..k8s.io.apimachinery.pkg.apis."
          + "meta.v1.ListMeta\0226\n\005items\030\002 \003(\0132\'.k8s.io"
          + ".api.settings.v1alpha1.PodPreset\"\227\002\n\rPod"
          + "PresetSpec\022E\n\010selector\030\001 \001(\01323.k8s.io.ap"
          + "imachinery.pkg.apis.meta.v1.LabelSelecto"
          + "r\022\'\n\003env\030\002 \003(\0132\032.k8s.io.api.core.v1.EnvV"
          + "ar\0222\n\007envFrom\030\003 \003(\0132!.k8s.io.api.core.v1"
          + ".EnvFromSource\022+\n\007volumes\030\004 \003(\0132\032.k8s.io"
          + ".api.core.v1.Volume\0225\n\014volumeMounts\030\005 \003("
          + "\0132\037.k8s.io.api.core.v1.VolumeMountB8\n\032io"
          + ".kubernetes.client.protoB\020V1alpha1Settin"
          + "gsZ\010v1alpha1"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.kubernetes.client.proto.V1.getDescriptor(),
          io.kubernetes.client.proto.Meta.getDescriptor(),
          io.kubernetes.client.proto.Runtime.getDescriptor(),
          io.kubernetes.client.proto.RuntimeSchema.getDescriptor(),
        },
        assigner);
    internal_static_k8s_io_api_settings_v1alpha1_PodPreset_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_k8s_io_api_settings_v1alpha1_PodPreset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_settings_v1alpha1_PodPreset_descriptor,
            new java.lang.String[] {
              "Metadata", "Spec",
            });
    internal_static_k8s_io_api_settings_v1alpha1_PodPresetList_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_k8s_io_api_settings_v1alpha1_PodPresetList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_settings_v1alpha1_PodPresetList_descriptor,
            new java.lang.String[] {
              "Metadata", "Items",
            });
    internal_static_k8s_io_api_settings_v1alpha1_PodPresetSpec_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_k8s_io_api_settings_v1alpha1_PodPresetSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_settings_v1alpha1_PodPresetSpec_descriptor,
            new java.lang.String[] {
              "Selector", "Env", "EnvFrom", "Volumes", "VolumeMounts",
            });
    io.kubernetes.client.proto.V1.getDescriptor();
    io.kubernetes.client.proto.Meta.getDescriptor();
    io.kubernetes.client.proto.Runtime.getDescriptor();
    io.kubernetes.client.proto.RuntimeSchema.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
