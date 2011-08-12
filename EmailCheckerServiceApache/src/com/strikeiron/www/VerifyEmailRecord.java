/**
 * VerifyEmailRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.strikeiron.www;

public class VerifyEmailRecord  implements java.io.Serializable {
    private java.lang.String EMail;

    private java.lang.String localPart;

    private java.lang.String domainPart;

    private boolean recommendedRetry;

    private com.strikeiron.www.StringKeyValuePair[] domainKnowledge;

    private com.strikeiron.www.StringKeyValuePair[] addressKnowledge;

    public VerifyEmailRecord() {
    }

    public VerifyEmailRecord(
           java.lang.String EMail,
           java.lang.String localPart,
           java.lang.String domainPart,
           boolean recommendedRetry,
           com.strikeiron.www.StringKeyValuePair[] domainKnowledge,
           com.strikeiron.www.StringKeyValuePair[] addressKnowledge) {
           this.EMail = EMail;
           this.localPart = localPart;
           this.domainPart = domainPart;
           this.recommendedRetry = recommendedRetry;
           this.domainKnowledge = domainKnowledge;
           this.addressKnowledge = addressKnowledge;
    }


    /**
     * Gets the EMail value for this VerifyEmailRecord.
     * 
     * @return EMail
     */
    public java.lang.String getEMail() {
        return EMail;
    }


    /**
     * Sets the EMail value for this VerifyEmailRecord.
     * 
     * @param EMail
     */
    public void setEMail(java.lang.String EMail) {
        this.EMail = EMail;
    }


    /**
     * Gets the localPart value for this VerifyEmailRecord.
     * 
     * @return localPart
     */
    public java.lang.String getLocalPart() {
        return localPart;
    }


    /**
     * Sets the localPart value for this VerifyEmailRecord.
     * 
     * @param localPart
     */
    public void setLocalPart(java.lang.String localPart) {
        this.localPart = localPart;
    }


    /**
     * Gets the domainPart value for this VerifyEmailRecord.
     * 
     * @return domainPart
     */
    public java.lang.String getDomainPart() {
        return domainPart;
    }


    /**
     * Sets the domainPart value for this VerifyEmailRecord.
     * 
     * @param domainPart
     */
    public void setDomainPart(java.lang.String domainPart) {
        this.domainPart = domainPart;
    }


    /**
     * Gets the recommendedRetry value for this VerifyEmailRecord.
     * 
     * @return recommendedRetry
     */
    public boolean isRecommendedRetry() {
        return recommendedRetry;
    }


    /**
     * Sets the recommendedRetry value for this VerifyEmailRecord.
     * 
     * @param recommendedRetry
     */
    public void setRecommendedRetry(boolean recommendedRetry) {
        this.recommendedRetry = recommendedRetry;
    }


    /**
     * Gets the domainKnowledge value for this VerifyEmailRecord.
     * 
     * @return domainKnowledge
     */
    public com.strikeiron.www.StringKeyValuePair[] getDomainKnowledge() {
        return domainKnowledge;
    }


    /**
     * Sets the domainKnowledge value for this VerifyEmailRecord.
     * 
     * @param domainKnowledge
     */
    public void setDomainKnowledge(com.strikeiron.www.StringKeyValuePair[] domainKnowledge) {
        this.domainKnowledge = domainKnowledge;
    }


    /**
     * Gets the addressKnowledge value for this VerifyEmailRecord.
     * 
     * @return addressKnowledge
     */
    public com.strikeiron.www.StringKeyValuePair[] getAddressKnowledge() {
        return addressKnowledge;
    }


    /**
     * Sets the addressKnowledge value for this VerifyEmailRecord.
     * 
     * @param addressKnowledge
     */
    public void setAddressKnowledge(com.strikeiron.www.StringKeyValuePair[] addressKnowledge) {
        this.addressKnowledge = addressKnowledge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VerifyEmailRecord)) return false;
        VerifyEmailRecord other = (VerifyEmailRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EMail==null && other.getEMail()==null) || 
             (this.EMail!=null &&
              this.EMail.equals(other.getEMail()))) &&
            ((this.localPart==null && other.getLocalPart()==null) || 
             (this.localPart!=null &&
              this.localPart.equals(other.getLocalPart()))) &&
            ((this.domainPart==null && other.getDomainPart()==null) || 
             (this.domainPart!=null &&
              this.domainPart.equals(other.getDomainPart()))) &&
            this.recommendedRetry == other.isRecommendedRetry() &&
            ((this.domainKnowledge==null && other.getDomainKnowledge()==null) || 
             (this.domainKnowledge!=null &&
              java.util.Arrays.equals(this.domainKnowledge, other.getDomainKnowledge()))) &&
            ((this.addressKnowledge==null && other.getAddressKnowledge()==null) || 
             (this.addressKnowledge!=null &&
              java.util.Arrays.equals(this.addressKnowledge, other.getAddressKnowledge())));
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
        if (getEMail() != null) {
            _hashCode += getEMail().hashCode();
        }
        if (getLocalPart() != null) {
            _hashCode += getLocalPart().hashCode();
        }
        if (getDomainPart() != null) {
            _hashCode += getDomainPart().hashCode();
        }
        _hashCode += (isRecommendedRetry() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDomainKnowledge() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDomainKnowledge());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDomainKnowledge(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddressKnowledge() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressKnowledge());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressKnowledge(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VerifyEmailRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.strikeiron.com", "VerifyEmailRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.strikeiron.com", "EMail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localPart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.strikeiron.com", "LocalPart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainPart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.strikeiron.com", "DomainPart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommendedRetry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.strikeiron.com", "RecommendedRetry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainKnowledge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.strikeiron.com", "DomainKnowledge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.strikeiron.com", "StringKeyValuePair"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.strikeiron.com", "StringKeyValuePair"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressKnowledge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.strikeiron.com", "AddressKnowledge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.strikeiron.com", "StringKeyValuePair"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.strikeiron.com", "StringKeyValuePair"));
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
