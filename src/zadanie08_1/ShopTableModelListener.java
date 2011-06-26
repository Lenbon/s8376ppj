package zadanie08_1;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

/**
 * ShopTableModelListener
 * 
 * @author      s8376
 * @version     $Id$
 */
public class ShopTableModelListener implements TableModelListener {

    public void tableChanged(TableModelEvent e) {
        
        ShopTableModel model = (ShopTableModel) e.getSource();

        int row = e.getFirstRow();
        int column = e.getColumn();

        System.out.println(e.getType());
        

System.out.println(model.getColumnName(column));
System.out.println(model.getValueAt(row, column));

        

System.out.println(model.getValueAt(row, column));
    }
}
