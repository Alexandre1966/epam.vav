//5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
// которое меньше максимального элемента массива, но больше всех других элементов).
package algorithm_decomposition;

import java.util.Arrays;

public class Task5 {
	public static void main(String[] args) {

		int arr[] = new int[] { 0, 2, 8, 4, 10 };

		sortBySelection(arr);

		System.out.println(arr[1]);

	}

	private static void sortBySelection(int[] arr) {
		
		for (int n = 0; n < arr.length; n++) {

			int maxIndex = n;
			int max = arr[n];

			for (int i = n + 1; i < arr.length; i++) {

				if (arr[maxIndex] < arr[i]) {

					maxIndex = i;
				}
			}
			max = arr[maxIndex];
			arr[maxIndex] = arr[n];
			arr[n] = max;
		}
	}
}
