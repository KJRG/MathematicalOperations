package com.capgemini.MathematicalOperations;

/**
 * The MathematicalOperations implements four simple mathematical operations
 */
public class MathematicalOperations {
	/**
	 * 
	 * @param number
	 * @return absolute value of number
	 */
	public double abs(double number) {
		return number < 0 ? number * -1 : number;
	}
	
	/**
	 * @param number1
	 * @param number2
	 * @return sum of two numbers
	 */
	public int sum(int number1, int number2) {
		return number1 + number2;
	}
}
