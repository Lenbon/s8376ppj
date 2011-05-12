package zadanie05_4;

import java.awt.Color;
import java.awt.Graphics;

public class CaseB extends Abstract {
    {
        color = Color.red;
        x = dim / 2;
        y = dim / 2;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillOval(x, y, dim, dim);
    }

    public void run() {
        String direct = "right";
        String lastDirect = "left";
        

        while (true) {
            // odbicie
            if (direct.equals("left")) {
                if (x - dim < getWidth() || x < 0) {
                    lastDirect = "right";
                    direct = "down";
                }
            } else if (direct.equals("right")) {
                if (x + dim > getWidth() || x < 0) {
                    lastDirect = "left";
                    direct = "down";
                }
            } else if (direct.equals("down")) {
                if (y + dim > getHeight()) {
                    return;
                }
                direct = lastDirect;
            }
            
            // przesuniecie
            if (direct.equals("left")) {
                x -= dx;
            } else if (direct.equals("right")) {
                x += dx;
            } else if (direct.equals("down")) {
                y += dy;
            }
            
            
            
            repaint();

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
            }
        }
    }
}
