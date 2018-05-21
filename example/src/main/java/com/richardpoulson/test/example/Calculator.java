package com.richardpoulson.test.example;

/**
 * Calculator is a concrete class that implements the ArithmeticFunctions and
 * TrigometricFunctions interfaces.
 * 
 * @author		Richard Poulson
 * @version		%I%, 2018-05-21
 * @since 1.0
 */
class Calculator implements ArithmeticFunctions, TrigometricFunctions, Cloneable {
	
	/** The name of the owner of the calculator. */
	private String owner;
	
	/**
	 * Constructor for Calculator.
	 * 
	 * @param owner the name of the owner of the calculator.
	 * @since 1.0
	 */
	Calculator(String owner) {
		this.setOwner(owner);
	}
	
	/**
	 * setter for setting the name of the calculator's owner.
	 * 
	 *  @param newOwner the name of the new owner of the calculator.
	 *  @since 1.0
	 */
	public void setOwner(String newOwner) {
		this.owner = newOwner;
	}
	
	/**
	 * getter for the Calculator's owner.
	 * 
	 *  @return the name of the owner of the Calculator.
	 *  @since 1.0
	 */
	public String getOwner() {
		return this.owner;
	}
	
	@Override
	/**
	 * @return a clone of the Calculator.
	 * @since 1.0
	 */
	public Calculator clone() {
		return new Calculator(this.getOwner());
	}
	
	@Override
	public double Add(double number1, double number2) {
		return (number1 + number2);
	}

	@Override
	public double Subtract(double number1, double number2) {
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

	@Override
	public double Sine(double number) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double Cosine(double number) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double Tangent(double number) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double Secant(double number) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double Cosecant(double number) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double Cotangent(double number) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
