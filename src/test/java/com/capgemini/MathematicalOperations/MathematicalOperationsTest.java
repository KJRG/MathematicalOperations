package com.capgemini.MathematicalOperations;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MathematicalOperationsTest 
{

	MathematicalOperations mo;
	
	@Before
	public void setUpBefore(){
		mo = new MathematicalOperations();
	}
	
	@Test
	public void shouldReturn4For2_2(){
		assertEquals(4, mo.sum(2,2));
	}
	@Test
	public void shouldReturn0For0_0(){
		assertEquals(0, mo.sum(0,0));
	}
	@Test
	public void shouldReturn0Forminus2_plus2(){
		assertEquals(0, mo.sum(-2,2));
	}
	@Test
	public void shouldReturnminus4Forminus2_minus2(){
		assertEquals(-4, mo.sum(-2,-2));
	}
}
