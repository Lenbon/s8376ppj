package zadanie08_1;

import javax.swing.table.AbstractTableModel;

/**
 * ShopTableModel
 * 
 * @author      s8376
 * @version     $Id$
 */
public class ShopTableModel extends AbstractTableModel {
    private final static String[] columnNames = { "Numer porządkowy",
            "Nazwa towaru", "Producent", "Cena" };
    private Object[][] products = { { 1, "Proszek do prania", "Ajax", 4.5 },
            { 2, "Kawa mielona", "Java", 8.0 },
            { 3, "Pasta do butów", "Polish", 3.2 },
            { 4, "Spinacz biurowy", "Biurex", 1.35 },
            { 5, "Ołówek", "Biurex", 0.3 },
            { 6, "Grzebień", "Badzieweks", 0.5 },
            { 7, "Szczoteczka do zębów", "Badzieweks", 2.5 },
            { 8, "Pani domu", "Wydawnictwo ABC", 5.0 },
            { 9, "Gotowanie", "Wydawnictwo ABC", 4.5 },
            { 10, "Horoskopy", "Wydawnictwo ABC", 4.5 } };

    private final static int ID_IDX = 0;
    private final static int NAME_IDX = 1;
    private final static int PRODUCER_IDX = 2;
    private final static int PRICE_IDX = 3;

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

        return products[rowIndex][columnIndex];
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == PRICE_IDX ? true : false;
    }

}
