/*
 * Author  : Meiyazhagan Arjunan
 * Company : Ilink Multitech Solutions
 */
package com.directv.emailchecker;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.strikeiron.www.EmailVerificationLocator;
import com.strikeiron.www.EmailVerificationSoap;
import com.strikeiron.www.holders.SISubscriptionInfoHolder;
import com.strikeiron.www.holders.SIWsOutputOfVerifyEmailRecordHolder;

// TODO: Auto-generated Javadoc
/**
 * The Class StrikeIronService.
 */
public class StrikeIronService {

	/** The Constant STRIKE_IRON_REG_USERID. */
	private static final String STRIKE_IRON_REG_USERID = "bsisson@directv.com";

	/** The Constant STRIKE_IRON_REG_PASSWORD. */
	private static final String STRIKE_IRON_REG_PASSWORD = "Direc12";

	/**
	 * Validate email id.
	 *
	 * @param emailId the email id
	 * @return the email checker
	 * @throws ServiceException the service exception
	 * @throws RemoteException the remote exception
	 */
	public EmailChecker validateEmailId(String emailId) throws ServiceException, RemoteException {

		/**
		 * This sample project demonstrates how to call the StrikeIron Email Verification 5.0 VerifyEmail
		 * web service operation.  To use this sample code, you will need a Registered StrikeIron Account.  If you
		 * do not have a StrikeIron Registered Account, you can obtain one here: http://www.strikeiron.com/Register.aspx
		 * 
		 * This sample uses the parameterized StrikeIron Email Verification 5.0 web service definition located at
		 * http://wsparam.strikeiron.com/emailverify5?WSDL  For more information on this web service, visit
		 * http://www.strikeiron.com/ProductDetail.aspx?p=447
		 * 
		 * Web service proxy classes have been auto-generated for the web service definition above using the Apache Axis
		 * 1.4 WSDL2Java emitter. 
		 */

		/**
		 * The rest of the web service inputs for Email Verification are declared here
		 */
		int timeout = 30; //number of seconds web service should wait for a response from mail server
		//valid values are between 30 and 120 (inclusive)

		/**
		 * Web service outputs are returned from the method call in Holder objects declared in the com.strikeiron.www.holders
		 * package.  The output for the VerifyAddressUSA method uses two holders: typed SIWsOutputOfVerifyEmailRecordHolder used to
		 * store the actual web service output, and SISubscriptionInfoHolder used to hold StrikeIron account information based
		 * on the result of the web service request.
		 */
		SIWsOutputOfVerifyEmailRecordHolder siResponse = new SIWsOutputOfVerifyEmailRecordHolder();
		SISubscriptionInfoHolder subInfo = new SISubscriptionInfoHolder();

		/**
		 * When using Apache Axis 1.4 WSDL2Java to generate proxy classes for a web service definition, there will be a Locator
		 * class used to generate instances of a web service client object.  For this web service the locator class name is
		 * EmailVerificationLocator, and the web service client object - which contains methods for each web service operation
		 * described in the web service definition - is named EmailVerificationSoap (with interface EmailVerification).
		 * Instances of each of these classes are defined and initialized below.
		 */
		EmailVerificationLocator serviceLocator = new EmailVerificationLocator();
		EmailVerificationSoap siService = serviceLocator.getEmailVerificationSoap();

		/**
		 * The web service operation can now be called using the inputs declared above.  Outputs are stored in holder objects,
		 * also defined above.  Note that for simplicity, there is no error handling in this project.  In a production environment,
		 * however, any web service request should be wrapped in a try-catch block with appropriate error handling.
		 */
		siService.verifyEmail(null, STRIKE_IRON_REG_USERID, STRIKE_IRON_REG_PASSWORD, emailId, timeout, siResponse, subInfo);

		/**
		 * The web service output object contains two elements: ServiceResult, which contains the output data based on web service inputs,
		 * and ServiceStatus, which contains a numeric status code and description indicating the success/failure status of the web service
		 * request.  You can make the following assumptions about the StatusNbr field within ServiceStatus for any StrikeIron web service:
		 *   -> 200-299: Operation completed successfully (data found, etc)
		 *   -> 300-399: Operation completed with non-fatal error (no data found, etc)
		 *   -> 400-499: Operation failed due to invalid input
		 *   -> 500+: Operation failed due to unexpected internal error, contact support@strikeiron.com
		 *   
		 * The output fields from the web service are now displayed to the console.  Note that not all output fields from ServiceResult are included.
		 * For more information on the data elements returned by StrikeIron Email Verification 5.0, refer to the product description page provided
		 * above.
		 */
		int statusNbr = siResponse.value.getServiceStatus().getStatusNbr();
		String statusDescription = siResponse.value.getServiceStatus().getStatusDescription();
		String localPart = siResponse.value.getServiceResult().getLocalPart();
		String domainPart = siResponse.value.getServiceResult().getDomainPart();
		boolean isRecommendedRetry = siResponse.value.getServiceResult().isRecommendedRetry();

		System.out.println("-----------------------------------------------------");
		System.out.println("EmailId      : " + emailId);
		System.out.println("StatusNbr    : " + statusNbr);
		System.out.println("StatusDesc   : " + statusDescription);
		System.out.println("LocalPart    : " + localPart);
		System.out.println("DomainPart   : " + domainPart);
		System.out.println("IsRecomRetry : " + isRecommendedRetry);

		return new EmailChecker(statusNbr, statusDescription);
	}
}
