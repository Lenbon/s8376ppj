import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
        frame.setLocation(1600, 200);
//        frame.setLayout(new GridBagLayout());
        frame.setLayout(new GridLayout(3, 3));
        
        GridBagConstraints c = new GridBagConstraints();
        
        // gorny panel
        JPanel top = new JPanel();

        JPanel topLeft = new JPanel();
        topLeft.setLayout(new FlowLayout(FlowLayout.LEFT));
        topLeft.add(new JButton("A1"));
        topLeft.add(new JButton("A2"));
        topLeft.add(new JButton("A3"));
        top.add(topLeft);

        JPanel topRight = new JPanel();
        topRight.setLayout(new FlowLayout(FlowLayout.RIGHT));
        topRight.add(new JButton("B1"));
        topRight.add(new JButton("B2"));
        topRight.add(new JButton("B3"));
        top.add(topRight);

        frame.add(top);

        // srodkowy panel
        JPanel middle = new JPanel();
        middle.add(new JTextArea());

        frame.add(middle);

        // dolny panel
        JPanel bottom = new JPanel();

        JPanel bottomLeft = new JPanel();
        bottomLeft.setLayout(new GridLayout(0, 3));
        for (int x = 0; x < 9; x++) {
            bottomLeft.add(new JButton("" + (x + 1)));
        }
        bottom.add(bottomLeft);

        JPanel bottomRight = new JPanel();
        bottomRight.setLayout(new GridLayout(0, 1));
        bottomRight.add(new JTextField());
        bottomRight.add(new JTextField());
        bottomRight.add(new JTextField());
        bottom.add(bottomRight);

        frame.add(bottom);

        frame.pack();
        frame.setVisible(true);
    }
}
