/*
  10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
  (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
  
*/
package algorithm_array;

import java.util.Arrays;

public class Task10 {
	public static void main(String[] args) {

		int quantity = 10;
		int diapazon = 10;
		int n = 1;

		int[] array = arrayOfIntCreation(quantity, diapazon);

		System.out.println(Arrays.toString(array));

		for (int i = 2; i < array.length; i += 2) {

			array[n] = array[i];

			n++;

		}

		for (int i = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1; i < array.length; i++) {

			array[i] = 0;

		}

		System.out.println(Arrays.toString(array));
	}

	public static int[] arrayOfIntCreation(int n, int diapazon) {

		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {

			array[i] = (int) (Math.random() * diapazon * (Math.random() > 0.5 ? 1 : -1));

		}

		return array;
	}
}
