package algorithm_decomposition;
//17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
// Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

public class Task17 {
    public static void main(String[] args) {

        int number = 999;
        int count = 0;

        while (number > 0){

            number -= sumDigitOfNumber(number);

            count++;
        }

        System.out.println("the number of subtractions = " +count);
    }

    private static int sumDigitOfNumber(int number) {
        int a = number;
        int sum = 0;

        while (number  > 0){

            number /= 10;

            a %= 10;

            sum += a;

            a = number;
        }

        return sum;
    }

}
