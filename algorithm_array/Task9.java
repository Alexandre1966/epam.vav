/*
   9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
   Если таких чисел несколько, то определить наименьшее из них.
   
*/
package algorithm_array;

import java.util.Arrays;

public class Task9 {

	public static void main(String[] args) {

		int n = 100;
		int diapazon = 100;
		int maxIndex = 0;
		int minValue = Integer.MAX_VALUE;

		int[] arr = arrayOfIntCreation(n, diapazon);

		System.out.println(Arrays.toString(arr));

		int[][] numberOfRepetitions = new int[arr.length][2];

		maxIndex = numberOfSameElements(arr, numberOfRepetitions);

		findValueOfDoplikate(numberOfRepetitions, maxIndex, minValue);

	}

	private static int numberOfSameElements(int[] arr, int[][] numberOfRepetitions) {

		int maxIndex = 0;
		int temp;

		for (int i = 0; i < arr.length; i++) {

			temp = arr[i];
			int index = 0;

			for (int j = 0; j < arr.length; j++) {
				if (temp == arr[j]) {

					index++;

					numberOfRepetitions[i][0] = arr[j];

					numberOfRepetitions[i][1] = index;

					maxIndex = (index > maxIndex) ? index : maxIndex;
				}
			}
		}
		return maxIndex;
	}

	private static void findValueOfDoplikate(int[][] meetnumbers, int maxIndex, int minValue) {

		for (int i = 0; i < meetnumbers.length; i++) {

			if (meetnumbers[i][1] == maxIndex) {

				minValue = meetnumbers[i][0] < minValue ? meetnumbers[i][0] : minValue;
			}
		}
		System.out.println(" minValue:" + minValue + " meet " + maxIndex + " times");
	}

	public static int[] arrayOfIntCreation(int n, int diapazon) {

		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {

			array[i] = (int) (Math.random() * diapazon * (Math.random() > 0.5 ? 1 : -1));

		}

		return array;
	}
}
