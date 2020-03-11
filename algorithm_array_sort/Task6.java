package algorithm_array_sort;
//6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
// Делается это следующим образом: сравниваются два соседних элемента 1 +ii aи a . Если 1 + ii a a ,
// то продвигаются на один элемент вперед. Если 1 + ii a a , то производится перестановка и сдвигаются на один элемент
// назад. Составить алгоритм этой сортировки.

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        double arr[] = new double[]{100, 10, 16, 8};
        int i = 0;

        while (i < arr.length - 1) {

            if (arr[i] > arr[i + 1]) {

                double temp = arr[i];

                arr[i] = arr[i + 1];

                arr[i + 1] = temp;

                if (i != 0) {

                    i -= 2;

                } else {

                    i--;
                }
            }

            i++;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(double[] array, int i, int j) {

        double temp = array[i];

        array[i] = array[j];

        array[j] = temp;
    }
}

