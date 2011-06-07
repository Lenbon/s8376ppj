package zadanie07_3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JTextArea;

/**
 * ListenerForeground
 * 
 * @author s8376
 * @version $Id$
 */
public class ListenerForeground implements ActionListener {
    protected JTextArea handler;

    public ListenerForeground(JTextArea handler) {
        this.handler = handler;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem item = (JMenuItem) e.getSource();
        MyIcon icon = (MyIcon) item.getIcon();
        handler.setForeground(icon.getColor());
    }
}
