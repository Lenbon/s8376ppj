
import zadanie01.*;

/**
 * Zadanie 1
 * (3p)
 * 
 * Zaprojektować i testować klasę Wielomian reprezentującą wielomiany zmiennej x.
 * Tworząc nowy wielomian użytkownik podaje w konstruktorze argumenty będące współczynnikami wielomianu (od najniższego rzędu potęgi x), przy czym ilość argumentów może być dowolną liczbą naturalną dodatnią.
 * 
 * Stworzyć w/w klasę w taki sposób, aby następujący program:
 * 
 * Wielomian w1=new Wielomian(3,1,4);
 * System.out.println(w1);                             // wyświetlenie reprezentacji tekstowej obiektu-wielomianu w1
 * 
 * Wielomian w2=new Wielomian(-4,0,5,0,2);
 * System.out.println(w2);                          
 * 
 * System.out.println(w1.dodaj(w2));           // metoda dodaj(...) zwraca nowy obiekt-wielomian będący sumą dwóch wielomianów
 * 
 * System.out.println(w1.mnoz(w2));            // metoda mnoz(...) zwraca nowy obiekt-wielomian będący iloczynem dwóch wielomianów
 * 
 * System.out.println(w1.wartosc(1));          // wywołanie metody wartosc(...) zwraca wartość wielomianu w1 dla podanej wartości zmiennej x=1
 * System.out.println(w2.wartosc(0));         
 * 
 * wyprowadził na konsolę poniższe wyniki:
 * 
 * 4x^2+x+3
 * 
 * 2x^4+5x^2-4
 * 
 * 2x^4+9x^2+x-1
 * 
 * 8x^6+2x^5+26x^4+5x^3-x^2-4x-12
 * 
 * 8
 * 
 * -4
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie01 {

    public static void main(String[] args) {
        Wielomian w1 = new Wielomian(3, 1, 4);
        System.out.println(w1);                             // wyświetlenie reprezentacji tekstowej obiektu-wielomianu w1

        Wielomian w2 = new Wielomian(-4, 0, 5, 0, 2);
        System.out.println(w2);

        System.out.println(w1.dodaj(w2));           // metoda dodaj(...) zwraca nowy obiekt-wielomian będący sumą dwóch wielomianów

        System.out.println(w1.mnoz(w2));            // metoda mnoz(...) zwraca nowy obiekt-wielomian będący iloczynem dwóch wielomianów

        System.out.println(w1.wartosc(1));          // wywołanie metody wartosc(...) zwraca wartość wielomianu w1 dla podanej wartości zmiennej x=1
        System.out.println(w2.wartosc(0));
    }
}
