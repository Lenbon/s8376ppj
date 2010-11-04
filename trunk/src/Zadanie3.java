import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Zadanie 3
 * 
 * Opracować algorytm, który oblicza sumę liczb większych od 2 spośród 10 liczb
 * wprowadzonych przez użytkownika. Przedstawić go w postaci schematu blokowego
 * oraz w pseudo-kodzie.
 * 
 * @author s8376
 */
public class Zadanie3 {
	public static void main(String[] args) {
		boolean flag;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int counter = 0;
		int number = 0;
		int result = 0;
		
		while (counter < 10) {
			flag = false;
			while (flag == false) {
				System.out.println("Podaj liczbę nr. " + (counter + 1) + ":");
				try {
					number = Integer.parseInt(br.readLine());
					flag = true;
				} catch (NumberFormatException e) {
					flag = false;
				} catch (IOException e) {
					flag = false;
				}
			}
			if (number > 2) {
				result += number;
			}
			++counter;
		}
		
		System.out.println("Wynik: " + result);
	}
}
