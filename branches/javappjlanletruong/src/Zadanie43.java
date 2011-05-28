import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

/**
 * Zadanie 43
 * 
 * Leksemy to ciągi znaków rozdzielone znakami spacji.
 * 
 * Napisz program, który kopiuje z pliku input.txt do output1.txt wszystkie
 * leksemy będące liczbami całkowitymi (typu int) i podaje ich sumę na konsolę.
 * Następnie program zapisuje pozostałe leksemy wraz z liczbą wystąpień każdego
 * z nich do pliku output2.txt.
 *  
 * @author s8376
 * @version $Revision$
 */
public class Zadanie43 {
    public static void main(String[] args) {
        String fileIn = "files/zadanie43In.txt";
        String fileOut1 = "files/zadanie43Out1.txt";
        String fileOut2 = "files/zadanie43Out2.txt";

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int sum = 0;
        String row;

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileIn));
            BufferedWriter bw1 = new BufferedWriter(new FileWriter(fileOut1));

            while ((row = br.readLine()) != null) {
                for (String val : row.split(" +")) {
                    if (val.matches("\\d+")) {
                        bw1.write(val);
                        sum += Integer.parseInt(val);
                        bw1.newLine();
                    } else {
                        if (map.containsKey(val)) {
                            map.put(val, map.get(val) + 1);
                        } else {
                            map.put(val, 1);
                        }
                    }
                }
            }

            br.close();
            bw1.close();

            BufferedWriter bw2 = new BufferedWriter(new FileWriter(fileOut2));

            for (String val : map.keySet()) {
                bw2.write(val + " " + map.get(val));
                bw2.newLine();
            }

            bw2.close();

            System.out.println("Suma wystąpień leksemów typu int: " + sum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
