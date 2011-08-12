/**
 * SISubscriptionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.strikeiron.www;

public class SISubscriptionInfo  implements java.io.Serializable {
    private int licenseStatusCode;

    private java.lang.String licenseStatus;

    private int licenseActionCode;

    private java.lang.String licenseAction;

    private int remainingHits;

    private java.math.BigDecimal amount;

    public SISubscriptionInfo() {
    }

    public SISubscriptionInfo(
           int licenseStatusCode,
           java.lang.String licenseStatus,
           int licenseActionCode,
           java.lang.String licenseAction,
           int remainingHits,
           java.math.BigDecimal amount) {
           this.licenseStatusCode = licenseStatusCode;
           this.licenseStatus = licenseStatus;
           this.licenseActionCode = licenseActionCode;
           this.licenseAction = licenseAction;
           this.remainingHits = remainingHits;
           this.amount = amount;
    }


    /**
     * Gets the licenseStatusCode value for this SISubscriptionInfo.
     * 
     * @return licenseStatusCode
     */
    public int getLicenseStatusCode() {
        return licenseStatusCode;
    }


    /**
     * Sets the licenseStatusCode value for this SISubscriptionInfo.
     * 
     * @param licenseStatusCode
     */
    public void setLicenseStatusCode(int licenseStatusCode) {
        this.licenseStatusCode = licenseStatusCode;
    }


    /**
     * Gets the licenseStatus value for this SISubscriptionInfo.
     * 
     * @return licenseStatus
     */
    public java.lang.String getLicenseStatus() {
        return licenseStatus;
    }


    /**
     * Sets the licenseStatus value for this SISubscriptionInfo.
     * 
     * @param licenseStatus
     */
    public void setLicenseStatus(java.lang.String licenseStatus) {
        this.licenseStatus = licenseStatus;
    }


    /**
     * Gets the licenseActionCode value for this SISubscriptionInfo.
     * 
     * @return licenseActionCode
     */
    public int getLicenseActionCode() {
        return licenseActionCode;
    }


    /**
     * Sets the licenseActionCode value for this SISubscriptionInfo.
     * 
     * @param licenseActionCode
     */
    public void setLicenseActionCode(int licenseActionCode) {
        this.licenseActionCode = licenseActionCode;
    }


    /**
     * Gets the licenseAction value for this SISubscriptionInfo.
     * 
     * @return licenseAction
     */
    public java.lang.String getLicenseAction() {
        return licenseAction;
    }


    /**
     * Sets the licenseAction value for this SISubscriptionInfo.
     * 
     * @param licenseAction
     */
    public void setLicenseAction(java.lang.String licenseAction) {
        this.licenseAction = licenseAction;
    }


    /**
     * Gets the remainingHits value for this SISubscriptionInfo.
     * 
     * @return remainingHits
     */
    public int getRemainingHits() {
        return remainingHits;
    }


    /**
     * Sets the remainingHits value for this SISubscriptionInfo.
     * 
     * @param remainingHits
     */
    public void setRemainingHits(int remainingHits) {
        this.remainingHits = remainingHits;
    }


    /**
     * Gets the amount value for this SISubscriptionInfo.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this SISubscriptionInfo.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SISubscriptionInfo)) return false;
        SISubscriptionInfo other = (SISubscriptionInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.licenseStatusCode == other.getLicenseStatusCode() &&
            ((this.licenseStatus==null && other.getLicenseStatus()==null) || 
             (this.licenseStatus!=null &&
              this.licenseStatus.equals(other.getLicenseStatus()))) &&
            this.licenseActionCode == other.getLicenseActionCode() &&
            ((this.licenseAction==null && other.getLicenseAction()==null) || 
             (this.licenseAction!=null &&
              this.licenseAction.equals(other.getLicenseAction()))) &&
            this.remainingHits == other.getRemainingHits() &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount())));
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
        _hashCode += getLicenseStatusCode();
        if (getLicenseStatus() != null) {
            _hashCode += getLicenseStatus().hashCode();
        }
        _hashCode += getLicenseActionCode();
        if (getLicenseAction() != null) {
            _hashCode += getLicenseAction().hashCode();
        }
        _hashCode += getRemainingHits();
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SISubscriptionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.strikeiron.com", "SISubscriptionInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseStatusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.strikeiron.com", "LicenseStatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.strikeiron.com", "LicenseStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.strikeiron.com", "LicenseActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.strikeiron.com", "LicenseAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingHits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.strikeiron.com", "RemainingHits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.strikeiron.com", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
