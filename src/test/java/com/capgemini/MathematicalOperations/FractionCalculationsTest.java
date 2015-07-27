package com.capgemini.MathematicalOperations;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.math.fraction.Fraction;
import org.junit.Test;

public class FractionCalculationsTest {

	@Test
	public void shouldReturnBiggestValue() {
		List<Fraction> fractions = Arrays.asList(new Fraction(1),
				new Fraction(2), new Fraction(3));

		FractionCalculations fc = new FractionCalculations();

		assertEquals(new Fraction(3), fc.getBiggestValue(fractions));
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionForEmptyList() {
		List<Fraction> fractions = Collections.emptyList();

		FractionCalculations fc = new FractionCalculations();

		fc.getBiggestValue(fractions);
	}

}
