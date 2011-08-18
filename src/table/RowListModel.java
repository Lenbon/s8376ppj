package table;

import java.util.*;
import javax.swing.table.*;

public abstract class RowListModel<E> extends AbstractTableModel {

    private List<String> colNames;
    private List<E> rows;

    public RowListModel(List<E> elist, String[] cols) {
        rows = new ArrayList<E>(elist);
        colNames = Arrays.asList(cols);
    }

    @Override
    public int getColumnCount() {
        return colNames.size();
    }

    @Override
    public int getRowCount() {
        return rows.size();
    }

    @Override
    public String getColumnName(int column) {
        return colNames.get(column);
    }

    @Override
    public Class<?> getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    public E getRow(int r) {
        return rows.get(r);
    }

    public void addRow(E newVal) {
        rows.add(newVal);
        this.fireTableDataChanged();
    }

}
