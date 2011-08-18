package table;

import java.io.Serializable;

public class Address implements Serializable, Comparable<Address> {

    private String town;
    private String street;
    private int nr;

    public Address(String town, String street, int nr) {
        this.town = town;
        this.street = street;
        this.nr = nr;
    }

    // gettery i settery (dla wszystkich pól)
    // na przykład:
    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    // ...

    // Ważna metoda toString()! 
    public String toString() {
        return town + "; " + street + "; " + nr;
    }

    // Naturalny porządek
    public int compareTo(Address a) {
        int r = town.compareTo(a.town);
        if (r == 0)
            r = street.compareTo(a.street);
        if (r == 0)
            r = nr - a.nr;
        return r;
    }

}
