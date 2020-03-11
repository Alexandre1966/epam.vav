/* 
 *  5 . Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
*/
package algorithm_array_array;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		int n = -1;// размерность матрицы

		while (n <= 0) {

			n = enterIntFromConsol("enter the order of the matrix" + "\n");

		}

		int s = n;
		int k = 1;
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < s; j++) {

				arr[i][j] += k;
			}

			k++;
			s--;
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