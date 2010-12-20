import java.io.IOError;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

/**
 * Zadanie 30
 * 
 * Napisać program sprawdzający, czy dana relacja w zbiorze X = {1, 2, 3, ..., n},
 * gdzie n jest liczbą naturalną  podaną przez użytkownika, jest:
 * *    zwrotna,
 * *    symetryczna.
 * Użytkownik podaje relację w postaci zbioru par liczb, np.: r = {(1,2), (2,1),
 * (2,2), (1,1), (1,3)} dla n = 3.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie30 {
	public static void main(String[] args) {
		boolean flag = false;
		int n = 0;
		
		do {
			try {
				n = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbę n:"));
				if (n <= 0) {
					throw new Exception("n musi być większe od 0");
				}
				flag = true;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "n nie jest liczbą większą od 0");
				flag = false;
			}			
		} while (flag == false);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int x = 1; x <= n; ++x) {
			list.add(x);
		}

		int counter, x, y;
		String input;
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		
		flag = false;
		counter = 1;
		do {
			try {
				input = JOptionPane.showInputDialog("Podaj zbior liczb (format: x,y;z,w):");
				String[] array = input.split("([ ;])+");
				for (String val : array) {
					String[] subArray = val.split("([ ,])+");
					x = Integer.parseInt(subArray[0]);
					y = Integer.parseInt(subArray[1]);
					if (x < 0 || y < 0 || x > n || y > n) {
						throw new Exception("Liczby wykraczają poza zbiór 0 - " + n);
					}
					hash.put(counter, val);
					++counter;
					flag = true;
				}
			} catch (IOError e) {
				JOptionPane.showMessageDialog(null, "Podany ciąg znaków nie jest poprawny");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			} 
		} while (flag == false);

		System.out.println(list.toString());
		System.out.println(hash.toString());
		
		boolean isReflexiveRelation = true;
		boolean isSymmetricRelation = true;
		
		for (Integer val : hash.keySet()) {
			System.out.println(hash.get(val));
			for (Integer subval : hash.keySet()) {
				
				
				
			}
		}
	}
}
