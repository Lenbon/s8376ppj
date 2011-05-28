import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * Zadanie 42
 * 
 * Otwórz plik tekstowy tak, aby móc go odczytywać wiersz po wierszu. Odczytuj
 * wszystkie wiersze i umieszczaj je w pliku wyjściowym w odwrotnym porządku.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie42 {
    public static void main(String[] args) {
        String fileIn = "files/zadanie42In.txt";
        String fileOut = "files/zadanie42Out.txt";
        String line;
        ArrayList<String> list = new ArrayList<String>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileIn));
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut));

            while ((line = br.readLine()) != null) {
                list.add(line);
            }

            for (int x = list.size() - 1; x >= 0; x--) {
                System.out.println("" + x + " " + list.get(x));
                bw.write(list.get(x));
                bw.newLine();
            }

            br.close();
            bw.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
