/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.berkeley.cs.amplab.carat.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;



public class CallInfo implements org.apache.thrift.TBase<CallInfo, CallInfo._Fields>, java.io.Serializable, Cloneable, Comparable<CallInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CallInfo");

  private static final org.apache.thrift.protocol.TField INCOMING_CALL_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("incomingCallTime", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField OUTGOING_CALL_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("outgoingCallTime", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField NON_CALL_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("nonCallTime", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField CALL_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("callStatus", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CallInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CallInfoTupleSchemeFactory());
  }

  public double incomingCallTime; // optional
  public double outgoingCallTime; // optional
  public double nonCallTime; // optional
  public String callStatus; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INCOMING_CALL_TIME((short)1, "incomingCallTime"),
    OUTGOING_CALL_TIME((short)2, "outgoingCallTime"),
    NON_CALL_TIME((short)3, "nonCallTime"),
    CALL_STATUS((short)4, "callStatus");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // INCOMING_CALL_TIME
          return INCOMING_CALL_TIME;
        case 2: // OUTGOING_CALL_TIME
          return OUTGOING_CALL_TIME;
        case 3: // NON_CALL_TIME
          return NON_CALL_TIME;
        case 4: // CALL_STATUS
          return CALL_STATUS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __INCOMINGCALLTIME_ISSET_ID = 0;
  private static final int __OUTGOINGCALLTIME_ISSET_ID = 1;
  private static final int __NONCALLTIME_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.INCOMING_CALL_TIME,_Fields.OUTGOING_CALL_TIME,_Fields.NON_CALL_TIME,_Fields.CALL_STATUS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INCOMING_CALL_TIME, new org.apache.thrift.meta_data.FieldMetaData("incomingCallTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.OUTGOING_CALL_TIME, new org.apache.thrift.meta_data.FieldMetaData("outgoingCallTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.NON_CALL_TIME, new org.apache.thrift.meta_data.FieldMetaData("nonCallTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.CALL_STATUS, new org.apache.thrift.meta_data.FieldMetaData("callStatus", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CallInfo.class, metaDataMap);
  }

  public CallInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CallInfo(CallInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.incomingCallTime = other.incomingCallTime;
    this.outgoingCallTime = other.outgoingCallTime;
    this.nonCallTime = other.nonCallTime;
    if (other.isSetCallStatus()) {
      this.callStatus = other.callStatus;
    }
  }

  public CallInfo deepCopy() {
    return new CallInfo(this);
  }

  @Override
  public void clear() {
    setIncomingCallTimeIsSet(false);
    this.incomingCallTime = 0.0;
    setOutgoingCallTimeIsSet(false);
    this.outgoingCallTime = 0.0;
    setNonCallTimeIsSet(false);
    this.nonCallTime = 0.0;
    this.callStatus = null;
  }

  public double getIncomingCallTime() {
    return this.incomingCallTime;
  }

  public CallInfo setIncomingCallTime(double incomingCallTime) {
    this.incomingCallTime = incomingCallTime;
    setIncomingCallTimeIsSet(true);
    return this;
  }

  public void unsetIncomingCallTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INCOMINGCALLTIME_ISSET_ID);
  }

  /** Returns true if field incomingCallTime is set (has been assigned a value) and false otherwise */
  public boolean isSetIncomingCallTime() {
    return EncodingUtils.testBit(__isset_bitfield, __INCOMINGCALLTIME_ISSET_ID);
  }

  public void setIncomingCallTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INCOMINGCALLTIME_ISSET_ID, value);
  }

  public double getOutgoingCallTime() {
    return this.outgoingCallTime;
  }

  public CallInfo setOutgoingCallTime(double outgoingCallTime) {
    this.outgoingCallTime = outgoingCallTime;
    setOutgoingCallTimeIsSet(true);
    return this;
  }

  public void unsetOutgoingCallTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OUTGOINGCALLTIME_ISSET_ID);
  }

  /** Returns true if field outgoingCallTime is set (has been assigned a value) and false otherwise */
  public boolean isSetOutgoingCallTime() {
    return EncodingUtils.testBit(__isset_bitfield, __OUTGOINGCALLTIME_ISSET_ID);
  }

  public void setOutgoingCallTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OUTGOINGCALLTIME_ISSET_ID, value);
  }

  public double getNonCallTime() {
    return this.nonCallTime;
  }

  public CallInfo setNonCallTime(double nonCallTime) {
    this.nonCallTime = nonCallTime;
    setNonCallTimeIsSet(true);
    return this;
  }

  public void unsetNonCallTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NONCALLTIME_ISSET_ID);
  }

  /** Returns true if field nonCallTime is set (has been assigned a value) and false otherwise */
  public boolean isSetNonCallTime() {
    return EncodingUtils.testBit(__isset_bitfield, __NONCALLTIME_ISSET_ID);
  }

  public void setNonCallTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NONCALLTIME_ISSET_ID, value);
  }

  public String getCallStatus() {
    return this.callStatus;
  }

  public CallInfo setCallStatus(String callStatus) {
    this.callStatus = callStatus;
    return this;
  }

  public void unsetCallStatus() {
    this.callStatus = null;
  }

  /** Returns true if field callStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetCallStatus() {
    return this.callStatus != null;
  }

  public void setCallStatusIsSet(boolean value) {
    if (!value) {
      this.callStatus = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case INCOMING_CALL_TIME:
      if (value == null) {
        unsetIncomingCallTime();
      } else {
        setIncomingCallTime((Double)value);
      }
      break;

    case OUTGOING_CALL_TIME:
      if (value == null) {
        unsetOutgoingCallTime();
      } else {
        setOutgoingCallTime((Double)value);
      }
      break;

    case NON_CALL_TIME:
      if (value == null) {
        unsetNonCallTime();
      } else {
        setNonCallTime((Double)value);
      }
      break;

    case CALL_STATUS:
      if (value == null) {
        unsetCallStatus();
      } else {
        setCallStatus((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case INCOMING_CALL_TIME:
      return Double.valueOf(getIncomingCallTime());

    case OUTGOING_CALL_TIME:
      return Double.valueOf(getOutgoingCallTime());

    case NON_CALL_TIME:
      return Double.valueOf(getNonCallTime());

    case CALL_STATUS:
      return getCallStatus();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case INCOMING_CALL_TIME:
      return isSetIncomingCallTime();
    case OUTGOING_CALL_TIME:
      return isSetOutgoingCallTime();
    case NON_CALL_TIME:
      return isSetNonCallTime();
    case CALL_STATUS:
      return isSetCallStatus();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CallInfo)
      return this.equals((CallInfo)that);
    return false;
  }

  public boolean equals(CallInfo that) {
    if (that == null)
      return false;

    boolean this_present_incomingCallTime = true && this.isSetIncomingCallTime();
    boolean that_present_incomingCallTime = true && that.isSetIncomingCallTime();
    if (this_present_incomingCallTime || that_present_incomingCallTime) {
      if (!(this_present_incomingCallTime && that_present_incomingCallTime))
        return false;
      if (this.incomingCallTime != that.incomingCallTime)
        return false;
    }

    boolean this_present_outgoingCallTime = true && this.isSetOutgoingCallTime();
    boolean that_present_outgoingCallTime = true && that.isSetOutgoingCallTime();
    if (this_present_outgoingCallTime || that_present_outgoingCallTime) {
      if (!(this_present_outgoingCallTime && that_present_outgoingCallTime))
        return false;
      if (this.outgoingCallTime != that.outgoingCallTime)
        return false;
    }

    boolean this_present_nonCallTime = true && this.isSetNonCallTime();
    boolean that_present_nonCallTime = true && that.isSetNonCallTime();
    if (this_present_nonCallTime || that_present_nonCallTime) {
      if (!(this_present_nonCallTime && that_present_nonCallTime))
        return false;
      if (this.nonCallTime != that.nonCallTime)
        return false;
    }

    boolean this_present_callStatus = true && this.isSetCallStatus();
    boolean that_present_callStatus = true && that.isSetCallStatus();
    if (this_present_callStatus || that_present_callStatus) {
      if (!(this_present_callStatus && that_present_callStatus))
        return false;
      if (!this.callStatus.equals(that.callStatus))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(CallInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetIncomingCallTime()).compareTo(other.isSetIncomingCallTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncomingCallTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.incomingCallTime, other.incomingCallTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOutgoingCallTime()).compareTo(other.isSetOutgoingCallTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOutgoingCallTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.outgoingCallTime, other.outgoingCallTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNonCallTime()).compareTo(other.isSetNonCallTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNonCallTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nonCallTime, other.nonCallTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCallStatus()).compareTo(other.isSetCallStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCallStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.callStatus, other.callStatus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("CallInfo(");
    boolean first = true;

    if (isSetIncomingCallTime()) {
      sb.append("incomingCallTime:");
      sb.append(this.incomingCallTime);
      first = false;
    }
    if (isSetOutgoingCallTime()) {
      if (!first) sb.append(", ");
      sb.append("outgoingCallTime:");
      sb.append(this.outgoingCallTime);
      first = false;
    }
    if (isSetNonCallTime()) {
      if (!first) sb.append(", ");
      sb.append("nonCallTime:");
      sb.append(this.nonCallTime);
      first = false;
    }
    if (isSetCallStatus()) {
      if (!first) sb.append(", ");
      sb.append("callStatus:");
      if (this.callStatus == null) {
        sb.append("null");
      } else {
        sb.append(this.callStatus);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te.getMessage());
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te.getMessage());
    }
  }

  private static class CallInfoStandardSchemeFactory implements SchemeFactory {
    public CallInfoStandardScheme getScheme() {
      return new CallInfoStandardScheme();
    }
  }

  private static class CallInfoStandardScheme extends StandardScheme<CallInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CallInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INCOMING_CALL_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.incomingCallTime = iprot.readDouble();
              struct.setIncomingCallTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OUTGOING_CALL_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.outgoingCallTime = iprot.readDouble();
              struct.setOutgoingCallTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NON_CALL_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.nonCallTime = iprot.readDouble();
              struct.setNonCallTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CALL_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.callStatus = iprot.readString();
              struct.setCallStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CallInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetIncomingCallTime()) {
        oprot.writeFieldBegin(INCOMING_CALL_TIME_FIELD_DESC);
        oprot.writeDouble(struct.incomingCallTime);
        oprot.writeFieldEnd();
      }
      if (struct.isSetOutgoingCallTime()) {
        oprot.writeFieldBegin(OUTGOING_CALL_TIME_FIELD_DESC);
        oprot.writeDouble(struct.outgoingCallTime);
        oprot.writeFieldEnd();
      }
      if (struct.isSetNonCallTime()) {
        oprot.writeFieldBegin(NON_CALL_TIME_FIELD_DESC);
        oprot.writeDouble(struct.nonCallTime);
        oprot.writeFieldEnd();
      }
      if (struct.callStatus != null) {
        if (struct.isSetCallStatus()) {
          oprot.writeFieldBegin(CALL_STATUS_FIELD_DESC);
          oprot.writeString(struct.callStatus);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CallInfoTupleSchemeFactory implements SchemeFactory {
    public CallInfoTupleScheme getScheme() {
      return new CallInfoTupleScheme();
    }
  }

  private static class CallInfoTupleScheme extends TupleScheme<CallInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CallInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetIncomingCallTime()) {
        optionals.set(0);
      }
      if (struct.isSetOutgoingCallTime()) {
        optionals.set(1);
      }
      if (struct.isSetNonCallTime()) {
        optionals.set(2);
      }
      if (struct.isSetCallStatus()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetIncomingCallTime()) {
        oprot.writeDouble(struct.incomingCallTime);
      }
      if (struct.isSetOutgoingCallTime()) {
        oprot.writeDouble(struct.outgoingCallTime);
      }
      if (struct.isSetNonCallTime()) {
        oprot.writeDouble(struct.nonCallTime);
      }
      if (struct.isSetCallStatus()) {
        oprot.writeString(struct.callStatus);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CallInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.incomingCallTime = iprot.readDouble();
        struct.setIncomingCallTimeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.outgoingCallTime = iprot.readDouble();
        struct.setOutgoingCallTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.nonCallTime = iprot.readDouble();
        struct.setNonCallTimeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.callStatus = iprot.readString();
        struct.setCallStatusIsSet(true);
      }
    }
  }

}

