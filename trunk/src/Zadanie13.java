/**
 * Zadanie 13
 * 
 * Napisać program, który rozwiązuje równanie kwadratowe: a*x*x + b*x + c = 0.
 * Współczynniki rzeczywiste podać w inicjacji odpowiednich zmiennych (typu
 * double) w programie.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie13 {
	public static void main(String[] args) {
		double a = 1.0;
		double b = 8.0;
		double c = 12.0;

		System.out
				.println("Równanie: a*x*x + b*x + c = 0\nZadane liczby:\na = "
						+ a + "\nb = " + b + "\nc = " + c);
		
		double delta = (b * b) - (4 * a * c);
		
		if (delta < 0 ) {
			System.out.println("Funkcja nie ma miejsc zerowych.");
		} else if (delta == 0) {
			double x0 = -b / 2 * a;
			System.out.println("Funkcja ma jedno miejsce zerowe: x0 = " + x0);
		} else {
			double x1 = (-b - Math.sqrt(delta)) / (2 * a);
			double x2 = (-b + Math.sqrt(delta)) / (2 * a);
			System.out.println("Funkcja ma dwa miejsca zerowe: x1 = " + x1 + "; x2 = " + x2);
		}
	}
}
