import java.awt.Dimension;

import zadanie08_1.*;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

/**
 * Zadanie 1
 * 
 * (10 p.)
 * 
 * Napisz program tworzący tabelę z kolumnami:
 *  numer porządkowy,
 *  nazwa towaru,
 *  producent,
 *  cena
 * 
 * reprezentującą cennik towarów w sklepie.
 * 
 * Interfejs graficzny powinien umożliwiać:
 *  dodawanie wiersza danych na koniec tabeli,
 *  wstawianie wiersza w dowolne miejsce tabeli,
 *  usuwanie jednego bądź kilku zaznaczonych wierszy.
 *  
 * Po każdej z tych operacji numery porządkowe towarów muszą być uaktualnione.
 * Kolumna cena powinna być jako jedyna edytowalna żeby umożliwić szybkie uaktualnianie cen.
 * Pola tej kolumny należy ustawić w kolorze żółtym a wartości czerwone.
 * 
 * @author s8376
 * @version $Id$
 */
public class Zadanie08_1 extends JFrame {

    public Zadanie08_1() {

        init();
        initGUI();
    }

    public void init() {
        
        add(new JScrollPane(new JTable(new ShopTableModel())));
    }

    public void initGUI() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(750, 400));
        setLocationRelativeTo(null);
        setTitle("Sklep - magazyn");

        setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Zadanie08_1();
            }
        });
    }
}
