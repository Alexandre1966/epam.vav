package algorithm_decomposition;

import java.util.Arrays;
//13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2
// (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка [n,2n],
// где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.

public class Task13 {
    public static void main(String[] args) {
        int n = 30;
        int[] arr = new int[n*2];

        for (int i = 0; i < arr.length; i++) {

            if (isPrime(n)==1){

                arr[i] = n;
              }

            n++;
        }

        sortBySelection(arr);

        for (int i = 1 ; i < arr.length ; i++) {

            if ( arr[i-1]- arr[i] == 2 && arr[i]!= 0 ){

                System.out.println( "numbers twins " + arr[i]+" "+ arr[i-1]);
            }
        }



    }
    private static int isPrime(int a) {

        int div = 1;

        if (a == 0 || a == 1) {

            System.out.println(" 0 and 1 is not prime numder");

            return 0;
        } else {
            for (int i = a ; i > 1; i--) {

                if (a % i == 0  ) {

                    div = i;

                }
            }
            return div == a ? 1 : 0;
        }
    }
    private static void sortBySelection(int[] arr) {
        for (int n = 0; n < arr.length; n++) {

            int maxIndex = n;
            int max = arr[n];

            for (int i = n+1; i < arr.length; i++) {

                if (arr[maxIndex] < arr[i]) {

                    maxIndex = i;
                }
            }

            max = arr[maxIndex];

            arr[maxIndex] = arr[n];

            arr[n] = max;
        }
    }
}


