package test.objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.objects.Division;

public class DivisionTest {

	Division division = new Division();
	
	@Test
	public void verifyIntAddition() {
		Assertions.assertEquals(5, division.calculateInt(10, 2));
	}
	
	@Test
	public void verifyFloatAddition() {
		Assertions.assertEquals((float) 0.3709677419, division.calculateFloatingPoint((float) 2.3, (float) 6.2));
	}
}
