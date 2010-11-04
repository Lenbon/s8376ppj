import javax.swing.JOptionPane;

/**
 * Zadanie 15 dodatkowe
 * 
 * Zalozenia: piec liczb - a, b, c, d, e posortowac za pomoca jak najmniejszej
 * ilosci testow
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie15Dodatkowe {
	public static void main(String[] args) {
		int numOfNumbers = 5;
		int[] numbers = new int[numOfNumbers];
		int x;

		Zadanie15Dodatkowe handler = new Zadanie15Dodatkowe();
		for (x = 0; x < numOfNumbers; ++x) {
			numbers[x] = handler.handle(x + 1); 
		}
		
		boolean flagChanges = false;
		int buffer;
		do {
			flagChanges = false;
			for (x = 0; x < numOfNumbers; ++x) {
				if (x < (numOfNumbers - 1) && numbers[x] > numbers[x + 1]) {
					buffer = numbers[x];
					numbers[x] = numbers[x + 1];
					numbers[x + 1] = buffer;
					flagChanges = true;					
				}				
			}
		} while (flagChanges == true);
			
		System.out.println("Wynik:");
		for (x = 0; x < numOfNumbers; ++x) {
			System.out.print("" + numbers[x] + ", ");
		}
	}

	/**
	 * Zwraca liczbe wprowadzona przez uzytkownika
	 * 
	 * @param int x numer wprowadzanej liczby
	 * @return int wprowadzona liczba
	 */
	protected int handle(int x) {
		boolean flag = false;
		int number = 0;

		do {
			flag = false;
			String dane = JOptionPane.showInputDialog("Podaj liczbę nr." + x);
			try {
				number = Integer.parseInt(dane);
				flag = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,
						"Podana wartość nie jest liczbą!");
				flag = false;
			}
		} while (flag == false);

		return number;
	}
}
