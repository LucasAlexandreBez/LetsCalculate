package test.objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.objects.Subtraction;

public class SubtractionTest {

	Subtraction subtraction = new Subtraction();
	
	@Test
	public void verifyIntAddition() {
		Assertions.assertEquals(8, subtraction.calculateInt(10, 2));
	}
	
	@Test
	public void verifyFloatAddition() {
		Assertions.assertEquals((float) -4.2, subtraction.calculateFloatingPoint((float) 2.0, (float) 6.2));
	}
}
