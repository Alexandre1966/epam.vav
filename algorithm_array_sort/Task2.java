package algorithm_array_sort;

import java.util.Arrays;

//2. Даны две последовательности m n b bb иaaa       2 121
//. Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей. Примечание.
// Дополнительный массив не использовать
public class Task2 {
    public static void main(String[] args) {

        int arr1[] = new int[]{1,6,3,4,5};
        int arr2[] = new int[]{6,7,6,9};
        int totalLength = arr1.length + arr2.length;
        int commonarray[] = new int[totalLength];
        int k = 4;

        System.arraycopy(arr1,0,commonarray,0,arr1.length);

        System.arraycopy(arr2,0,commonarray,arr1.length,arr2.length);

        System.out.println(Arrays.toString(commonarray));

        sortDecreasing(commonarray);

        System.out.println(Arrays.toString(commonarray));
    }

    private static void sortDecreasing(int[] commonarray) {

        for (int n = 0; n < commonarray.length; n++) {

            int maxIndex = n;

            int max = commonarray[n];

            for (int i = n+1; i < commonarray.length; i++) {

                if (commonarray[maxIndex] < commonarray[i]) {

                    maxIndex = i;
                }
            }

            max = commonarray[maxIndex];

            commonarray[maxIndex] = commonarray[n];

            commonarray[n] = max;
        }
    }


}