/*
 * 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
*/
package algorithm_array_array;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		int n = -1;
		String str = "enter the even order of the matrix --> ";

		while (n % 2 != 0 || n < 1) {

			n = enterIntFromConsol(str);
		}

		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {

			int k = 1;
			int d = n;

			for (int j = 0; j < n; j++) {

				if (i % 2 == 0) {

					arr[i][j] += k;

					k++;

				} else {

					arr[i][j] += d;

					d--;
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
