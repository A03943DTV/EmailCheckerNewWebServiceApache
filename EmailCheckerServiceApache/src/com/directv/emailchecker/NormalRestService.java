/*
 * Author  : Meiyazhagan Arjunan
 * Company : Ilink Multitech Solutions
 */
package com.directv.emailchecker;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// TODO: Auto-generated Javadoc
/**
 * The Class NormalRestService.
 */
@Path("/directv")
public class NormalRestService {

	/** The Constant POST_URL. */
	private static final String POST_URL = "http://www.ip-address.org/verify/email-checker.php";

	/** The Constant SUCCESS. */
	private static final String SUCCESS = "Success";

	/** The Constant FAILURE. */
	private static final String FAILURE = "Failure";

	/** The Constant DIV_CLASS_EMAIL_RED. */
	private static final String DIV_CLASS_EMAIL_RED = "<div class='emailred'>";

	/** The Constant DIV_CLASS_EMAIL. */
	private static final String DIV_CLASS_EMAIL = "<div class='email'>";

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

		return excutePost(POST_URL, getUrlParameters(emailId), emailId);
	}

	/**
	 * Email checker filtered.
	 *
	 * @param emailId the email id
	 * @return the string
	 */
	@GET
	@Path("/emailcheckerfiltered/{emailid}")
	@Produces( { MediaType.TEXT_PLAIN })
	public String emailCheckerFiltered(@PathParam("emailid") String emailId) {

		return excutePostFiltered(POST_URL, getUrlParameters(emailId), emailId);
	}

	/**
	 * Gets the url parameters.
	 *
	 * @param emailId the email id
	 * @return the url parameters
	 */
	private String getUrlParameters(String emailId) {

		String urlParameters = null;
		try {
			urlParameters = "email=" + URLEncoder.encode(emailId, "UTF-8") + "&send=" + URLEncoder.encode("1", "UTF-8") + "&submit="
					+ URLEncoder.encode("Email Lookup", "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return urlParameters;
	}

	/**
	 * Excute post filtered.
	 *
	 * @param targetURL the target url
	 * @param urlParameters the url parameters
	 * @param emailId the email id
	 * @return the string
	 */
	private String excutePostFiltered(String targetURL, String urlParameters, String emailId) {

		HttpURLConnection connection = null;

		try {

			connection = getConnection(targetURL, urlParameters);

			//Send request
			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			int statusCode = connection.getResponseCode();
			if (statusCode != 200) {
				return "Invalid HTTP response status code " + statusCode + " from URL " + POST_URL;
			}

			//Get Response	
			InputStream is = connection.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			return verifyResponseContentFiltered(br, emailId);

		} catch (Exception e) {
			e.printStackTrace();
			return "Exception in connecting to the URL and getting response";
		} finally {
			if (connection != null) {
				connection.disconnect();
			}
		}
	}

	/**
	 * Excute post.
	 *
	 * @param targetURL the target url
	 * @param urlParameters the url parameters
	 * @param emailId the email id
	 * @return the response
	 */
	public Response excutePost(String targetURL, String urlParameters, String emailId) {

		HttpURLConnection connection = null;

		try {

			connection = getConnection(targetURL, urlParameters);

			//Send request
			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();

			int statusCode = connection.getResponseCode();
			if (statusCode != 200) {
				return new Response(emailId, FAILURE, null, new ErrorMessage("Invalid HTTP response status code " + statusCode + " from URL "
						+ POST_URL));
			}

			//Get Response	
			InputStream is = connection.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			return verifyResponseContent(br, emailId);

		} catch (Exception e) {
			e.printStackTrace();
			return new Response(emailId, FAILURE, null, new ErrorMessage("Exception in connecting to the URL and getting response"));
		} finally {
			if (connection != null) {
				connection.disconnect();
			}
		}
	}

	/**
	 * Gets the connection.
	 *
	 * @param targetURL the target url
	 * @param urlParameters the url parameters
	 * @return the connection
	 * @throws Exception the exception
	 */
	private HttpURLConnection getConnection(String targetURL, String urlParameters) throws Exception {

		URL url = new URL(targetURL);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		connection.setRequestProperty("Content-Length", "" + Integer.toString(urlParameters.getBytes().length));
		connection.setRequestProperty("Content-Language", "en-US");
		connection.setConnectTimeout(60000);//1 minute
		connection.setUseCaches(false);
		connection.setDoInput(true);
		connection.setDoOutput(true);
		return connection;
	}

	/**
	 * Verify response content.
	 *
	 * @param br the br
	 * @param emailId the email id
	 * @return the response
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private Response verifyResponseContent(BufferedReader br, String emailId) throws IOException {

		EmailChecker emailChecker = null;
		boolean isDivElementPresent = false;
		boolean isValid = false;
		String readLine;
		while (((readLine = br.readLine()) != null)) {
			if (readLine.contains(DIV_CLASS_EMAIL_RED)) {
				isDivElementPresent = true;
				isValid = readLine.contains("<div class='emailred'><TT>" + emailId + "</TT> is <br />a valid deliverable e-mail box address.</div>");
				emailChecker = new EmailChecker(0L, getContent(readLine, DIV_CLASS_EMAIL_RED.length()));
				emailChecker.setIsvalid(isValid);
				return new Response(emailId, SUCCESS, emailChecker, null);
			} else if (readLine.contains(DIV_CLASS_EMAIL)) {
				isDivElementPresent = true;
				isValid = false;
				emailChecker = new EmailChecker(0L, getContent(readLine, DIV_CLASS_EMAIL.length()));
				emailChecker.setIsvalid(isValid);
				return new Response(emailId, SUCCESS, emailChecker, null);
			}
		}
		if (!isDivElementPresent) {
			return new Response(emailId, FAILURE, null, new ErrorMessage("Response page doesn't contain required content"));
		}
		return null;
	}

	/**
	 * Verify response content filtered.
	 *
	 * @param br the br
	 * @param emailId the email id
	 * @return the string
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private String verifyResponseContentFiltered(BufferedReader br, String emailId) throws IOException {

		boolean isDivElementPresent = false;
		boolean isValid = false;
		String readLine;
		while (((readLine = br.readLine()) != null)) {
			if (readLine.contains(DIV_CLASS_EMAIL_RED)) {
				isDivElementPresent = true;
				isValid = readLine.contains("<div class='emailred'><TT>" + emailId + "</TT> is <br />a valid deliverable e-mail box address.</div>");
				return String.valueOf(isValid);
			} else if (readLine.contains(DIV_CLASS_EMAIL)) {
				isDivElementPresent = true;
				isValid = false;
				return String.valueOf(isValid);
			}
		}
		if (!isDivElementPresent) {
			return "Response page doesn't contain required content";
		}
		return null;
	}

	/**
	 * Gets the content.
	 *
	 * @param readLine the read line
	 * @param idx the idx
	 * @return the content
	 */
	private String getContent(String readLine, int idx) {
		return readLine.substring(readLine.indexOf("<div") + idx, readLine.length() - 6).replace("<TT>", "").replace("</TT>", "").replace("<br />",
				"");
	}
}
