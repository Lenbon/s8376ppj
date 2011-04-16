package zadanie01;

public class Wielomian {

    protected int[] params;

    public Wielomian(int... params) {
        this.params = params;
    }

    /**
     * metoda dodaj(...) zwraca nowy obiekt-wielomian będący sumą dwóch wielomianów
     *
     * @param Wielomian w
     * @return Wielomian
     */
    public Wielomian dodaj(Wielomian w) {
        int[] newArray;
        if (params.length > w.params.length) {
            newArray = new int[params.length];
        } else {
            newArray = new int[w.params.length];
        }

        for (int x = 0; x < params.length; x++) {
            newArray[x] = params[x];
        }
        for (int x = 0; x < w.params.length; x++) {
            newArray[x] += w.params[x];
        }
        return new Wielomian(newArray);
    }

    /**
     * metoda mnoz(...) zwraca nowy obiekt-wielomian będący iloczynem dwóch wielomianów
     *
     * @param Wielomian w
     * @return Wielomian
     */
    public Wielomian mnoz(Wielomian w) {
        int[] newArray = {};

        // TODO

        return new Wielomian(newArray);
    }

    @Override
    public String toString() {
        String output = "", element = "";
        int length = params.length;

        for (int x = 0; x < length; x++) {
            if (params[x] != 0) {
                element = "";
                if (params[x] > 0 && x != length - 1) {
                    element += "+";
                }
                if (params[x] != 1) {
                    element += params[x];
                }
                if (x != 0) {
                    element += "x";
                    if (x != 1) {
                        element += "^" + x;
                    }
                }
                output = element + output;
            }
        }

        return output;
    }

    /**
     * wywołanie metody wartosc(...) zwraca wartość wielomianu w1 dla podanej wartości zmiennej x=1
     */
    public String wartosc(int x) {
        return "";
    }
}
