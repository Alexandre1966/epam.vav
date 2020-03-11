/*7.Сформировать квадратную матрицу порядка N по правилу:  
     
      −
  =
  N JI
  JIA
  22
  sin], [ 
  и подсчитать количество положительных элементов в ней. 
*/
package algorithm_array_array;

import java.util.Scanner;
import static java.lang.Math.*;

public class Task7 {

	public static void main(String[] args) {

		int n = -1;
		int count = 0;

		while (n <= 0) {

			n = enterIntFromConsol("enter the dimension of the matrix -->");

		}

		double[][] arr = new double[n][n];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				arr[i][j] = sin((pow(i, 2) - pow(j, 2)) / n);

				if (arr[i][j] > 0) {

					count++;
				}
			}
		}

		printMassive(arr);

		System.out.println("number of positive elements = " + count);

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
