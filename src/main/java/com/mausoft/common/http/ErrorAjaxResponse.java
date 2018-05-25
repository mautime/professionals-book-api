package com.mausoft.common.http;

import org.springframework.http.HttpStatus;

public class ErrorAjaxResponse extends AjaxResponse {
	private static final long serialVersionUID = 7338624340940209350L;

	public ErrorAjaxResponse(HttpStatus status, String summary, String message) {
		super(status, message);
		addProperty("summary", summary);
	}
}