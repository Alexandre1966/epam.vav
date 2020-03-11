package algorithm_array_sort;

import java.util.Arrays;
//5. Сортировка вставками. Дана последовательность чисел n aaa , ,, 21  . Требуется переставить числа в порядке возрастания.
// Делается это следующим образом. Пусть i aaa , ,, 21  - упорядоченная последовательность, т. е. na aa    21 .
// Берется следующее число 1 +ia и вставляется в последовательность так, чтобы новая последовательность была тоже возрастающей.
// Процесс производится до тех пор, пока все элементы от i +1 до n не будут перебраны. Примечание. Место помещения очередного
// элемента в отсортированную часть производить с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
public class Task5 {
    public static void main(String[] args) {

        int arr[] = new int[]{10, 2, 5, 7, 1};
        int indexFrom = 0;// откуда берем элемент
        int indexAt = 0; // куда элемент вставляем

        int i = 1;
        while (i < arr.length) {

            if (arr[i - 1] > arr[i]) {

                indexAt = binary1(arr, i - 1, arr[i]);

                indexFrom = i;


                insert(arr, indexAt, indexFrom);

            }
            i++;
        }
        //System.out.println("indexFrom: "+ indexFrom +"   indexAt: "+ indexAt);
        System.out.println(Arrays.toString(arr));

    }

    private static void insert(int[] arr, int indexAt, int indexFrom) {

        int tempValue = arr[indexAt];

        arr[indexAt] = arr[indexFrom];

        for (int current = indexFrom; current > indexAt; current--) {

            arr[current] = arr[current - 1];
        }
        arr[indexAt + 1] = tempValue;

    }

    private static int binary1(int[] arr, int lastIndex, int searchElement) {
        int firstIndex = 0;

        while (firstIndex < lastIndex) {

            int middleIndex = (firstIndex + lastIndex) / 2;

            if (arr[middleIndex] == searchElement) {

                return middleIndex;

            } else if (arr[middleIndex] >= searchElement) {

                lastIndex = middleIndex;

            } else {

                firstIndex = middleIndex + 1;
            }
        }
        if (searchElement > arr[lastIndex]) {

            return lastIndex + 1;
        } else {

            return lastIndex;
        }


    }
}