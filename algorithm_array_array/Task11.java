package algorithm_array_array;

import static java.lang.Math.*;

//11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк,
// в которых число 5 встречается три и более раз.
public class Task11 {
    public static void main(String[] args) {

        int row = 10;
        int colum = 20;
       int[][] arr = new int[row][colum];

        int valueof = 5;
        int count = 0;
        int numberofcount = 3;

        for (int i = 0; i < row ; i++) {

            for (int j = 0; j < colum; j++) {

                arr[i][j] = (int)(random()*15 + 1);
            }
        }
        printMassive(arr);

        for (int i = 0; i < row ; i++) {

            for (int j = 0; j < colum; j++) {

                if ( valueof == arr[i][j] ){

                    count++;

                    if (count >= numberofcount){

                        System.out.println(" number of column = " + i);
                    }
                }
            }
            count = 0;
        }


    }
    private static void printMassive(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {

                System.out.print( nums[i][j] + "\t");
                        }
            System.out.println();
        }
    }

}


