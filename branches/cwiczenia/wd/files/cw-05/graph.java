
// Rysowanie na komponencie
// Na komponencie mozna rysowac i wypelniac: 
// proste figury geometryczne,napisy,obrazy (klasa Graphics)
// w ciele metody paintComponent() mamy dostep do obiektu wykreslajacego klasy Graphics  

import java.util.*;
import java.awt.*;
import javax.swing.*;

class Graph extends JPanel {
        
    int dim = 20;       //srednica figury
        
    int x = 75, y = 75; //polozenie             
    
    public void paintComponent(Graphics g){
        super.paintComponent(g); //wykreslanie komponentu JPanel                           
        g.setColor(Color.blue); //ustawienie koloru wykreslania
        g.fillOval(x, y, dim, dim); //wypelnianie kola
    }
        
    
    public Dimension getPreferredSize(){
        return new Dimension(200, 200);
    }
    
    
    public static void main(String[] args){

        JFrame frame = new JFrame("Rysowanie ");//utworzenie okna ramowego
        Graph graph  = new Graph();//utworzenie panelu do rysowania
        frame.getContentPane().add(graph); //dodanie panelu do okna ramowego
        frame.setLocation(300, 300); //lokalizacja okna na ekranie
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//obs³uga zamkniecia okna
        frame.pack(); //upakowanie okna
        frame.show();//wyswietlenie okna na ekranie        
        
    }

}

