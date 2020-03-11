//11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.(для целых чисел?)

package algorithm_decomposition;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task11 {

	public static void main(String[] args) {

		double a = 12345.90009;
		double b = 123.445566;

		if (numberOfdigits(a) == numberOfdigits(b)) {

			System.out.println(" the number of digits is the same");

		} else {

			System.out.println(numberOfdigits(a) - numberOfdigits(b) > 0 ? "the number of digits  a > b "
					: "the number of digits  b > a ");

		}
	}

	private static int numberOfdigits(double a) {

		String str = String.valueOf(a);
		char[] arr = str.toCharArray();
		int count = 0;

		for (char ar : arr) {

			if (ar != '.') {

				count++;
			}
		}

		return count;
	}
}

/*       while ( a - b > 0){

                a *= 10;
                b = (int) a;
                System.out.println("a= "+a+"  b= " + b);
        }
        do {
                count++;
                System.out.println( "count = " + count);
            } while ((a /= 10) > 1);*/