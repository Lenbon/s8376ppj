package zadanie06_2;

import java.awt.Color;
import java.awt.Graphics;
import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import javax.swing.JPanel;

/**
 * Painter
 * 
 * @author s8376
 * @version $Id$
 */
public class Painter extends JPanel {
    Parser parser;
    int counterMin = 0, counterMax = 0;
    List<Object> keysList;
    HashMap<String, Integer> container;

    public Painter(Parser parser) {
        this.parser = parser;
        boolean first = true;

        try {
            container = this.parser.getData();
            keysList = Arrays.asList(container.keySet().toArray());
            Collections.sort(keysList, Collator
                    .getInstance(Locale.getDefault()));

            // obliczam wartosci najmniejsze i najwieksze
            for (Object key : keysList.toArray()) {
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
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            Panel panel;

            // przekazuje dane do widoku
            for (Object key : keysList.toArray()) {
                panel = new Panel();
                panel.setLineWidth((100 * ((int) container.get(key)))
                        / counterMax);

                panel.setTitle("" + key);
                panel.setCounter(container.get(key));

                if ((int) container.get(key) == counterMin) {
                    panel.setColor(Color.gray);
                } else if ((int) container.get(key) == counterMax) {
                    panel.setColor(Color.red);
                }

                add(panel);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
