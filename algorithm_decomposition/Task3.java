//3. Вычислить площадь правильного шестиугольника со стороной а, используя метод
// вычисления площади треугольника.
package algorithm_decomposition;
import static java.lang.Math.*;

public class Task3 {

	public static void main(String[] args) {

		double a = 5;

		double area = getAreaHexagons(a, a);

		System.out.println(area);
	}

	private static double getAreaHexagons(double a, double b) {

		double degrees = 60;

		return ((a * b) / 2) * sin(toRadians(degrees)) * 6;
	}
}
