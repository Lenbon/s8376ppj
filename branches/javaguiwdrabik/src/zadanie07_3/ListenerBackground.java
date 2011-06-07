package zadanie07_3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JTextArea;

/**
 * ListenerBackground
 * 
 * @author s8376
 * @version $Id$
 */
public class ListenerBackground implements ActionListener {
    protected JTextArea handler;

    public ListenerBackground(JTextArea handler) {
        this.handler = handler;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem item = (JMenuItem) e.getSource();
        MyIcon icon = (MyIcon) item.getIcon();
        handler.setBackground(icon.getColor());
    }
}
