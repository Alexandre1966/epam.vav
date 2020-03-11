//7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
package algorithm_decomposition;

public class Task7 {

	public static void main(String[] args) {

		int n = 9;
		int sum = 0;

		for (int i = 1; i <= n; i += 2) {

			sum += getFactorial(i);
		}

		System.out.println(sum);
	}

	private static int getFactorial(int n) {

		int factorial = 1;

		for (int i = 1; i <= n; i++) {

			factorial *= i;
		}

		return factorial;
	}
}
