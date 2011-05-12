package zadanie05_4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

abstract public class Abstract extends JPanel implements Runnable {
    int dim = 20; //srednica figury       
    int x = 75, y = 75; //polozenie poczatkowe       
    int dx = 3, dy = 5; //dlugosc kroku w kierunku x i y       
    int delay = 40; //opoznienie odswiezania   
    Color color;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillOval(x, y, dim, dim);
    }

    public void run() {

    }

    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }
}
