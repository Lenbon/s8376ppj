package jcomponents;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI2 extends JFrame implements ActionListener {

    public GUI2() {
        super("GUI");
        setLayout(new FlowLayout());
        String[] ctab = { "Red", "Yellow", "Blue" };
        for (String txt : ctab) {
            JButton b = new JButton(txt);
            b.addActionListener(this);
            add(b);
        }
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        Color c = Color.white;
        if (cmd.equals("Red"))
            c = Color.red;
        else if (cmd.equals("Yellow"))
            c = Color.yellow;
        else if (cmd.equals("Blue"))
            c = Color.blue;
        getContentPane().setBackground(c);
    }

    public static void main(String[] a) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUI2();
            }
        });
    }
}
