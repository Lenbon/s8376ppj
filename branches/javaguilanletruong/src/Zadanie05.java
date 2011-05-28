import zadanie05.*;

/**
 * Zadanie 6 (1p)
 * 
 * (Rozbudować zadanie 5)
 * 
 * Zdefiniować interfejs Obliczenie zawierający metody obliczające pole
 * i obwód figury. Zaimplementować interfejs Obliczenie w klasach Figura,
 * Kolo, Prostokat oraz testować wszystkie metody.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie05 {
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

        fig[0].obwod();
        fig[1].obwod();

        fig[0].pole();
        fig[1].pole();
    }
}
