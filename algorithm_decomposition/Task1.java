 /*
  * 
  *  1. Написать метод(методы) для нахождения наибольшего общего делителя и
  *  наименьшего общего кратного двух натуральных чисел:
   * 
  */
package algorithm_decomposition;

public class Task1 {

	public static void main(String[] args) {

		int m = 27;
		int n = 36;

		System.out.println(largestCommonDivisor(m, n));

		System.out.println(leastCommonMultiple(m, n));
	}

	private static int leastCommonMultiple(int m, int n) {

		return m * n / largestCommonDivisor(m, n);
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