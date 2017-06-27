package com.junit5.recipes.demoexception;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.junit5.recipes.exceptionutils.InvalidParameterCountException;

@DisplayName("Junit5 Jupiter Exception test")
public class ExpectExceptionTest {


	@Test
	@DisplayName("Test assert exception")
	void myFirstTest(TestInfo testInfo) {
		final ExpectException expectEx = new ExpectException();
		
		 InvalidParameterCountException exception = assertThrows(InvalidParameterCountException.class, () -> {
		        expectEx.constructErrorMessage("sample ","error");
		    });
		assertEquals("Invalid parametercount: expected=3, passed=2", exception.getMessage());
	}
}
