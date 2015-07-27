package com.capgemini.MathematicalOperations;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import Jama.Matrix;

public class MathematicalOperationsMatrixTest {

	MathematicalOperationsMatrix mom;

	@Before
	public void setUpBefore() {
		mom = new MathematicalOperationsMatrix();
	}

	@Test
	public void shouldReturnSumMatrix2_4_6_8_10_12ForMatrix1_2_3_4_5_6AndMatrix1_2_3_4_5_6() {
		// given
		double[][] numbers = { { 1, 2, 3 }, { 4, 5, 6 } };
		double[][] numbersResult = { { 2, 4, 6 }, { 8, 10, 12 } };
		Matrix matrix1 = new Matrix(numbers);
		Matrix matrix2 = new Matrix(numbers);
		// when
		Matrix result = mom.sum(matrix1, matrix2);
		// then
		assertArrayEquals(numbersResult, result.getArray());
	}

	@Test
	public void shouldReturnDifferenceMatrix0_0_0_0_0_0ForMatrix1_2_3_4_5_6AndMatrix1_2_3_4_5_6() {
		// given
		double[][] numbers = { { 1, 2, 3 }, { 4, 5, 6 } };
		double[][] numbersResult = { { 0, 0, 0 }, { 0, 0, 0 } };
		Matrix matrix1 = new Matrix(numbers);
		Matrix matrix2 = new Matrix(numbers);
		// when
		Matrix result = mom.difference(matrix1, matrix2);
		// then
		assertArrayEquals(numbersResult, result.getArray());
	}
}
