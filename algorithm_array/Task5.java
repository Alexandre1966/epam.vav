/*
   5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа,
   для которых аi > i.
   
*/
package algorithm_array;

import java.util.Arrays;
import java.util.Random;

public class Task5 {

	public static void main(String[] args) {

		int n = 10;
		int diapazon = 10;

		int[] array = arrayOfIntCreation(n, diapazon);

		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {

			System.out.println((array[i] > i) ? array[i] : "");
		}
	}

	public static int[] arrayOfIntCreation(int n, int diapazon) {

		int[] array = new int[n];

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {

			array[i] = random.nextInt(diapazon);

		}

		return array;
	}

}
