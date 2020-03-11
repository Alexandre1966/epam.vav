/*
   7. Даны действительные числа n aaa ,,, 2 1  . Найти

     max( 1 12221 + − + ++ n nnn a aa aaa  .
*/
package algorithm_array;

public class Task7 {

	public static void main(String[] args) {

		int n = 10;
		 
		double[] arr = arrayOfDoublCreation(n);
 
		double max = 0;

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] + arr[arr.length - 1 - i] > max) {

				max = arr[i] + arr[arr.length - 1 - i];
			}
		}
		System.out.println("max = " + max);
	}

	public static double[] arrayOfDoublCreation(int n) {

		double[] array = new double[n];

		for (int i = 0; i < array.length; i++) {

			array[i] = Math.random() * 200 - 100;

		}

		return array;
	}
}