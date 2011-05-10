package zadanie05_3;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class Graph extends JPanel {
    Image img;
    boolean loaded = false;

    public Graph(String fileName) {
        // TODO Auto-generated constructor stub
//        loadImage(fileName);
    }

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

    }
}
