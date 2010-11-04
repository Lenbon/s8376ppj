/**
 * Zadanie 10
 * 
 * Napisać program, który pobiera 3-cyfrową liczbę naturalną i wyprowadza cyfry
 * tej liczby w odwrotnej kolejności (np. 123->321). Dane wejściowe podać w
 * inicjacji odpowiedniej zmiennej (typu int) w programie.
 * 
 * @author s8376
 */
public class Zadanie10 {
	public static void main(String[] args) {
		// FIXME do zrobienia
		int in = 999;
		int out = 99;

		do {
			++out;
		} while (in - out != 198 && in - out != -198 && out < 1000);

		System.out.println("Wejście: " + in + "\nWyjście: " + out);

	}
}
