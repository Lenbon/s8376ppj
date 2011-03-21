import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Zadanie 5
 * 
 * Opracować algorytm, który wczytuje po kolei 10 liczb oraz oblicza sumę od
 * pierwszej liczby do pierwszego zera (lub do ostatniej liczby). Przedstawić go
 * w postaci schematu blokowego oraz w pseudo-kodzie.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie5 {
	public static void main(String[] args) {
		boolean flag = false;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = 0;
		int result = 0;
		
		for (int counter = 0; counter < 10; ++counter) {
			do {
				try {
					System.out.println("Podaj liczbę nr. " + (counter + 1));
					number = Integer.parseInt(br.readLine());
					flag = true;
				} catch (NumberFormatException e) {
					flag = false;
				} catch (IOException e) {
					flag = false;
				}
			} while (flag == false);

			if (number == 0) {
				counter = 10;
			} else {
				result += number;
			}
		}
		
		System.out.println("Wynik: " + result);
	}
}
