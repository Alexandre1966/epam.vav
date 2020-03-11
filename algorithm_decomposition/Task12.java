package algorithm_decomposition;

import java.util.Arrays;
////12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
//// элементами которого являются числа, сумма цифр которых равна К и которые
//// не большее N.

public class Task12 {
    public static void main(String[] args) {

        int N = 10;//не больше значения N
        int K = 10; // сумма всех разрядов чисел
        int[] number = new int[3];// разрядность числа
        int[] arr = new int[10] ;
        int num = 0;


        for (int i = 0; i < arr.length; i++) {

            number = generateDigit(N, K,number);

            arr[i]= getNumber(number);

        }
        System.out.println(Arrays.toString(arr));

    }

    private static int getNumber(int[] number) {
        int dig = 0;

        for (int i = 0; i < number.length ; i++) {

            dig += number[i];

            dig *= 10;
        }
        return dig/10;
    }

    private static int[] generateDigit(int n, int k, int[] a) {

        int sum = 0;

        while (sum != k){

            sum = 0;

            for (int i = 0; i < a.length ; i++) {

                a[i] = (int) (Math.random()* n);

                sum += a[i];
            }
        }

        return a;
    }

}
