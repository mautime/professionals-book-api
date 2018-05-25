package com.mausoft.common.http;

import org.springframework.http.HttpStatus;

public class SuccessAjaxResponse extends AjaxResponse {
	
	private static final long serialVersionUID = 4547643188911548625L;

	public SuccessAjaxResponse(HttpStatus status, String message) {
		super(status, message);
	}
	
	public SuccessAjaxResponse(String message) {
		this(HttpStatus.OK, message);
	}
	
	public SuccessAjaxResponse() {
		this("SUCCESS");
	}
	
	public SuccessAjaxResponse(String propertyName, Object value) {
		this();
		addProperty(propertyName, value);
	}
}
