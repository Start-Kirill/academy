package by.academy.tasks.OOP.Task3Matrix;

import java.util.Arrays;

public class Matrix {

	private double[][] matrix;
	private int width;
	private int height;

	public Matrix() {
		super();
	}

	public Matrix(double[][] matrix) {
		super();
		this.matrix = matrix;
		this.height = matrix.length;
		this.width = matrix[0].length;
	}

	public double[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(double[][] matrix) {
		this.matrix = matrix;
		this.height = matrix.length;
		this.width = matrix[0].length;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Matrix sumMatrixes(Matrix m) {
		if (this.height != m.getHeight()) {
			System.out.println("Heights of matrixes are different. Operation is impossible");
			return null;
		}
		if (this.width != m.getWidth()) {
			System.out.println("Widths of matrixes are different. Operation is impossible");
			return null;
		}
		double[][] matrix = new double[height][width];

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				matrix[i][j] = this.matrix[i][j] + m.matrix[i][j];
			}
		}
		return new Matrix(matrix);

	}

	public Matrix multiplyNumber(double number) {
		double[][] matrix = new double[height][width];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				matrix[i][j] = this.matrix[i][j] * number;
			}
		}
		return new Matrix(matrix);
	}

	public void printMatrix() {
		for (double[] ds : matrix) {
			System.out.println(Arrays.toString(ds));
		}
	}

	public Matrix multiplyMatrixes(Matrix m) {
		if (width != m.height) {
			System.out.println(
					"Width of the first matrix doesn't equal height of the second matrix. Operation impossible");
			return null;
		}

		double[][] matrix = new double[height][m.getWidth()];

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < m.getWidth(); j++) {
				matrix[i][j] = getElement(this.matrix[i], getColumn(m.getMatrix(), j));
			}
		}
		return new Matrix(matrix);
	}

	private double getElement(double[] a, double[] b) {
		double element = 0;
		for (int i = 0; i < a.length; i++) {
			element += a[i] * b[i];
		}
		return element;
	}

	private double[] getColumn(double[][] matrix, int n) {
		double[] array = new double[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (j == n) {
					array[i] = matrix[i][j];
				}
			}
		}
		return array;
	}
}
