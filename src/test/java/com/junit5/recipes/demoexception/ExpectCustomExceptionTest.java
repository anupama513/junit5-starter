package com.junit5.recipes.demoexception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import com.junit5.recipes.exceptionutils.InvalidParameterCountException;

@DisplayName("Junit5 Jupiter Exception test")
public class ExpectCustomExceptionTest {


	@Test
	@DisplayName("Test assert exception")
	void myFirstTest(TestInfo testInfo) {
		final ExpectCustomException expectEx = new ExpectCustomException();
		
		 InvalidParameterCountException exception = assertThrows(InvalidParameterCountException.class, () -> {
		        expectEx.constructErrorMessage("sample ","error");
		    });
		assertEquals("Invalid parametercount: expected=3, passed=2", exception.getMessage());
	}
	
	@Test
	@DisplayName("Successful test")
	public void testSuccess() throws InvalidParameterCountException {
		ExpectCustomException expectCustomException = new ExpectCustomException();
		assertNotNull(expectCustomException.constructErrorMessage("No ","exception ","encountered"));
	}
}
