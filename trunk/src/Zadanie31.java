import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * Zadanie 31
 *  
 * "Dynamiczne" sortowanie kolekcji argumentów tekstowych
 * Kolejny argument tekstowy dostarcza się do kolekcji za pośrednictwem
 * okienka dialogowego. Po dodawaniu kolejnego argumentu do kolekcji,
 * program wyprowadza jej zawartość, posortowaną według porządku leksykograficznego,
 * na konsolę. Wyjście z programu następuje po naciśnięciu przycisku "Cancel".
 * Działanie programu mogłoby wyglądać następująco:
 * 
 * aaa
 * [aaa]
 * aca
 * [aaa,aca]
 * abc
 * [aaa,abc,aca]
 * c
 * [aaa,abc,aca,c]
 * b
 * [aaa,abc,aca,b,c]
 * ...
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie31 {
	public static void main(String[] args) {
		String input = "";
		ArrayList<String> list = new ArrayList<String>();
		String[] array;
		
		while (true) {
			input = JOptionPane.showInputDialog("Podaj ciąg znaków:");
			if (input == null) {
				break;
			}
			list.add(input);
		
//			array = (String[]) list.toArray();
//			
////			Arrays.sort(list.toArray()
			
	        System.out.println(Arrays.toString(list.toArray()));
		}
	}
}
