/**
 * Zadanie 2
 * 
 * Opracować algorytm, który oblicza liczbę rozwiązań równania z podanymi
 * współczynnikami: ax2 + bx + c = 0. Przedstawić go w postaci schematu
 * blokowego oraz w pseudo-kodzie.
 * 
 * http://pl.wikibooks.org/wiki/Matematyka_dla_liceum/Funkcja_kwadratowa/R%C3%B3wnania_kwadratowe
 * http://www.pierwiastek.pl/rownania/rozwiazywanie-rownania-kwadratowego.html
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 8;
        int c = 12;
        int delta = b * b - 4 * a * c;
        if (delta > 0) {
            System.out.println("Wynik: funkcja ma dwa rozwiązania");
        } else if (delta == 0) {
            System.out.println("Wynik: funkcja ma jedno rozwiązanie");
        } else {
            System.out
                    .println("Wynik: funkcja nie ma rozwiazania (w zbiorze liczb rzeczywistych)");
        }
    }
}
