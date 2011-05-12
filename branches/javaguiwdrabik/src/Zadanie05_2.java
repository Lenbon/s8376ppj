import javax.swing.JFrame;

import zadanie05_2.*;

/**
 * @author s8376
 * @version $Revision$
 */
class Zadanie05_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rysowanie proporcjonalnie");//utworzenie okna ramowego
        Graph graph = new Graph(); //utworzenie panelu do rysowania
        frame.getContentPane().add(graph); //dodanie panelu do okna ramowego
        frame.setLocation(300, 300); //lokalizacja okna na ekranie
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //obsługa zamkniecia okna
        frame.pack(); //upakowanie okna
        frame.show(); //wyswietlenie okna na ekranie        
    }
}
