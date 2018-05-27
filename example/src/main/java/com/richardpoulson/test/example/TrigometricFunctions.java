package com.richardpoulson.test.example;

/**
 * An interface supporting the Trigometric functions
 * Sine, Cosine, Tangent, Secant, Cosecant, and Cotangent.
 * 
 * @author Richard Poulson
 */
interface TrigometricFunctions {
	/** 
	 * @param number The value of the angle (in units of degrees).
	 * @return The y-component of the triangle defined by the given angle.
	 */
	abstract double Sine(double number);
	/** 
	 * @param number The value of the angle (in units of degrees).
	 * @return The x-component of the triangle defined by the given angle.
	 */
	abstract double Cosine(double number);
	/** 
	 * @param number The value of the angle (in units of degrees).
	 * @return The slope of the triangle (y-component / x-component) of the triangle defined by the given angle.
	 */
	abstract double Tangent(double number);
	/** 
	 * @param number The value of the angle (in units of degrees).
	 * @return The inverse of the y-component of the triangle defined by the given angle.
	 */
	abstract double Secant(double number);
	/** 
	 * @param number The value of the angle (in units of degrees).
	 * @return The inverse of the x-component of the triangle defined by the given angle.
	 */
	abstract double Cosecant(double number);
	/** 
	 * @param number The value of the angle (in units of degrees).
	 * @return The inverse of the slope of the triangle (x-component / y-component) defined by the given angle.
	 */
	abstract double Cotangent(double number);
}
