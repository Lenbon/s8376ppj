import java.util.HashMap;
import java.util.Set;

import javax.swing.JOptionPane;

/**
 * Zadanie 41
 * 
 * Napisać i testować program, który liczy ilość znaków, występujących tylko
 * raz w podanym łańcuchu tekstowym, wprowadzonym przez użytkownika.
 * Dane wejściowe i wyjściowe podać w oknach dialogowych. Program działa
 * "w pętlę" i kończy działanie w momencie wybrania Cancel lub
 * wprowadzenia łańcucha "Koniec".
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie41 {
	public static void main(String[] args) {
		String input, chars;
		String message = "";
		int counter;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		while (true) {
			input = JOptionPane.showInputDialog(message + "Wprowadź ciąg znaków");
			
			if (input == null || input.equals("Koniec")) {
				break;
			} else {
				message = "";
				chars = "";
				counter = 0;
				for (int x = 0; x < input.length(); x++) {
					if (map.containsKey("" + input.charAt(x))) {
						map.put("" + input.charAt(x), map.get("" + input.charAt(x)) + 1);
					} else {
						map.put("" + input.charAt(x), 1);
					}
				}

				Set<String> set = map.keySet();
				for (Object val : set.toArray()) {
					if (map.get(val) == 1) {
						counter++;
					}
				}

				message = "Ilość pojedyńczych znaków: " + counter + " (" + chars;
				map.clear();
			}
		}
	}
}
