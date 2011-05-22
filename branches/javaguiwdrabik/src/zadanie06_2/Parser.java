package zadanie06_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

/**
 * Parser
 * 
 * @author s8376
 * @version $Id$
 */
public class Parser {
    HashMap<Character, Integer> container = null;
    String file;

    public Parser(String file) {
        this.file = file;
    }

    HashMap<Character, Integer> getData() throws Exception {
        if (container == null) {
            loadData(file);
        }
        return container;
    }

    void loadData(String file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            container = new HashMap<Character, Integer>();

            while ((line = br.readLine()) != null) {
                for (char val : line.toCharArray()) {
                    if ((int) val != 32) { // jesli nie jest spacja
                        if (container.containsKey((Character) val)) {
                            container.put((Character) val, container
                                    .get((Character) val) + 1);
                        } else {
                            container.put((Character) val, 1);
                        }
                    }
                }
            }

            br.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
