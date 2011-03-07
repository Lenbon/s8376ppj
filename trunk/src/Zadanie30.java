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
		int x, y, n = 0;
		
		do {
			try {
				n = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbę n:"));
				if (n <= 0 || n > 25) {
					throw new Exception("n musi być w większe od 0 i mniejsze od 25");
				}
				flag = true;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "n nie jest liczbą większą od 0");
				flag = false;
			}			
		} while (flag == false);
		
		ArrayList<Integer> set = new ArrayList<Integer>();
		for (int s = 1; s <= n; ++s) {
			set.add(s);
		}
		
		String input;
		ArrayList<HashMap<Integer, Integer>> list = new ArrayList<HashMap<Integer, Integer>>();
		
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
					HashMap<Integer, Integer> pair = new HashMap<Integer, Integer>();
					pair.put(1, x);
					pair.put(2, y);
					list.add(pair);
					flag = true;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Podany ciąg znaków nie jest poprawny");
				flag = false;
			}
		} while (flag == false);

		System.out.println(set.toString());
		System.out.println(list.toString());
		
		boolean flagRelSym = false, flagRelReturn = true;
		
		for (x = 1; x <= n; x++) {
			for (HashMap<Integer, Integer> val : list) {
//				if (val.get(1).equals(x))
			}
		}
		System.out.println("W zbiorze " + (!flagRelReturn ? "NIE " : "") + "występuje relacja zwrotna " 
				+ "oraz " + (!flagRelSym ? "NIE " : "") + "występuje relacja symetryczna");
	}
}
