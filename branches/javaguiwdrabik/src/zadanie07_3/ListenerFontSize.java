package zadanie07_3;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

/**
 * ListenerFontSize
 * 
 * @author s8376
 * @version $Id$
 */
public class ListenerFontSize implements ActionListener {
    protected JTextArea handler;
    protected int fontSize;

    public ListenerFontSize(JTextArea handler, int size) {
        this.handler = handler;
        this.fontSize = size;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        handler.setFont(new Font("Times New Roman", Font.PLAIN, fontSize));
    }
}
