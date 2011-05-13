package zadanie05_4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

abstract public class Abstract extends JPanel implements Runnable {
    /**
     * srednica figury
     */
    int dim = 20;
    /**
     * polozenie poczatkowe
     */
    int x = 75, y = 75;
    /**
     * dlugosc kroku w kierunku x i y
     */
    int dx = 3, dy = 5;
    /**
     * opoznienie odswiezania
     */
    int delay = 40;
    /**
     * Kolor pendzla
     */
    Color color = Color.blue;
    {
        setBounds(0, 0, 200, 200);
        setOpaque(false);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color); //ustawienie koloru wykreslania
        g.fillOval(x, y, dim, dim); //wypełnienie kola kolorem
    }

    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }
}
