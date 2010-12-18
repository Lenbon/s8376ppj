import java.util.ArrayList;

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
				if (n <=0) {
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

		while (true) {
			
		}
		
	}
}
