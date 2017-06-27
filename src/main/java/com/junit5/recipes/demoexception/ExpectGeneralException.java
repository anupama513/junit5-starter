package com.junit5.recipes.demoexception;

public class ExpectGeneralException {

	public void validateParameters(Integer param ) {
		if (param == null) {
			throw new NullPointerException("Null parameters are not allowed");
		}
	}
}
