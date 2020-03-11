package algorithm_decomposition;
//16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
// Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпози



import static java.lang.Math.pow;

public class Task16 {
    public static void main(String[] args) {

        int n = 8;//digit number

        int[] arr = new int[n];
        int N = (int) pow(10, n) - 1;
        int sum;
        int value;


        for (int i = 0; i < N; i++) {

            numberInArray(i, arr);

            sum = isOddNumber(arr);

            if (sum != 0) {

                numberInArray(sum, arr);

                value = countEvenDigit(arr);

               System.out.println("i="+ i+ "  sum="+ sum + "  value=" + value );
            }
        }
    }

    private static void numberInArray(int number, int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            arr[i] = number % 10;

            number /= 10;

        }
    }

    private static int isOddNumber(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]% 2 == 0) {

                return 0;
            }else {
                sum += arr[i];
            }
        }

        return sum;
    }

    private static int countEvenDigit(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]% 2 == 0 && arr[i] != 0) {

                count++;

            }
        }

        return count;
    }

}

