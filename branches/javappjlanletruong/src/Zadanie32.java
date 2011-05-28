import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 * Zadanie 32
 * 
 * Napisać program, który wczytuje napisy podawane przez użytkownika (dopóki 
 * nie zrezygnuje on z ich wprowadzania), a następnie podaje liczbę wystąpień
 * wszystkich wprowadzonych napisów. Np. po wprowadzeniu napisów Aaa, Bbb, Aaa,
 * Ccc, Aaa, Bbb powinniśmy otrzymać raport: Aaa 3, Bbb 2, Ccc 1.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie32 {
    public static void main(String[] args) {
        String input = "";
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        while (true) {
            input = JOptionPane.showInputDialog("Podaj ciąg znaków:");
            if (input == null) {
                break;
            }

            if (map.containsKey(input)) {
                map.put(input, (map.get(input) + 1));
            } else {
                map.put(input, 1);
            }
        }

        for (String val : map.keySet()) {
            System.out.print(val + " " + map.get(val) + ", ");
        }
    }
}
