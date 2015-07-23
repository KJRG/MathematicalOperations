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
}
