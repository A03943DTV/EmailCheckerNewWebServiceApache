package com.strikeiron.www;

public class EmailVerificationSoapProxy implements com.strikeiron.www.EmailVerificationSoap {
  private String _endpoint = null;
  private com.strikeiron.www.EmailVerificationSoap emailVerificationSoap = null;
  
  public EmailVerificationSoapProxy() {
    _initEmailVerificationSoapProxy();
  }
  
  public EmailVerificationSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initEmailVerificationSoapProxy();
  }
  
  private void _initEmailVerificationSoapProxy() {
    try {
      emailVerificationSoap = (new com.strikeiron.www.EmailVerificationLocator()).getEmailVerificationSoap();
      if (emailVerificationSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)emailVerificationSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)emailVerificationSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (emailVerificationSoap != null)
      ((javax.xml.rpc.Stub)emailVerificationSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.strikeiron.www.EmailVerificationSoap getEmailVerificationSoap() {
    if (emailVerificationSoap == null)
      _initEmailVerificationSoapProxy();
    return emailVerificationSoap;
  }
  
  public void verifyEmail(java.lang.String unregisteredUserEmail, java.lang.String userID, java.lang.String password, java.lang.String email, int timeout, com.strikeiron.www.holders.SIWsOutputOfVerifyEmailRecordHolder verifyEmailResult, com.strikeiron.www.holders.SISubscriptionInfoHolder SISubscriptionInfo) throws java.rmi.RemoteException{
    if (emailVerificationSoap == null)
      _initEmailVerificationSoapProxy();
    emailVerificationSoap.verifyEmail(unregisteredUserEmail, userID, password, email, timeout, verifyEmailResult, SISubscriptionInfo);
  }
  
  public void getStatusCodesForMethod(java.lang.String unregisteredUserEmail, java.lang.String userID, java.lang.String password, java.lang.String methodname, com.strikeiron.www.holders.SIWsOutputOfMethodStatusRecordHolder getStatusCodesForMethodResult, com.strikeiron.www.holders.SISubscriptionInfoHolder SISubscriptionInfo) throws java.rmi.RemoteException{
    if (emailVerificationSoap == null)
      _initEmailVerificationSoapProxy();
    emailVerificationSoap.getStatusCodesForMethod(unregisteredUserEmail, userID, password, methodname, getStatusCodesForMethodResult, SISubscriptionInfo);
  }
  
  public void getStatusCodes(java.lang.String unregisteredUserEmail, java.lang.String userID, java.lang.String password, com.strikeiron.www.holders.SIWsOutputOfSIWsResultArrayOfMethodStatusRecordHolder getStatusCodesResult, com.strikeiron.www.holders.SISubscriptionInfoHolder SISubscriptionInfo) throws java.rmi.RemoteException{
    if (emailVerificationSoap == null)
      _initEmailVerificationSoapProxy();
    emailVerificationSoap.getStatusCodes(unregisteredUserEmail, userID, password, getStatusCodesResult, SISubscriptionInfo);
  }
  
  public void getServiceInfo(java.lang.String unregisteredUserEmail, java.lang.String userID, java.lang.String password, com.strikeiron.www.holders.SIWsOutputOfSIWsResultArrayOfServiceInfoRecordHolder getServiceInfoResult, com.strikeiron.www.holders.SISubscriptionInfoHolder SISubscriptionInfo) throws java.rmi.RemoteException{
    if (emailVerificationSoap == null)
      _initEmailVerificationSoapProxy();
    emailVerificationSoap.getServiceInfo(unregisteredUserEmail, userID, password, getServiceInfoResult, SISubscriptionInfo);
  }
  
  public void getRemainingHits(java.lang.String unregisteredUserEmail, java.lang.String userID, java.lang.String password, javax.xml.rpc.holders.IntHolder licenseStatusCode, javax.xml.rpc.holders.StringHolder licenseStatus, javax.xml.rpc.holders.IntHolder licenseActionCode, javax.xml.rpc.holders.StringHolder licenseAction, javax.xml.rpc.holders.IntHolder remainingHits, javax.xml.rpc.holders.BigDecimalHolder amount) throws java.rmi.RemoteException{
    if (emailVerificationSoap == null)
      _initEmailVerificationSoapProxy();
    emailVerificationSoap.getRemainingHits(unregisteredUserEmail, userID, password, licenseStatusCode, licenseStatus, licenseActionCode, licenseAction, remainingHits, amount);
  }
  
  
}