/**
 * Zadanie 40
 * 
 * Napisać i testować w programie metodę boolean palindrome(String s)
 * sprawdzającą, czy dany łańcuch s jest palindromem.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie40 {
    public static void main(String[] args) {
        String[] list = { "Kobyła ma mały bok.",
                "Ile Roman ładny dyndał na moreli?",
                "Zakopane i cel wieczoru urocze i w lecie na pokaz.",
                "Ot, i psikus - i amok tatko ma i suki spito.",
                "Curabitur et ligula.",
                "Ej, u Reja bogaty dureń. Erudyta go bajeruje.",
                "Matoł i Mela ukrywani na wyrku - ale miło tam.",
                "Ibuli kat Izydor - bokobrody z Itaki lubi.",
                "I za kufrem smerf u Kazi.",
                "Kat Pąk Izydor świni w środy z Iką Ptak.",
                "Vestibulum dapibus, mauris nec malesuada.",
                "Róg, zima do larga, zima mi zagra lodami z gór.",
                "Raz cywil boso mami - mam osobliwy czar.",
                "A na Dwór to łamagi i gama łotrów dana.",
                "U Izydy żądze na wyrku co noc ukrywane, zdąży Dyziu?" };

        for (String s : list) {
            if (palindrome(s)) {
                System.out.println("Ciąg znaków: " + s + "; jest palindromem.");
            } else {
                System.out.println("Ciąg znaków: " + s
                        + "; nie jest palindromem.");
            }
        }
    }

    public static boolean palindrome(String s) {
        s = s.toLowerCase().replaceAll("([ _,;.!?-]+)", "");

        int extra = s.length() % 2 != 0 ? 1 : 0;
        for (int x = 0; x < (int) s.length() / 2 + extra; x++) {
            //			System.out.println(s.charAt(x) + " "  + s.charAt((s.length() - x) - 1));
            if (s.charAt(x) != s.charAt((s.length() - x) - 1)) {
                return false;
            }
        }

        return true;
    }
}
