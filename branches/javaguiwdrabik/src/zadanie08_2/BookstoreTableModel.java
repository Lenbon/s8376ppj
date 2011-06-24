package zadanie08_2;

import javax.swing.table.AbstractTableModel;

/**
 * BookstoreTableModel
 * 
 * @author      s8376
 * @version     $Id$
 */
public class BookstoreTableModel extends AbstractTableModel {

    private final static int ID_IDX = 0;
    private final static int AUTHOR_IDX = 1;
    private final static int TITLE_IDX = 2;
    private final static int PUBLISHINGHOUSE_IDX = 3;
    private final static int PRICE_IDX = 4;
    private final static int FRONTPAGE_IDX = 5;

    private final static String[] columnNames = { "ID", "Autora", "Tytuł",
            "Wydawnictwo", "Cena", "Strona tytułowa" };
    private Object[] products;

    public BookstoreTableModel(String pathToStorageFile) {

        try {
            addTableModelListener(new BookstoreTableModelListener());

            BookstoreModel model = new BookstoreModel(pathToStorageFile);
            products = model.getData();
        } catch (Exception e) {
            System.err.println(e.toString());
            System.exit(1);
        }
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public int getRowCount() {
        return products.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        if (products == null)
            return null;

        Book book = (Book) products[rowIndex];

        switch (columnIndex) {
        case ID_IDX:
            return book.getId();
        case AUTHOR_IDX:
            return book.getAuthorName();
        case FRONTPAGE_IDX:
            return book.getFrontpageImage();
        case PRICE_IDX:
            return book.getPrice();
        case PUBLISHINGHOUSE_IDX:
            return book.getPublishingHouse();
        case TITLE_IDX:
            return book.getTitle();
        }

        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
}
