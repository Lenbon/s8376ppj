package zadanie08_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.ImageIcon;

/**
 * BookstoreModel
 * 
 * @author      s8376
 * @version     $Id$
 */
public class BookstoreModel {

    private String path;

    public BookstoreModel(String path) {
        this.path = path;
    }

    public Object[] getData() {

        Object[] result = null;

        try {
            String line;
            BufferedReader br = new BufferedReader(new FileReader(path));

            ArrayList<String> storage = new ArrayList<String>();

            while ((line = br.readLine()) != null) {
                if (line.length() > 0) {
                    storage.add(line);
                }
            }

            br.close();

            result = new Object[storage.size()];
            String[] row;

            for (int x = 0; x < storage.size(); x++) {
                row = storage.get(x).split("[|]");
                result[x] = new Book((int) Integer.parseInt(row[0]), row[1],
                        row[2], row[3], (float) Float.parseFloat(row[4]),
                        new ImageIcon(row[5]));
            }
        } catch (Exception e) {
            System.err.println(e.toString());
            System.exit(1);
        }

        return result;
    }
}
