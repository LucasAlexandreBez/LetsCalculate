package test.objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.objects.Multiplication;

public class MultiplicationTest {
	
	Multiplication multiplication = new Multiplication();
	
	@Test
	public void verifyIntAddition() {
		Assertions.assertEquals(20, multiplication.calculateInt(10, 2));
	}
	
	@Test
	public void verifyFloatAddition() {
		Assertions.assertEquals((float) 12.4, multiplication.calculateFloatingPoint((float) 2.0, (float) 6.2));
	}
}
