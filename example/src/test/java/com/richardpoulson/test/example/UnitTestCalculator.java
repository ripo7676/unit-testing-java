/**
 * Test for com.richardpoulson.test.example.Calculator
 * @author Richard Poulson
 */
package com.richardpoulson.test.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import org.junit.jupiter.api.Test;

import com.richardpoulson.test.example.Calculator;

public class UnitTestCalculator {
	
	Calculator calc = new Calculator("Bob");
	Calculator clone = calc.clone();
	
	@Test
	public void Add() {
		// both positive numbers
		assertEquals(calc.Add(3, 4), 7);
		// both negative numbers
		assertEquals(calc.Add(-4, -5), -9);
		// positive number, negative number
		assertEquals(calc.Add(6, -5), 1);
		// negative number, positive number
		assertEquals(calc.Add(-8, 6), -2);
		// Commutative property
		assertEquals(calc.Add(4, 3), calc.Add(3, 4));
		// Associative Property
		double result1 = calc.Add(2, calc.Add(3, 4));
		double result2 = calc.Add(calc.Add(2, 3), 4);
		assertEquals(result1, result2);
		// Additive Identity Property
		assertEquals(calc.Add(7, 0), 7);
	}
	
	@Test
	public void Subtract() {
		// both positive numbers
		assertEquals(calc.Subtract(3, 4), -1);
		// both negative numbers
		assertEquals(calc.Subtract(-4, -5), 1);
		// positive number, negative number
		assertEquals(calc.Subtract(6, -5), 11);
		// negative number, positive number
		assertEquals(calc.Subtract(-8, 6), -14);
		// Subtractive Identity Property
		assertEquals(calc.Subtract(7, 0), 7);
	}
	
	@Test
	public void Multiply() {
		double result1, result2;
		// both positive numbers
		assertEquals(calc.Multiply(3, 4), 12);
		// both negative numbers
		assertEquals(calc.Multiply(-4, -5), 20);
		// positive number, negative number
		assertEquals(calc.Multiply(6, -5), -30);
		// negative number, positive number
		assertEquals(calc.Multiply(-8, 6), -48);
		// Commutative Property
		assertEquals(calc.Multiply(4, 3), calc.Multiply(3, 4));
		// Associative Property
		result1 = calc.Multiply(2, calc.Multiply(3, 4));
		result2 = calc.Multiply(calc.Multiply(2, 3), 4);
		assertEquals(result1, result2);
	}
	
	@Test
	public void Divide() {
		// both positive numbers
		assertEquals(12, calc.Multiply(3, 4));
		// both negative numbers
		assertEquals(20, calc.Multiply(-4, -5));
		// positive number, negative number
		assertEquals(-30, calc.Multiply(6, -5));
		// negative number, positive number
		assertEquals(-48, calc.Multiply(-8, 6));
	}
	
	//== Behavior/attributes inherited from class java.lang.Object
	
	@Test
	public void GetClass() {
		assertTrue(calc.getClass() == Calculator.class);
	}
	
	@Test
	public void Clone() {
		// Assert that the original and clone are not the same object
		assertNotSame(calc, clone);
		// Assert that class of clone is Calculator
		assertTrue(clone.getClass() == Calculator.class);
	}

	@Test
	public void HashCode() {
		// Whenever invoked on the same object more than once during an execution
		// of a Java application, the hashCode method must return the same integer
		int hashResult1 = calc.hashCode();
		int hashResult2 = calc.hashCode();
		assertEquals(hashResult1, hashResult2);
		// If two objects are equal according to the equals(Object) method, then
		// hashCode() must return the same value for both object.
		Calculator reference1 = calc;
		Calculator reference2 = calc;
		hashResult1 = reference1.hashCode();
		hashResult2 = reference2.hashCode();
		assertTrue(reference1.equals(reference2));
		assertEquals(hashResult1, hashResult2);
		// It is not required that two unequal objects (according to 
		// Calculator.equals(java.lang.Object)) have unequal hash values
	}

	@Test
	public void Equals() {
		Calculator reference1 = calc;
		Calculator reference2 = calc;
		Calculator reference3 = clone;
		assertTrue(reference1.equals(reference2));
		assertFalse(reference1.equals(reference3));
	}

	@Test
	public void ToString() {
		// For instances of Calculator, ToString() will be defined to return
		// Calculator.class.getName() + '@' + Integer.toHexString(instance.hashCode());
		String name = calc.getClass().getName();
		String hashCode = Integer.toHexString(calc.hashCode());
		String finalString = name + '@' + hashCode;
		assertEquals(calc.toString(), finalString);
	}
}
