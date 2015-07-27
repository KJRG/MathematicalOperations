package com.capgemini.MathematicalOperations;

import Jama.Matrix;

/**
 * @author MGORLAS 
 * The MathematicalOperationsMatrix implements two simple
 * mathematical operations for matrix
 */
public class MathematicalOperationsMatrix {

	/**
	 * @param matrix1
	 * @param matrix2
	 * @return sum of two matrix
	 */
	public Matrix sum(Matrix matrix1, Matrix matrix2) {
		return matrix1.plus(matrix2);
	}

	/**
	 * @param matrix1
	 * @param matrix2
	 * @return difference of two matrix
	 */
	public Matrix difference(Matrix matrix1, Matrix matrix2) {
		return matrix1.minus(matrix2);
	}

}
