import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;

import zadanie06_2.*;

/**
 * Zad. 2. Wykres paskowy (max. 10 p)
 * 
 * Napisać aplikację, która wczytuje plik tekstowy.
 * Aplikacja ma zliczać częstotliwość wystąpienia poszczególnych znaków w pliku
 * i podać wynik graficznie - w postaci wykresu słupkowego, na którym szerokość
 * słupków jest proporcjonalna do częstości występowania znaków, przy czym minimalna
 * częstość jest oznaczana kolorem szarym, maksymalna - czerwonym, a posrednie - niebieskim.
 * Za słupkami na wykresie pokazać liczby, oznaczające odpowiednie częstości.
 * 
 * Przetestować aplikację na  pliku tekstowym, zawierającym duży fragment polskiego tekstu.
 * Rozwiązanie zadania winno spełniać następujące warunki:
 *  zmieniać szerokość słupków wraz z rozmiarami okna aplikacji (wizualizacja najczęsciej występującej litery powinna zawsze mniej więc pokrywać aktualną szerokość okna),
 *  zapewnić przewijanie pionowe, gdy liczba "wierszy" wizualizacji nie mieści się w oknie (pomoc: wykorzystać JScrollPane),
 *  uwzględniać porządek polskich liter (pomoc: wykorzystać klasę Collator z pakietu java.text).
 * 
 * Punktacja:
 * 
 * za poprawnie działający program (niekoniecznie spełniający warunki 1-3) - max 3 punkty,
 * za spełnienie warunku 1  - max dodatkowo 2 punkty,
 * za spełnienie warunku 2  - max dodatkowo 2 punkty,
 * za spelnienie warunku 3 - max dodatkowe 3 punkty.
 * 
 * Przy przydziale punktów będzie uwzględniany sposób oprogramowania
 * 
 * @author s8376
 * @version $Id$
 */
public class Zadanie06_2 {
    public static void main(String[] args) {
        try {
            Painter painter = new Painter(new Parser("files/zadanie06_2.txt"));
            
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocation(100, 100);
            frame.setPreferredSize(new Dimension(200, 200));
            frame.setLayout(new GridLayout(0, 1));
            frame.setTitle("Wykres");
            
            frame.add(painter);
            
            frame.pack();
            frame.setVisible(true);
            
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }
}
