import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Zadanie 1. Testowanie prostych rozkładów (max. 4p)
 * 
 * Pięć przycisków z napisami "Przycisk 1" - "Przycisk 5" pokazać w oknie:
 * a) w układzie BorderLayou
 * b) w układzie FlowLayout
 * c) w układzie FlowLayout z wyrównaniem do lewej
 * d) w układzie FlowLayout z wyrównaniem do prawej
 * e) w układzie GridLayout jako jeden wiersz
 * f) jako jedną kolumnę
 * g) jako tablice (3, 2)
 * 
 * Proszę napisać to jako jedną aplikację, w której sposób układania komponentów
 * określany jest w dialogu wejściowym poprzez  podanie odpowiedniej litery (A-G).
 * 
 * @author s8376
 * @version $Id$
 */
public class Zadanie06_4 {
    public static void main(String[] args) {
        char input;
        String dialogExtraContent = "";

        while (true) {
            try {
                input = JOptionPane.showInputDialog(
                        (dialogExtraContent.length() > 0 ? dialogExtraContent
                                + "\n" : "")
                                + "Wprowadź typ rozkładu(A-G)").charAt(0);

                // okno
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setPreferredSize(new Dimension(300, 300));
                frame.setLocation(300, 300);

                if (input == 'A') { // a) w układzie BorderLayou
                    frame.setTitle("A w układzie BorderLayou");
                    frame.setLayout(new BorderLayout());
                } else if (input == 'B') { // b) w układzie FlowLayout
                    frame.setTitle("B w układzie FlowLayout");
                    frame.setLayout(new FlowLayout());
                } else if (input == 'C') { // c) w układzie FlowLayout z wyrównaniem do lewej
                    frame
                            .setTitle("C w układzie FlowLayout z wyrównaniem do lewej");
                    frame.setLayout(new FlowLayout(FlowLayout.LEFT));
                } else if (input == 'D') { // d) w układzie FlowLayout z wyrównaniem do prawej
                    frame
                            .setTitle("D w układzie FlowLayout z wyrównaniem do prawej");
                    frame.setLayout(new FlowLayout(FlowLayout.RIGHT));
                } else if (input == 'E') { // e) w układzie GridLayout jako jeden wiersz
                    frame.setTitle("E w układzie GridLayout jako jeden wiersz");
                    frame.setLayout(new GridLayout(1, 0, 1, 1));
                } else if (input == 'F') { // f) jako jedną kolumnę
                    frame.setTitle("F jako jedną kolumnę");
                    frame.setLayout(new GridLayout(0, 1, 1, 1));
                } else if (input == 'G') { // g) jako tablice (3, 2)
                    frame.setTitle(" jako tablice (3, 2)");
                    frame.setLayout(new GridLayout(3, 2, 1, 1));
                } else {
                    throw new Exception("Nieprawidłowy parametr wejściowy");
                }

                // przyciski
                for (int x = 0; x < 5; x++) {
                    frame.getContentPane().add(
                            new JButton("Przycisk " + (x + 1)));
                }

                // pakowanie i wyswietlanie
                frame.pack();
                frame.setVisible(true);

                break;
            } catch (Exception e) {
                dialogExtraContent = e.getMessage();
            }
        }
    }
}
