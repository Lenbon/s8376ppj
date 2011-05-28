import javax.swing.JFrame;

import zadanie05_2.*;

/**
 * Zadanie 2  - Rysowanie na komponencie - wymiarowanie proporcjonalne
 * 
 * Figury geometryczne z zadania 1 wyrysować tak aby zmieniały wymiary proporcjonalnie do wymiarów panelu do rysowania.
 * 
 * @author s8376
 * @version $Id$
 */
public class Zadanie05_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rysowanie ");
        Graph graph = new Graph();
        frame.getContentPane().add(graph);
        frame.setLocation(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
