/*
   1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
  
*/
package algorithm_array_array;

public class Task1 {
	
	public static void main(String[] args) {
		
		int row = 3;
		int column = 8;
		double diapazon = 10.;

		double[][] array = twoDimArrayOfDoublCreation(row, column, diapazon);

		printMassive(array);

		System.out.println();

		findOddColumn(array);
	}

	public static void findOddColumn(double[][] array) {

		int row;
		int column;
		column = array[0].length;
		row = array.length;

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j += 2) {

				if (array[0][j] > array[row - 1][j]) {

					System.out.format("%.2f", array[i][j]);

					System.out.print("\t");

				}
			}

			System.out.println();
		}
	}

	public static double[][] twoDimArrayOfDoublCreation(int row, int column, double diapazon) {

		double[][] array = new double[row][column];

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[0].length; j++) {

				array[i][j] = Math.random() * diapazon * (Math.random() > 0.5 ? 1 : -1);

			}

		}

		return array;
	}

	private static void printMassive(double[][] array) {

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				System.out.format("%.2f", array[i][j]);

				System.out.print("\t");
			}

			System.out.println();
		}
	}
}
