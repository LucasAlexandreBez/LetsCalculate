package main.objects;

public class Subtraction extends Arithmetic{

	@Override
	public int calculateInt(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public float calculateFloatingPoint(float num1, float num2) {
		return num1 - num2;
	}
}
