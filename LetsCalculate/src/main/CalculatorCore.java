package main;

import java.util.ArrayList;
import java.util.Scanner;

import main.helper.CalcHelpers;
import main.helper.MenuHelper;
import main.objects.Addition;
import main.objects.Arithmetic;
import main.objects.Division;
import main.objects.Multiplication;
import main.objects.Subtraction;

/**
 * Class responsible for the control and user interactions with the calculator
 * 
 * @author Lucas Alexandre Bez Piancoski
 * @since 20/11/2025
 */
public class CalculatorCore {

	private MenuHelper menuHelper = new MenuHelper();
	private CalcHelpers calcHelpers = new CalcHelpers();
	private ArrayList<Arithmetic> availiableArithmeticsCalculations = new ArrayList<Arithmetic>();

	/**
	 * Start the calculator process asking for the user the inputs
	 * and proceed with calculation
	 * 
	 * @author Lucas Alexandre Bez Piancoski
	 * @since 20/11/2025
	 */
	public void startCalculator() {
		availiableArithmeticsCalculations.add(new Addition());
		availiableArithmeticsCalculations.add(new Subtraction());
		availiableArithmeticsCalculations.add(new Multiplication());
		availiableArithmeticsCalculations.add(new Division());

		Scanner scanner = new Scanner(System.in);
		try {

			int userChoice;
			String num1, num2;

			menuHelper.showArithmeticOptionsAndRules(availiableArithmeticsCalculations);
			userChoice = scanner.nextInt();

			if (userChoice < 0 || userChoice >= availiableArithmeticsCalculations.size()) {
				System.out.println("Selected option is not valid");
				return;
			}

			System.out.print("Provide the first number: ");
			num1 = scanner.next();
			System.out.print("Provide the second number: ");
			num2 = scanner.next();

			if (calcHelpers.isFloat(num1) | calcHelpers.isFloat(num2)) {
				System.out
						.println("Result: " + availiableArithmeticsCalculations.get(userChoice).calculateFloatingPoint(
								calcHelpers.convertUserInpuToFloat(num1), calcHelpers.convertUserInpuToFloat(num2)));
			} else {
				System.out.println("Result: " + availiableArithmeticsCalculations.get(userChoice)
						.calculateInt(calcHelpers.convertUserInpuToInt(num1), calcHelpers.convertUserInpuToInt(num2)));
			}

		} finally {
			System.out.println("Thanks for using the calculator");
			scanner.close();
		}
	}

}
