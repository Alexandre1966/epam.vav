//4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между
// какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.

package algorithm_decomposition;

import java.util.Arrays;

import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

public class Task4 {
	public static void main(String[] args) {

		double[][] points = { { 2, 4 }, { 3, 5 }, { 6, 2 }, { 7, 8 }, };
		int maxIindex = Integer.MIN_VALUE;
		int maxJindex = Integer.MIN_VALUE;
		double maxDistance = 0;

		for (int i = 0; i < points.length; i++) {

			for (int j = i + 1; j < points.length; j++) {

				double dist = distanse(points[i], points[j]);

				if (dist > maxDistance) {

					maxDistance = dist;

					maxIindex = i;

					maxJindex = j;
				}
			}
		}

		System.out.println(" Max distance = " + maxDistance + " between points:");
		
		printPoint(points[maxIindex]);
		
		printPoint(points[maxJindex]);
	}

	public static double distanse(double m1[], double m2[]) {

		return sqrt(pow(m1[0] - m2[0], 2) + pow(m1[1] - m2[1], 2));

	}

	private static void printPoint(double[] point) {
		
		System.out.println(Arrays.toString(point));
	}

	private static void printMassive(double[][] nums) {
		
		for (int i = 0; i < nums.length; i++) {

			for (int j = 0; j < nums[i].length; j++) {

				System.out.printf("%f ", nums[i][j]);
			}
			System.out.println();
		}
	}
}
