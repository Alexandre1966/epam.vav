package algorithm_array_array;
//10. Найти положительные элементы главной диагонали квадратной матрицы.
public class Task10 {
    public static void main(String[] args) {
        double[][] array = {
                {1,1,1},
                {2,-2,2},
                {3,3,3},
        };

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j ++) {

                if (i == j && array[i][j] > 0){

                    System.out.print(array[i][j] +"\t");
                }
            }
            System.out.println();
        }
    }
}
