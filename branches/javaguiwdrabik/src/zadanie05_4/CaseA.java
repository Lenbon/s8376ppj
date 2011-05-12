package zadanie05_4;

public class CaseA extends Abstract {
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
            }
            catch (InterruptedException e) {
            }
        }
    }
}
