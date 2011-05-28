/**
 * 5.1 Animowanie rysunkow s.52.
 * Okrag odbija sie od krawedzi pulpitu.    
 * Przygotowanie rysunku w watku glownym,
 * wykreslanie w paintComponent().
 */

import java.util.*;
import java.awt.*;
import javax.swing.*;

class Anim extends JPanel {
    
    int dim = 20;// srednica        
    int x = 75, y = 75;// polozenie        
    int dx = 3, dy = 5;//zmiany po³o¿enia         
    int delay = 40;// opoznienie odswie¿ania    
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);                            
        g.setColor(Color.blue);
        g.fillOval(x, y, dim, dim);
    }
    
    public void startAnim(){
    
        while(true){    
            // odbicie
            if(x + dim > getWidth() || x < 0)dx = -dx;
            if(y + dim > getHeight() || y < 0)dy = -dy;
            // przesuniecie
            x += dx;
            y += dy;

            repaint(); 

            try{Thread.sleep(delay);}
            catch(InterruptedException e){}
        }
    }
    
    public Dimension getPreferredSize(){
        return new Dimension(200, 200);
    }
    
    public static void main(String[] args){

        JFrame frame = new JFrame("Animacja");
        Anim anim  = new Anim();
        frame.getContentPane().add(anim);
        frame.setLocation(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.show();
        // rozpoczecie animacji
        anim.startAnim();
    }

}

