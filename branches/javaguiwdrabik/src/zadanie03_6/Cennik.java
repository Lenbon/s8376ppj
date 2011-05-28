package zadanie03_6;

import java.util.Hashtable;

public final class Cennik {
    private final static Cennik instance = new Cennik();
    protected Hashtable<String, Double> tariff;

    private Cennik() {
        tariff = new Hashtable<String, Double>();
    }

    public static Cennik getCennik() {
        return instance;
    }

    public double getPrice(String name) {
        return tariff.get(name);
    }

    public boolean hasPrice(String name) {
        return tariff.containsKey(name) ? true : false;
    }

    public Cennik set(String name, double price) {
        tariff.put(name, (Double) price);
        return this;
    }
}
