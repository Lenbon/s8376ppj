package school;

import javax.swing.JOptionPane;

/**
 * Input
 * 
 * @package school
 * @author s8376
 * @version $Revision$
 */
public class Input {
    /**
     * Zwraca liczbe int wprowadzona przez uzytkownika
     * 
     * @param String
     *            message
     * @return int
     */
    public int getInt(String message) {
        if (message == "") {
            message = "Podaj liczbę typu int";
        }
        boolean flag = false;
        int value = 0;

        do {
            flag = false;
            String data = JOptionPane.showInputDialog(message);
            try {
                value = Integer.parseInt(data);
                flag = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Podana wartość nie jest liczbą!");
            }
        } while (flag == false);

        return value;
    }
}
