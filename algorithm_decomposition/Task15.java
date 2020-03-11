package algorithm_decomposition;
//15. Найти все натуральные n-значные числа, цифры в которых образуют строго
// возрастающую последовательность (например, 1234, 5789). Для решения задачи
// использовать декомпозицию.

import static java.lang.Math.*;

public class Task15 {

    public static void main(String[] args) {

        int n = 4;//digit number
        int[] arr = new int[n];

       int N = (int) pow(10, n)-1;

        for (int i = 0; i < N; i++) {

            numberInArray(i, arr);

         if(isIncreasing(arr) == 1)  {

             System.out.println(i);
         }
        }
    }

    private static void numberInArray(int number, int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            arr[i] = number % 10;

            number /= 10;

        }
    }


    private static int isIncreasing(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] <= arr[i + 1] ) {

                return 0;
            }
        }

        return 1;
    }

}


