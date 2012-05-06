package zadanie7;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Gui
 *
 * @version     $Id$
 */
public class Gui extends JFrame
{
    public JFrame frame;
    public JButton button1;
    public JButton button2;
    public JTextField textField1;
    public JTextField textField2;

    public Gui()
    {
        super();

        frame = new JFrame();

        frame.setTitle("Zadanie 7");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(300, 300);
        frame.setPreferredSize(new Dimension(250, 150));
        frame.setLayout(new GridLayout(2, 2));

        JPanel panel = new JPanel();

        button1 = new JButton("button1");
        panel.add(button1);

        button2 = new JButton("button2");
        panel.add(button2);

        textField1 = new JTextField();
        textField1.setPreferredSize(new Dimension(90, 20));
        panel.add(textField1);

        textField2 = new JTextField();
        textField2.setPreferredSize(new Dimension(90, 20));
        panel.add(textField2);

        frame.getContentPane().add(panel);
    }

    public void setVisible()
    {
        frame.pack();
        frame.setVisible(true);
    }
}
