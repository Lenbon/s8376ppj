import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JOptionPane;

/**
 * Zadanie 44
 * 
 * Napisz program szukający wystąpień słowa w tekstowym pliku wejściowym.
 * Program ma wypisywać na konsolę oraz do pliku wyjściowego:
 * numer wiersza (licząc od 1) pliku wejściowego, w którym występuje szukane
 * słowo oraz ilość jego wystąpień. Słowo oraz plik wejściowy użytkownik podaje
 * z okienka dialogowego.
 *  
 * @author s8376
 * @version $Revision$
 */
public class Zadanie44 {
    public static void main(String[] args) {
        try {
            String filesDir = "files/";
            String output = filesDir + "zadanie44Out.txt";
            String input = JOptionPane.showInputDialog("Podaj nazwę pliku:");
            String word = JOptionPane.showInputDialog("Podaj szukane słowo:");

            //			String input = "zadanie44In.txt";
            //			String word = "DUMMY";

            BufferedReader br = new BufferedReader(new FileReader(filesDir
                    + input));
            BufferedWriter bw = new BufferedWriter(new FileWriter(output));

            boolean wordFound = false;
            int lineNumber = 1;
            int wordCounter = 0;
            int index = 0;
            String headerMessage = "Słowo: " + word, line, lineMessage;

            System.out.println(headerMessage);
            bw.write(headerMessage);
            bw.newLine();

            while ((line = br.readLine()) != null) {
                while ((index = line.indexOf(word, index)) != -1) {
                    if (index != -1) {
                        wordFound = true; // znaleziono co najmniej jedno slowo
                        wordCounter++;
                    }
                    index += word.length();
                }
                if (wordCounter > 0) {
                    lineMessage = "wiersz " + lineNumber + "; wystąpień: "
                            + wordCounter;
                    System.out.println(lineMessage);
                    bw.write(lineMessage);
                    bw.newLine();
                }
                lineNumber++;
                index = 0;
                wordCounter = 0;
            }

            if (wordFound == false) {
                lineMessage = "nie odnaleziono słowa";
                System.out.println(lineMessage);
                bw.write(lineMessage);
            }

            br.close();
            bw.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
