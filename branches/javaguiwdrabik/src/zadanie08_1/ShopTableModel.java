package zadanie08_1;

import javax.swing.table.AbstractTableModel;

/**
 * ShopTableModel
 * 
 * @author      s8376
 * @version     $Id$
 */
public class ShopTableModel extends AbstractTableModel {

    public final static int ID_IDX = 0;
    public final static int NAME_IDX = 1;
    public final static int PRODUCER_IDX = 2;
    public final static int PRICE_IDX = 3;

    public final static String ID_NAME = "Numer porządkowy";
    public final static String NAME_NAME = "Nazwa towaru";
    public final static String PRODUCER_NAME = "Producent";
    public final static String PRICE_NAME = "Cena";

    private final static String[] columnNames = { ID_NAME, NAME_NAME,
            PRODUCER_NAME, PRICE_NAME };
    private String[][] products = { { null, "Proszek do prania", "Ajax", "4" },
            { null, "Kawa mielona", "Java", "8" },
            { null, "Pasta do butów", "Polish", "3" },
            { null, "Spinacz biurowy", "Biurex", "1" },
            { null, "Ołówek", "Biurex", "1" },
            { null, "Grzebień", "Badzieweks", "1" },
            { null, "Szczoteczka do zębów", "Badzieweks", "2" },
            { null, "Pani domu", "Wydawnictwo ABC", "5" },
            { null, "Gotowanie", "Wydawnictwo ABC", "4" },
            { null, "Horoskopy", "Wydawnictwo ABC", "4" } };

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column].toString();
    }

    @Override
    public int getRowCount() {

        if (products == null)
            return 0;
        return products.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return columnIndex == ID_IDX ? rowIndex + 1
                : products[rowIndex][columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == PRICE_IDX ? true : false;
    }
}
