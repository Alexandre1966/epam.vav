/*
 * 8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
   а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
   
*/
package algorithm_array_array;

import java.util.Scanner;

public class Task8 {
	
	public static void main(String[] args) {

		int column = -1;
		int row = -1;
		int first = -1;
		int second = -1;

		

		String str = "Enter the row number --> ";

		while (row <= 0) {

			row = enterIntFromConsol(str);
		}

		String str1 = "Enter the column number --> ";

		while (column <= 0) {

			column = enterIntFromConsol(str1);
		}

		double[][] array = twoDimArrayOfDoublCreation(row, column, 10.0);

		

		printMassive(array);

		while (first < 0) {

			first = enterIntFromConsol("Enter first colum number from 1 to " + (array[0].length) + "\n") - 1;

		}

		while (second < 0) {

			second = enterIntFromConsol("Enter  second  colum number from 1 to " + (array[0].length) + "\n") - 1;

		}



		cangeColumn(first, second, array);

		printMassive(array);

	}

	public static void cangeColumn(int first, int second, double[][] array) {

		System.out.println("first = " + first);

		System.out.println("second = " + second);

		double temp = 0;

		for (int i = 0; i < array.length; i++) {

			temp = array[i][first];

			array[i][first] = array[i][second];

			array[i][second] = temp;
		}
	}

	public static int enterIntFromConsol(String str) {

		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		int value;

		System.out.print(str);

		while (!sc.hasNextInt()) {

			sc.next();

			System.out.println(str);
		}

		value = sc.nextInt();

		return value;
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

