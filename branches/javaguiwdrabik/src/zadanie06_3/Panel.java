package zadanie06_3;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JPanel;

/**
 * Panel
 * 
 * @author s8376
 * @version $Id$
 */
public class Panel extends JPanel implements Runnable {
    int index = 0, maxIndex = 0;
    Image[] images;
    Image img;

    public Panel(String path, ArrayList<File> list) {
        super();

        maxIndex = list.size();
        images = new Image[maxIndex];

        int x = 0;
        for (File file : list) {
            loadImage(path + file.getName(), x);
            x++;
        }
    }

    private void loadImage(String imgFileName, int index) {
        img = Toolkit.getDefaultToolkit().getImage(imgFileName);
        MediaTracker mt = new MediaTracker(this);
        mt.addImage(img, 1);
        try {
            mt.waitForID(1);
        } catch (InterruptedException exc) {
        }

        images[index] = img;
    }

    public void paintComponent(Graphics g) {
        if (images[index] != null) {
            g.drawImage(images[index], 0, 0, 200, 130, this);
        }

        if (index + 1 >= maxIndex) {
            index = 0;
        } else {
            index++;
        }
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);
                repaint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
