import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Zadanie 2. Kombinowanie rozkładów (max. 10p)
 * 
 * Napisać aplikację, w oknie której znajdzie się edytor tekstowy (JTextArea)
 * oraz umieszone przyciski oraz pola tekstowe
 * 
 * Uwaga:
 * 
 * przyciski A1-A3 są wyrównane w lewo i nie zmieniają swoich rozmiarów,
 * przyciski B1-B3 są wyrównane w prawo i nie zmieniają swoich rozmiarów,
 * przyciski numeryczne nie zmieniają swoich rozmiarów,
 * pola tekstowe ( JTextField ) mogą zmieniać swoje rozmiary i położenie
 * 
 * @author s8376
 * @version $Id$
 */
public class Zadanie06_5v2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 350));
        frame.setLocation(300, 300);
        frame.setLayout(new GridLayout(3, 1));

        JButton c1, c2, c3, c4, c5, c6, c7, c8, c9;
        JTextField tf1, tf2, tf3;
        JTextArea ta1;

        // przyciski panel gorny
        JPanel panelTopLeft = new JPanel();
        panelTopLeft.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelTopLeft.add(new JButton("A1"));
        panelTopLeft.add(new JButton("A2"));
        panelTopLeft.add(new JButton("A3"));

        JPanel panelTopRight = new JPanel();
        panelTopRight.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panelTopRight.add(new JButton("B1"));
        panelTopRight.add(new JButton("B2"));
        panelTopRight.add(new JButton("B3"));

        JPanel panelTopContainer = new JPanel();
        panelTopContainer.setLayout(new GridLayout(1, 2));
        panelTopContainer.add(panelTopLeft);
        panelTopContainer.add(panelTopRight);

        frame.add(panelTopContainer);
        
        frame.add(new JTextArea());

        // przyciski panel dolny
        JPanel panelBottomLeft = new JPanel();
        panelBottomLeft.setLayout(new GridLayout(3, 3));
        for (int x = 1; x < 10; x++) {
            panelBottomLeft.add(new JButton("" + x));
        }

        JPanel panelBottomRight = new JPanel();
        panelBottomRight.setLayout(new GridLayout(3, 1));
        for (int x = 0; x < 3; x++) {
            panelBottomRight.add(new JTextField());
        }

        JPanel panelBottomContainter = new JPanel();
        panelBottomContainter.setLayout(new GridLayout(1, 2));
        panelBottomContainter.add(panelBottomLeft);
        panelBottomContainter.add(panelBottomRight);

        frame.add(panelBottomContainter);

        frame.pack();
        frame.setVisible(true);
    }
}
