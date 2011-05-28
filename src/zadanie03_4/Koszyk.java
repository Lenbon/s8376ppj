package zadanie03_4;

import java.util.ArrayList;

public class Koszyk {
    protected ArrayList<Product> storage;

    public Koszyk() {
        storage = new ArrayList<Product>();
    }

    public Koszyk add(Product product) {
        storage.add(product);
        return this;
    }

    public ArrayList<Product> getStorage() {
        return storage;
    }

    public Koszyk showContent() {
        System.out.println(toString());
        return this;
    }

    public String toString() {
        String output = "Zawartość koszyka:\n";

        for (Product val : storage) {
            output += val.getName() + " " + val.getQuanity() + " kg\n";
        }

        return output;
    }
}
