/**
 * ServiceInfoRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.strikeiron.www;

public class ServiceInfoRecord  implements java.io.Serializable {
    private java.lang.String infoKey;

    private java.lang.String infoValue;

    public ServiceInfoRecord() {
    }

    public ServiceInfoRecord(
           java.lang.String infoKey,
           java.lang.String infoValue) {
           this.infoKey = infoKey;
           this.infoValue = infoValue;
    }


    /**
     * Gets the infoKey value for this ServiceInfoRecord.
     * 
     * @return infoKey
     */
    public java.lang.String getInfoKey() {
        return infoKey;
    }


    /**
     * Sets the infoKey value for this ServiceInfoRecord.
     * 
     * @param infoKey
     */
    public void setInfoKey(java.lang.String infoKey) {
        this.infoKey = infoKey;
    }


    /**
     * Gets the infoValue value for this ServiceInfoRecord.
     * 
     * @return infoValue
     */
    public java.lang.String getInfoValue() {
        return infoValue;
    }


    /**
     * Sets the infoValue value for this ServiceInfoRecord.
     * 
     * @param infoValue
     */
    public void setInfoValue(java.lang.String infoValue) {
        this.infoValue = infoValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceInfoRecord)) return false;
        ServiceInfoRecord other = (ServiceInfoRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.infoKey==null && other.getInfoKey()==null) || 
             (this.infoKey!=null &&
              this.infoKey.equals(other.getInfoKey()))) &&
            ((this.infoValue==null && other.getInfoValue()==null) || 
             (this.infoValue!=null &&
              this.infoValue.equals(other.getInfoValue())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getInfoKey() != null) {
            _hashCode += getInfoKey().hashCode();
        }
        if (getInfoValue() != null) {
            _hashCode += getInfoValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceInfoRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.strikeiron.com", "ServiceInfoRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.strikeiron.com", "InfoKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.strikeiron.com", "InfoValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
