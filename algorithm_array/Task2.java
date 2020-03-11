/*
  2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены
  большие данного Z, этим числом. Подсчитать количество замен.
  
*/
package algorithm_array;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		double Z;
		int count = 0;
		int n = 10;
		String str = "Enter Z -> ";

		double[] mas = arrayOfDoublCreation(n);

		System.out.println(Arrays.toString(mas));

		Z = enterDoubleFromConsol(str);

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] > Z) {

				mas[i] = Z;

				count++;
			}

		}

		System.out.println(Arrays.toString(mas) + "\n" + "  number of replacements = " + count);
	}

	public static double[] arrayOfDoublCreation(int n) {

		double[] array = new double[n];

		for (int i = 0; i < array.length; i++) {

			array[i] = Math.random() * 200 - 100;

		}

		return array;
	}

	public static double enterDoubleFromConsol(String str) {

		Scanner sc = new Scanner(System.in);

		System.out.print(str);

		while (!sc.hasNextDouble()) {

			sc.next();

			System.out.println(str);
		}

		return sc.nextDouble();
	}
}
