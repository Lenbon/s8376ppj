package zadanie08_2;

import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 * BookTable
 * 
 * @author s8376
 * @version $Id$
 */
public class BookTable extends JTable {

    BookPriceRenederer priceCellRenderer = new BookPriceRenederer(false);

    public BookTable(BookstoreTableModel bookstoreTableModel) {
        super(bookstoreTableModel);
    }

    public TableCellRenderer getCellRenderer(int row, int column) {

        if (column == 4) {
            return (TableCellRenderer) priceCellRenderer;
        }

        return super.getCellRenderer(row, column);
    }
}
