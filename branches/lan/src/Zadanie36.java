import javax.swing.JOptionPane;

/**
 * Zadanie 36
 * 
 * Napisać i przetestować w programie metodę int ocurr(String s ,char c)
 * obliczającą ile razy w łańcuchu s występuje znak c. Wypisać na konsolę
 * łańcuch s po usunięciu wszystkich wystąpień znaku c. 
 * 
 * @author s8376
 * @version $Revision
 */
public class Zadanie36 {
	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("Podaj ciąg znaków:");
		char c = 'o';
		String s2 = s1.replaceAll("" + c, "");
		JOptionPane.showMessageDialog(null, "Wynik:\nciąg znaków: " + s1 + "\nznak '" + c + "' występuje w ciągu " + ocurr(s1, c) + " razy\nciąg znaków bez znaku '" + c + "':\n" + s2);
	}
	public static int ocurr(String s, char c) {
		int index = 0;
		int counter = 0;

		do {
			index = s.indexOf(c, index);
			if (index != -1) {
				++counter;
				index = s.indexOf(c, index) + 1;
			}
		} while (index != -1);

		return counter;
	}
}
