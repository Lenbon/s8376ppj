package jcomponents;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI1 extends JFrame {
    public GUI1() {
        super("GUI - 2");
        final Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        JButton b = new JButton("Red");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cp.setBackground(Color.red);
            }
        });
        cp.add(b);

        b = new JButton("Yellow");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cp.setBackground(Color.yellow);
            }
        });
        cp.add(b);

        b = new JButton("Blue");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cp.setBackground(Color.blue);
            }
        });
        cp.add(b);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] a) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUI1();
            }
        });
    }
}
