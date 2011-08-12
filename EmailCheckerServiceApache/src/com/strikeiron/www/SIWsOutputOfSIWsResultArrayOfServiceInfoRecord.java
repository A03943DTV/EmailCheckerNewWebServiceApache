/**
 * SIWsOutputOfSIWsResultArrayOfServiceInfoRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.strikeiron.www;

public class SIWsOutputOfSIWsResultArrayOfServiceInfoRecord  implements java.io.Serializable {
    private com.strikeiron.www.SIWsStatus serviceStatus;

    private com.strikeiron.www.SIWsResultArrayOfServiceInfoRecord serviceResult;

    public SIWsOutputOfSIWsResultArrayOfServiceInfoRecord() {
    }

    public SIWsOutputOfSIWsResultArrayOfServiceInfoRecord(
           com.strikeiron.www.SIWsStatus serviceStatus,
           com.strikeiron.www.SIWsResultArrayOfServiceInfoRecord serviceResult) {
           this.serviceStatus = serviceStatus;
           this.serviceResult = serviceResult;
    }


    /**
     * Gets the serviceStatus value for this SIWsOutputOfSIWsResultArrayOfServiceInfoRecord.
     * 
     * @return serviceStatus
     */
    public com.strikeiron.www.SIWsStatus getServiceStatus() {
        return serviceStatus;
    }


    /**
     * Sets the serviceStatus value for this SIWsOutputOfSIWsResultArrayOfServiceInfoRecord.
     * 
     * @param serviceStatus
     */
    public void setServiceStatus(com.strikeiron.www.SIWsStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
    }


    /**
     * Gets the serviceResult value for this SIWsOutputOfSIWsResultArrayOfServiceInfoRecord.
     * 
     * @return serviceResult
     */
    public com.strikeiron.www.SIWsResultArrayOfServiceInfoRecord getServiceResult() {
        return serviceResult;
    }


    /**
     * Sets the serviceResult value for this SIWsOutputOfSIWsResultArrayOfServiceInfoRecord.
     * 
     * @param serviceResult
     */
    public void setServiceResult(com.strikeiron.www.SIWsResultArrayOfServiceInfoRecord serviceResult) {
        this.serviceResult = serviceResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SIWsOutputOfSIWsResultArrayOfServiceInfoRecord)) return false;
        SIWsOutputOfSIWsResultArrayOfServiceInfoRecord other = (SIWsOutputOfSIWsResultArrayOfServiceInfoRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceStatus==null && other.getServiceStatus()==null) || 
             (this.serviceStatus!=null &&
              this.serviceStatus.equals(other.getServiceStatus()))) &&
            ((this.serviceResult==null && other.getServiceResult()==null) || 
             (this.serviceResult!=null &&
              this.serviceResult.equals(other.getServiceResult())));
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
        if (getServiceStatus() != null) {
            _hashCode += getServiceStatus().hashCode();
        }
        if (getServiceResult() != null) {
            _hashCode += getServiceResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SIWsOutputOfSIWsResultArrayOfServiceInfoRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.strikeiron.com", "SIWsOutputOfSIWsResultArrayOfServiceInfoRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.strikeiron.com", "ServiceStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.strikeiron.com", "SIWsStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.strikeiron.com", "ServiceResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.strikeiron.com", "SIWsResultArrayOfServiceInfoRecord"));
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
