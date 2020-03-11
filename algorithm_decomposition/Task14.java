package algorithm_decomposition;
//14. Натуральное число, в записи которого n цифр, называется числом Армстронга,
// если сумма его цифр, возведенная в степень n, равна самому числу.
// Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.

public class Task14 {
    public static void main(String[] args) {

        int k = 100000;

        for (int i = 0; i < k; i++) {

          if (i == isArmstrongNumber(i)){

              System.out.println(i + " is Armstrong number ");
            }
        }
    }

    private static int isArmstrongNumber(int number) {
        int a = number;
        int sum = 0;

        int bitnum = bitNumber(number);

        do{
            number /= 10;

            a %= 10;

            sum += Math.pow(a,bitnum);

            a = number;

        }while (number  > 0);

        return sum+a;
    }

private static int bitNumber(int number) {

        int count = 0;

    while (number  > 0){

           number /= 10;

            count++;
    }

        return count;
    }

}
