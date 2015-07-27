package com.capgemini.MathematicalOperations;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ComplexNumberTest {
	private ComplexNumber number1 = new ComplexNumber(4, 0);
	private List<ComplexNumber> numbers;
	
	@Before
	public void initList() {
		 numbers = new ArrayList<ComplexNumber>();
	}
	
	@After
	public void clearList() {
		numbers.clear();
	}
	
	@Test
	public void shouldBeDistanceOf2() {
		List<ComplexNumber> numbers = new ArrayList<ComplexNumber>();
		numbers.add(new ComplexNumber(2,  0));
		numbers.add(new ComplexNumber(6,  0));
		numbers.add(new ComplexNumber(4, -2));
		numbers.add(new ComplexNumber(4,  2));
		
		for (ComplexNumber complexNumber : numbers) {
			assertEquals(2.0, number1.absoluteDistanceTo(complexNumber), 1e-4);
		}
	}

	@Test
	public void shouldBeDistanceOf2sqrt2() {
		List<ComplexNumber> numbers = new ArrayList<ComplexNumber>();
		numbers.add(new ComplexNumber(6,  2));
		numbers.add(new ComplexNumber(6, -2));
		numbers.add(new ComplexNumber(2,  2));
		numbers.add(new ComplexNumber(2, -2));
		
		for (ComplexNumber complexNumber : numbers) {
			assertEquals(2.0*Math.sqrt(2.0), number1.absoluteDistanceTo(complexNumber), 1e-4);
		}
	}

}
