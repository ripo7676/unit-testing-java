package com.richardpoulson.java.test.example;

class Calculator implements BasicCalculator {

	@Override
	public double Negative(double number) {
		return -number;
	}

	@Override
	public double Addition(double number1, double number2) {
		return (number1 + number2);
	}

	@Override
	public double Subtraction(double number1, double number2) {
		return (number1 - number2);
	}

	@Override
	public double Multiply(double number1, double number2) {
		return (number1 * number2);
	}

	@Override
	public double Divide(double number1, double number2) {
		return (number1 / number2);
	}

}
