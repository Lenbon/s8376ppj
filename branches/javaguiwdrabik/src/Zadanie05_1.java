// Animowanie figury
// okrag odbija sie od krawedzi pulpitu.   
// przygotowanie wpólrzednych figury w watku glownym,
// wykreslanie w watku zdarzeniowym w paintComponent().

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Zadanie05_1 extends JPanel {
    int dim = 20; //srednica figury       
    int x = 75, y = 75; //polozenie poczatkowe       
    int dx = 3, dy = 5; //dlugosc kroku w kierunku x i y       
    int delay = 40; //opoznienie odswiezania   

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.blue); //ustawienie koloru wykreslania
        g.fillOval(x, y, dim, dim); //wypełnienie kola kolorem
    }

    public void startAnim() {

        while (true) {
            // odbicie
            if (x + dim > getWidth() || x < 0)
                dx = -dx;
            if (y + dim > getHeight() || y < 0)
                dy = -dy;
            // przesuniecie wzdluz x i y
            x += dx;
            y += dy;

            repaint(); //wstawienie paintComponent() do watku zdarzeniowego

            try {
                Thread.sleep(delay);
            } //uspienie watku
            catch (InterruptedException e) {
            }
        }
    }

    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Animacja"); //utworzenie okna ramowego
        Zadanie05_1 anim = new Zadanie05_1(); //utworzenie panelu do rysowania
        frame.getContentPane().add(anim); //dodanie panelu do okna ramowego
        frame.setLocation(300, 300); //lokalizacja okna na ekranie
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //obsługa zamkniecia okna
        frame.pack(); //upakowanie okna
        frame.show(); //wyswietlenie okna na ekranie       
        anim.startAnim(); // rozpoczecie animacji
    }

}
