package by.academy.tasks.OOP.Task3Matrix;

public class AppMatrix {

	public static void main(String[] args) {
		
		double[][] arrayOne = {{3, -1, 4}, {2, 3, 8}};
		double[][] arrayTwo = {{7, -5, -1}, {4, 2, 1}, {2, 3, 5}};
		
		Matrix matrixOne = new Matrix(arrayOne);
		Matrix matrixTwo = new Matrix(arrayTwo);
		
//		Matrix matrixSum = matrixOne.sumMatrixes(matrixTwo).toString();
//		matrixOne.sumMatrixes(matrixTwo).printMatrix();
//		matrixOne.multiplyNumber(3.5).printMatrix();
		
		matrixOne.multiplyMatrixes(matrixTwo).printMatrix();
	}

}
