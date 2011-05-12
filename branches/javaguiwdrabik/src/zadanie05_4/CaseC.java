package zadanie05_4;

import java.awt.Color;

public class CaseC extends Abstract {
    {
        color = Color.green;
        x = dim / 2;
        y = dim / 2;
    }

    public void run() {
        while (true) {
            // odbicie
            if (x + dim > getWidth() || x < 0)
                dx = -dx;
            if (y + dim > getHeight() || y < 0)
                dy = -dy;
            // przesuniecie wzdluz x i y
            x += dx;
            y += dy;

            repaint();

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
            }
        }
    }
}
