/**
 * EmailVerificationSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.strikeiron.www;

public interface EmailVerificationSoap extends java.rmi.Remote {

    /**
     * Validates an email address with the given timeout.
     */
    public void verifyEmail(java.lang.String unregisteredUserEmail, java.lang.String userID, java.lang.String password, java.lang.String email, int timeout, com.strikeiron.www.holders.SIWsOutputOfVerifyEmailRecordHolder verifyEmailResult, com.strikeiron.www.holders.SISubscriptionInfoHolder SISubscriptionInfo) throws java.rmi.RemoteException;

    /**
     * Gets all status codes a method in the service might return.
     */
    public void getStatusCodesForMethod(java.lang.String unregisteredUserEmail, java.lang.String userID, java.lang.String password, java.lang.String methodname, com.strikeiron.www.holders.SIWsOutputOfMethodStatusRecordHolder getStatusCodesForMethodResult, com.strikeiron.www.holders.SISubscriptionInfoHolder SISubscriptionInfo) throws java.rmi.RemoteException;

    /**
     * Get all statuses this service might return.
     */
    public void getStatusCodes(java.lang.String unregisteredUserEmail, java.lang.String userID, java.lang.String password, com.strikeiron.www.holders.SIWsOutputOfSIWsResultArrayOfMethodStatusRecordHolder getStatusCodesResult, com.strikeiron.www.holders.SISubscriptionInfoHolder SISubscriptionInfo) throws java.rmi.RemoteException;

    /**
     * Get information about the web service
     */
    public void getServiceInfo(java.lang.String unregisteredUserEmail, java.lang.String userID, java.lang.String password, com.strikeiron.www.holders.SIWsOutputOfSIWsResultArrayOfServiceInfoRecordHolder getServiceInfoResult, com.strikeiron.www.holders.SISubscriptionInfoHolder SISubscriptionInfo) throws java.rmi.RemoteException;
    public void getRemainingHits(java.lang.String unregisteredUserEmail, java.lang.String userID, java.lang.String password, javax.xml.rpc.holders.IntHolder licenseStatusCode, javax.xml.rpc.holders.StringHolder licenseStatus, javax.xml.rpc.holders.IntHolder licenseActionCode, javax.xml.rpc.holders.StringHolder licenseAction, javax.xml.rpc.holders.IntHolder remainingHits, javax.xml.rpc.holders.BigDecimalHolder amount) throws java.rmi.RemoteException;
}
