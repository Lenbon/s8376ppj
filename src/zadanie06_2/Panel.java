package zadanie06_2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Panel
 * 
 * @author      s8376
 * @version     $Id$
 */
public class Panel extends JPanel {

    Color color = Color.blue;
    String title;
    int counter, lineWidth = 10, lineHeight = 10, margin = 10, lineMargin = 30,
            rectMaxSize = 310;

    public int getCounter() {
        return counter;
    }

    public String getTitle() {
        return title;
    }

    public void paintComponent(Graphics g) {

        g.setColor(color);
        g.drawString(title, margin, lineHeight);
        g.fillRect(lineMargin, 0, lineWidth, lineHeight);
        g.drawString("" + counter, lineMargin + lineWidth + margin, lineHeight);
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void setLineWidth(int lineWidth) {
        this.lineWidth = (int) (rectMaxSize * 0.01 * lineWidth) + margin;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
