package com.capgemini.MathematicalOperations;

import static org.junit.Assert.assertTrue;
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

}
