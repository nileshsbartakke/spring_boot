package com.baeldung.protobuf;


public final class BaeldungTraining {
private BaeldungTraining() {}
public static void registerAllExtensions(
   com.google.protobuf.ExtensionRegistryLite registry) {
}

public static void registerAllExtensions(
   com.google.protobuf.ExtensionRegistry registry) {
 registerAllExtensions(
     (com.google.protobuf.ExtensionRegistryLite) registry);
}
public interface CourseOrBuilder extends
   // @@protoc_insertion_point(interface_extends:baeldung.Course)
   com.google.protobuf.MessageOrBuilder {

 /**
  * <code>int32 id = 1;</code>
  */
 int getId();

 /**
  * <code>string course_name = 2;</code>
  */
 java.lang.String getCourseName();
 /**
  * <code>string course_name = 2;</code>
  */
 com.google.protobuf.ByteString
     getCourseNameBytes();

 /**
  * <code>repeated .baeldung.Student student = 3;</code>
  */
 java.util.List<com.baeldung.protobuf.BaeldungTraining.Student> 
     getStudentList();
 /**
  * <code>repeated .baeldung.Student student = 3;</code>
  */
 com.baeldung.protobuf.BaeldungTraining.Student getStudent(int index);
 /**
  * <code>repeated .baeldung.Student student = 3;</code>
  */
 int getStudentCount();
 /**
  * <code>repeated .baeldung.Student student = 3;</code>
  */
 java.util.List<? extends com.baeldung.protobuf.BaeldungTraining.StudentOrBuilder> 
     getStudentOrBuilderList();
 /**
  * <code>repeated .baeldung.Student student = 3;</code>
  */
 com.baeldung.protobuf.BaeldungTraining.StudentOrBuilder getStudentOrBuilder(
     int index);
}
/**
* Protobuf type {@code baeldung.Course}
*/
public  static final class Course extends
   com.google.protobuf.GeneratedMessageV3 implements
   // @@protoc_insertion_point(message_implements:baeldung.Course)
   CourseOrBuilder {
private static final long serialVersionUID = 0L;
 // Use Course.newBuilder() to construct.
 private Course(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
   super(builder);
 }
 private Course() {
   id_ = 0;
   courseName_ = "";
   student_ = java.util.Collections.emptyList();
 }

 @java.lang.Override
 public final com.google.protobuf.UnknownFieldSet
 getUnknownFields() {
   return this.unknownFields;
 }
 private Course(
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
         case 8: {

           id_ = input.readInt32();
           break;
         }
         case 18: {
           java.lang.String s = input.readStringRequireUtf8();

           courseName_ = s;
           break;
         }
         case 26: {
           if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
             student_ = new java.util.ArrayList<com.baeldung.protobuf.BaeldungTraining.Student>();
             mutable_bitField0_ |= 0x00000004;
           }
           student_.add(
               input.readMessage(com.baeldung.protobuf.BaeldungTraining.Student.parser(), extensionRegistry));
           break;
         }
         default: {
           if (!parseUnknownFieldProto3(
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
     if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
       student_ = java.util.Collections.unmodifiableList(student_);
     }
     this.unknownFields = unknownFields.build();
     makeExtensionsImmutable();
   }
 }
 public static final com.google.protobuf.Descriptors.Descriptor
     getDescriptor() {
   return com.baeldung.protobuf.BaeldungTraining.internal_static_baeldung_Course_descriptor;
 }

 @java.lang.Override
 protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
     internalGetFieldAccessorTable() {
   return com.baeldung.protobuf.BaeldungTraining.internal_static_baeldung_Course_fieldAccessorTable
       .ensureFieldAccessorsInitialized(
           com.baeldung.protobuf.BaeldungTraining.Course.class, com.baeldung.protobuf.BaeldungTraining.Course.Builder.class);
 }

 private int bitField0_;
 public static final int ID_FIELD_NUMBER = 1;
 private int id_;
 /**
  * <code>int32 id = 1;</code>
  */
 public int getId() {
   return id_;
 }

 public static final int COURSE_NAME_FIELD_NUMBER = 2;
 private volatile java.lang.Object courseName_;
 /**
  * <code>string course_name = 2;</code>
  */
 public java.lang.String getCourseName() {
   java.lang.Object ref = courseName_;
   if (ref instanceof java.lang.String) {
     return (java.lang.String) ref;
   } else {
     com.google.protobuf.ByteString bs = 
         (com.google.protobuf.ByteString) ref;
     java.lang.String s = bs.toStringUtf8();
     courseName_ = s;
     return s;
   }
 }
 /**
  * <code>string course_name = 2;</code>
  */
 public com.google.protobuf.ByteString
     getCourseNameBytes() {
   java.lang.Object ref = courseName_;
   if (ref instanceof java.lang.String) {
     com.google.protobuf.ByteString b = 
         com.google.protobuf.ByteString.copyFromUtf8(
             (java.lang.String) ref);
     courseName_ = b;
     return b;
   } else {
     return (com.google.protobuf.ByteString) ref;
   }
 }

 public static final int STUDENT_FIELD_NUMBER = 3;
 private java.util.List<com.baeldung.protobuf.BaeldungTraining.Student> student_;
 /**
  * <code>repeated .baeldung.Student student = 3;</code>
  */
 public java.util.List<com.baeldung.protobuf.BaeldungTraining.Student> getStudentList() {
   return student_;
 }
 /**
  * <code>repeated .baeldung.Student student = 3;</code>
  */
 public java.util.List<? extends com.baeldung.protobuf.BaeldungTraining.StudentOrBuilder> 
     getStudentOrBuilderList() {
   return student_;
 }
 /**
  * <code>repeated .baeldung.Student student = 3;</code>
  */
 public int getStudentCount() {
   return student_.size();
 }
 /**
  * <code>repeated .baeldung.Student student = 3;</code>
  */
 public com.baeldung.protobuf.BaeldungTraining.Student getStudent(int index) {
   return student_.get(index);
 }
 /**
  * <code>repeated .baeldung.Student student = 3;</code>
  */
 public com.baeldung.protobuf.BaeldungTraining.StudentOrBuilder getStudentOrBuilder(
     int index) {
   return student_.get(index);
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
   if (id_ != 0) {
     output.writeInt32(1, id_);
   }
   if (!getCourseNameBytes().isEmpty()) {
     com.google.protobuf.GeneratedMessageV3.writeString(output, 2, courseName_);
   }
   for (int i = 0; i < student_.size(); i++) {
     output.writeMessage(3, student_.get(i));
   }
   unknownFields.writeTo(output);
 }

 @java.lang.Override
 public int getSerializedSize() {
   int size = memoizedSize;
   if (size != -1) return size;

   size = 0;
   if (id_ != 0) {
     size += com.google.protobuf.CodedOutputStream
       .computeInt32Size(1, id_);
   }
   if (!getCourseNameBytes().isEmpty()) {
     size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, courseName_);
   }
   for (int i = 0; i < student_.size(); i++) {
     size += com.google.protobuf.CodedOutputStream
       .computeMessageSize(3, student_.get(i));
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
   if (!(obj instanceof com.baeldung.protobuf.BaeldungTraining.Course)) {
     return super.equals(obj);
   }
   com.baeldung.protobuf.BaeldungTraining.Course other = (com.baeldung.protobuf.BaeldungTraining.Course) obj;

   boolean result = true;
   result = result && (getId()
       == other.getId());
   result = result && getCourseName()
       .equals(other.getCourseName());
   result = result && getStudentList()
       .equals(other.getStudentList());
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
   hash = (37 * hash) + ID_FIELD_NUMBER;
   hash = (53 * hash) + getId();
   hash = (37 * hash) + COURSE_NAME_FIELD_NUMBER;
   hash = (53 * hash) + getCourseName().hashCode();
   if (getStudentCount() > 0) {
     hash = (37 * hash) + STUDENT_FIELD_NUMBER;
     hash = (53 * hash) + getStudentList().hashCode();
   }
   hash = (29 * hash) + unknownFields.hashCode();
   memoizedHashCode = hash;
   return hash;
 }

 public static com.baeldung.protobuf.BaeldungTraining.Course parseFrom(
     java.nio.ByteBuffer data)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data);
 }
 public static com.baeldung.protobuf.BaeldungTraining.Course parseFrom(
     java.nio.ByteBuffer data,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data, extensionRegistry);
 }
 public static com.baeldung.protobuf.BaeldungTraining.Course parseFrom(
     com.google.protobuf.ByteString data)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data);
 }
 public static com.baeldung.protobuf.BaeldungTraining.Course parseFrom(
     com.google.protobuf.ByteString data,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data, extensionRegistry);
 }
 public static com.baeldung.protobuf.BaeldungTraining.Course parseFrom(byte[] data)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data);
 }
 public static com.baeldung.protobuf.BaeldungTraining.Course parseFrom(
     byte[] data,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data, extensionRegistry);
 }
 public static com.baeldung.protobuf.BaeldungTraining.Course parseFrom(java.io.InputStream input)
     throws java.io.IOException {
   return com.google.protobuf.GeneratedMessageV3
       .parseWithIOException(PARSER, input);
 }
 public static com.baeldung.protobuf.BaeldungTraining.Course parseFrom(
     java.io.InputStream input,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws java.io.IOException {
   return com.google.protobuf.GeneratedMessageV3
       .parseWithIOException(PARSER, input, extensionRegistry);
 }
 public static com.baeldung.protobuf.BaeldungTraining.Course parseDelimitedFrom(java.io.InputStream input)
     throws java.io.IOException {
   return com.google.protobuf.GeneratedMessageV3
       .parseDelimitedWithIOException(PARSER, input);
 }
 public static com.baeldung.protobuf.BaeldungTraining.Course parseDelimitedFrom(
     java.io.InputStream input,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws java.io.IOException {
   return com.google.protobuf.GeneratedMessageV3
       .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
 }
 public static com.baeldung.protobuf.BaeldungTraining.Course parseFrom(
     com.google.protobuf.CodedInputStream input)
     throws java.io.IOException {
   return com.google.protobuf.GeneratedMessageV3
       .parseWithIOException(PARSER, input);
 }
 public static com.baeldung.protobuf.BaeldungTraining.Course parseFrom(
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
 public static Builder newBuilder(com.baeldung.protobuf.BaeldungTraining.Course prototype) {
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
  * Protobuf type {@code baeldung.Course}
  */
 public static final class Builder extends
     com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
     // @@protoc_insertion_point(builder_implements:baeldung.Course)
     com.baeldung.protobuf.BaeldungTraining.CourseOrBuilder {
   public static final com.google.protobuf.Descriptors.Descriptor
       getDescriptor() {
     return com.baeldung.protobuf.BaeldungTraining.internal_static_baeldung_Course_descriptor;
   }

   @java.lang.Override
   protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
       internalGetFieldAccessorTable() {
     return com.baeldung.protobuf.BaeldungTraining.internal_static_baeldung_Course_fieldAccessorTable
         .ensureFieldAccessorsInitialized(
             com.baeldung.protobuf.BaeldungTraining.Course.class, com.baeldung.protobuf.BaeldungTraining.Course.Builder.class);
   }

   // Construct using com.baeldung.protobuf.BaeldungTraining.Course.newBuilder()
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
       getStudentFieldBuilder();
     }
   }
   @java.lang.Override
   public Builder clear() {
     super.clear();
     id_ = 0;

     courseName_ = "";

     if (studentBuilder_ == null) {
       student_ = java.util.Collections.emptyList();
       bitField0_ = (bitField0_ & ~0x00000004);
     } else {
       studentBuilder_.clear();
     }
     return this;
   }

   @java.lang.Override
   public com.google.protobuf.Descriptors.Descriptor
       getDescriptorForType() {
     return com.baeldung.protobuf.BaeldungTraining.internal_static_baeldung_Course_descriptor;
   }

   @java.lang.Override
   public com.baeldung.protobuf.BaeldungTraining.Course getDefaultInstanceForType() {
     return com.baeldung.protobuf.BaeldungTraining.Course.getDefaultInstance();
   }

   @java.lang.Override
   public com.baeldung.protobuf.BaeldungTraining.Course build() {
     com.baeldung.protobuf.BaeldungTraining.Course result = buildPartial();
     if (!result.isInitialized()) {
       throw newUninitializedMessageException(result);
     }
     return result;
   }

   @java.lang.Override
   public com.baeldung.protobuf.BaeldungTraining.Course buildPartial() {
     com.baeldung.protobuf.BaeldungTraining.Course result = new com.baeldung.protobuf.BaeldungTraining.Course(this);
     int from_bitField0_ = bitField0_;
     int to_bitField0_ = 0;
     result.id_ = id_;
     result.courseName_ = courseName_;
     if (studentBuilder_ == null) {
       if (((bitField0_ & 0x00000004) == 0x00000004)) {
         student_ = java.util.Collections.unmodifiableList(student_);
         bitField0_ = (bitField0_ & ~0x00000004);
       }
       result.student_ = student_;
     } else {
       result.student_ = studentBuilder_.build();
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
       com.google.protobuf.Descriptors.FieldDescriptor field,
       java.lang.Object value) {
     return (Builder) super.setField(field, value);
   }
   @java.lang.Override
   public Builder clearField(
       com.google.protobuf.Descriptors.FieldDescriptor field) {
     return (Builder) super.clearField(field);
   }
   @java.lang.Override
   public Builder clearOneof(
       com.google.protobuf.Descriptors.OneofDescriptor oneof) {
     return (Builder) super.clearOneof(oneof);
   }
   @java.lang.Override
   public Builder setRepeatedField(
       com.google.protobuf.Descriptors.FieldDescriptor field,
       int index, java.lang.Object value) {
     return (Builder) super.setRepeatedField(field, index, value);
   }
   @java.lang.Override
   public Builder addRepeatedField(
       com.google.protobuf.Descriptors.FieldDescriptor field,
       java.lang.Object value) {
     return (Builder) super.addRepeatedField(field, value);
   }
   @java.lang.Override
   public Builder mergeFrom(com.google.protobuf.Message other) {
     if (other instanceof com.baeldung.protobuf.BaeldungTraining.Course) {
       return mergeFrom((com.baeldung.protobuf.BaeldungTraining.Course)other);
     } else {
       super.mergeFrom(other);
       return this;
     }
   }

   public Builder mergeFrom(com.baeldung.protobuf.BaeldungTraining.Course other) {
     if (other == com.baeldung.protobuf.BaeldungTraining.Course.getDefaultInstance()) return this;
     if (other.getId() != 0) {
       setId(other.getId());
     }
     if (!other.getCourseName().isEmpty()) {
       courseName_ = other.courseName_;
       onChanged();
     }
     if (studentBuilder_ == null) {
       if (!other.student_.isEmpty()) {
         if (student_.isEmpty()) {
           student_ = other.student_;
           bitField0_ = (bitField0_ & ~0x00000004);
         } else {
           ensureStudentIsMutable();
           student_.addAll(other.student_);
         }
         onChanged();
       }
     } else {
       if (!other.student_.isEmpty()) {
         if (studentBuilder_.isEmpty()) {
           studentBuilder_.dispose();
           studentBuilder_ = null;
           student_ = other.student_;
           bitField0_ = (bitField0_ & ~0x00000004);
           studentBuilder_ = 
             com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                getStudentFieldBuilder() : null;
         } else {
           studentBuilder_.addAllMessages(other.student_);
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
     com.baeldung.protobuf.BaeldungTraining.Course parsedMessage = null;
     try {
       parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
     } catch (com.google.protobuf.InvalidProtocolBufferException e) {
       parsedMessage = (com.baeldung.protobuf.BaeldungTraining.Course) e.getUnfinishedMessage();
       throw e.unwrapIOException();
     } finally {
       if (parsedMessage != null) {
         mergeFrom(parsedMessage);
       }
     }
     return this;
   }
   private int bitField0_;

   private int id_ ;
   /**
    * <code>int32 id = 1;</code>
    */
   public int getId() {
     return id_;
   }
   /**
    * <code>int32 id = 1;</code>
    */
   public Builder setId(int value) {
     
     id_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>int32 id = 1;</code>
    */
   public Builder clearId() {
     
     id_ = 0;
     onChanged();
     return this;
   }

   private java.lang.Object courseName_ = "";
   /**
    * <code>string course_name = 2;</code>
    */
   public java.lang.String getCourseName() {
     java.lang.Object ref = courseName_;
     if (!(ref instanceof java.lang.String)) {
       com.google.protobuf.ByteString bs =
           (com.google.protobuf.ByteString) ref;
       java.lang.String s = bs.toStringUtf8();
       courseName_ = s;
       return s;
     } else {
       return (java.lang.String) ref;
     }
   }
   /**
    * <code>string course_name = 2;</code>
    */
   public com.google.protobuf.ByteString
       getCourseNameBytes() {
     java.lang.Object ref = courseName_;
     if (ref instanceof String) {
       com.google.protobuf.ByteString b = 
           com.google.protobuf.ByteString.copyFromUtf8(
               (java.lang.String) ref);
       courseName_ = b;
       return b;
     } else {
       return (com.google.protobuf.ByteString) ref;
     }
   }
   /**
    * <code>string course_name = 2;</code>
    */
   public Builder setCourseName(
       java.lang.String value) {
     if (value == null) {
 throw new NullPointerException();
}

     courseName_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>string course_name = 2;</code>
    */
   public Builder clearCourseName() {
     
     courseName_ = getDefaultInstance().getCourseName();
     onChanged();
     return this;
   }
   /**
    * <code>string course_name = 2;</code>
    */
   public Builder setCourseNameBytes(
       com.google.protobuf.ByteString value) {
     if (value == null) {
 throw new NullPointerException();
}
checkByteStringIsUtf8(value);
     
     courseName_ = value;
     onChanged();
     return this;
   }

   private java.util.List<com.baeldung.protobuf.BaeldungTraining.Student> student_ =
     java.util.Collections.emptyList();
   private void ensureStudentIsMutable() {
     if (!((bitField0_ & 0x00000004) == 0x00000004)) {
       student_ = new java.util.ArrayList<com.baeldung.protobuf.BaeldungTraining.Student>(student_);
       bitField0_ |= 0x00000004;
      }
   }

   private com.google.protobuf.RepeatedFieldBuilderV3<
       com.baeldung.protobuf.BaeldungTraining.Student, com.baeldung.protobuf.BaeldungTraining.Student.Builder, com.baeldung.protobuf.BaeldungTraining.StudentOrBuilder> studentBuilder_;

   /**
    * <code>repeated .baeldung.Student student = 3;</code>
    */
   public java.util.List<com.baeldung.protobuf.BaeldungTraining.Student> getStudentList() {
     if (studentBuilder_ == null) {
       return java.util.Collections.unmodifiableList(student_);
     } else {
       return studentBuilder_.getMessageList();
     }
   }
   /**
    * <code>repeated .baeldung.Student student = 3;</code>
    */
   public int getStudentCount() {
     if (studentBuilder_ == null) {
       return student_.size();
     } else {
       return studentBuilder_.getCount();
     }
   }
   /**
    * <code>repeated .baeldung.Student student = 3;</code>
    */
   public com.baeldung.protobuf.BaeldungTraining.Student getStudent(int index) {
     if (studentBuilder_ == null) {
       return student_.get(index);
     } else {
       return studentBuilder_.getMessage(index);
     }
   }
   /**
    * <code>repeated .baeldung.Student student = 3;</code>
    */
   public Builder setStudent(
       int index, com.baeldung.protobuf.BaeldungTraining.Student value) {
     if (studentBuilder_ == null) {
       if (value == null) {
         throw new NullPointerException();
       }
       ensureStudentIsMutable();
       student_.set(index, value);
       onChanged();
     } else {
       studentBuilder_.setMessage(index, value);
     }
     return this;
   }
   /**
    * <code>repeated .baeldung.Student student = 3;</code>
    */
   public Builder setStudent(
       int index, com.baeldung.protobuf.BaeldungTraining.Student.Builder builderForValue) {
     if (studentBuilder_ == null) {
       ensureStudentIsMutable();
       student_.set(index, builderForValue.build());
       onChanged();
     } else {
       studentBuilder_.setMessage(index, builderForValue.build());
     }
     return this;
   }
   /**
    * <code>repeated .baeldung.Student student = 3;</code>
    */
   public Builder addStudent(com.baeldung.protobuf.BaeldungTraining.Student value) {
     if (studentBuilder_ == null) {
       if (value == null) {
         throw new NullPointerException();
       }
       ensureStudentIsMutable();
       student_.add(value);
       onChanged();
     } else {
       studentBuilder_.addMessage(value);
     }
     return this;
   }
   /**
    * <code>repeated .baeldung.Student student = 3;</code>
    */
   public Builder addStudent(
       int index, com.baeldung.protobuf.BaeldungTraining.Student value) {
     if (studentBuilder_ == null) {
       if (value == null) {
         throw new NullPointerException();
       }
       ensureStudentIsMutable();
       student_.add(index, value);
       onChanged();
     } else {
       studentBuilder_.addMessage(index, value);
     }
     return this;
   }
   /**
    * <code>repeated .baeldung.Student student = 3;</code>
    */
   public Builder addStudent(
       com.baeldung.protobuf.BaeldungTraining.Student.Builder builderForValue) {
     if (studentBuilder_ == null) {
       ensureStudentIsMutable();
       student_.add(builderForValue.build());
       onChanged();
     } else {
       studentBuilder_.addMessage(builderForValue.build());
     }
     return this;
   }
   /**
    * <code>repeated .baeldung.Student student = 3;</code>
    */
   public Builder addStudent(
       int index, com.baeldung.protobuf.BaeldungTraining.Student.Builder builderForValue) {
     if (studentBuilder_ == null) {
       ensureStudentIsMutable();
       student_.add(index, builderForValue.build());
       onChanged();
     } else {
       studentBuilder_.addMessage(index, builderForValue.build());
     }
     return this;
   }
   /**
    * <code>repeated .baeldung.Student student = 3;</code>
    */
   public Builder addAllStudent(
       java.lang.Iterable<? extends com.baeldung.protobuf.BaeldungTraining.Student> values) {
     if (studentBuilder_ == null) {
       ensureStudentIsMutable();
       com.google.protobuf.AbstractMessageLite.Builder.addAll(
           values, student_);
       onChanged();
     } else {
       studentBuilder_.addAllMessages(values);
     }
     return this;
   }
   /**
    * <code>repeated .baeldung.Student student = 3;</code>
    */
   public Builder clearStudent() {
     if (studentBuilder_ == null) {
       student_ = java.util.Collections.emptyList();
       bitField0_ = (bitField0_ & ~0x00000004);
       onChanged();
     } else {
       studentBuilder_.clear();
     }
     return this;
   }
   /**
    * <code>repeated .baeldung.Student student = 3;</code>
    */
   public Builder removeStudent(int index) {
     if (studentBuilder_ == null) {
       ensureStudentIsMutable();
       student_.remove(index);
       onChanged();
     } else {
       studentBuilder_.remove(index);
     }
     return this;
   }
   /**
    * <code>repeated .baeldung.Student student = 3;</code>
    */
   public com.baeldung.protobuf.BaeldungTraining.Student.Builder getStudentBuilder(
       int index) {
     return getStudentFieldBuilder().getBuilder(index);
   }
   /**
    * <code>repeated .baeldung.Student student = 3;</code>
    */
   public com.baeldung.protobuf.BaeldungTraining.StudentOrBuilder getStudentOrBuilder(
       int index) {
     if (studentBuilder_ == null) {
       return student_.get(index);  } else {
       return studentBuilder_.getMessageOrBuilder(index);
     }
   }
   /**
    * <code>repeated .baeldung.Student student = 3;</code>
    */
   public java.util.List<? extends com.baeldung.protobuf.BaeldungTraining.StudentOrBuilder> 
        getStudentOrBuilderList() {
     if (studentBuilder_ != null) {
       return studentBuilder_.getMessageOrBuilderList();
     } else {
       return java.util.Collections.unmodifiableList(student_);
     }
   }
   /**
    * <code>repeated .baeldung.Student student = 3;</code>
    */
   public com.baeldung.protobuf.BaeldungTraining.Student.Builder addStudentBuilder() {
     return getStudentFieldBuilder().addBuilder(
         com.baeldung.protobuf.BaeldungTraining.Student.getDefaultInstance());
   }
   /**
    * <code>repeated .baeldung.Student student = 3;</code>
    */
   public com.baeldung.protobuf.BaeldungTraining.Student.Builder addStudentBuilder(
       int index) {
     return getStudentFieldBuilder().addBuilder(
         index, com.baeldung.protobuf.BaeldungTraining.Student.getDefaultInstance());
   }
   /**
    * <code>repeated .baeldung.Student student = 3;</code>
    */
   public java.util.List<com.baeldung.protobuf.BaeldungTraining.Student.Builder> 
        getStudentBuilderList() {
     return getStudentFieldBuilder().getBuilderList();
   }
   private com.google.protobuf.RepeatedFieldBuilderV3<
       com.baeldung.protobuf.BaeldungTraining.Student, com.baeldung.protobuf.BaeldungTraining.Student.Builder, com.baeldung.protobuf.BaeldungTraining.StudentOrBuilder> 
       getStudentFieldBuilder() {
     if (studentBuilder_ == null) {
       studentBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
           com.baeldung.protobuf.BaeldungTraining.Student, com.baeldung.protobuf.BaeldungTraining.Student.Builder, com.baeldung.protobuf.BaeldungTraining.StudentOrBuilder>(
               student_,
               ((bitField0_ & 0x00000004) == 0x00000004),
               getParentForChildren(),
               isClean());
       student_ = null;
     }
     return studentBuilder_;
   }
   @java.lang.Override
   public final Builder setUnknownFields(
       final com.google.protobuf.UnknownFieldSet unknownFields) {
     return super.setUnknownFieldsProto3(unknownFields);
   }

   @java.lang.Override
   public final Builder mergeUnknownFields(
       final com.google.protobuf.UnknownFieldSet unknownFields) {
     return super.mergeUnknownFields(unknownFields);
   }


   // @@protoc_insertion_point(builder_scope:baeldung.Course)
 }

 // @@protoc_insertion_point(class_scope:baeldung.Course)
 private static final com.baeldung.protobuf.BaeldungTraining.Course DEFAULT_INSTANCE;
 static {
   DEFAULT_INSTANCE = new com.baeldung.protobuf.BaeldungTraining.Course();
 }

 public static com.baeldung.protobuf.BaeldungTraining.Course getDefaultInstance() {
   return DEFAULT_INSTANCE;
 }

 private static final com.google.protobuf.Parser<Course>
     PARSER = new com.google.protobuf.AbstractParser<Course>() {
   @java.lang.Override
   public Course parsePartialFrom(
       com.google.protobuf.CodedInputStream input,
       com.google.protobuf.ExtensionRegistryLite extensionRegistry)
       throws com.google.protobuf.InvalidProtocolBufferException {
     return new Course(input, extensionRegistry);
   }
 };

 public static com.google.protobuf.Parser<Course> parser() {
   return PARSER;
 }

 @java.lang.Override
 public com.google.protobuf.Parser<Course> getParserForType() {
   return PARSER;
 }

 @java.lang.Override
 public com.baeldung.protobuf.BaeldungTraining.Course getDefaultInstanceForType() {
   return DEFAULT_INSTANCE;
 }

}

public interface StudentOrBuilder extends
   // @@protoc_insertion_point(interface_extends:baeldung.Student)
   com.google.protobuf.MessageOrBuilder {

 /**
  * <code>int32 id = 1;</code>
  */
 int getId();

 /**
  * <code>string first_name = 2;</code>
  */
 java.lang.String getFirstName();
 /**
  * <code>string first_name = 2;</code>
  */
 com.google.protobuf.ByteString
     getFirstNameBytes();

 /**
  * <code>string last_name = 3;</code>
  */
 java.lang.String getLastName();
 /**
  * <code>string last_name = 3;</code>
  */
 com.google.protobuf.ByteString
     getLastNameBytes();

 /**
  * <code>string email = 4;</code>
  */
 java.lang.String getEmail();
 /**
  * <code>string email = 4;</code>
  */
 com.google.protobuf.ByteString
     getEmailBytes();

 /**
  * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
  */
 java.util.List<com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber> 
     getPhoneList();
 /**
  * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
  */
 com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber getPhone(int index);
 /**
  * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
  */
 int getPhoneCount();
 /**
  * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
  */
 java.util.List<? extends com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumberOrBuilder> 
     getPhoneOrBuilderList();
 /**
  * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
  */
 com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumberOrBuilder getPhoneOrBuilder(
     int index);
}
/**
* Protobuf type {@code baeldung.Student}
*/
public  static final class Student extends
   com.google.protobuf.GeneratedMessageV3 implements
   // @@protoc_insertion_point(message_implements:baeldung.Student)
   StudentOrBuilder {
private static final long serialVersionUID = 0L;
 // Use Student.newBuilder() to construct.
 private Student(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
   super(builder);
 }
 private Student() {
   id_ = 0;
   firstName_ = "";
   lastName_ = "";
   email_ = "";
   phone_ = java.util.Collections.emptyList();
 }

 @java.lang.Override
 public final com.google.protobuf.UnknownFieldSet
 getUnknownFields() {
   return this.unknownFields;
 }
 private Student(
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
         case 8: {

           id_ = input.readInt32();
           break;
         }
         case 18: {
           java.lang.String s = input.readStringRequireUtf8();

           firstName_ = s;
           break;
         }
         case 26: {
           java.lang.String s = input.readStringRequireUtf8();

           lastName_ = s;
           break;
         }
         case 34: {
           java.lang.String s = input.readStringRequireUtf8();

           email_ = s;
           break;
         }
         case 42: {
           if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
             phone_ = new java.util.ArrayList<com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber>();
             mutable_bitField0_ |= 0x00000010;
           }
           phone_.add(
               input.readMessage(com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber.parser(), extensionRegistry));
           break;
         }
         default: {
           if (!parseUnknownFieldProto3(
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
     if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
       phone_ = java.util.Collections.unmodifiableList(phone_);
     }
     this.unknownFields = unknownFields.build();
     makeExtensionsImmutable();
   }
 }
 public static final com.google.protobuf.Descriptors.Descriptor
     getDescriptor() {
   return com.baeldung.protobuf.BaeldungTraining.internal_static_baeldung_Student_descriptor;
 }

 @java.lang.Override
 protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
     internalGetFieldAccessorTable() {
   return com.baeldung.protobuf.BaeldungTraining.internal_static_baeldung_Student_fieldAccessorTable
       .ensureFieldAccessorsInitialized(
           com.baeldung.protobuf.BaeldungTraining.Student.class, com.baeldung.protobuf.BaeldungTraining.Student.Builder.class);
 }

 /**
  * Protobuf enum {@code baeldung.Student.PhoneType}
  */
 public enum PhoneType
     implements com.google.protobuf.ProtocolMessageEnum {
   /**
    * <code>MOBILE = 0;</code>
    */
   MOBILE(0),
   /**
    * <code>LANDLINE = 1;</code>
    */
   LANDLINE(1),
   UNRECOGNIZED(-1),
   ;

   /**
    * <code>MOBILE = 0;</code>
    */
   public static final int MOBILE_VALUE = 0;
   /**
    * <code>LANDLINE = 1;</code>
    */
   public static final int LANDLINE_VALUE = 1;


   public final int getNumber() {
     if (this == UNRECOGNIZED) {
       throw new java.lang.IllegalArgumentException(
           "Can't get the number of an unknown enum value.");
     }
     return value;
   }

   /**
    * @deprecated Use {@link #forNumber(int)} instead.
    */
   @java.lang.Deprecated
   public static PhoneType valueOf(int value) {
     return forNumber(value);
   }

   public static PhoneType forNumber(int value) {
     switch (value) {
       case 0: return MOBILE;
       case 1: return LANDLINE;
       default: return null;
     }
   }

   public static com.google.protobuf.Internal.EnumLiteMap<PhoneType>
       internalGetValueMap() {
     return internalValueMap;
   }
   private static final com.google.protobuf.Internal.EnumLiteMap<
       PhoneType> internalValueMap =
         new com.google.protobuf.Internal.EnumLiteMap<PhoneType>() {
           public PhoneType findValueByNumber(int number) {
             return PhoneType.forNumber(number);
           }
         };

   public final com.google.protobuf.Descriptors.EnumValueDescriptor
       getValueDescriptor() {
     return getDescriptor().getValues().get(ordinal());
   }
   public final com.google.protobuf.Descriptors.EnumDescriptor
       getDescriptorForType() {
     return getDescriptor();
   }
   public static final com.google.protobuf.Descriptors.EnumDescriptor
       getDescriptor() {
     return com.baeldung.protobuf.BaeldungTraining.Student.getDescriptor().getEnumTypes().get(0);
   }

   private static final PhoneType[] VALUES = values();

   public static PhoneType valueOf(
       com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
     if (desc.getType() != getDescriptor()) {
       throw new java.lang.IllegalArgumentException(
         "EnumValueDescriptor is not for this type.");
     }
     if (desc.getIndex() == -1) {
       return UNRECOGNIZED;
     }
     return VALUES[desc.getIndex()];
   }

   private final int value;

   private PhoneType(int value) {
     this.value = value;
   }

   // @@protoc_insertion_point(enum_scope:baeldung.Student.PhoneType)
 }

 public interface PhoneNumberOrBuilder extends
     // @@protoc_insertion_point(interface_extends:baeldung.Student.PhoneNumber)
     com.google.protobuf.MessageOrBuilder {

   /**
    * <code>string number = 1;</code>
    */
   java.lang.String getNumber();
   /**
    * <code>string number = 1;</code>
    */
   com.google.protobuf.ByteString
       getNumberBytes();

   /**
    * <code>.baeldung.Student.PhoneType type = 2;</code>
    */
   int getTypeValue();
   /**
    * <code>.baeldung.Student.PhoneType type = 2;</code>
    */
   com.baeldung.protobuf.BaeldungTraining.Student.PhoneType getType();
 }
 /**
  * Protobuf type {@code baeldung.Student.PhoneNumber}
  */
 public  static final class PhoneNumber extends
     com.google.protobuf.GeneratedMessageV3 implements
     // @@protoc_insertion_point(message_implements:baeldung.Student.PhoneNumber)
     PhoneNumberOrBuilder {
 private static final long serialVersionUID = 0L;
   // Use PhoneNumber.newBuilder() to construct.
   private PhoneNumber(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
     super(builder);
   }
   private PhoneNumber() {
     number_ = "";
     type_ = 0;
   }

   @java.lang.Override
   public final com.google.protobuf.UnknownFieldSet
   getUnknownFields() {
     return this.unknownFields;
   }
   private PhoneNumber(
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
           case 10: {
             java.lang.String s = input.readStringRequireUtf8();

             number_ = s;
             break;
           }
           case 16: {
             int rawValue = input.readEnum();

             type_ = rawValue;
             break;
           }
           default: {
             if (!parseUnknownFieldProto3(
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
     return com.baeldung.protobuf.BaeldungTraining.internal_static_baeldung_Student_PhoneNumber_descriptor;
   }

   @java.lang.Override
   protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
       internalGetFieldAccessorTable() {
     return com.baeldung.protobuf.BaeldungTraining.internal_static_baeldung_Student_PhoneNumber_fieldAccessorTable
         .ensureFieldAccessorsInitialized(
             com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber.class, com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber.Builder.class);
   }

   public static final int NUMBER_FIELD_NUMBER = 1;
   private volatile java.lang.Object number_;
   /**
    * <code>string number = 1;</code>
    */
   public java.lang.String getNumber() {
     java.lang.Object ref = number_;
     if (ref instanceof java.lang.String) {
       return (java.lang.String) ref;
     } else {
       com.google.protobuf.ByteString bs = 
           (com.google.protobuf.ByteString) ref;
       java.lang.String s = bs.toStringUtf8();
       number_ = s;
       return s;
     }
   }
   /**
    * <code>string number = 1;</code>
    */
   public com.google.protobuf.ByteString
       getNumberBytes() {
     java.lang.Object ref = number_;
     if (ref instanceof java.lang.String) {
       com.google.protobuf.ByteString b = 
           com.google.protobuf.ByteString.copyFromUtf8(
               (java.lang.String) ref);
       number_ = b;
       return b;
     } else {
       return (com.google.protobuf.ByteString) ref;
     }
   }

   public static final int TYPE_FIELD_NUMBER = 2;
   private int type_;
   /**
    * <code>.baeldung.Student.PhoneType type = 2;</code>
    */
   public int getTypeValue() {
     return type_;
   }
   /**
    * <code>.baeldung.Student.PhoneType type = 2;</code>
    */
   public com.baeldung.protobuf.BaeldungTraining.Student.PhoneType getType() {
     @SuppressWarnings("deprecation")
     com.baeldung.protobuf.BaeldungTraining.Student.PhoneType result = com.baeldung.protobuf.BaeldungTraining.Student.PhoneType.valueOf(type_);
     return result == null ? com.baeldung.protobuf.BaeldungTraining.Student.PhoneType.UNRECOGNIZED : result;
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
     if (!getNumberBytes().isEmpty()) {
       com.google.protobuf.GeneratedMessageV3.writeString(output, 1, number_);
     }
     if (type_ != com.baeldung.protobuf.BaeldungTraining.Student.PhoneType.MOBILE.getNumber()) {
       output.writeEnum(2, type_);
     }
     unknownFields.writeTo(output);
   }

   @java.lang.Override
   public int getSerializedSize() {
     int size = memoizedSize;
     if (size != -1) return size;

     size = 0;
     if (!getNumberBytes().isEmpty()) {
       size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, number_);
     }
     if (type_ != com.baeldung.protobuf.BaeldungTraining.Student.PhoneType.MOBILE.getNumber()) {
       size += com.google.protobuf.CodedOutputStream
         .computeEnumSize(2, type_);
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
     if (!(obj instanceof com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber)) {
       return super.equals(obj);
     }
     com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber other = (com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber) obj;

     boolean result = true;
     result = result && getNumber()
         .equals(other.getNumber());
     result = result && type_ == other.type_;
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
     hash = (37 * hash) + NUMBER_FIELD_NUMBER;
     hash = (53 * hash) + getNumber().hashCode();
     hash = (37 * hash) + TYPE_FIELD_NUMBER;
     hash = (53 * hash) + type_;
     hash = (29 * hash) + unknownFields.hashCode();
     memoizedHashCode = hash;
     return hash;
   }

   public static com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber parseFrom(
       java.nio.ByteBuffer data)
       throws com.google.protobuf.InvalidProtocolBufferException {
     return PARSER.parseFrom(data);
   }
   public static com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber parseFrom(
       java.nio.ByteBuffer data,
       com.google.protobuf.ExtensionRegistryLite extensionRegistry)
       throws com.google.protobuf.InvalidProtocolBufferException {
     return PARSER.parseFrom(data, extensionRegistry);
   }
   public static com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber parseFrom(
       com.google.protobuf.ByteString data)
       throws com.google.protobuf.InvalidProtocolBufferException {
     return PARSER.parseFrom(data);
   }
   public static com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber parseFrom(
       com.google.protobuf.ByteString data,
       com.google.protobuf.ExtensionRegistryLite extensionRegistry)
       throws com.google.protobuf.InvalidProtocolBufferException {
     return PARSER.parseFrom(data, extensionRegistry);
   }
   public static com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber parseFrom(byte[] data)
       throws com.google.protobuf.InvalidProtocolBufferException {
     return PARSER.parseFrom(data);
   }
   public static com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber parseFrom(
       byte[] data,
       com.google.protobuf.ExtensionRegistryLite extensionRegistry)
       throws com.google.protobuf.InvalidProtocolBufferException {
     return PARSER.parseFrom(data, extensionRegistry);
   }
   public static com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber parseFrom(java.io.InputStream input)
       throws java.io.IOException {
     return com.google.protobuf.GeneratedMessageV3
         .parseWithIOException(PARSER, input);
   }
   public static com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber parseFrom(
       java.io.InputStream input,
       com.google.protobuf.ExtensionRegistryLite extensionRegistry)
       throws java.io.IOException {
     return com.google.protobuf.GeneratedMessageV3
         .parseWithIOException(PARSER, input, extensionRegistry);
   }
   public static com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber parseDelimitedFrom(java.io.InputStream input)
       throws java.io.IOException {
     return com.google.protobuf.GeneratedMessageV3
         .parseDelimitedWithIOException(PARSER, input);
   }
   public static com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber parseDelimitedFrom(
       java.io.InputStream input,
       com.google.protobuf.ExtensionRegistryLite extensionRegistry)
       throws java.io.IOException {
     return com.google.protobuf.GeneratedMessageV3
         .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
   }
   public static com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber parseFrom(
       com.google.protobuf.CodedInputStream input)
       throws java.io.IOException {
     return com.google.protobuf.GeneratedMessageV3
         .parseWithIOException(PARSER, input);
   }
   public static com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber parseFrom(
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
   public static Builder newBuilder(com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber prototype) {
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
    * Protobuf type {@code baeldung.Student.PhoneNumber}
    */
   public static final class Builder extends
       com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
       // @@protoc_insertion_point(builder_implements:baeldung.Student.PhoneNumber)
       com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumberOrBuilder {
     public static final com.google.protobuf.Descriptors.Descriptor
         getDescriptor() {
       return com.baeldung.protobuf.BaeldungTraining.internal_static_baeldung_Student_PhoneNumber_descriptor;
     }

     @java.lang.Override
     protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
         internalGetFieldAccessorTable() {
       return com.baeldung.protobuf.BaeldungTraining.internal_static_baeldung_Student_PhoneNumber_fieldAccessorTable
           .ensureFieldAccessorsInitialized(
               com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber.class, com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber.Builder.class);
     }

     // Construct using com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber.newBuilder()
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
       number_ = "";

       type_ = 0;

       return this;
     }

     @java.lang.Override
     public com.google.protobuf.Descriptors.Descriptor
         getDescriptorForType() {
       return com.baeldung.protobuf.BaeldungTraining.internal_static_baeldung_Student_PhoneNumber_descriptor;
     }

     @java.lang.Override
     public com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber getDefaultInstanceForType() {
       return com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber.getDefaultInstance();
     }

     @java.lang.Override
     public com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber build() {
       com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber result = buildPartial();
       if (!result.isInitialized()) {
         throw newUninitializedMessageException(result);
       }
       return result;
     }

     @java.lang.Override
     public com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber buildPartial() {
       com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber result = new com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber(this);
       result.number_ = number_;
       result.type_ = type_;
       onBuilt();
       return result;
     }

     @java.lang.Override
     public Builder clone() {
       return (Builder) super.clone();
     }
     @java.lang.Override
     public Builder setField(
         com.google.protobuf.Descriptors.FieldDescriptor field,
         java.lang.Object value) {
       return (Builder) super.setField(field, value);
     }
     @java.lang.Override
     public Builder clearField(
         com.google.protobuf.Descriptors.FieldDescriptor field) {
       return (Builder) super.clearField(field);
     }
     @java.lang.Override
     public Builder clearOneof(
         com.google.protobuf.Descriptors.OneofDescriptor oneof) {
       return (Builder) super.clearOneof(oneof);
     }
     @java.lang.Override
     public Builder setRepeatedField(
         com.google.protobuf.Descriptors.FieldDescriptor field,
         int index, java.lang.Object value) {
       return (Builder) super.setRepeatedField(field, index, value);
     }
     @java.lang.Override
     public Builder addRepeatedField(
         com.google.protobuf.Descriptors.FieldDescriptor field,
         java.lang.Object value) {
       return (Builder) super.addRepeatedField(field, value);
     }
     @java.lang.Override
     public Builder mergeFrom(com.google.protobuf.Message other) {
       if (other instanceof com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber) {
         return mergeFrom((com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber)other);
       } else {
         super.mergeFrom(other);
         return this;
       }
     }

     public Builder mergeFrom(com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber other) {
       if (other == com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber.getDefaultInstance()) return this;
       if (!other.getNumber().isEmpty()) {
         number_ = other.number_;
         onChanged();
       }
       if (other.type_ != 0) {
         setTypeValue(other.getTypeValue());
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
       com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber parsedMessage = null;
       try {
         parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
       } catch (com.google.protobuf.InvalidProtocolBufferException e) {
         parsedMessage = (com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber) e.getUnfinishedMessage();
         throw e.unwrapIOException();
       } finally {
         if (parsedMessage != null) {
           mergeFrom(parsedMessage);
         }
       }
       return this;
     }

     private java.lang.Object number_ = "";
     /**
      * <code>string number = 1;</code>
      */
     public java.lang.String getNumber() {
       java.lang.Object ref = number_;
       if (!(ref instanceof java.lang.String)) {
         com.google.protobuf.ByteString bs =
             (com.google.protobuf.ByteString) ref;
         java.lang.String s = bs.toStringUtf8();
         number_ = s;
         return s;
       } else {
         return (java.lang.String) ref;
       }
     }
     /**
      * <code>string number = 1;</code>
      */
     public com.google.protobuf.ByteString
         getNumberBytes() {
       java.lang.Object ref = number_;
       if (ref instanceof String) {
         com.google.protobuf.ByteString b = 
             com.google.protobuf.ByteString.copyFromUtf8(
                 (java.lang.String) ref);
         number_ = b;
         return b;
       } else {
         return (com.google.protobuf.ByteString) ref;
       }
     }
     /**
      * <code>string number = 1;</code>
      */
     public Builder setNumber(
         java.lang.String value) {
       if (value == null) {
 throw new NullPointerException();
}

       number_ = value;
       onChanged();
       return this;
     }
     /**
      * <code>string number = 1;</code>
      */
     public Builder clearNumber() {
       
       number_ = getDefaultInstance().getNumber();
       onChanged();
       return this;
     }
     /**
      * <code>string number = 1;</code>
      */
     public Builder setNumberBytes(
         com.google.protobuf.ByteString value) {
       if (value == null) {
 throw new NullPointerException();
}
checkByteStringIsUtf8(value);
       
       number_ = value;
       onChanged();
       return this;
     }

     private int type_ = 0;
     /**
      * <code>.baeldung.Student.PhoneType type = 2;</code>
      */
     public int getTypeValue() {
       return type_;
     }
     /**
      * <code>.baeldung.Student.PhoneType type = 2;</code>
      */
     public Builder setTypeValue(int value) {
       type_ = value;
       onChanged();
       return this;
     }
     /**
      * <code>.baeldung.Student.PhoneType type = 2;</code>
      */
     public com.baeldung.protobuf.BaeldungTraining.Student.PhoneType getType() {
       @SuppressWarnings("deprecation")
       com.baeldung.protobuf.BaeldungTraining.Student.PhoneType result = com.baeldung.protobuf.BaeldungTraining.Student.PhoneType.valueOf(type_);
       return result == null ? com.baeldung.protobuf.BaeldungTraining.Student.PhoneType.UNRECOGNIZED : result;
     }
     /**
      * <code>.baeldung.Student.PhoneType type = 2;</code>
      */
     public Builder setType(com.baeldung.protobuf.BaeldungTraining.Student.PhoneType value) {
       if (value == null) {
         throw new NullPointerException();
       }
       
       type_ = value.getNumber();
       onChanged();
       return this;
     }
     /**
      * <code>.baeldung.Student.PhoneType type = 2;</code>
      */
     public Builder clearType() {
       
       type_ = 0;
       onChanged();
       return this;
     }
     @java.lang.Override
     public final Builder setUnknownFields(
         final com.google.protobuf.UnknownFieldSet unknownFields) {
       return super.setUnknownFieldsProto3(unknownFields);
     }

     @java.lang.Override
     public final Builder mergeUnknownFields(
         final com.google.protobuf.UnknownFieldSet unknownFields) {
       return super.mergeUnknownFields(unknownFields);
     }


     // @@protoc_insertion_point(builder_scope:baeldung.Student.PhoneNumber)
   }

   // @@protoc_insertion_point(class_scope:baeldung.Student.PhoneNumber)
   private static final com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber DEFAULT_INSTANCE;
   static {
     DEFAULT_INSTANCE = new com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber();
   }

   public static com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber getDefaultInstance() {
     return DEFAULT_INSTANCE;
   }

   private static final com.google.protobuf.Parser<PhoneNumber>
       PARSER = new com.google.protobuf.AbstractParser<PhoneNumber>() {
     @java.lang.Override
     public PhoneNumber parsePartialFrom(
         com.google.protobuf.CodedInputStream input,
         com.google.protobuf.ExtensionRegistryLite extensionRegistry)
         throws com.google.protobuf.InvalidProtocolBufferException {
       return new PhoneNumber(input, extensionRegistry);
     }
   };

   public static com.google.protobuf.Parser<PhoneNumber> parser() {
     return PARSER;
   }

   @java.lang.Override
   public com.google.protobuf.Parser<PhoneNumber> getParserForType() {
     return PARSER;
   }

   @java.lang.Override
   public com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber getDefaultInstanceForType() {
     return DEFAULT_INSTANCE;
   }

 }

 private int bitField0_;
 public static final int ID_FIELD_NUMBER = 1;
 private int id_;
 /**
  * <code>int32 id = 1;</code>
  */
 public int getId() {
   return id_;
 }

 public static final int FIRST_NAME_FIELD_NUMBER = 2;
 private volatile java.lang.Object firstName_;
 /**
  * <code>string first_name = 2;</code>
  */
 public java.lang.String getFirstName() {
   java.lang.Object ref = firstName_;
   if (ref instanceof java.lang.String) {
     return (java.lang.String) ref;
   } else {
     com.google.protobuf.ByteString bs = 
         (com.google.protobuf.ByteString) ref;
     java.lang.String s = bs.toStringUtf8();
     firstName_ = s;
     return s;
   }
 }
 /**
  * <code>string first_name = 2;</code>
  */
 public com.google.protobuf.ByteString
     getFirstNameBytes() {
   java.lang.Object ref = firstName_;
   if (ref instanceof java.lang.String) {
     com.google.protobuf.ByteString b = 
         com.google.protobuf.ByteString.copyFromUtf8(
             (java.lang.String) ref);
     firstName_ = b;
     return b;
   } else {
     return (com.google.protobuf.ByteString) ref;
   }
 }

 public static final int LAST_NAME_FIELD_NUMBER = 3;
 private volatile java.lang.Object lastName_;
 /**
  * <code>string last_name = 3;</code>
  */
 public java.lang.String getLastName() {
   java.lang.Object ref = lastName_;
   if (ref instanceof java.lang.String) {
     return (java.lang.String) ref;
   } else {
     com.google.protobuf.ByteString bs = 
         (com.google.protobuf.ByteString) ref;
     java.lang.String s = bs.toStringUtf8();
     lastName_ = s;
     return s;
   }
 }
 /**
  * <code>string last_name = 3;</code>
  */
 public com.google.protobuf.ByteString
     getLastNameBytes() {
   java.lang.Object ref = lastName_;
   if (ref instanceof java.lang.String) {
     com.google.protobuf.ByteString b = 
         com.google.protobuf.ByteString.copyFromUtf8(
             (java.lang.String) ref);
     lastName_ = b;
     return b;
   } else {
     return (com.google.protobuf.ByteString) ref;
   }
 }

 public static final int EMAIL_FIELD_NUMBER = 4;
 private volatile java.lang.Object email_;
 /**
  * <code>string email = 4;</code>
  */
 public java.lang.String getEmail() {
   java.lang.Object ref = email_;
   if (ref instanceof java.lang.String) {
     return (java.lang.String) ref;
   } else {
     com.google.protobuf.ByteString bs = 
         (com.google.protobuf.ByteString) ref;
     java.lang.String s = bs.toStringUtf8();
     email_ = s;
     return s;
   }
 }
 /**
  * <code>string email = 4;</code>
  */
 public com.google.protobuf.ByteString
     getEmailBytes() {
   java.lang.Object ref = email_;
   if (ref instanceof java.lang.String) {
     com.google.protobuf.ByteString b = 
         com.google.protobuf.ByteString.copyFromUtf8(
             (java.lang.String) ref);
     email_ = b;
     return b;
   } else {
     return (com.google.protobuf.ByteString) ref;
   }
 }

 public static final int PHONE_FIELD_NUMBER = 5;
 private java.util.List<com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber> phone_;
 /**
  * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
  */
 public java.util.List<com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber> getPhoneList() {
   return phone_;
 }
 /**
  * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
  */
 public java.util.List<? extends com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumberOrBuilder> 
     getPhoneOrBuilderList() {
   return phone_;
 }
 /**
  * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
  */
 public int getPhoneCount() {
   return phone_.size();
 }
 /**
  * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
  */
 public com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber getPhone(int index) {
   return phone_.get(index);
 }
 /**
  * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
  */
 public com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumberOrBuilder getPhoneOrBuilder(
     int index) {
   return phone_.get(index);
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
   if (id_ != 0) {
     output.writeInt32(1, id_);
   }
   if (!getFirstNameBytes().isEmpty()) {
     com.google.protobuf.GeneratedMessageV3.writeString(output, 2, firstName_);
   }
   if (!getLastNameBytes().isEmpty()) {
     com.google.protobuf.GeneratedMessageV3.writeString(output, 3, lastName_);
   }
   if (!getEmailBytes().isEmpty()) {
     com.google.protobuf.GeneratedMessageV3.writeString(output, 4, email_);
   }
   for (int i = 0; i < phone_.size(); i++) {
     output.writeMessage(5, phone_.get(i));
   }
   unknownFields.writeTo(output);
 }

 @java.lang.Override
 public int getSerializedSize() {
   int size = memoizedSize;
   if (size != -1) return size;

   size = 0;
   if (id_ != 0) {
     size += com.google.protobuf.CodedOutputStream
       .computeInt32Size(1, id_);
   }
   if (!getFirstNameBytes().isEmpty()) {
     size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, firstName_);
   }
   if (!getLastNameBytes().isEmpty()) {
     size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, lastName_);
   }
   if (!getEmailBytes().isEmpty()) {
     size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, email_);
   }
   for (int i = 0; i < phone_.size(); i++) {
     size += com.google.protobuf.CodedOutputStream
       .computeMessageSize(5, phone_.get(i));
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
   if (!(obj instanceof com.baeldung.protobuf.BaeldungTraining.Student)) {
     return super.equals(obj);
   }
   com.baeldung.protobuf.BaeldungTraining.Student other = (com.baeldung.protobuf.BaeldungTraining.Student) obj;

   boolean result = true;
   result = result && (getId()
       == other.getId());
   result = result && getFirstName()
       .equals(other.getFirstName());
   result = result && getLastName()
       .equals(other.getLastName());
   result = result && getEmail()
       .equals(other.getEmail());
   result = result && getPhoneList()
       .equals(other.getPhoneList());
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
   hash = (37 * hash) + ID_FIELD_NUMBER;
   hash = (53 * hash) + getId();
   hash = (37 * hash) + FIRST_NAME_FIELD_NUMBER;
   hash = (53 * hash) + getFirstName().hashCode();
   hash = (37 * hash) + LAST_NAME_FIELD_NUMBER;
   hash = (53 * hash) + getLastName().hashCode();
   hash = (37 * hash) + EMAIL_FIELD_NUMBER;
   hash = (53 * hash) + getEmail().hashCode();
   if (getPhoneCount() > 0) {
     hash = (37 * hash) + PHONE_FIELD_NUMBER;
     hash = (53 * hash) + getPhoneList().hashCode();
   }
   hash = (29 * hash) + unknownFields.hashCode();
   memoizedHashCode = hash;
   return hash;
 }

 public static com.baeldung.protobuf.BaeldungTraining.Student parseFrom(
     java.nio.ByteBuffer data)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data);
 }
 public static com.baeldung.protobuf.BaeldungTraining.Student parseFrom(
     java.nio.ByteBuffer data,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data, extensionRegistry);
 }
 public static com.baeldung.protobuf.BaeldungTraining.Student parseFrom(
     com.google.protobuf.ByteString data)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data);
 }
 public static com.baeldung.protobuf.BaeldungTraining.Student parseFrom(
     com.google.protobuf.ByteString data,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data, extensionRegistry);
 }
 public static com.baeldung.protobuf.BaeldungTraining.Student parseFrom(byte[] data)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data);
 }
 public static com.baeldung.protobuf.BaeldungTraining.Student parseFrom(
     byte[] data,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws com.google.protobuf.InvalidProtocolBufferException {
   return PARSER.parseFrom(data, extensionRegistry);
 }
 public static com.baeldung.protobuf.BaeldungTraining.Student parseFrom(java.io.InputStream input)
     throws java.io.IOException {
   return com.google.protobuf.GeneratedMessageV3
       .parseWithIOException(PARSER, input);
 }
 public static com.baeldung.protobuf.BaeldungTraining.Student parseFrom(
     java.io.InputStream input,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws java.io.IOException {
   return com.google.protobuf.GeneratedMessageV3
       .parseWithIOException(PARSER, input, extensionRegistry);
 }
 public static com.baeldung.protobuf.BaeldungTraining.Student parseDelimitedFrom(java.io.InputStream input)
     throws java.io.IOException {
   return com.google.protobuf.GeneratedMessageV3
       .parseDelimitedWithIOException(PARSER, input);
 }
 public static com.baeldung.protobuf.BaeldungTraining.Student parseDelimitedFrom(
     java.io.InputStream input,
     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     throws java.io.IOException {
   return com.google.protobuf.GeneratedMessageV3
       .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
 }
 public static com.baeldung.protobuf.BaeldungTraining.Student parseFrom(
     com.google.protobuf.CodedInputStream input)
     throws java.io.IOException {
   return com.google.protobuf.GeneratedMessageV3
       .parseWithIOException(PARSER, input);
 }
 public static com.baeldung.protobuf.BaeldungTraining.Student parseFrom(
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
 public static Builder newBuilder(com.baeldung.protobuf.BaeldungTraining.Student prototype) {
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
  * Protobuf type {@code baeldung.Student}
  */
 public static final class Builder extends
     com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
     // @@protoc_insertion_point(builder_implements:baeldung.Student)
     com.baeldung.protobuf.BaeldungTraining.StudentOrBuilder {
   public static final com.google.protobuf.Descriptors.Descriptor
       getDescriptor() {
     return com.baeldung.protobuf.BaeldungTraining.internal_static_baeldung_Student_descriptor;
   }

   @java.lang.Override
   protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
       internalGetFieldAccessorTable() {
     return com.baeldung.protobuf.BaeldungTraining.internal_static_baeldung_Student_fieldAccessorTable
         .ensureFieldAccessorsInitialized(
             com.baeldung.protobuf.BaeldungTraining.Student.class, com.baeldung.protobuf.BaeldungTraining.Student.Builder.class);
   }

   // Construct using com.baeldung.protobuf.BaeldungTraining.Student.newBuilder()
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
       getPhoneFieldBuilder();
     }
   }
   @java.lang.Override
   public Builder clear() {
     super.clear();
     id_ = 0;

     firstName_ = "";

     lastName_ = "";

     email_ = "";

     if (phoneBuilder_ == null) {
       phone_ = java.util.Collections.emptyList();
       bitField0_ = (bitField0_ & ~0x00000010);
     } else {
       phoneBuilder_.clear();
     }
     return this;
   }

   @java.lang.Override
   public com.google.protobuf.Descriptors.Descriptor
       getDescriptorForType() {
     return com.baeldung.protobuf.BaeldungTraining.internal_static_baeldung_Student_descriptor;
   }

   @java.lang.Override
   public com.baeldung.protobuf.BaeldungTraining.Student getDefaultInstanceForType() {
     return com.baeldung.protobuf.BaeldungTraining.Student.getDefaultInstance();
   }

   @java.lang.Override
   public com.baeldung.protobuf.BaeldungTraining.Student build() {
     com.baeldung.protobuf.BaeldungTraining.Student result = buildPartial();
     if (!result.isInitialized()) {
       throw newUninitializedMessageException(result);
     }
     return result;
   }

   @java.lang.Override
   public com.baeldung.protobuf.BaeldungTraining.Student buildPartial() {
     com.baeldung.protobuf.BaeldungTraining.Student result = new com.baeldung.protobuf.BaeldungTraining.Student(this);
     int from_bitField0_ = bitField0_;
     int to_bitField0_ = 0;
     result.id_ = id_;
     result.firstName_ = firstName_;
     result.lastName_ = lastName_;
     result.email_ = email_;
     if (phoneBuilder_ == null) {
       if (((bitField0_ & 0x00000010) == 0x00000010)) {
         phone_ = java.util.Collections.unmodifiableList(phone_);
         bitField0_ = (bitField0_ & ~0x00000010);
       }
       result.phone_ = phone_;
     } else {
       result.phone_ = phoneBuilder_.build();
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
       com.google.protobuf.Descriptors.FieldDescriptor field,
       java.lang.Object value) {
     return (Builder) super.setField(field, value);
   }
   @java.lang.Override
   public Builder clearField(
       com.google.protobuf.Descriptors.FieldDescriptor field) {
     return (Builder) super.clearField(field);
   }
   @java.lang.Override
   public Builder clearOneof(
       com.google.protobuf.Descriptors.OneofDescriptor oneof) {
     return (Builder) super.clearOneof(oneof);
   }
   @java.lang.Override
   public Builder setRepeatedField(
       com.google.protobuf.Descriptors.FieldDescriptor field,
       int index, java.lang.Object value) {
     return (Builder) super.setRepeatedField(field, index, value);
   }
   @java.lang.Override
   public Builder addRepeatedField(
       com.google.protobuf.Descriptors.FieldDescriptor field,
       java.lang.Object value) {
     return (Builder) super.addRepeatedField(field, value);
   }
   @java.lang.Override
   public Builder mergeFrom(com.google.protobuf.Message other) {
     if (other instanceof com.baeldung.protobuf.BaeldungTraining.Student) {
       return mergeFrom((com.baeldung.protobuf.BaeldungTraining.Student)other);
     } else {
       super.mergeFrom(other);
       return this;
     }
   }

   public Builder mergeFrom(com.baeldung.protobuf.BaeldungTraining.Student other) {
     if (other == com.baeldung.protobuf.BaeldungTraining.Student.getDefaultInstance()) return this;
     if (other.getId() != 0) {
       setId(other.getId());
     }
     if (!other.getFirstName().isEmpty()) {
       firstName_ = other.firstName_;
       onChanged();
     }
     if (!other.getLastName().isEmpty()) {
       lastName_ = other.lastName_;
       onChanged();
     }
     if (!other.getEmail().isEmpty()) {
       email_ = other.email_;
       onChanged();
     }
     if (phoneBuilder_ == null) {
       if (!other.phone_.isEmpty()) {
         if (phone_.isEmpty()) {
           phone_ = other.phone_;
           bitField0_ = (bitField0_ & ~0x00000010);
         } else {
           ensurePhoneIsMutable();
           phone_.addAll(other.phone_);
         }
         onChanged();
       }
     } else {
       if (!other.phone_.isEmpty()) {
         if (phoneBuilder_.isEmpty()) {
           phoneBuilder_.dispose();
           phoneBuilder_ = null;
           phone_ = other.phone_;
           bitField0_ = (bitField0_ & ~0x00000010);
           phoneBuilder_ = 
             com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                getPhoneFieldBuilder() : null;
         } else {
           phoneBuilder_.addAllMessages(other.phone_);
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
     com.baeldung.protobuf.BaeldungTraining.Student parsedMessage = null;
     try {
       parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
     } catch (com.google.protobuf.InvalidProtocolBufferException e) {
       parsedMessage = (com.baeldung.protobuf.BaeldungTraining.Student) e.getUnfinishedMessage();
       throw e.unwrapIOException();
     } finally {
       if (parsedMessage != null) {
         mergeFrom(parsedMessage);
       }
     }
     return this;
   }
   private int bitField0_;

   private int id_ ;
   /**
    * <code>int32 id = 1;</code>
    */
   public int getId() {
     return id_;
   }
   /**
    * <code>int32 id = 1;</code>
    */
   public Builder setId(int value) {
     
     id_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>int32 id = 1;</code>
    */
   public Builder clearId() {
     
     id_ = 0;
     onChanged();
     return this;
   }

   private java.lang.Object firstName_ = "";
   /**
    * <code>string first_name = 2;</code>
    */
   public java.lang.String getFirstName() {
     java.lang.Object ref = firstName_;
     if (!(ref instanceof java.lang.String)) {
       com.google.protobuf.ByteString bs =
           (com.google.protobuf.ByteString) ref;
       java.lang.String s = bs.toStringUtf8();
       firstName_ = s;
       return s;
     } else {
       return (java.lang.String) ref;
     }
   }
   /**
    * <code>string first_name = 2;</code>
    */
   public com.google.protobuf.ByteString
       getFirstNameBytes() {
     java.lang.Object ref = firstName_;
     if (ref instanceof String) {
       com.google.protobuf.ByteString b = 
           com.google.protobuf.ByteString.copyFromUtf8(
               (java.lang.String) ref);
       firstName_ = b;
       return b;
     } else {
       return (com.google.protobuf.ByteString) ref;
     }
   }
   /**
    * <code>string first_name = 2;</code>
    */
   public Builder setFirstName(
       java.lang.String value) {
     if (value == null) {
 throw new NullPointerException();
}

     firstName_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>string first_name = 2;</code>
    */
   public Builder clearFirstName() {
     
     firstName_ = getDefaultInstance().getFirstName();
     onChanged();
     return this;
   }
   /**
    * <code>string first_name = 2;</code>
    */
   public Builder setFirstNameBytes(
       com.google.protobuf.ByteString value) {
     if (value == null) {
 throw new NullPointerException();
}
checkByteStringIsUtf8(value);
     
     firstName_ = value;
     onChanged();
     return this;
   }

   private java.lang.Object lastName_ = "";
   /**
    * <code>string last_name = 3;</code>
    */
   public java.lang.String getLastName() {
     java.lang.Object ref = lastName_;
     if (!(ref instanceof java.lang.String)) {
       com.google.protobuf.ByteString bs =
           (com.google.protobuf.ByteString) ref;
       java.lang.String s = bs.toStringUtf8();
       lastName_ = s;
       return s;
     } else {
       return (java.lang.String) ref;
     }
   }
   /**
    * <code>string last_name = 3;</code>
    */
   public com.google.protobuf.ByteString
       getLastNameBytes() {
     java.lang.Object ref = lastName_;
     if (ref instanceof String) {
       com.google.protobuf.ByteString b = 
           com.google.protobuf.ByteString.copyFromUtf8(
               (java.lang.String) ref);
       lastName_ = b;
       return b;
     } else {
       return (com.google.protobuf.ByteString) ref;
     }
   }
   /**
    * <code>string last_name = 3;</code>
    */
   public Builder setLastName(
       java.lang.String value) {
     if (value == null) {
 throw new NullPointerException();
}

     lastName_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>string last_name = 3;</code>
    */
   public Builder clearLastName() {
     
     lastName_ = getDefaultInstance().getLastName();
     onChanged();
     return this;
   }
   /**
    * <code>string last_name = 3;</code>
    */
   public Builder setLastNameBytes(
       com.google.protobuf.ByteString value) {
     if (value == null) {
 throw new NullPointerException();
}
checkByteStringIsUtf8(value);
     
     lastName_ = value;
     onChanged();
     return this;
   }

   private java.lang.Object email_ = "";
   /**
    * <code>string email = 4;</code>
    */
   public java.lang.String getEmail() {
     java.lang.Object ref = email_;
     if (!(ref instanceof java.lang.String)) {
       com.google.protobuf.ByteString bs =
           (com.google.protobuf.ByteString) ref;
       java.lang.String s = bs.toStringUtf8();
       email_ = s;
       return s;
     } else {
       return (java.lang.String) ref;
     }
   }
   /**
    * <code>string email = 4;</code>
    */
   public com.google.protobuf.ByteString
       getEmailBytes() {
     java.lang.Object ref = email_;
     if (ref instanceof String) {
       com.google.protobuf.ByteString b = 
           com.google.protobuf.ByteString.copyFromUtf8(
               (java.lang.String) ref);
       email_ = b;
       return b;
     } else {
       return (com.google.protobuf.ByteString) ref;
     }
   }
   /**
    * <code>string email = 4;</code>
    */
   public Builder setEmail(
       java.lang.String value) {
     if (value == null) {
 throw new NullPointerException();
}

     email_ = value;
     onChanged();
     return this;
   }
   /**
    * <code>string email = 4;</code>
    */
   public Builder clearEmail() {
     
     email_ = getDefaultInstance().getEmail();
     onChanged();
     return this;
   }
   /**
    * <code>string email = 4;</code>
    */
   public Builder setEmailBytes(
       com.google.protobuf.ByteString value) {
     if (value == null) {
 throw new NullPointerException();
}
checkByteStringIsUtf8(value);
     
     email_ = value;
     onChanged();
     return this;
   }

   private java.util.List<com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber> phone_ =
     java.util.Collections.emptyList();
   private void ensurePhoneIsMutable() {
     if (!((bitField0_ & 0x00000010) == 0x00000010)) {
       phone_ = new java.util.ArrayList<com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber>(phone_);
       bitField0_ |= 0x00000010;
      }
   }

   private com.google.protobuf.RepeatedFieldBuilderV3<
       com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber, com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber.Builder, com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumberOrBuilder> phoneBuilder_;

   /**
    * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
    */
   public java.util.List<com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber> getPhoneList() {
     if (phoneBuilder_ == null) {
       return java.util.Collections.unmodifiableList(phone_);
     } else {
       return phoneBuilder_.getMessageList();
     }
   }
   /**
    * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
    */
   public int getPhoneCount() {
     if (phoneBuilder_ == null) {
       return phone_.size();
     } else {
       return phoneBuilder_.getCount();
     }
   }
   /**
    * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
    */
   public com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber getPhone(int index) {
     if (phoneBuilder_ == null) {
       return phone_.get(index);
     } else {
       return phoneBuilder_.getMessage(index);
     }
   }
   /**
    * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
    */
   public Builder setPhone(
       int index, com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber value) {
     if (phoneBuilder_ == null) {
       if (value == null) {
         throw new NullPointerException();
       }
       ensurePhoneIsMutable();
       phone_.set(index, value);
       onChanged();
     } else {
       phoneBuilder_.setMessage(index, value);
     }
     return this;
   }
   /**
    * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
    */
   public Builder setPhone(
       int index, com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber.Builder builderForValue) {
     if (phoneBuilder_ == null) {
       ensurePhoneIsMutable();
       phone_.set(index, builderForValue.build());
       onChanged();
     } else {
       phoneBuilder_.setMessage(index, builderForValue.build());
     }
     return this;
   }
   /**
    * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
    */
   public Builder addPhone(com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber value) {
     if (phoneBuilder_ == null) {
       if (value == null) {
         throw new NullPointerException();
       }
       ensurePhoneIsMutable();
       phone_.add(value);
       onChanged();
     } else {
       phoneBuilder_.addMessage(value);
     }
     return this;
   }
   /**
    * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
    */
   public Builder addPhone(
       int index, com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber value) {
     if (phoneBuilder_ == null) {
       if (value == null) {
         throw new NullPointerException();
       }
       ensurePhoneIsMutable();
       phone_.add(index, value);
       onChanged();
     } else {
       phoneBuilder_.addMessage(index, value);
     }
     return this;
   }
   /**
    * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
    */
   public Builder addPhone(
       com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber.Builder builderForValue) {
     if (phoneBuilder_ == null) {
       ensurePhoneIsMutable();
       phone_.add(builderForValue.build());
       onChanged();
     } else {
       phoneBuilder_.addMessage(builderForValue.build());
     }
     return this;
   }
   /**
    * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
    */
   public Builder addPhone(
       int index, com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber.Builder builderForValue) {
     if (phoneBuilder_ == null) {
       ensurePhoneIsMutable();
       phone_.add(index, builderForValue.build());
       onChanged();
     } else {
       phoneBuilder_.addMessage(index, builderForValue.build());
     }
     return this;
   }
   /**
    * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
    */
   public Builder addAllPhone(
       java.lang.Iterable<? extends com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber> values) {
     if (phoneBuilder_ == null) {
       ensurePhoneIsMutable();
       com.google.protobuf.AbstractMessageLite.Builder.addAll(
           values, phone_);
       onChanged();
     } else {
       phoneBuilder_.addAllMessages(values);
     }
     return this;
   }
   /**
    * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
    */
   public Builder clearPhone() {
     if (phoneBuilder_ == null) {
       phone_ = java.util.Collections.emptyList();
       bitField0_ = (bitField0_ & ~0x00000010);
       onChanged();
     } else {
       phoneBuilder_.clear();
     }
     return this;
   }
   /**
    * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
    */
   public Builder removePhone(int index) {
     if (phoneBuilder_ == null) {
       ensurePhoneIsMutable();
       phone_.remove(index);
       onChanged();
     } else {
       phoneBuilder_.remove(index);
     }
     return this;
   }
   /**
    * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
    */
   public com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber.Builder getPhoneBuilder(
       int index) {
     return getPhoneFieldBuilder().getBuilder(index);
   }
   /**
    * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
    */
   public com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumberOrBuilder getPhoneOrBuilder(
       int index) {
     if (phoneBuilder_ == null) {
       return phone_.get(index);  } else {
       return phoneBuilder_.getMessageOrBuilder(index);
     }
   }
   /**
    * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
    */
   public java.util.List<? extends com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumberOrBuilder> 
        getPhoneOrBuilderList() {
     if (phoneBuilder_ != null) {
       return phoneBuilder_.getMessageOrBuilderList();
     } else {
       return java.util.Collections.unmodifiableList(phone_);
     }
   }
   /**
    * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
    */
   public com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber.Builder addPhoneBuilder() {
     return getPhoneFieldBuilder().addBuilder(
         com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber.getDefaultInstance());
   }
   /**
    * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
    */
   public com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber.Builder addPhoneBuilder(
       int index) {
     return getPhoneFieldBuilder().addBuilder(
         index, com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber.getDefaultInstance());
   }
   /**
    * <code>repeated .baeldung.Student.PhoneNumber phone = 5;</code>
    */
   public java.util.List<com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber.Builder> 
        getPhoneBuilderList() {
     return getPhoneFieldBuilder().getBuilderList();
   }
   private com.google.protobuf.RepeatedFieldBuilderV3<
       com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber, com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber.Builder, com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumberOrBuilder> 
       getPhoneFieldBuilder() {
     if (phoneBuilder_ == null) {
       phoneBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
           com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber, com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumber.Builder, com.baeldung.protobuf.BaeldungTraining.Student.PhoneNumberOrBuilder>(
               phone_,
               ((bitField0_ & 0x00000010) == 0x00000010),
               getParentForChildren(),
               isClean());
       phone_ = null;
     }
     return phoneBuilder_;
   }
   @java.lang.Override
   public final Builder setUnknownFields(
       final com.google.protobuf.UnknownFieldSet unknownFields) {
     return super.setUnknownFieldsProto3(unknownFields);
   }

   @java.lang.Override
   public final Builder mergeUnknownFields(
       final com.google.protobuf.UnknownFieldSet unknownFields) {
     return super.mergeUnknownFields(unknownFields);
   }


   // @@protoc_insertion_point(builder_scope:baeldung.Student)
 }

 // @@protoc_insertion_point(class_scope:baeldung.Student)
 private static final com.baeldung.protobuf.BaeldungTraining.Student DEFAULT_INSTANCE;
 static {
   DEFAULT_INSTANCE = new com.baeldung.protobuf.BaeldungTraining.Student();
 }

 public static com.baeldung.protobuf.BaeldungTraining.Student getDefaultInstance() {
   return DEFAULT_INSTANCE;
 }

 private static final com.google.protobuf.Parser<Student>
     PARSER = new com.google.protobuf.AbstractParser<Student>() {
   @java.lang.Override
   public Student parsePartialFrom(
       com.google.protobuf.CodedInputStream input,
       com.google.protobuf.ExtensionRegistryLite extensionRegistry)
       throws com.google.protobuf.InvalidProtocolBufferException {
     return new Student(input, extensionRegistry);
   }
 };

 public static com.google.protobuf.Parser<Student> parser() {
   return PARSER;
 }

 @java.lang.Override
 public com.google.protobuf.Parser<Student> getParserForType() {
   return PARSER;
 }

 @java.lang.Override
 public com.baeldung.protobuf.BaeldungTraining.Student getDefaultInstanceForType() {
   return DEFAULT_INSTANCE;
 }

}

private static final com.google.protobuf.Descriptors.Descriptor
 internal_static_baeldung_Course_descriptor;
private static final 
 com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
   internal_static_baeldung_Course_fieldAccessorTable;
private static final com.google.protobuf.Descriptors.Descriptor
 internal_static_baeldung_Student_descriptor;
private static final 
 com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
   internal_static_baeldung_Student_fieldAccessorTable;
private static final com.google.protobuf.Descriptors.Descriptor
 internal_static_baeldung_Student_PhoneNumber_descriptor;
private static final 
 com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
   internal_static_baeldung_Student_PhoneNumber_fieldAccessorTable;

public static com.google.protobuf.Descriptors.FileDescriptor
   getDescriptor() {
 return descriptor;
}
private static  com.google.protobuf.Descriptors.FileDescriptor
   descriptor;
static {
 java.lang.String[] descriptorData = {
   "\n\010my.proto\022\010baeldung\"M\n\006Course\022\n\n\002id\030\001 \001" +
   "(\005\022\023\n\013course_name\030\002 \001(\t\022\"\n\007student\030\003 \003(\013" +
   "2\021.baeldung.Student\"\352\001\n\007Student\022\n\n\002id\030\001 " +
   "\001(\005\022\022\n\nfirst_name\030\002 \001(\t\022\021\n\tlast_name\030\003 \001" +
   "(\t\022\r\n\005email\030\004 \001(\t\022,\n\005phone\030\005 \003(\0132\035.baeld" +
   "ung.Student.PhoneNumber\032H\n\013PhoneNumber\022\016" +
   "\n\006number\030\001 \001(\t\022)\n\004type\030\002 \001(\0162\033.baeldung." +
   "Student.PhoneType\"%\n\tPhoneType\022\n\n\006MOBILE" +
   "\020\000\022\014\n\010LANDLINE\020\001B)\n\025com.baeldung.protobu" +
   "fB\020BaeldungTrainingb\006proto3"
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
 internal_static_baeldung_Course_descriptor =
   getDescriptor().getMessageTypes().get(0);
 internal_static_baeldung_Course_fieldAccessorTable = new
   com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
     internal_static_baeldung_Course_descriptor,
     new java.lang.String[] { "Id", "CourseName", "Student", });
 internal_static_baeldung_Student_descriptor =
   getDescriptor().getMessageTypes().get(1);
 internal_static_baeldung_Student_fieldAccessorTable = new
   com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
     internal_static_baeldung_Student_descriptor,
     new java.lang.String[] { "Id", "FirstName", "LastName", "Email", "Phone", });
 internal_static_baeldung_Student_PhoneNumber_descriptor =
   internal_static_baeldung_Student_descriptor.getNestedTypes().get(0);
 internal_static_baeldung_Student_PhoneNumber_fieldAccessorTable = new
   com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
     internal_static_baeldung_Student_PhoneNumber_descriptor,
     new java.lang.String[] { "Number", "Type", });
}

// @@protoc_insertion_point(outer_class_scope)
}
