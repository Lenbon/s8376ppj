import javax.swing.JOptionPane;

/**
 * Zadanie 33
 * 
 * Napisać program, który pobiera z okienka dialogowego łańcuch znakowy i :
 * *    podaje na konsoli długość łańcucha,
 * *    wyprowadza pierwszy i ostatni znak,
 * *    wyprowadza podłańcuch od 3 znaku do ostatniego znaku,
 * *    wyprowadza podłańcuch od 3 znaku do przedostatniego znaku.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie33 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Podaj ciąg znaków:");
        String result = "";

        result += input + "\n";
        result += "Długość łańcucha: " + input.length() + " znaków\n";
        result += "Pierwszy znak: " + input.charAt(0) + "\n";
        result += "Ostatni znak: " + input.charAt(input.length() - 1) + "\n";
        result += "podłańcuch od 3 znaku do ostatniego znaku: "
                + input.substring(3, input.length()) + "\n";
        result += "podłańcuch od 3 znaku do przedostatniego znaku: "
                + input.substring(3, input.length() - 1) + "\n";

        JOptionPane.showMessageDialog(null, result);
    }
}
