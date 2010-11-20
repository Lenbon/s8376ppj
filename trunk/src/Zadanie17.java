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
//		String calculation = JOptionPane.showInputDialog("Kalkulator");
		
		String calculation = "12.3+12.3";
		
		boolean isCorrect = false;
		boolean isParsedFirst = false;
		boolean isParsedChar = false;
		boolean isParsedSecond = false;
		
		int length = calculation.length();
		
		try {
			for (int x = 0; x < length; ++x) {
				
				
				
				
				
				throw new Exception("Źle!!");
				
//				double first;
//				double second;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
