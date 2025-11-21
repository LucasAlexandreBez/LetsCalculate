package test.objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import main.objects.Addition;

public class AdditionTest {
	
	Addition addition = new Addition();
	
	@Test
	public void verifyIntAddition() {
		Assertions.assertEquals(7, addition.calculateInt(3, 4));
	}
	
	@Test
	public void verifyFloatAddition() {
		Assertions.assertEquals((float) 8.6, addition.calculateFloatingPoint((float) 3.9, (float) 4.7));
	}

}
