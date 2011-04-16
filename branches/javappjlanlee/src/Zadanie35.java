import javax.swing.JOptionPane;

/**
 * Zadanie 35
 * 
 * Napisać program, który pobiera od użytkownika 2 łańcuchy znakowe s1, s2
 * i wyprowadza informacje o tym, ile razy w łańcuchu s1 występuje łańcuch s2.
 *  
 * @author s8376
 * @version $Revision$
 */
public class Zadanie35 {
    public static void main(String[] args) {
        try {
            String s1 = JOptionPane
                    .showInputDialog("Podaj pierwszy ciąg znaków:");
            String s2 = JOptionPane.showInputDialog("Podaj drugi ciąg znaków:");

            if (s1.isEmpty() || s2.isEmpty()) {
                throw new Exception("Podane ciągi znaków nie moga być puste");
            }

            int index = 0;
            int counter = 0;
            do {
                index = s2.indexOf(s1, index);
                if (index != -1) {
                    ++counter;
                    index = s2.indexOf(s1, index) + 1;
                }
            } while (index != -1);

            JOptionPane.showMessageDialog(null, "Licznik: " + counter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
