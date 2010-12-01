import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Zadanie 4
 * 
 * Opracować algorytm, który oblicza silnię (n!) podanej liczby n. Przedstawić
 * go w postaci schematu blokowego oraz w pseudo-kodzie.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie4 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = 0;

		boolean flag = false;
		while (flag == false) {
			System.out.println("Podaj liczbę: ");
			try {
				number = Integer.parseInt(br.readLine());
				if (number > 25) {
					System.out.println("Podana liczba nie może być większa od 25");
					throw new NumberFormatException();
				}
				flag = true;
			} catch (NumberFormatException e) {
				flag = false;
			} catch (IOException e) {
				flag = false;
			}
		}

		int result = 1;
		for (int counter = 1; counter <= number; ++counter) {
			result *= counter;
		}

		System.out.println("Wynik: " + result);
	}
}
