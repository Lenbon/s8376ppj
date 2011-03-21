import javax.swing.JOptionPane;

/**
 * Zadanie 17
 * 
 * Napisać program symulujący działanie czterodziałaniowego kalkulatora:
 * użytkownik podaje (w okienku dialogowym) rodzaj operacji (+, -, *, /) i dwie
 * liczby typu double, program wyświetla w okienku dialogowym wynik.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie17 {
	public static void main(String[] args) {
		String calculation = JOptionPane.showInputDialog("Kalkulator - akceptuje wyrażenie: AA.AA + BB.BB");

		try {
			String operator;
			if (calculation.contains("+")) {
				operator = "+";
			} else if (calculation.contains("-")) {
				operator = "-";
			} else if (calculation.contains("*")) {
				operator = "*";
			} else if (calculation.contains("/")) {
				operator = "/";
			} else {
				throw new Exception("Nie podano operatora operacji");
			}

			double first = Double.parseDouble(calculation.substring(0, calculation.indexOf(operator)));
			double second = Double.parseDouble(calculation.substring(calculation.indexOf(operator) + 1));
			double result;

			if (operator == "+") {
				result = first + second;
			} else if (operator == "-") {
				result = first - second;
			} else if (operator == "*") {
				result = first * second;
			} else if (operator == "/") {
				result = first / second;
			} else {
				throw new Exception("Nie podano operatora operacji");
			}
			
			JOptionPane.showMessageDialog(null, "Wynik: " + first + " " + operator + " " + second + " = " + result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
