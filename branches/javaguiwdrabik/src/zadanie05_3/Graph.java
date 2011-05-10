package zadanie05_3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class Graph extends JPanel {
    Image img;
    boolean loaded = false;

    public Graph(String fileName) {
        loadImage(fileName);
        setPreferredSize(new Dimension(img.getWidth(this) + img.getHeight(this)
                / 2, img.getHeight(this) + img.getHeight(this) / 2));
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
        } else {
            setPreferredSize(new Dimension(200, 200));
        }
    }

    public void paintComponent(Graphics gs) {
        super.paintComponent(gs);
        
        Graphics2D g = (Graphics2D) gs;
        
        
        if (img != null && loaded) {
            g.drawImage(img, img.getWidth(this) / 4, img.getHeight(this) / 4,
                    img.getWidth(this), img.getHeight(this), this);

            int brushSize = img.getWidth(this) / 10;
            if (brushSize <= 0) {
                brushSize = 1;
            }

            
//            g.setStroke(TWO_PIXEL_STROKE);
            g.setColor(Color.black);
            g.drawRect(0, 0, img.getWidth(this) + img.getWidth(this) / 2 - brushSize, img.getHeight(this) + img.getHeight(this) / 2 - brushSize);
            
            String imageTitle = "Hello world!";
            int imageTitleX = this.getWidth() / 2 - g.getFontMetrics().stringWidth(imageTitle) / 2,
                imageTitleY = 10;

            g.setColor(Color.gray);
            g.drawString(imageTitle, imageTitleX + 1, imageTitleY + 1);
            g.setColor(Color.black);
            g.drawString(imageTitle, imageTitleX, imageTitleY);
        }
    }
}
