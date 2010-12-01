import javax.swing.JOptionPane;

/**
 * Zadanie 14
 * 
 * Napisać program, który oblicza największą liczbę ze 3 podanych liczb. Dane
 * wejściowe i wyjściowe podać w oknach dialogowych.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie14 {
	public static void main(String[] args) {
		boolean flag = false;
		int number = 0;
		int max = 0;
		
		for (int x = 1; x <= 3; ++x) {
			do {
				flag = false;
				String data = JOptionPane.showInputDialog("Podaj liczbe " + x
						+ " typu int");
				try {
					number = Integer.parseInt(data);
					flag = true;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null,
							"Podana wartosc nie jest liczba!");
					flag = false;
				}
			} while (flag == false);

			if (number > max) {
				max = number;
			}
		}

		JOptionPane.showMessageDialog(null, "Najwieksza liczba to: "
				+ max);
	}
}
