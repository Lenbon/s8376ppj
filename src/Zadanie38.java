import javax.swing.JOptionPane;

/**
 * Zadanie 38
 * 
 * Napisać i przetestować w programie metodę boolean letters(String s)
 * sprawdzającą, czy w danym łańcuchu tekstowym s występują wyłącznie litery. 
 * 
 * @author s8376
 * @version $Revison$
 *
 */
public class Zadanie38 {
    public static void main(String[] arg) {
        if (letters(JOptionPane.showInputDialog("Podaj ciąg znaków"))) {
            JOptionPane
                    .showMessageDialog(null, "Ciąg zawiera wyłącznie litery");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Ciąg zawiera inne znaki oprócz liter");
        }
    }

    public static boolean letters(String s) {
        if (s.matches("(^[a-zA-Z]+)")) {
            return true;
        } else {
            return false;
        }
    }
}
