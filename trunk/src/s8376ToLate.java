import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * 
 * @author s8376
 * @version $Revision$
 */
public class s8376ToLate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int matrxSize = 4;
		
		boolean flagBreak = false, flagInput;
		int paramX = 0, paramY = 1, value;
		int counterEven = 0, counterOdd = 0, columnNumberWithMost = 0;
		String input, inputMessage = "";
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> row = new ArrayList<Integer>();

		for (int x = 0; x < (matrxSize * matrxSize); x++) {
			flagInput = false;
			while (flagInput != true) {
				input = JOptionPane.showInputDialog((inputMessage.length() > 0 ? inputMessage + "\n" : "") + "Podaj liczbę nr. " + (x + 1));
				if (input == null) {
					flagBreak = true;
					break;
				}
				try {
					value = Integer.parseInt(input);
					
					if (value % 2 == 0) {
						counterEven++;
					} else {
						counterOdd++;
					}
					
					System.out.println("x: " + paramX + " y: " + paramY + " value: " + value); // TODO deleteme
					
					row.add(value);
					flagInput = true;
					paramX++;
					
					
					
					if (paramX == matrxSize) {
						matrix.add(row);
						row = new ArrayList<Integer>();
						
						paramX = 0;
						paramY++;
					}
				} catch (Exception e) {
					inputMessage = "Niepoprawny format liczby";
					flagInput = false;
				}
			}
			if (flagBreak == true) {
				break;
			}
		}

		for (ArrayList<Integer> val : matrix) {
			for (Integer subVal : val) {
				System.out.print(subVal + " ");
			}
			System.out.println("");
		}
		
//		int (columnNumberWithMost) {
//			
//		}
		
		System.out.println("Wynik:\n"
				+ "Ilość argumentów parzystych: " + counterEven + "\n"
				+ "Ilość argumentów nieparzystych: " + counterOdd + "\n"
				+ (counterEven + counterOdd != (matrxSize * matrxSize) ? "suma elementów nie jest adekwatna\n" : "")
//				+ "Numer kolumny z największą sumą: " + columnNumberWithMost + "\n"
//				+ "Ilość argumentów parzystych występujących tylko raz: " + onlyOnceCounter
				);
	}
}
