package zadanie08_2;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class BookPriceRenederer extends JLabel implements TableCellRenderer {

    boolean isBordered;

    public BookPriceRenederer(boolean isBordered) {

        this.isBordered = isBordered;
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object color,
            boolean isSelected, boolean hasFocus, int row, int column) {

        setForeground(Color.RED);
        setBackground(Color.YELLOW);

        return this;
    }
}
