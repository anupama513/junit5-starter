package com.junit5.recipes.exceptionutils;

public class InvalidParameterCountException extends Throwable{

	String message;
	
	public InvalidParameterCountException(String message) {
		super(message);
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
