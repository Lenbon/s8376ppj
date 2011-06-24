import zadanie08_2.*;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

/**
 * Zadanie 1
 * 
 * (12 p.)
 * 
 * W programie stworzyć tabelę (obiekt JTable), prezentującą informacje o książkach .
 * Książka ma następujace cechy:
 *  autora
 *  tytuł
 *  wydawnictwo
 *  cenę
 *  stronę tytułową (obrazek)
 *  
 * Informacje o książkach mają być wczytywane z pliku.
 * Wszystkie kolumny tabeli powinny być edytowalne.
 * Zapewnić sortowanie w tabeli wg: autora, tytulu, ceny (przyciski sortowania).
 * Zapewnić również możliwość przeliczania cen i pokazywania ich w  różnych walutach.
 * Waluty: PLN, USD, EUR
 * 
 * @author      s8376
 * @version     $Id$
 */
public class Zadanie08_2 extends JFrame {

    public Zadanie08_2() {

        init();
        initGUI();
    }

    public void init() {
        add(new JScrollPane(new BookTable(new BookstoreTableModel(
                "files/zadanie08_2/data.txt"))));
    }

    public void initGUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(750, 400));
        setLocationRelativeTo(null);

        setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Zadanie08_2();
            }
        });
    }
}
