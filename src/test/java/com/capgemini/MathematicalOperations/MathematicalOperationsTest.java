package com.capgemini.MathematicalOperations;

//import org.apache.commons.math3;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MathematicalOperationsTest 
{
	@Test
	public void absShouldReturn0For0() {
		MathematicalOperations mo = new MathematicalOperations();
		assertEquals(0, mo.abs(0), 0);
	}

public class MathematicalOperationsTest {

	MathematicalOperations mo;

	@Before
	public void setUpBefore() {
		mo = new MathematicalOperations();
	}

	@Test
	public void shouldReturn4For2_2() {
		// given
		int number1 = 2;
		int number2 = 2;
		// when
		int result = mo.sum(number1, number2);
		// then
		assertEquals(4, result);
	}

	@Test
	public void shouldReturn0For0_0() {
		// given
		int number1 = 0;
		int number2 = 0;
		// when
		int result = mo.sum(number1, number2);
		// then
		assertEquals(0, result);
	}

	@Test
	public void shouldReturn0Forminus2_plus2() {
		// given
		int number1 = -2;
		int number2 = 2;
		// when
		int result = mo.sum(number1, number2);
		// then
		assertEquals(0, result);
	}

	@Test
	public void shouldReturnminus4Forminus2_minus2() {
		// given
		int number1 = -2;
		int number2 = -2;
		// when
		int result = mo.sum(number1, number2);
		// then
		assertEquals(-4, result);
	}
}
