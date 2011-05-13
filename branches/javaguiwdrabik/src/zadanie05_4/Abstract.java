package zadanie05_4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

abstract public class Abstract extends JPanel implements Runnable {
    /**
     * Kierunki przesuwania sie obiektu
     * 
     * n-orth, s-outh, w-est, e-ast
     */
    char directionInit, directionCurrent, directionLast;
    /**
     * Granice przesuniecia w kierunkach
     */
    int eGauge, sGauge;
    char[] directions = { 'e', 's', 'w', 's' };
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
    public void run() {
        
        int lastX = x, lastY = y;
        
        boolean directionFlag = true;
        
        while (true) {
            for (int directionKey = 0; directionKey < directions.length; directionKey++) {
                directionFlag = true;
                while (directionFlag) {
                    if (directions[directionKey] == 'e') {
                        x += dx;
                        if (x + dim > eGauge + lastX) {
                            lastX = x;
                            directionFlag = false;
                        }
                    } else if (directions[directionKey] == 's') {
                        y += dy;
                        if (y + dy > sGauge + lastY) {
                            lastY = y;
                            directionFlag = false;
                        }
                    } else if (directions[directionKey] == 'w') {
                        x -= dx;
                        if (x - dim < 0) {
                            lastX = x;
                            directionFlag = false;
                        }
                    }

                    repaint();

                    try {
                        Thread.sleep(delay);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }
}
