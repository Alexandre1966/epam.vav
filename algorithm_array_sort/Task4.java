package algorithm_array_sort;

//4. Сортировка обменами. Дана последовательность чисел n aaa  2
// 1 .Требуется переставить числа в порядке возрастания.
// Для этого сравниваются два соседних числа 1 +ii aиa . Если 1 + ii a a ,
// то делается перестановка. Так продолжается до тех пор, пока все элементы не станут
// расположены в порядке возрастания. Составить алгоритм сортировки, подсчитывая
// при этом количества перестановок.

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

       int arr[] = new int[]{4, 2, 5, 1, 3};

        exchangeSorting(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void exchangeSorting(int[] arr) {
        int temp;
        int count = 0;

        for (int j = arr.length-1; j > 0 ; j--) {

           for (int i = 0; i < j; i++) {

            if (arr[i] > arr[i + 1]) {

                temp = arr[i + 1];

                arr[i + 1] = arr[i];

                arr[i] = temp;
                count++;
            }
        }
    }
        System.out.println("number of permutations count = " + count);
    }
}

