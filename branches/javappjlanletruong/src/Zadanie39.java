import javax.swing.JOptionPane;

/**
 * Zadanie 39
 * 
 * Napisać i testować w programie metodę String reverse(String s),
 * która zwraca łańcuch odwrócony łańcucha s. 
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie39 {
    public static void main(String[] arg) {
        JOptionPane.showMessageDialog(null, reverse(JOptionPane
                .showInputDialog("Podaj ciąg znaków")));
    }

    public static String reverse(String s) {
        StringBuffer r = new StringBuffer();

        int index = (s.length() - 1);
        while (index >= 0) {
            r.append(s.charAt(index));
            --index;
        }

        return r.toString();
    }
}
