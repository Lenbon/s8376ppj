import javax.swing.JOptionPane;

/**
 * Zadanie 20
 * 
 * Napisać i testować program, który wyprowadza na konsolę po kolei wszystkie
 * liczby nieparzyste, dopóki ich iloczyn nie przekroczy podanej liczby. Dane
 * wejściowe podać w oknach dialogowych. Program działa "w pętlę" i kończy
 * działanie w momencie wybrania Cancel.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie20 {
    public static void main(String[] args) {
        for (;;) {
            boolean flagExit = false;
            boolean flagInput = false;
            int counter;
            int number = 0;
            int limit;

            do {
                flagInput = false;
                String input = JOptionPane
                        .showInputDialog("Podaj liczbę (int)");
                if (input == null) {
                    flagExit = true;
                    break;
                }
                try {
                    number = Integer.parseInt(input);
                    flagInput = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,
                            "Podana wartość nie jest liczbą (int)!");
                    flagInput = false;
                }
            } while (flagInput == false);

            if (flagExit == true) {
                break;
            }

            counter = 1;
            limit = 1;
            for (;;) {
                if (counter % 2 != 0) {
                    if (limit * counter > number) {
                        System.out.println("---");
                        break;
                    } else {
                        System.out.println("" + counter + "(" + limit + ")");
                        limit *= counter;
                    }
                }
                ++counter;
            }
        }
        System.out.println("OK");
    }
}
