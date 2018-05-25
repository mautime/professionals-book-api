package com.mausoft.common.http;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

public interface IAjaxResponse extends Serializable {
	public void setMessage(String message);
	public String getMessage();
	public void setStatus(HttpStatus status);
	public HttpStatus getStatus();
	public <T> void addProperty(String name, T value);
	public <T> T getProperty(String name, Class<T> clazz);
	public Object getProperty(String name);
}