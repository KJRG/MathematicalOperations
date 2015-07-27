package com.capgemini.MathematicalOperations;

import org.apache.commons.math3.complex.Complex;

public class ComplexNumber extends Complex {
	private static final long serialVersionUID = 1L;

	public ComplexNumber(double real, double imaginary) {
		super(real, imaginary);
	}
	
	/**
	 * @param another Complex number
	 * @return Distance from <b>this</b> number to <b>another</b> number.
	 */
	public double absoluteDistanceTo(Complex another) {
		return Math.sqrt(Math.pow(another.getReal()-getReal(), 2) + Math.pow(another.getImaginary()-getImaginary(), 2));
	}

}
