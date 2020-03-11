package algorithm_array_array;
//9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить,
// какой столбец содержит максимальную сумму.
public class Task9 {
    public static void main(String[] args) {
        double[][] array = {
                {1,1,1,1,1},
                {2,2,2,2,2},
                {3,3,3,3,9},
        };

        int row = array.length;
        int colum = array[0].length;
        int maxindex =0;
        double temp = 0;
        double max = Double.MIN_VALUE;

        for (int i = 0; i < colum ; i++) {

            for (int j = 0; j < row; j++) {

                temp += array[j][i];

                if (temp > max){

                    max = temp;

                    maxindex = i;
                }
            }


            System.out.println(" sum of elements " + i + " column = " + temp);
            temp = 0;

        }
        System.out.println(maxindex + " column contains the maximum sum");
    }
}
