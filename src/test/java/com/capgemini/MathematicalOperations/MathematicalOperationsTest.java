package com.capgemini.MathematicalOperations;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MathematicalOperationsTest {
	private MathematicalOperations mathOperObject = new MathematicalOperations();
	private double arg0, arg1;

	@Test
	public void resultIs0IfAnyArgumentEquals0() {
		// given
		arg0 = 0;
		arg1 = 1;
		// then
		assertTrue(mathOperObject.product(arg0, arg1) == 0.0);
		assertTrue(mathOperObject.product(arg1, arg0) == 0.0);
		assertTrue(mathOperObject.product(arg0, arg0) == 0.0);
	}

	@Test
	public void resultIsArg0IfArg1Equals1() {
		// given
		arg0 = 10;
		arg1 = 1;
		// then
		assertTrue(mathOperObject.product(arg0, arg1) == arg0);
	}

	@Test
	public void resultIsNegativeIfOneArgumentIsPositiveAndOtherIsNegative() {
		// given
		arg0 = 11;
		arg1 = -1;
		// then
		assertTrue(mathOperObject.product(arg0, arg1) < 0);
		assertTrue(mathOperObject.product(arg1, arg0) < 0);
	}

	@Test
	public void resultIsPositiveIfBothArg0AndArg1AreNegative() {
		// given
		arg0 = -10;
		arg1 = -2;
		// then
		assertTrue(mathOperObject.product(arg0, arg1) > 0);
		assertTrue(mathOperObject.product(arg1, arg0) > 0);
	}

	@Test
	public void shouldReturn4For2_2() {
		// given
		int number1 = 2;
		int number2 = 2;
		// when
		int result = mathOperObject.sum(number1, number2);
		// then
		assertEquals(4, result);
	}

	@Test
	public void shouldReturn0For0_0() {
		// given
		int number1 = 0;
		int number2 = 0;
		// when
		int result = mathOperObject.sum(number1, number2);
		// then
		assertEquals(0, result);
	}

	@Test
	public void shouldReturn0Forminus2_plus2() {
		// given
		int number1 = -2;
		int number2 = 2;
		// when
		int result = mathOperObject.sum(number1, number2);
		// then
		assertEquals(0, result);
	}

	@Test
	public void shouldReturnminus4Forminus2_minus2() {
		// given
		int number1 = -2;
		int number2 = -2;
		// when
		int result = mathOperObject.sum(number1, number2);
		// then
		assertEquals(-4, result);
	}
}
