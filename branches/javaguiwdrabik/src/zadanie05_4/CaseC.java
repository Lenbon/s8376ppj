package zadanie05_4;

import java.awt.Color;

public class CaseC extends Abstract {
    int hDistance = 30;
    {
        color = Color.red;

        x = dim / 2;
        y = dim / 2;
    }

    public void run() {
        // l left, r right, h horizontaly
        char direction = 'r';
        char lastDirection = 'h';
        int directionChangeInY = y;
        
        while (true) {
            if (direction == 'r') {
                x += dx;
                if (x + dim > getWidth()) {
                    lastDirection = direction;
                    directionChangeInY = y;
                    direction = 'h';
                }
            } else if (direction == 'l') {
                x -= dx;
                if (x - dim < 0) {
                    lastDirection = direction;
                    directionChangeInY = y;
                    direction = 'h';
                }
            } else if (direction == 'h') {
                x += dx;
                if (x + dim > getWidth()) {
                    // koniec obszaru, koncze rysowanie
                    return;
                }
                if (x + dx > directionChangeInX + hDistance) {
                    direction = lastDirection == 'v' ? 'r' : 'l';
                    lastDirection = 'h';
                }
            }

            repaint(); //wstawienie paintComponent() do watku zdarzeniowego

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
            }
        }
    }
}
