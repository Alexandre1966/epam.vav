/*
  
   1. В массив A [N] занесены натуральные числа.
   Найти сумму тех элементов, которые кратны данному К.
   
*/
package algorithm_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		int k;
		String str = "Input K ->";
 
		int sum = 0;
		int N = 10;
		int diapazon = 10; // диапазон значений массива

		int[] randarray = arrayOfIntCreation(N, diapazon);

		System.out.println(Arrays.toString(randarray));

		k = enterIntFromConsol(str);

		for (int i = 0; i < randarray.length; i++) {

			if (randarray[i] % k == 0) {

				sum += randarray[i];
			}
		}

		System.out.println("sum of multiple elements " + sum);
	}

	public static int[] arrayOfIntCreation(int n, int diapazon) {

		int[] array = new int[n];

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {

			array[i] = random.nextInt(diapazon);

		}

		return array;
	}

	public static int enterIntFromConsol(String str) {

		Scanner sc = new Scanner(System.in);

		System.out.print(str);

		while (!sc.hasNextInt()) {

			sc.next();

			System.out.println(str);
		}

		return sc.nextInt();
	}
}
