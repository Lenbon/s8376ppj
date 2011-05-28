import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
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
        frame.setPreferredSize(new Dimension(400, 400));
        frame.setLocation(300, 200);
        frame.setLayout(new GridBagLayout());
        
        GridBagConstraints c = new GridBagConstraints();

        // panel gorny
        JPanel topLeft = new JPanel();
        
topLeft.setBackground(Color.GREEN);
        
        topLeft.setLayout(new FlowLayout(FlowLayout.LEFT));
        topLeft.add(new JButton("A1"));
        topLeft.add(new JButton("A2"));
        topLeft.add(new JButton("A3"));
        c.gridx = 1;
        c.gridy = 1;
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        frame.add(topLeft, c);

        JPanel topRight = new JPanel();
        
topRight.setBackground(Color.RED);
        
        topRight.setLayout(new FlowLayout(FlowLayout.RIGHT));
        topRight.add(new JButton("B1"));
        topRight.add(new JButton("B2"));
        topRight.add(new JButton("B3"));
        c.gridx = 2;
        c.gridy = 1;
        c.anchor = GridBagConstraints.FIRST_LINE_END;
        frame.add(topRight, c);

        // panel srodkowy
        JTextArea textarea = new JTextArea();
        textarea.setPreferredSize(new Dimension(200, 200));
        c.gridx = 1;
        c.gridy = 2;
        c.gridwidth = 2;
        c.fill = GridBagConstraints.BOTH;
        frame.add(textarea, c);

        // panel dolny
        JPanel bottomLeft = new JPanel();
bottomLeft.setBackground(Color.pink);
        bottomLeft.setLayout(new GridLayout(0, 3));
        for (int x = 0; x < 9; x++) {
            bottomLeft.add(new JButton("" + (x + 1)));
        }
        c.gridx = 1;
        c.gridy = 3;
        c.gridwidth = 1;
        c.anchor = GridBagConstraints.LAST_LINE_START;
        c.fill = GridBagConstraints.NONE;
        frame.add(bottomLeft, c);
        
        JPanel bottomRight = new JPanel();
bottomRight.setBackground(Color.blue);
        bottomRight.setLayout(new BoxLayout(bottomRight, BoxLayout.Y_AXIS));
        bottomRight.add(new JTextField("JTextField"));
        bottomRight.add(new JTextField("JTextField"));
        bottomRight.add(new JTextField("JTextField"));
        c.gridx = 2;
        c.gridy = 3;
        c.anchor = GridBagConstraints.LAST_LINE_END;
        c.fill = GridBagConstraints.BOTH;
        frame.add(bottomRight, c);

        frame.pack();
        frame.setVisible(true);
    }
}
