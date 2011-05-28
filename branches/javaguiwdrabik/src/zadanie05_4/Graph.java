package zadanie05_4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Graph extends JPanel {
    int dim = 20;
    int x = 75, y = 75;
    int dx = 3, dy = 5;
    int delay = 40;
    Color color;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillOval(x, y, dim, dim);
    }

    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
