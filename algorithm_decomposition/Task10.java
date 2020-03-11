//10. Дано натуральное число N. Написать метод(методы) для формирования массива,
// элементами которого являются цифры числа N.
package algorithm_decomposition;
import java.util.Arrays;
import static java.lang.Math.*;

public class Task10 {
    public static void main(String[] args) {

        int N = 50;
        int arr[] = new int [N];

        createArray(N, arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void createArray(int n, int[] arr) {

        for (int i = 0; i < arr.length ; i++) {

           arr[i]  = (int)(random() * n + 1 );
        }
    }
}
