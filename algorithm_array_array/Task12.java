package algorithm_array_array;

//12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
public class Task12 {
    public static void main(String[] args) {

        int [][] array = {
                {7,2,1,8,1},
                {2,42,2,44,5},
                {93,3,13,33,9},
        };
        int row = array.length;
        int colum = array[0].length;

        System.out.println("the rows in ascending order");

        for (int i = 0; i < row ; i++) {

            for (int j = 0; j < colum; j++) {

                sortdecreasingRow(array[i]);

            }
        }
        printMassive(array);

        System.out.println("the rows in descending order");

        for (int i = 0; i < row ; i++) {

            for (int j = 0; j < colum; j++) {

             sortincreasingRow(array[i]);
            }
        }
        printMassive(array);


    }

    private static void sortincreasingRow(int[] numbers) {

        for (int i = numbers.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                if (numbers[i] < numbers[j]) {

                    int promez = numbers[j];

                    numbers[j] = numbers[i];

                    numbers[i] = promez;

                }
            }
        }
    }
    private static void sortdecreasingRow(int[] numbers) {

        for (int i = numbers.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                if (numbers[i] > numbers[j]) {

                    int promez = numbers[j];

                    numbers[j] = numbers[i];
                    
                    numbers[i] = promez;
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
