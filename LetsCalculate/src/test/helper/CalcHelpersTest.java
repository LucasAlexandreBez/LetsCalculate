package test.helper;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.helper.CalcHelpers;

public class CalcHelpersTest {

	CalcHelpers calcHelpers = new CalcHelpers();
	
	@Test
	public void sendTrueIfValueIsFloat() {
		assertTrue(calcHelpers.isFloat("39.78"));
	}
	
	@Test
	public void sendFalseIfValueIsNotFloat() {
		assertFalse(calcHelpers.isFloat("2"));
	}
	
	@Test
	public void convertValueToFloatWithSuccess() {
		assertEquals((float)2.0, calcHelpers.convertUserInpuToFloat("2.0"));
	}
	
	@Test
	public void convertValueToIntWithSuccess() {
		assertEquals(2, calcHelpers.convertUserInpuToInt("2"));
	}
	
	@Test
	public void throwErrorWhenAddNonFloatValuesToConvert() {
		assertAll("properties",
				() -> {
					NumberFormatException ex = assertThrows(NumberFormatException.class,() -> calcHelpers.convertUserInpuToFloat("a"));
					assertEquals("a is not a valid value", ex.getMessage());
				}
		);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"2.8", "a"})
	public void throwErrorWhenAddNonIntValuesToConvert(String value) {
		assertAll("properties",
				() -> {
					NumberFormatException ex = assertThrows(NumberFormatException.class,() -> calcHelpers.convertUserInpuToInt(value));
					assertEquals(value + " is not a valid value", ex.getMessage());
				}
		);
	}
}
