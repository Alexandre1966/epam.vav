/*
   6. Задана последовательность N вещественных чисел. Вычислить сумму чисел,
   порядковые номера которых являются простыми числами.
   
*/
package algorithm_array;

public class Task6 {
	public static void main(String[] args) {

		int N = 10;
		double sum = 0;
		
		double[] array = arrayOfDoublCreation(N);

		for (int i = 0; i < array.length; i++) {

			if (isPrime1(i)) {

				sum += array[i];

			}
		}
		System.out.println("sum of numbers = " + sum);
	}

	private static boolean isPrime(int i) {

		if (i == 1 || (i != 2 && i % 2 == 0)) {

			return false;
		}

		for (int j = 3; j < i; j += 2) {

			if (i % j == 0) {

				return false;
			}
		}

		return true;
	}

	private static boolean isPrime1(int a) {

		int div = 1;

		if (a == 0 || a == 1) {

			return false;

		} else {
			for (int i = a; i > 1; i--) {

				if (a % i == 0) {

					div = i;
				}
			}
			return div == a ? true : false;
		}
	}

	public static double[] arrayOfDoublCreation(int n) {

		double[] array = new double[n];

		for (int i = 0; i < array.length; i++) {

			array[i] = Math.random() * 200 - 100;

		}

		return array;
	}
}


