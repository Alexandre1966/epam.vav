package algorithm_array;

import java.util.Arrays;

//3. Дан массив действительных чисел, размерность которого N. Подсчитать,
// сколько в нем отрицательных, положительных и нулевых элементов.

public class Task3 {

	public static void main(String[] args) {

		int N = 10;
		int positive = 0;
		int negative = 0;
		int zeroelements = 0;

		double[] array = arrayOfDoublCreation(N);

		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {

			if (array[i] > 0) {

				positive++;

			} else if (array[i] < 0) {

				negative--;

			} else {

				zeroelements++;
			}
		}

		System.out.println("positive = " + positive + " negative " + negative + " zeroelements " + zeroelements);

	}

	public static double[] arrayOfDoublCreation(int n) {

		double[] array = new double[n];

		for (int i = 0; i < array.length; i++) {

			array[i] = Math.random() * 200 - 100;

		}

		return array;
	}
}
