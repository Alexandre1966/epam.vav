package algorithm_array_array;

//не решена

//14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
// причем в каждом столбце число единиц равно номеру столбца.
public class Task14 {
    public static void main(String[] args) {

        int row = 5;
        int colum = 5;
        int[][] arr = new int[row][colum];

        int count = 0;


        for (int i = 0; i < colum ; i++) {

            for (int j = 0; j < row ; j++) {

                arr[i][j] = 1;

                if(count < i){

                    arr[i][j] = 0;

                    count++;
                }
            }
           count = 0;
        }

        printMassive(arr);
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
