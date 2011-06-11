package jcomponents;

import java.awt.*; // dla FlowLayout
import java.awt.event.*; // dla zdarzenie akcji
import javax.swing.*; //  dla Swingu (JFrame. JButton)

class GUIb extends JFrame {
    final int BNUM = 3; // liczba przycisków

    GUIb() {
        super("GUI");
        setLayout(new FlowLayout());
        for (int i = 1; i <= BNUM; i++) {
            JButton b = new JButton("Przycisk " + i);
            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Wystąpiło zdarzenie!");
                }
            });
            add(b);
        }
        pack();
        show();
    }

    public static void main(String[] a) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUIb();
            }
        });
    }

}
