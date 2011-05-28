import zadanie04.*;

/**
 * Zadanie 5 (3p)
 * 
 * Zaprojektować klasę abstrakcyjną Figura oraz klasy Kolo, Prostokat:
 * 
 * Klasa abstrakcyjna Figura:
 * Pola:        protected int x, y;                                                        // położenie figury
 * protected String fig = "Jeszcze nie wiadomo";              // nazwa figury z wartością początkową
 * Konstruktor: public Figura(int x, int y)                                        // konstruowanie figury na podstawie podanego położenia
 * Metoda: public void pokaz()                                                      //  wypisuje nazwę figury i położenie
 * Metoda abstrakcyjna: public abstract void pozycja(int x, int y)  //  wypisuje komunikat, czy punkt (x, y) znajduje się wewnątrz figury
 * 
 * Klasy Kolo, Prostokat rozszerzają klasę Figura:
 * 
 * Kolo:
 * Dodatkowe pole: private int promien;
 * Konstruktor: public Kolo(int x, int y, int r)                                              // konstruowanie koła o środku w punkcie (x, y) i  promieniu r
 * Implementacja metody abstrakcyjnej: public void pozycja(int x, int y)
 * Przedefiniowanie metody: public void pokaz()                                      // wypisuje dodatkowo promień koła
 * 
 * Prostokat:
 * Dodatkowe pola: private int szer, wys;                           // szerokość i wysokość prostokąta
 * Konstruktor: public Prostokat(int x, int y, int s, int w)     // konstruowanie prostokąta (o bokach równoległych do osi układu współrzędnych)
 *                                                                                        // z podanym położeniem lewego górnego wierzchołka (x, y), szerokością s, wysokością w
 * Implementacja metody abstrakcyjnej: public void pozycja(int x, int y)
 * Przedefiniowanie metody: public void pokaz()              // wypisuje dodatkowo parametry szer, wys
 * Stworzyć w/w klasy w taki sposób, aby następujący program
 * 
 * public class TestFigur {
 *    
 *     public static void main(String[] args)
 *     {       
 *         Figura fig[] = new Figura[2];
 *         fig[0] = new Kolo(200, 200, 50);
 *         fig[1] = new Prostokat(200, 200, 50, 50);
 *        
 *             // polimorficzne wywołanie metody pokaz() z klas Kolo/Prostokat,
 *             // a nie z klasy Figura
 *         for (Figura f : fig){
 *             f.pokaz();
 *             System.out.println();
 *         }
 *        
 *         fig[0].pozycja(200, 200);                     
 *         fig[1].pozycja(210, 300);
 *        
 *     }
 * }
 * 
 * wyprowadził na konsolę poniższe wyniki:
 * Kolo
 * Srodek - (200, 200)
 * Promien - 50
 * 
 * Prostokat
 * Lewy gorny - (200, 200)
 * Szerokosc: 50, Wysokosc: 50
 * 
 * Punkt (200, 200) znajduje sie wewnatrz kola
 * 
 * Punkt (210, 300) znajduje sie na zewnatrz prostokata
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie04 {
    public static void main(String[] args) {
        Figura fig[] = new Figura[2];
        fig[0] = new Kolo(200, 200, 50);
        fig[1] = new Prostokat(200, 200, 50, 50);

        // polimorficzne wywołanie metody pokaz() z klas Kolo/Prostokat,
        // a nie z klasy Figura
        for (Figura f : fig) {
            f.pokaz();
            System.out.println();
        }

        fig[0].pozycja(200, 200);
        fig[1].pozycja(210, 300);
    }
}
