package zadanie05_2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class Graph extends JPanel {
    Image img;
    boolean loaded = false;

    private void loadImage(String imgFileName) {
        img = Toolkit.getDefaultToolkit().getImage(imgFileName);
        MediaTracker mt = new MediaTracker(this);
        mt.addImage(img, 1);

        try {
            mt.waitForID(1);
        } catch (InterruptedException exc) {
        }

        int w = img.getWidth(this); // szerokość obrazka
        int h = img.getHeight(this); // wysokość obrazka

        if (w != -1 && w != 0 && h != -1 && h != 0) {
            loaded = true;
            setPreferredSize(new Dimension(w, h));
        } else
            setPreferredSize(new Dimension(200, 200));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.blue);
        g.fillOval(50, 50, 75, 75);

        loadImage("files/images/zadanie05_1_1.jpg");
        if (img != null && loaded) {
            g.drawImage(img, 0, 0, img.getWidth(this), img.getHeight(this),
                    this);
        }

        // wyrysować i ewentualnie wypełnić inne figury geometryczne o wymiarach podanych w pikslach
        // linię
        g.setColor(Color.red);
        g.drawLine(25, 25, 175, 25);
        // prostokąt
        g.setColor(Color.black);
        g.drawRect(25, 100, 25, 25);
        g.setColor(Color.green);
        g.fillRect(25, 100, 25, 25);
        // trójkąt
        int[] tabX = { 50, 75, 25 }, tabY = { 50, 25, 25 };
        g.setColor(Color.black);
        g.drawPolygon(tabX, tabY, 3);
        g.setColor(Color.cyan);
        g.fillPolygon(tabX, tabY, 3);
        // wycinek koła
        g.setColor(Color.gray);
        g.fillArc(150, 150, 50, 50, 0, 255);
        // wyrysować określony napis w odpowiednim położeniu
        g.setColor(Color.black);
        g.drawString("Hello world!", 26, 176);
        g.setColor(Color.orange);
        g.drawString("Hello world!", 25, 175);
    }

    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }
}
