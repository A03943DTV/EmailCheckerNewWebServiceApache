/*
 * Author  : Meiyazhagan Arjunan
 * Company : Ilink Multitech Solutions
 */
package com.directv.emailchecker;

import java.rmi.RemoteException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.rpc.ServiceException;

// TODO: Auto-generated Javadoc
/**
 * The Class StrikeIronRestService.
 */
@Path("/strikeirondirectv")
public class StrikeIronRestService {

	/** The Constant SUCCESS. */
	private static final String SUCCESS = "Success";

	/** The Constant FAILURE. */
	private static final String FAILURE = "Failure";

	/**
	 * Email checker.
	 *
	 * @param emailId the email id
	 * @return the response
	 */
	@GET
	@Path("/emailchecker/{emailid}")
	@Produces( { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response emailChecker(@PathParam("emailid") String emailId) {

		//StatusNbr = 200 StatusDescription = Email Valid
		//StatusNbr = 201 StatusDescription = Email Not Valid
		//StatusNbr = 202 StatusDescription = MX Will Accept
		//StatusNbr = 203 StatusDescription = User Account Valid
		//StatusNbr = 300 StatusDescription = Timed Out
		//StatusNbr = 310 StatusDescription = Domain Not Found
		//StatusNbr = 311 StatusDescription = Not A Valid Mail Domain
		//StatusNbr = 320 StatusDescription = MX Not Responding
		//StatusNbr = 321 StatusDescription = MX Deferred
		//StatusNbr = 322 StatusDescription = MX Throttled
		//StatusNbr = 323 StatusDescription = MX Actively Rejected
		//StatusNbr = 400 StatusDescription = Invalid Input
		//StatusNbr = 401 StatusDescription = Invalid Local Name
		//StatusNbr = 402 StatusDescription = Invalid Domain Name
		//StatusNbr = 403 StatusDescription = Invalid Timeout (must be between 15 and 120 seconds)
		//StatusNbr = 500 StatusDescription = Internal Error
		//StatusNbr = 501 StatusDescription = Internal Error: No Relay Services Found

		try {

			EmailChecker emailchecker = new StrikeIronService().validateEmailId(emailId);

			// -> 200-299: Operation completed successfully (data found, etc)
			// -> 300-399: Operation completed with non-fatal error (no data found, etc)
			// -> 400-499: Operation failed due to invalid input
			// -> 500+   : Operation failed due to unexpected internal error, contact support@strikeiron.com

			if (emailchecker.getStatusno() == 201) {
				emailchecker.setIsvalid(false);
				return new Response(emailId, SUCCESS, emailchecker, null);
			} else if (emailchecker.getStatusno() >= 200 && emailchecker.getStatusno() <= 299) {
				emailchecker.setIsvalid(true);
				return new Response(emailId, SUCCESS, emailchecker, null);
			} else if (emailchecker.getStatusno() >= 300 && emailchecker.getStatusno() <= 399) {
				emailchecker.setIsvalid(false);
				return new Response(emailId, SUCCESS, emailchecker, null);
			} else if (emailchecker.getStatusno() >= 400 && emailchecker.getStatusno() <= 499) {
				emailchecker.setIsvalid(false);
				return new Response(emailId, SUCCESS, emailchecker, null);
			} else if (emailchecker.getStatusno() >= 500) {
				return new Response(emailId, FAILURE, null, new ErrorMessage("StrikeIron: " + emailchecker.getDescription()));
			}

		} catch (RemoteException e) {
			e.printStackTrace();
			return new Response(emailId, FAILURE, null, new ErrorMessage("StrikeIron: " + e.getMessage()));
		} catch (ServiceException e) {
			e.printStackTrace();
			return new Response(emailId, FAILURE, null, new ErrorMessage("StrikeIron: " + e.getMessage()));
		}
		return null;
	}

	/**
	 * Email checker filtered.
	 *
	 * @param emailId the email id
	 * @return the string
	 */
	@GET
	@Path("/emailcheckerfiltered/{emailid}")
	public String emailCheckerFiltered(@PathParam("emailid") String emailId) {

		try {

			EmailChecker emailchecker = new StrikeIronService().validateEmailId(emailId);

			if (emailchecker.getStatusno() == 201) {
				return String.valueOf(false);
			} else if (emailchecker.getStatusno() >= 200 && emailchecker.getStatusno() <= 299) {
				return String.valueOf(true);
			} else if (emailchecker.getStatusno() >= 300 && emailchecker.getStatusno() <= 399) {
				return String.valueOf(false);
			} else if (emailchecker.getStatusno() >= 400 && emailchecker.getStatusno() <= 499) {
				return String.valueOf(false);
			} else if (emailchecker.getStatusno() >= 500) {
				return "StrikeIron: " + emailchecker.getDescription();
			}

		} catch (RemoteException e) {
			e.printStackTrace();
			return "StrikeIron: " + e.getMessage();
		} catch (ServiceException e) {
			e.printStackTrace();
			return "StrikeIron: " + e.getMessage();
		}
		return null;
	}
}
