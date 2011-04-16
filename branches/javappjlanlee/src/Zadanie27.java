import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Zadanie 27
 * 
 * Napisać program, który pobiera z linii wywołania 10 argumentów, umieszcza je
 * we własnej tablicy łańcuchów tekstowych i wypisuje na konsolę ich konkatenację
 * oraz  największy i najmniejszy element tablicy (stosujemy porządek leksykograficzny).
 * Pomoc: Do porównania dwóch łańcuchów tekstowych można skorzystać z  metody compareTo()
 * z klasy String (zob. dokumentację Java):
 * s1.compareTo(s2) zwraca:
 * *     liczbę ujemną, jeżeli łańcuch tekstowy s1 znajduje, według porządku leksykograficznego,
 * przed łańcuchem tekstowym s2;
 * *     liczbę dodatnią, jeżeli s1 znajduje, według porządku leksykograficznym, po s2;
 * *     0, jeśli s1 i s2  są takie same.
 * Np. "ala".compareTo("ale") < 0, "2".compareTo("11") > 0, "java".compareTo("ja"+"va") = 0.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie27 {
    public static void main(String[] args) {
        int counter = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tab = new String[10];

        String concatenation = "";
        String min = "";
        String max = "";

        while (counter < 10) {

            System.out.println("Podaj ciąg znaków (" + (counter + 1) + "): ");
            try {
                tab[counter] = br.readLine();

                concatenation += tab[counter];
                if (counter == 0) {
                    min = max = tab[counter];
                } else {
                    if (tab[counter].compareTo(min) < 0) {
                        min = tab[counter];
                    }
                    if (tab[counter].compareTo(max) > 0) {
                        max = tab[counter];
                    }
                }

                ++counter;
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("min: " + min + "; max: " + max + "; "
                    + concatenation);
        }
    }
}
