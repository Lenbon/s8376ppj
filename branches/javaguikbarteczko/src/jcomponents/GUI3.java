package jcomponents;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static java.awt.Color.*;

public class GUI3 extends JFrame implements ActionListener {

    String[] ctab = { "Red", "Yellow", "Blue" };
    Color[] color = { RED, YELLOW, BLUE };

    public GUI3() {
        super("GUI");
        setLayout(new FlowLayout());

        for (int i = 0; i < ctab.length; i++) {
            JButton b = new JButton(ctab[i]);
            b.setActionCommand("" + i);
            b.addActionListener(this);
            add(b);
        }
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int index = Integer.parseInt(e.getActionCommand());
        getContentPane().setBackground(color[index]);
    }

    public static void main(String[] a) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUI3();
            }
        });
    }
}
