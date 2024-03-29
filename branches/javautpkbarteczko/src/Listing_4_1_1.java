import dynload.*;
import javax.swing.*;

class Listing_4_1_1 extends JFrame
{
    static void exit(String s)
    {
        System.out.println(s);
        System.exit(1);
    }

    Listing_4_1_1(String actionClassName)
    {
        Class actionClass = null;
        Action act = null;
        try {
            actionClass = Class.forName(actionClassName);
            act = (Action) actionClass.newInstance();
        } catch (Exception exc) {
            exit("Obiekt klasy akcji nie może być utworzony");
        }

        JButton b = new JButton();
        b.setAction(act);
        add(b);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String args[])
    {
        final String in = JOptionPane.showInputDialog("Podaj nazwę klasy:");
        if (in != null) {
            SwingUtilities.invokeLater(new Runnable()
            {
                public void run()
                {
                    new Listing_4_1_1(in);
                }
            });

        }
    }

}
