/*
 * 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 
*/
package algorithm_array_array;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		int n = -1;// размерность матрицы

		while (n <= 0) {

			n = enterIntFromConsol("enter the order of the matrix" + "\n");

		}

		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if ((j - i >= 0 && i + j <= n - 1) || (j - i <= 0 && i + j >= n - 1)) {

					arr[i][j] = 1;
				}
			}
		}

		printMassive(arr);

	}

	private static void printMassive(int[][] nums) {
		for (int i = 0; i < nums.length; i++) {

			for (int j = 0; j < nums[i].length; j++) {

				System.out.printf("%d ", nums[i][j]);
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
