package algorithm_array_sort;
//8.Даны дроби
//1 1  ( i i q p , - натуральные). Составить программу, которая приводит эти дроби к
// общему знаменателю и упорядочивает их в порядке возрастания.

public class Task8 {
    public static void main(String[] args) {

        int[][] fractions = {
                             {3, 2},
                             {5, 6},
                             {17, 18},
                             {3, 8},
                                      };
        int multiplier;
        int k = 0;
        int  lcm = fractions[0][1];

        do{

                lcm = leastCommonMultiple(lcm, fractions[k+1][1]);

            k++;
        }while (k < fractions.length - 1);

            for (int i = 0; i < fractions.length; i++) {

                 for (int j = 0; j < fractions[i].length ; j++) {

                  multiplier = lcm / fractions[i][1];

                  fractions[i][j] *= multiplier;
            }
        }

         sortBySelection(fractions,0);

         printMassive(fractions);
    }

    private static int leastCommonMultiple(int m, int n) {
// наименьшее общее кратное
        return m*n/largestCommonDivisor(m,n);
    }

    private static int largestCommonDivisor(int a, int b) {
//наибольший общий делитель
        int nod = 1;

        for (int i = a; i > 0; i--) {

            if (a % i == 0 && b % i == 0) {
                nod = i;
                break;
            }
        }
        return nod;
    }



    private static void printMassive(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {

                System.out.printf("%d ", nums[i][j]);
            }
            System.out.println();
        }
    }
    private static void sortBySelection(int[][] arr, int column) {
        for (int n = 0; n < arr.length; n++) {

            int maxIndex = n;
            int max = arr[n][column];

            for (int i = n+1; i < arr.length; i++) {

                if (arr[maxIndex][column] > arr[i][column]) {

                    maxIndex = i;
                }
            }

            max = arr[maxIndex][column];

            arr[maxIndex][column] = arr[n][column];

            arr[n][column] = max;
        }
    }
}


