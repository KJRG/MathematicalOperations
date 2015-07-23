package com.capgemini.MathematicalOperations;

import java.util.List;

import org.apache.commons.math.fraction.Fraction;

public class FractionCalculations {
	public Fraction getBiggestValue(List<Fraction> values) {
		if(values.isEmpty()) {
			throw new IllegalArgumentException("The list passed as argument is empty");
		}
		
		Fraction max = values.get(0);
		
		for(int i = 0; i < values.size(); i++) {
			if(values.get(i).compareTo(max) > 0) {
				max = values.get(i);
			}
		}
		
		return max;
	}
}
