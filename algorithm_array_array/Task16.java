package algorithm_array_array;

import java.util.Scanner;

//16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ..., 2 n
// так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой.
// Построить такой квадрат. Пример магического квадрата порядка 3:

public class Task16 {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        System.out.print(" Input number N multiple of 4 = ");
        int n = in.nextInt();
        int[][] a = new int[n][n];

            if (n % 4 > 0){

            System.out.print("Error: N not a multiple 4 - Input other number ");

        }else{
               GenerateArray(a);

               System.out.println(" Magic square: ");

               ReverseArray1(a);

               ReverseArray2(a);

               printMassive(a);
        }
    }



    public static void GenerateArray(int a[][])
    {
        int k = 1;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a.length; j++)
            {
                a[i][j] = k;

                k++;
            }
        }
    }

    public static void ReverseArray1(int a[][])
    {
        int t;

        for (int i = 0; i < a.length / 2; i++)
        {
            for (int j = 0; j < a.length / 2; j++)
            {
                if (i == j)
                {
                    t = a[i][j];

                    a[i][j] = a[a.length - 1 - i][a.length - 1 - j];

                    a[a.length - 1 - i][a.length - 1 - j] = t;
                }
            }
        }
    }

    public static void ReverseArray2(int a[][]){

        int t;

        for (int i = 0, j = a.length - 1 - i; i <= (a.length / 2) - 1; ++i, --j){

            t = a[i][j];

            a[i][j] = a[j][i];

            a[j][i] = t;
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