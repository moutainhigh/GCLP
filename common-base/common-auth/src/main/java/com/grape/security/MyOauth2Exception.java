package com.grape.security;

import java.util.Map;
import java.util.Set;

import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;

public class MyOauth2Exception extends OAuth2Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3115068956110255864L;

	public MyOauth2Exception(String msg) {
		super(msg);
	}
	public String getOAuth2ErrorCode() {
		return null;
	}
	
	public static OAuth2Exception valueOf(Map<String, String> errorParams) {
		/*String errorCode = errorParams.get(ERROR);
		String errorMessage = errorParams.containsKey(DESCRIPTION) ? errorParams.get(DESCRIPTION)
				: null;*/
		OAuth2Exception ex = new MyOauth2Exception(null);
		Set<Map.Entry<String, String>> entries = errorParams.entrySet();
		for (Map.Entry<String, String> entry : entries) {
			String key = entry.getKey();
			
			ex.addAdditionalInformation(key, entry.getValue());
	
		}

		return ex;
	}
	
	
}
