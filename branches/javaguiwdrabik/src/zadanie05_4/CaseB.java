package zadanie05_4;

import java.awt.Color;

public class CaseB extends Abstract {
    int vDistance = 30;
    {
        color = Color.green;

        x = dim / 2;
        y = dim / 2;
    }

    public void run() {
        // l left, r right, v vertically
        char direction = 'r';
        char lastDirection = 'v';
        int directionChangeInY = y;
        
        while (true) {
            if (direction == 'r') {
                x += dx;
                if (x + dim > getWidth()) {
                    lastDirection = direction;
                    directionChangeInY = y;
                    direction = 'v';
                }
            } else if (direction == 'l') {
                x -= dx;
                if (x - dim < 0) {
                    lastDirection = direction;
                    directionChangeInY = y;
                    direction = 'v';
                }
            } else if (direction == 'v') {
                y += dy;
                if (y + dim > getHeight()) {
                    // koniec obszaru, koncze rysowanie
                    return;
                }
                if (y + dy > directionChangeInY + vDistance) {
                    direction = lastDirection == 'l' ? 'r' : 'l';
                    lastDirection = 'v';
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
