package com.mausoft.common.http;

import java.util.HashMap;

import org.springframework.http.HttpStatus;

public class AjaxResponse extends HashMap<String, Object> implements IAjaxResponse {
	
	private static final long serialVersionUID = 1059155087188388314L;

	public AjaxResponse(HttpStatus status, String message) {
		setStatus(status);
		setMessage(message);
	}
	
	public AjaxResponse(HttpStatus status) {
		this(status, null);
	}
	
	@Override
	public void setMessage(String message) {
		put("message", message);
	}

	@Override
	public String getMessage() {
		return getProperty("status", String.class);
	}

	@Override
	public void setStatus(HttpStatus status) {
		put("status", status);
	}

	@Override
	public HttpStatus getStatus() {
		return getProperty("status", HttpStatus.class);
	}

	@Override
	public void addProperty(String name, Object value) {
		put(name, value);
	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> T getProperty(String name, Class<T> aClazz) {
		return get(name) != null ? (T) get(name) : null;
	}

	@Override
	public Object getProperty(String name) {
		return get(name);
	}
}