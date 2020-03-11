//8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3]
// + D[4] + D[5]; D[4] +D[5] +D[6]. Пояснение. Составить метод(методы) для
// вычисления суммы трех последовательно расположенных элементов массива с номерами
// от k до m.

package algorithm_decomposition;

public class Task8 {

	public static void main(String[] args) {

		double[] mas = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int k = 4;
		double sum1 = 0;
		int step = 3;

		if (k + step <= mas.length && k >= 0) {

			sum1 += sumOf3(mas, k);

			System.out.println(" sum of three elements from position k=" + k + " is " + sum1);
		} else {

			System.out.println(" k must be in range from 0  to " + (mas.length - step));
		}
	}

	private static double sumOf3(double[] mas, int k) {

		int step = 3;
		double sum = 0;

		for (int i = k; i < step + k; i++) {

			sum += mas[i];
		}
		return sum;
	}
}

