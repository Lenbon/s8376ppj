import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Zadanie 21
 * 
 * Napisać i testować (w głównym programie) własną metodę: int nwd(int a, int
 * b), która oblicza największy wspólny dzielnik (NWD) 2 liczb naturalnych
 * wprowadzonych przez użytkownika.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie21 {
	protected int _input(String message) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(message);
		int input = 0;
		
		try {
			input = Integer.parseInt(br.readLine());
			if (input <= 0) {
				throw new NumberFormatException("Input must be grater than 0");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return input;
	}
	protected int _nwd(int a, int b) {
		if (a < b) {
			int buffeur = a;
			a = b;
			b = buffeur;
		}
	
		int nwd = a % b;
		if (nwd == 0) {
			nwd = b;
		} else {
			while (b % nwd != 0) {
				nwd = b % nwd;
			}
		}

		return nwd;
	}
	public static void main(String[] args) {
		Zadanie21 nwd = new Zadanie21();
		int a = nwd._input("Podaj pierwszą liczbę: ");
		int b = nwd._input("Podaj drugą liczbę: ");
		System.out.println("NWD dla liczb " + a + " i " + b + ": " + nwd._nwd(a, b));
	}
}
