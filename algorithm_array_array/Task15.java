package algorithm_array_array;
//15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
public class Task15 {
    public static void main(String[] args) {
        int [][] array = {
                {7,2,1,8,1},
                {2,42,2,44,5},
                {98,3,13,67,9},
        };
        int row = array.length;
        int colum = array[0].length;
        int temp = Integer.MIN_VALUE;


        for (int i = 0; i < row ; i++) {

            for (int j = 0; j < colum; j++) {

             if (temp < array[i][j]) {

                  temp = array[i][j];
             }
        }
        }
        printMassive(array);

        System.out.println("max=" + temp);

        for (int i = 0; i < row ; i++) {

            for (int j = 0; j < colum; j++) {

                if (array[i][j] % 2 != 0) {

                    array[i][j] = temp;
                }
            }
        }

        printMassive(array);
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

