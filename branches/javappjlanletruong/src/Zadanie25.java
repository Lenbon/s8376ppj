import school.Circle;
import school.Point;

/**
 * Zadanie 25
 * 
 * Dodefiniować następujące konstrukcje klasy Circle z zadania 24 i
 * przetestować:
 * 
 * Pole statyczne: static int ilosc - ilość tworzonych kół do chwili obecnej
 * Metoda statyczna: static int dajIlosc() - zwraca liczbę tworzonych kół do
 * chwili obecnej
 * 
 * Pole niestatyczne: int nr - numer danego koła Metoda niestatyczna: int
 * dajNr() - zwraca numer danego koła.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie25 {
    public static void main(String[] args) {
        Circle c1 = new Circle(new Point(1, 1), 5);
        System.out.println("To jest koło nr." + c1.dajNr() + " z ilości "
                + Circle.dajIlosc());

        Circle c2 = new Circle(new Point(2, 2), 5);
        System.out.println("To jest koło nr." + c2.dajNr() + " z ilości "
                + Circle.dajIlosc());

        Circle c3 = new Circle(new Point(3, 3), 5);
        System.out.println("To jest koło nr." + c3.dajNr() + " z ilości "
                + Circle.dajIlosc());

        Circle c4 = new Circle(new Point(4, 4), 5);
        System.out.println("To jest koło nr." + c4.dajNr() + " z ilości "
                + Circle.dajIlosc());

        Circle c5 = new Circle(new Point(5, 5), 5);
        System.out.println("To jest koło nr." + c5.dajNr() + " z ilości "
                + Circle.dajIlosc());

        System.out.println("------");

        // powtorne odpytanie kola nr. 3
        System.out.println("To jest koło nr." + c3.dajNr() + " z ilości "
                + Circle.dajIlosc());
    }
}
