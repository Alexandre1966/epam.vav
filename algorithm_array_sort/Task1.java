//1. Заданы два одномерных массива с различным количеством элементов и натуральное число k.
// Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
// при этом не используя дополнительный массив.

package algorithm_array_sort;
import java.util.Arrays;


public class Task1 {
    public static void main(String[] args) {

        int arr1[] = new int[]{1,2,3,4,5};
        int arr2[] = new int[]{6,7,8,9};
        int totalLength = arr1.length + arr2.length;
        int commonarray[] = new int[totalLength];
        int k = 4;


        insetKposition(arr1, arr2, commonarray, k);
    }

    private static void insetKposition(int[] arr1, int[] arr2, int[] commonarray, int k) {

        System.arraycopy(arr1,0,commonarray,0,k);

        System.arraycopy(arr2,0,commonarray,k,arr2.length);

        System.arraycopy(arr1,k,commonarray,k+arr2.length,(arr1.length -k));

        System.out.println(Arrays.toString(commonarray));
    }
}

