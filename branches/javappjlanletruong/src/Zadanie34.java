import javax.swing.JOptionPane;

/**
 * Zadanie 34
 * 
 * Napisać program, który pobiera od użytkownika łańcuch znakowy s i wyprowadza
 * na konsolę następujące informacje: 
 * * ile słów zawiera s (słowa = zestawy znaków rozdzielone spacjami, przecinkami, kropkami i średnikami), 
 * * najkrótsze, najdłuższe słowo z s,
 * * najmniejsze, największe słowo z s według porządku leksykograficznego.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie34 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Podaj ciąg znaków:");
        String words[] = input.split("([ _.,;]+)");

        String minLenght = "";
        String maxLenght = "";
        String minLex = "";
        String maxLex = "";

        boolean init = true;

        for (String val : words) {
            if (init == true) {
                minLenght = maxLenght = minLex = maxLex = val;
                init = false;
            }

            if (val.length() < minLenght.length()) {
                minLenght = val;
            }
            if (val.length() > maxLenght.length()) {
                maxLenght = val;
            }
            if (val.compareTo(minLex) < 0) {
                minLex = val;
            }
            if (val.compareTo(maxLex) > 0) {
                maxLex = val;
            }
        }

        JOptionPane.showMessageDialog(null, input + ":\n" + "Ilość słów: "
                + words.length + "\n" + "Najkrótsze słowo: " + minLenght + "\n"
                + "Najdłuższe słowo: " + maxLenght + "\n" + "Porządek: "
                + minLex + ", " + maxLex + "\n");
    }
}
