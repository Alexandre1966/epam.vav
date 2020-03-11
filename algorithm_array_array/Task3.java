package algorithm_array_array;

import java.util.Scanner;

//3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Task3 {

	public static void main(String[] args) {

		int column = -1;
		int row = -1;

		double[][] array = twoDimArrayOfDoublCreation(4, 8, 10.0);

		printMassive(array);

		String str = "Enter the row number k  from 0  " + " to " + (array.length - 1);

		while (row <= 0 || (row > array.length - 1)) {

			row = enterIntFromConsol(str);
		}
		
		System.out.println("Row :");

		printRowOfArray(array, row);

		String str1 = "Enter the column number p from 0  " + " to " + (array[0].length - 1);

		
		while (column <= 0 || (column > array[0].length - 1)) {

			column = enterIntFromConsol(str1);

		}

		System.out.println("Column :");

		printColumnOfArray(array, column);
	}

	private static void printRowOfArray(double[][] nums, int row) {

		for (int j = 0; j < nums[row].length; j++) {

			System.out.printf("%.2f", nums[row][j]);

			System.out.print("\t");
		}
		System.out.println();
	}

	private static void printColumnOfArray(double[][] nums, int column) {

		for (int i = 0; i < nums.length; i++) {

			System.out.printf("%.2f", nums[i][column]);

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
}
