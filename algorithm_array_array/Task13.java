package algorithm_array_array;
//13. Отсотрировать столбцы матрицы по возрастанию и убыванию значений эементов.
public class Task13 {
    public static void main(String[] args) {
        int [][] array = {
                {7,2,1,8,1},
                {2,42,2,44,5},
                {93,3,13,67,9},
        };
        int row = array.length;
        int colum = array[0].length;

        System.out.println("the columns  in ascending order");

        for (int i = 0; i < colum ; i++) {

            for (int j = 0; j < row; j++) {

                  sortincreasingRow(array[j]);
            }
        }

        printMassive(array);

        System.out.println("the columns  in descending  order");
        for (int i = 0; i < colum ; i++) {

            for (int j = 0; j < row; j++) {

               sortdecreasingRow(array[j]);

            }
        }

        printMassive(array);
    }

    private static void sortincreasingRow(int[] numbers) {
        for (int j = numbers.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (numbers[j] < numbers[i]) {
                    int promez = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = promez;
                }
            }
        }
    }
    private static void sortdecreasingRow(int[] numbers) {
        for (int j = numbers.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (numbers[j] > numbers[i]) {
                    int promez = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = promez;
                }
            }
        }
    }

    private static void printMassive(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {

                System.out.printf("%d ", nums[i][j]);
            }
            System.out.println();
        }
    }

}
