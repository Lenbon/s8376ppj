import javax.swing.JOptionPane;

/**
 * Zadanie 37
 * 
 * Napisać i przetestować w programie metodę boolean digits(String s) sprawdzającą,
 * czy w danym łańcuchu tekstowym s występują wyłącznie cyfry.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie37 {
    public static void main(String[] args) {
        if (digits(JOptionPane.showInputDialog("Podaj ciąg znaków:"))) {
            JOptionPane.showMessageDialog(null,
                    "Ciąg znaków zawiera tylko cyfry");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Ciąg znaków zawiera inne znaki oprócz cyfr");
        }
    }

    static public boolean digits(String s) {
        if (s.matches("(^[0-9]+)")) {
            return true;
        } else {
            return false;
        }
    }
}
