package com.capgemini.MathematicalOperations;

import static org.junit.Assert.assertEquals;

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

	@Test
	public void absShouldReturn1For1() {
		MathematicalOperations mo = new MathematicalOperations();
		assertEquals(1, mo.abs(1), 0);
	}

	@Test
	public void absShouldReturn1ForMinus1() {
		MathematicalOperations mo = new MathematicalOperations();
		assertEquals(1, mo.abs(-1), 0);
	}

	@Test
	public void absShouldReturn2For2() {
		MathematicalOperations mo = new MathematicalOperations();
		assertEquals(2, mo.abs(2), 0);
	}

	@Test
	public void absShouldReturn2ForMinus2() {
		MathematicalOperations mo = new MathematicalOperations();
		assertEquals(2, mo.abs(-2), 0);
	}
}
