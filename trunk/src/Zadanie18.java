import javax.swing.JOptionPane;

/**
 * Zadanie 18
 * 
 * Napisać program symulujący działanie podstawowych operacji logicznych na
 * dwóch argumentach: użytkownik podaje rodzaj operacji (negacja, i, lub,
 * implikacja, równoważność) i wartości logiczne argumentów, program wyświetla
 * wynik.
 * 
 * @author s8376
 * @version 18
 */
public class Zadanie18 {
	public static void main(String[] args) {
		String input;

		input = JOptionPane.showInputDialog("Podaj pierwszy parametr:");
		boolean first = Boolean.parseBoolean(input);

		input = JOptionPane.showInputDialog("Podaj drugi parametr:");
		boolean second = Boolean.parseBoolean(input);

		String operation = JOptionPane.showInputDialog("Podaj typ operacji:");

		//enum operation = {"negation", "and", "or", "implication", "ifAndOnlyIf"};

		switch (operation) {
		case "negation":// negacja
			break;
		case "and": // i
			break;
		case "or": // lub
			break;
		case "implication": // implikacja
			break;
		case "ifAndOnlyIf": // równoważność
			break;
		}
	}
}
