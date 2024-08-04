package com.indus.training.core.impl;

import com.indus.training.core.domain.ArrayOperationsInput;
import com.indus.training.core.domain.ArrayOperationsOutput;
import com.indus.training.core.svc.IArrayOperations;

/**
 * ArrayOperations class provides implementations for the IArrayOperations
 * interface.
 */
public class ArrayOperations implements IArrayOperations {

	/**
	 * Adds two 2x2 matrices provided in the input and returns the result.
	 *
	 * @param arOpInpObj the input object containing the two matrices to be added
	 * @return the output object containing the result of the addition
	 */
	@Override
	public ArrayOperationsOutput add(ArrayOperationsInput arOpInpObj) {

		ArrayOperationsOutput arOpOutObj = null;
		{
			double[][] param1 = arOpInpObj.param1;
			double[][] param2 = arOpInpObj.param2;
			double[][] result = new double[2][2];
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					result[i][j] = param1[i][j] + param2[i][j];
				}
			}
			arOpOutObj = new ArrayOperationsOutput();
			arOpOutObj.param1 = param1;
			arOpOutObj.param2 = param2;
			arOpOutObj.result = result;

		}

		return arOpOutObj;
	}

	/**
	 * Multiplies two 2x2 matrices provided in the input and returns the result.
	 *
	 * @param arOpInpObj the input object containing the two matrices to be
	 *                   multiplied
	 * @return the output object containing the result of the multiplication
	 */
	@Override
	public ArrayOperationsOutput multiply(ArrayOperationsInput arOpInpObj) {

		ArrayOperationsOutput arOpOutObj = null;
		{
			double[][] param1 = arOpInpObj.param1;
			double[][] param2 = arOpInpObj.param2;
			double[][] result = new double[2][2];
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					result[i][j] = 0;
					for (int k = 0; k < 2; k++) {
						result[i][j] = result[i][j] + param1[i][k] * param2[k][j];

					}
				}
			}
			arOpOutObj = new ArrayOperationsOutput();
			arOpOutObj.param1 = param1;
			arOpOutObj.param2 = param2;
			arOpOutObj.result = result;

		}
		return arOpOutObj;
	}

}
