package zadanie08_2;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 * BookstoreTableModelListener
 * 
 * @author      s8376
 * @version     $Id$
 */
public class BookstoreTableModelListener implements TableModelListener {

    @Override
    public void tableChanged(TableModelEvent e) {

        System.out.println("stuk!");

//        int row = e.getFirstRow();
//        int column = e.getColumn();
//        TableModel model = (TableModel) e.getSource();
//        String columnName = model.getColumnName(column);
//        Object data = model.getValueAt(row, column);
//
//        //...// Do something with the data...

    }
}
