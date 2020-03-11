//9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы)
// вычисления его площади, если угол между сторонами длиной X и Y— прямой.
package algorithm_decomposition;

import static java.lang.Math.*;

public class Task9 {

	public static void main(String[] args) {
		
		double X = 3.0;
		double Y = 2.6;
		double Z = 3.6;
		double T = 1.6;
		double N;// hypotenuse of a right triangle

		N = sqrt(pow(X, 2) + pow(Y, 2));

		double quadranglearea = triangleArea(Z, T, N) + (X * Y) / 2;

		System.out.println("quadrangle area = " + quadranglearea);
	}

	private static double triangleArea(double z, double t, double n) {

		double hp = (z + t + n) / 2;// half perimetr

		return sqrt((hp * (hp - n) * (hp - z) * (hp - t)));
	}

}
