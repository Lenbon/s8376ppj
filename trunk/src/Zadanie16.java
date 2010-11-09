import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Zadanie 16
 * 
 * Napisać program, który pobiera 1 znak i wyprowadza wartość liczbową
 * odpowiadającą cyfrze szesnastkowej podanej w postaci tego znaku lub -1 jeśli
 * dany znak nie odpowiada żadnej cyfrze szesnastkowej. Np: '0' -> 0, 'A' -> 10,
 * 'a'-> 10, 'x' -> -1.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie16 {
	public static void main(String[] args) {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String inputString = "";
//		System.out.println("Podaj ciąg: ");
//		try {
//			inputString = br.readLine();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		String inputString = "abcdefg0123456789ABCDEFG";

		int status;
		int stringLenght = inputString.length();
		for (int x = 0; x < stringLenght; ++x) {
			status = -1;
			if (inputString.charAt(x) >= 48 && inputString.charAt(x) <= 57) { // 0-9
				status = inputString.charAt(x) - 48;
			} else if (inputString.charAt(x) >= 65 && inputString.charAt(x) <= 70) { // A-F
				status = (inputString.charAt(x) - 65) + 10;
			} else if (inputString.charAt(x) >= 97 && inputString.charAt(x) <= 102) { // a-f
				status = (inputString.charAt(x) - 97) + 10;
			}
			System.out.print("'" + inputString.charAt(x) + "' -> " + status + ", ");
		}
	}
}
