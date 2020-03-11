/* 
   4. Даны действительные числа а1 ,а2 ,..., аn .
   Поменять местами наибольший и наименьший элементы.
  
*/
package algorithm_array;
import java.util.Arrays;


public class Task4 {

	public static final double MAX_VALUE = Double.MAX_VALUE;
	public static final double MIN_VALUE = Double.MAX_VALUE;

	public static void main(String[] args) {

		double max = -MIN_VALUE;
		double min = MAX_VALUE;
		double intermed = 0;
		int indexMax = 0;
		int indexMin = 0;

		double[] array = arrayOfDoublCreation(10);

		for (int i = 0; i < array.length; i++) {

			if (array[i] > max) {

				max = array[i];

				indexMax = i;

			} else {

				if (array[i] < min) {

					min = array[i];

					indexMin = i;
				}

			}

		}

		System.out.println(Arrays.toString(array));

		intermed = array[indexMax];

		array[indexMax] = array[indexMin];

		array[indexMin] = intermed;

		System.out.println(" Min mas = " + min + "  Max mas = " + max);

		System.out.println(Arrays.toString(array));

	}

	public static double[] arrayOfDoublCreation(int n) {

		double[] array = new double[n];

		for (int i = 0; i < array.length; i++) {

			array[i] = Math.random() * 200 - 100;

		}

		return array;
	}
}

