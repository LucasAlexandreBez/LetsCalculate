package main.helper;

import java.util.ArrayList;

import main.objects.Arithmetic;

/**
 * Class responsible to print user messages
 * 
 * @author Lucas Alexandre Bez Piancoski
 * @since 20/11/2025
 */
public class MenuHelper {
	 
	/**
	 * Print the message prompt with availiable options
	 * @param arithmetics the array with all the math calculations
	 * 
	 * @author Lucas Alexandre Bez Piancoski
	 * @since 20/11/2025
	 */
	public void showArithmeticOptionsAndRules(ArrayList<Arithmetic> arithmetics) {
		System.out.println("Welcome to the calculator");
		System.out.println("To start using it just type the number of the desired options below");
		for (Arithmetic arithmetic : arithmetics) {
			System.out.println(arithmetics.indexOf(arithmetic) + " - " + arithmetic.getClass().getSimpleName());
		}
		System.out.print("Select one of the options: ");
	}

}
