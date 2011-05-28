/**
 * Zadanie 10
 * 
 * Napisać program, który pobiera 3-cyfrową liczbę naturalną i wyprowadza cyfry
 * tej liczby w odwrotnej kolejności (np. 123->321). Dane wejściowe podać w
 * inicjacji odpowiedniej zmiennej (typu int) w programie.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie10 {
    public static void main(String[] args) {
        int number = 907;
        System.out.println("Wynik: in " + number + "; out " + (number % 10)
                + ((number % 100) / 10) + (number / 100));
    }
}
