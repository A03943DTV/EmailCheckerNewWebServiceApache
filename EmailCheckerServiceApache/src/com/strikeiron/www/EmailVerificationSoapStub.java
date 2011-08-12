/**
 * EmailVerificationSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.strikeiron.www;

public class EmailVerificationSoapStub extends org.apache.axis.client.Stub implements com.strikeiron.www.EmailVerificationSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("VerifyEmail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "UnregisteredUserEmail"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "UserID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "Email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "Timeout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "VerifyEmailResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.strikeiron.com", "SIWsOutputOfVerifyEmailRecord"), com.strikeiron.www.SIWsOutputOfVerifyEmailRecord.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "SISubscriptionInfo"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.strikeiron.com", "SISubscriptionInfo"), com.strikeiron.www.SISubscriptionInfo.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStatusCodesForMethod");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "UnregisteredUserEmail"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "UserID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "methodname"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "GetStatusCodesForMethodResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.strikeiron.com", "SIWsOutputOfMethodStatusRecord"), com.strikeiron.www.SIWsOutputOfMethodStatusRecord.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "SISubscriptionInfo"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.strikeiron.com", "SISubscriptionInfo"), com.strikeiron.www.SISubscriptionInfo.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStatusCodes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "UnregisteredUserEmail"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "UserID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "GetStatusCodesResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.strikeiron.com", "SIWsOutputOfSIWsResultArrayOfMethodStatusRecord"), com.strikeiron.www.SIWsOutputOfSIWsResultArrayOfMethodStatusRecord.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "SISubscriptionInfo"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.strikeiron.com", "SISubscriptionInfo"), com.strikeiron.www.SISubscriptionInfo.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetServiceInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "UnregisteredUserEmail"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "UserID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "GetServiceInfoResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.strikeiron.com", "SIWsOutputOfSIWsResultArrayOfServiceInfoRecord"), com.strikeiron.www.SIWsOutputOfSIWsResultArrayOfServiceInfoRecord.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "SISubscriptionInfo"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.strikeiron.com", "SISubscriptionInfo"), com.strikeiron.www.SISubscriptionInfo.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetRemainingHits");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "UnregisteredUserEmail"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "UserID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "LicenseStatusCode"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "LicenseStatus"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "LicenseActionCode"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "LicenseAction"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "RemainingHits"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.strikeiron.com", "Amount"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

    }

    public EmailVerificationSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public EmailVerificationSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public EmailVerificationSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.strikeiron.com", "ArrayOfMethodStatusRecord");
            cachedSerQNames.add(qName);
            cls = com.strikeiron.www.MethodStatusRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.strikeiron.com", "MethodStatusRecord");
            qName2 = new javax.xml.namespace.QName("http://www.strikeiron.com", "MethodStatusRecord");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.strikeiron.com", "ArrayOfServiceInfoRecord");
            cachedSerQNames.add(qName);
            cls = com.strikeiron.www.ServiceInfoRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.strikeiron.com", "ServiceInfoRecord");
            qName2 = new javax.xml.namespace.QName("http://www.strikeiron.com", "ServiceInfoRecord");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.strikeiron.com", "ArrayOfSIWsStatus");
            cachedSerQNames.add(qName);
            cls = com.strikeiron.www.SIWsStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.strikeiron.com", "SIWsStatus");
            qName2 = new javax.xml.namespace.QName("http://www.strikeiron.com", "SIWsStatus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.strikeiron.com", "ArrayOfStringKeyValuePair");
            cachedSerQNames.add(qName);
            cls = com.strikeiron.www.StringKeyValuePair[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.strikeiron.com", "StringKeyValuePair");
            qName2 = new javax.xml.namespace.QName("http://www.strikeiron.com", "StringKeyValuePair");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.strikeiron.com", "MethodStatusRecord");
            cachedSerQNames.add(qName);
            cls = com.strikeiron.www.MethodStatusRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.strikeiron.com", "ServiceInfoRecord");
            cachedSerQNames.add(qName);
            cls = com.strikeiron.www.ServiceInfoRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.strikeiron.com", "SISubscriptionInfo");
            cachedSerQNames.add(qName);
            cls = com.strikeiron.www.SISubscriptionInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.strikeiron.com", "SIWsOutputOfMethodStatusRecord");
            cachedSerQNames.add(qName);
            cls = com.strikeiron.www.SIWsOutputOfMethodStatusRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.strikeiron.com", "SIWsOutputOfSIWsResultArrayOfMethodStatusRecord");
            cachedSerQNames.add(qName);
            cls = com.strikeiron.www.SIWsOutputOfSIWsResultArrayOfMethodStatusRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.strikeiron.com", "SIWsOutputOfSIWsResultArrayOfServiceInfoRecord");
            cachedSerQNames.add(qName);
            cls = com.strikeiron.www.SIWsOutputOfSIWsResultArrayOfServiceInfoRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.strikeiron.com", "SIWsOutputOfVerifyEmailRecord");
            cachedSerQNames.add(qName);
            cls = com.strikeiron.www.SIWsOutputOfVerifyEmailRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.strikeiron.com", "SIWsResultArrayOfMethodStatusRecord");
            cachedSerQNames.add(qName);
            cls = com.strikeiron.www.SIWsResultArrayOfMethodStatusRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.strikeiron.com", "SIWsResultArrayOfServiceInfoRecord");
            cachedSerQNames.add(qName);
            cls = com.strikeiron.www.SIWsResultArrayOfServiceInfoRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.strikeiron.com", "SIWsResultArrayOfSIWsStatus");
            cachedSerQNames.add(qName);
            cls = com.strikeiron.www.SIWsResultArrayOfSIWsStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.strikeiron.com", "SIWsStatus");
            cachedSerQNames.add(qName);
            cls = com.strikeiron.www.SIWsStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.strikeiron.com", "StringKeyValuePair");
            cachedSerQNames.add(qName);
            cls = com.strikeiron.www.StringKeyValuePair.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.strikeiron.com", "VerifyEmailRecord");
            cachedSerQNames.add(qName);
            cls = com.strikeiron.www.VerifyEmailRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void verifyEmail(java.lang.String unregisteredUserEmail, java.lang.String userID, java.lang.String password, java.lang.String email, int timeout, com.strikeiron.www.holders.SIWsOutputOfVerifyEmailRecordHolder verifyEmailResult, com.strikeiron.www.holders.SISubscriptionInfoHolder SISubscriptionInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.strikeiron.com/VerifyEmail");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.strikeiron.com", "VerifyEmail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {unregisteredUserEmail, userID, password, email, new java.lang.Integer(timeout)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                verifyEmailResult.value = (com.strikeiron.www.SIWsOutputOfVerifyEmailRecord) _output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "VerifyEmailResult"));
            } catch (java.lang.Exception _exception) {
                verifyEmailResult.value = (com.strikeiron.www.SIWsOutputOfVerifyEmailRecord) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "VerifyEmailResult")), com.strikeiron.www.SIWsOutputOfVerifyEmailRecord.class);
            }
            try {
                SISubscriptionInfo.value = (com.strikeiron.www.SISubscriptionInfo) _output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "SISubscriptionInfo"));
            } catch (java.lang.Exception _exception) {
                SISubscriptionInfo.value = (com.strikeiron.www.SISubscriptionInfo) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "SISubscriptionInfo")), com.strikeiron.www.SISubscriptionInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getStatusCodesForMethod(java.lang.String unregisteredUserEmail, java.lang.String userID, java.lang.String password, java.lang.String methodname, com.strikeiron.www.holders.SIWsOutputOfMethodStatusRecordHolder getStatusCodesForMethodResult, com.strikeiron.www.holders.SISubscriptionInfoHolder SISubscriptionInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.strikeiron.com/GetStatusCodesForMethod");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.strikeiron.com", "GetStatusCodesForMethod"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {unregisteredUserEmail, userID, password, methodname});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                getStatusCodesForMethodResult.value = (com.strikeiron.www.SIWsOutputOfMethodStatusRecord) _output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "GetStatusCodesForMethodResult"));
            } catch (java.lang.Exception _exception) {
                getStatusCodesForMethodResult.value = (com.strikeiron.www.SIWsOutputOfMethodStatusRecord) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "GetStatusCodesForMethodResult")), com.strikeiron.www.SIWsOutputOfMethodStatusRecord.class);
            }
            try {
                SISubscriptionInfo.value = (com.strikeiron.www.SISubscriptionInfo) _output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "SISubscriptionInfo"));
            } catch (java.lang.Exception _exception) {
                SISubscriptionInfo.value = (com.strikeiron.www.SISubscriptionInfo) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "SISubscriptionInfo")), com.strikeiron.www.SISubscriptionInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getStatusCodes(java.lang.String unregisteredUserEmail, java.lang.String userID, java.lang.String password, com.strikeiron.www.holders.SIWsOutputOfSIWsResultArrayOfMethodStatusRecordHolder getStatusCodesResult, com.strikeiron.www.holders.SISubscriptionInfoHolder SISubscriptionInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.strikeiron.com/GetStatusCodes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.strikeiron.com", "GetStatusCodes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {unregisteredUserEmail, userID, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                getStatusCodesResult.value = (com.strikeiron.www.SIWsOutputOfSIWsResultArrayOfMethodStatusRecord) _output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "GetStatusCodesResult"));
            } catch (java.lang.Exception _exception) {
                getStatusCodesResult.value = (com.strikeiron.www.SIWsOutputOfSIWsResultArrayOfMethodStatusRecord) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "GetStatusCodesResult")), com.strikeiron.www.SIWsOutputOfSIWsResultArrayOfMethodStatusRecord.class);
            }
            try {
                SISubscriptionInfo.value = (com.strikeiron.www.SISubscriptionInfo) _output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "SISubscriptionInfo"));
            } catch (java.lang.Exception _exception) {
                SISubscriptionInfo.value = (com.strikeiron.www.SISubscriptionInfo) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "SISubscriptionInfo")), com.strikeiron.www.SISubscriptionInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getServiceInfo(java.lang.String unregisteredUserEmail, java.lang.String userID, java.lang.String password, com.strikeiron.www.holders.SIWsOutputOfSIWsResultArrayOfServiceInfoRecordHolder getServiceInfoResult, com.strikeiron.www.holders.SISubscriptionInfoHolder SISubscriptionInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.strikeiron.com/GetServiceInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.strikeiron.com", "GetServiceInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {unregisteredUserEmail, userID, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                getServiceInfoResult.value = (com.strikeiron.www.SIWsOutputOfSIWsResultArrayOfServiceInfoRecord) _output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "GetServiceInfoResult"));
            } catch (java.lang.Exception _exception) {
                getServiceInfoResult.value = (com.strikeiron.www.SIWsOutputOfSIWsResultArrayOfServiceInfoRecord) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "GetServiceInfoResult")), com.strikeiron.www.SIWsOutputOfSIWsResultArrayOfServiceInfoRecord.class);
            }
            try {
                SISubscriptionInfo.value = (com.strikeiron.www.SISubscriptionInfo) _output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "SISubscriptionInfo"));
            } catch (java.lang.Exception _exception) {
                SISubscriptionInfo.value = (com.strikeiron.www.SISubscriptionInfo) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "SISubscriptionInfo")), com.strikeiron.www.SISubscriptionInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getRemainingHits(java.lang.String unregisteredUserEmail, java.lang.String userID, java.lang.String password, javax.xml.rpc.holders.IntHolder licenseStatusCode, javax.xml.rpc.holders.StringHolder licenseStatus, javax.xml.rpc.holders.IntHolder licenseActionCode, javax.xml.rpc.holders.StringHolder licenseAction, javax.xml.rpc.holders.IntHolder remainingHits, javax.xml.rpc.holders.BigDecimalHolder amount) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://wsparam.strikeiron.com/StrikeIron/EmailVerify5/EmailVerification/GetRemainingHits");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.strikeiron.com", "SILicenseInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {unregisteredUserEmail, userID, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                licenseStatusCode.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "LicenseStatusCode"))).intValue();
            } catch (java.lang.Exception _exception) {
                licenseStatusCode.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "LicenseStatusCode")), int.class)).intValue();
            }
            try {
                licenseStatus.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "LicenseStatus"));
            } catch (java.lang.Exception _exception) {
                licenseStatus.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "LicenseStatus")), java.lang.String.class);
            }
            try {
                licenseActionCode.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "LicenseActionCode"))).intValue();
            } catch (java.lang.Exception _exception) {
                licenseActionCode.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "LicenseActionCode")), int.class)).intValue();
            }
            try {
                licenseAction.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "LicenseAction"));
            } catch (java.lang.Exception _exception) {
                licenseAction.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "LicenseAction")), java.lang.String.class);
            }
            try {
                remainingHits.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "RemainingHits"))).intValue();
            } catch (java.lang.Exception _exception) {
                remainingHits.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "RemainingHits")), int.class)).intValue();
            }
            try {
                amount.value = (java.math.BigDecimal) _output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "Amount"));
            } catch (java.lang.Exception _exception) {
                amount.value = (java.math.BigDecimal) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.strikeiron.com", "Amount")), java.math.BigDecimal.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
