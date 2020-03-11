package algorithm_array_sort;

import java.util.Arrays;

//7. Пусть даны две неубывающие последовательности действительных чисел m n b bbиaaa     21 21
//Требуется указать те места, на которые нужно вставлять элементы последовательности m bb b   2 1 в
// первую последовательность так, чтобы новая последовательность оставалась возрастающей.
public class Task7 {
    public static void main(String[] args) {

        double arr1[] = new double[]{1,3,5,7,9};
        double arr2[] = new double[]{2,4,8};
        double result[] = new double[arr1.length + arr2.length];
        int k = arr1.length;
        int position;

        System.arraycopy(arr1,0,result,0,arr1.length);

         for (int i = 0; i < arr2.length ; i++) {

             System.arraycopy(arr2,i,result,k,1);

             position = binarySearch(result, k, arr2[i]);

             System.out.println("element i = " + arr2[i] + " of arr2 insert in " +
                                 position + " position ");
             insert(result,position,k);

             k++;

        }
        System.out.println("resulting array \" result: \" ");

        System.out.println(Arrays.toString(result));
    }
    private static void insert(double[] arr, int insertIndexAt, int insertIndexFrom) {

        double tempValue = arr[insertIndexAt];

        arr[insertIndexAt] = arr[insertIndexFrom];

        for (int current = insertIndexFrom; current > insertIndexAt; current--) {

            arr[current] = arr[current - 1];
        }
        arr[insertIndexAt + 1] = tempValue;

    }

    private static int  binarySearch(double[] arr, int lastIndex, double searchElement) {
        int firstIndex = 0;

        while (firstIndex < lastIndex) {

            int middleIndex = (firstIndex + lastIndex) / 2;

            if (arr[middleIndex] == searchElement) {

                return middleIndex;

            } else if (arr[middleIndex] >= searchElement) {

                lastIndex = middleIndex;

            } else firstIndex = middleIndex + 1;
        }
        if (searchElement > arr[lastIndex]) {

            return lastIndex + 1;
        } else {
            return lastIndex;
        }


    }
}


