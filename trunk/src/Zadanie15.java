import javax.swing.JOptionPane;

/**
 * Zadanie 15
 * 
 * Napisać program, który pobiera 3 argumenty o postaci liczb rzeczywistych i
 * wyprowadza je w porządku niemalejącym. Dane wejściowe i wyjściowe podać w
 * oknach dialogowych.
 * 
 * @author s8376
 */
public class Zadanie15 {
	/**
	 * Glowna funkcja programu
	 * 
	 * @param String args
	 * @return void
	 */
	public static void main(String[] args) {
		Zadanie15 handler = new Zadanie15();

		double buffer;
		double number1 = handler.handle(1);
		double number2 = handler.handle(2);
		double number3 = handler.handle(3);

		boolean flagChanges;
		do {
			flagChanges = false;
			if (number1 > number2) {
				buffer = number2;
				number2 = number1;
				number1 = buffer;
				flagChanges = true;
			}
			if (number2 > number3) {
				buffer = number3;
				number3 = number2;
				number2 = buffer;
				flagChanges = true;
			}
		} while (flagChanges == true);

		JOptionPane.showMessageDialog(null, "Wynik: " + number1 + ", "
				+ number2 + ", " + number3);
	}

	/**
	 * Zwraca liczbe wprowadzona przez uzytkownika
	 * 
	 * @param int x numer wprowadzanej liczby
	 * @return boolean wprowadzona liczba rzeczywista
	 */
	protected double handle(int x) {
		boolean flag = false;
		double number = 0.0;

		do {
			flag = false;
			String dane = JOptionPane.showInputDialog("Podaj liczbę " + x
					+ " typu double");
			try {
				number = Double.parseDouble(dane);
				flag = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,
						"Podana wartość nie jest liczbą double!");
				flag = false;
			}
		} while (flag == false);

		return number;
	}

}
