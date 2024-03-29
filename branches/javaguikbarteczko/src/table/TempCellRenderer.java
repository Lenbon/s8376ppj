package table;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class TempCellRenderer implements TableCellRenderer {
    
    JPanel p = new JPanel();
    JLabel l = new JLabel();

    TempCellRenderer(int mies) {
        l.setFont(new Font("Dialog", Font.BOLD, 18));
        l.setBorder(BorderFactory.createLineBorder(Color.black));
        l.setText("?");
        l.setOpaque(true);
        l.setBackground(Color.yellow);
        p.add(l);
    }

    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {

        if (isSelected) {
            p.setForeground(table.getSelectionForeground());
            p.setBackground(table.getSelectionBackground());
        } else {
            p.setForeground(table.getForeground());
            p.setBackground(table.getBackground());
        }

        if (value != null) {
            int val = ((Integer) value).intValue();
            if (val > 25) {
                l.setBackground(Color.red);
                l.setForeground(Color.yellow);
            } else if (val < 10) {
                l.setBackground(Color.blue);
                l.setForeground(Color.white);
            } else {
                l.setBackground(Color.yellow);
                l.setForeground(Color.black);
            }

            l.setText("" + value);
        } else
            l.setText("?");

        return p;
    }
}
