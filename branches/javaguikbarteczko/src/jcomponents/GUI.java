package jcomponents;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

class GUI extends JFrame {

    MouseListener handler = new MouseAdapter() {
        public void mousePressed(MouseEvent e) {
            System.out.println("Myszka wciśnięta!");
        }
    };

    GUI() {
        JButton b = new JButton("Przycisk");
        b.addMouseListener(handler);
        add(b);
        pack();
        show();
    }

    public static void main(String[] a) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUI();
            }
        });
    }
}
