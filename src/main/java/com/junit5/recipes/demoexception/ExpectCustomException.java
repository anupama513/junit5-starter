package com.junit5.recipes.demoexception;

import com.junit5.recipes.exceptionutils.InvalidParameterCountException;

public class ExpectCustomException {

	public String constructErrorMessage(String... args) throws InvalidParameterCountException {
		if(args.length!=3) {
			throw new InvalidParameterCountException("Invalid parametercount: expected=3, passed="+args.length);
		}else {
			String message = "";
			for(String arg: args) {
				message += arg;
			}
			return message;
		}
	}
	
}
