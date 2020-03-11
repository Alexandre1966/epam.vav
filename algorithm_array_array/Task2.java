/*
  
  2.Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
  
*/
package algorithm_array_array;

import java.util.Arrays;

public class Task2 {
	
	public static void main(String[] args) {
		
		int row = 5;
		int column = row;
		int diapazon = 10;
		
		int[][] array = twoDimArrayOfIntCreation(row, column, diapazon);
				
        printMassive(array);
       
        System.out.println();
        
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length; j++) {

				if (i == j) {

					System.out.print(array[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}
	public static int[][] twoDimArrayOfIntCreation(int row, int column, int diapazon) {

		int[][] array = new int[row][column];

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[0].length; j++) {

				array[i][j] = (int) (Math.random() * diapazon * (Math.random() > 0.5 ? 1 : -1));

			}

		}
		
		return array;
	}

	private static void printMassive(int[][] array) {

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				System.out.print(array[i][j] + "\t");

			}
			System.out.println();
		}
	}
}
