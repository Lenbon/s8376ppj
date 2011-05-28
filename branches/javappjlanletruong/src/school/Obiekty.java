package school;

// publiczna klasa testuj¹ca
public class Obiekty {

    // funkcja g³ówna
    public static void main(String[] args) {
        Osoba o1 = new Osoba("Kowalska", 20);
        Osoba o2 = new Osoba();

        System.out.println(o1.wiek); // 20

        // System.out.println(o2.nazwisko); // B³¹d
        System.out.println(o2.dajNazwisko()); // Nowak

        o2.ustawWiek(30);

        o2.pokaz(); // "Osoba (Nowak,30)"
        System.out.println(o2); // "Osoba (Nowak,30)"

        System.out.println("Ró¿nica wieku " + o1.dajNazwisko() + " i "
                + o2.dajNazwisko() + " to: " + o2.roznicaWieku(o1)); // Ró¿nica
        // wieku
        // Kowalska
        // i
        // Nowak
        // to:
        // 10

        o1.mlodsza(o2).pokaz(); // Osoba (Kowalska,20)
    }

} // koniec klasy Obiekty

// klasa zewnêtrzna Osoba
class Osoba {

    // deklaracje pól (zmiennych) obiektowych
    private String nazwisko;
    int wiek;

    // konstruktor 1
    public Osoba(String nazw, int w) {
        nazwisko = nazw; // this.nazwisko
        wiek = w; // this.wiek
    }

    // konstruktor 2
    public Osoba() {
        nazwisko = "Nowak"; // this.nazwisko
        wiek = 1; // this.wiek
        // this("Nowak", 1);
    }

    // metoda zwracaj¹ca nazwisko danej osoby
    public String dajNazwisko() {
        return nazwisko; // this.nazwisko
    }

    // metoda zwracaj¹ca wiek danej osoby
    public int dajWiek() {
        return wiek; // this.wiek
    }

    // metoda ustalaj¹ca nazwisko
    public void ustawNazwisko(String nazw) {
        nazwisko = nazw; // this.nazwisko
    }

    // metoda ustalaj¹ca wiek
    public void ustawWiek(int w) {
        wiek = w; // this.wiek
    }

    // metoda zwracaj¹ca ró¿nicê wieku 2 osób
    public int roznicaWieku(Osoba o) {
        int roznica = wiek - o.wiek; // this.wiek - o.wiek
        return roznica;
    }

    // metoda zwracaj¹ca m³odsz¹ osobê z 2 osób
    public Osoba mlodsza(Osoba os) {
        if (roznicaWieku(os) < 0)
            return this;
        else
            return os;

    }

    // metoda pokazuj¹ca informacje o danej osobie
    public void pokaz() {
        System.out.println("Osoba (" + nazwisko + "," + wiek + ")");
    }

    // reprezentacja tekstowa
    public String toString() {
        return ("Osoba (" + nazwisko + "," + wiek + ")");
    }

} // koniec klasy Osoba
