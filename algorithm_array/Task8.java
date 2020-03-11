/*
  8. Дана последовательность целых чисел n aaa ,,, 21  .
  Образовать новую последовательность, выбросив из исходной те члены, которые равны
  ) ,,,min( 2 1 n aaa  .
  
*/

package algorithm_array;

import java.util.Arrays;

public class Task8 {

	public static void main(String[] args) {

		int n = 10;
		int diapazon = 10; // диапазон значений массива

		int[] array = arrayOfIntCreation(n, diapazon);

		System.out.println(Arrays.toString(array));

		int[] arrayNew = removesMinimum(array);

		System.out.println(Arrays.toString(arrayNew));

	}

	private static int[] removesMinimum(int[] arr) {

		int minValue = Integer.MAX_VALUE;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < minValue) {

				minValue = arr[i];

				count = 1;

			} else if (arr[i] == minValue) {

				count++;

			}
		}

		int[] arrayNew = new int[arr.length - count];

		int indexresult = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > minValue) {

				arrayNew[indexresult++] = arr[i];
			}
		}

		return arrayNew;
	}

	public static int[] arrayOfIntCreation(int n, int diapazon) {

		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {

			array[i] = (int) (Math.random() * diapazon * (Math.random() > 0.5 ? 1 : -1));

		}

		return array;
	}
}
