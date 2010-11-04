import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Zadanie 1
 * 
 * Opracować algorytm, który oblicza największą i najmniejszą liczbę ze 2
 * podanych liczb. W przypadku gdy są równe wypisać odpowiedni komunikat.
 * Przedstawić go w postaci schematu blokowego oraz w pseudo-kodzie
 * 
 * @author s8376
 */
public class Zadanie1 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Podaj pierwszą liczbę: ");
		int l1 = 0;
		try {
			l1 = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Podaj drugą liczbe: ");
		int l2 = 0;
		try {
			l2 = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (l1 > l2) {
			System.out.println("Wynik: " + l1 + " jest większa od " + l2);
		} else if (l1 < l2) {
			System.out.println("Wynik: " + l1 + " jest mniejsza od " + l2);
		} else {
			System.out.println("Wynik: liczby " + l1 + " i " + l2 + " są równe");
		}
	}
}
