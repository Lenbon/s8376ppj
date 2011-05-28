package zadanie06_2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Painter
 * 
 * @author s8376
 * @version $Id$
 */
public class Painter {
    Parser parser;

    public Painter(Parser parser) {
        this.parser = parser;
    }

    public void display() throws Exception {
        HashMap<Character, Integer> container = parser.getData();

        SortedSet<Character> sortedset = new TreeSet<Character>(container
                .keySet());
        Iterator<Character> it = sortedset.iterator();
        
        Character key;
        int counterMin = 0, counterMax = 0;
        boolean first = true;

        // ustalam najwieksze/najmniejsze wartosci
        while (it.hasNext()) {
            key = it.next();

            if (first) {
                counterMin = container.get(key);
                counterMax = container.get(key);
                first = false;
            }
            if ((int) container.get(key) < counterMin) {
                counterMin = (int) container.get(key);
            }
            if ((int) container.get(key) > counterMax) {
                counterMax = (int) container.get(key);
            }
        }

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(100, 100);
        frame.setPreferredSize(new Dimension(400, 700));
        frame.setLayout(new GridLayout(0, 1));
        frame.setTitle("Wykres");

        Panel panel;
        it = sortedset.iterator();

        frame.add(new JPanel());
        
        // przekazuje dane do widoku
        while (it.hasNext()) {
            key = it.next();

            panel = new Panel();
            panel.setLineWidth((100 * ((int) container.get(key))) / counterMax);

            panel.setTitle("" + key);
            panel.setCounter(container.get(key));

            if ((int) container.get(key) == counterMin) {
                panel.setColor(Color.gray);
            } else if ((int) container.get(key) == counterMax) {
                panel.setColor(Color.red);
            }

            frame.add(panel);
        }

        frame.pack();
        frame.setVisible(true);
    }
}
