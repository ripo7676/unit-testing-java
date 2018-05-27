package com.richardpoulson.test.example;

/**
 * An interface supporting the Arithmetic functions
 * Add, Subtract, Multiply, and Divide.
 * 
 * @author Richard Poulson
 */

interface ArithmeticFunctions {
	/** 
	 * @param number1 The first term to be added.
	 * @param number2 The second term to be added.
	 * @return The sum of number1 and number2.
	 */
	abstract double Add(double number1, double number2);
	/**
	 * @param number1 The minuend of the subtraction.
	 * @param number2 The subtrahend of the subtraction.
	 * @return The difference between the minuend and the subtrahend.
	 */
	abstract double Subtract(double number1, double number2);
	/**
	 * @param number1 The first factor of the multiplication.
	 * @param number2 The second factor of the multiplication.
	 * @return The product of the two factors.
	 */
	abstract double Multiply(double number1, double number2);
	/**
	 * @param number1 The dividend of the division.
	 * @param number2 The divisor of the division.
	 * @return The quotient of the dividend by the divisor.
	 */
	abstract double Divide(double number1, double number2);
}