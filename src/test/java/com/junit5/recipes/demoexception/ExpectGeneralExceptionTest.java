package com.junit5.recipes.demoexception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import com.junit5.recipes.exceptionutils.InvalidParameterCountException;

@DisplayName("General Exception Test")
public class ExpectGeneralExceptionTest {

	@Test
	@DisplayName("Test assert NullPointerException")
	void testGeneralException(TestInfo testInfo) {
		final ExpectGeneralException generalEx = new ExpectGeneralException();
		
		 NullPointerException exception = assertThrows(NullPointerException.class, () -> {
		        generalEx.validateParameters(null);
		    });
		assertEquals("Null parameters are not allowed", exception.getMessage());
	}
}
