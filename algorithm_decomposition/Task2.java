//2. Написать метод(методы) для нахождения наибольшего общего делителя
// четырех натуральных чисел.

package algorithm_decomposition;

public class Task2 {

	public static void main(String[] args) {

		int[] numbers = { 64, 88, 56, 28 };
		
		int lcd = 1;

		for (int i = 1; i < numbers.length; i++) {

			lcd = largestCommonDivisor(numbers[0], numbers[i]);
		}
		System.out.println("Largest Common Divisor = " + lcd);
	}

	private static int largestCommonDivisor(int a, int b) {

		int nod = 1;

		for (int i = a; i > 0; i--) {

			if (a % i == 0 && b % i == 0) {

				nod = i;

				break;
			}
		}
		return nod;
	}

}
