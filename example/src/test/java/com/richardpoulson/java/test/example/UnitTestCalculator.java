/**
 * @author Richard Poulson
 * Test for com.richardpoulson.java.test.example.Calculator
 */
package com.richardpoulson.java.test.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

public class UnitTestCalculator {
	
	Calculator calc = new Calculator();

	@Test
	public void testNegative() {
		// basic subtraction
		double result = calc.Subtraction(3.0, 2.0);
		assertEquals(result, 1.0);
		// a number minus 0
		result = calc.Subtraction(3.0, 0.0);
		assertEquals(result, 3.0);
		// 0 minus a number
		result = calc.Subtraction(0, 3.0);
		assertEquals(result, -3.0);
	}

	@Test
	public void testAddition() {
		double result = calc.Addition(3, 4);
		assertEquals(result, 7);
	}

	@Test
	public void testSubtraction() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}

	@Test
	public void testObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testWait() {
		fail("Not yet implemented");
	}

	@Test
	public void testFinalize() {
		fail("Not yet implemented");
	}

}
