package zadanie03_5;

import java.util.ArrayList;

public class Koszyk extends ContainerAbstract {
    public static int counter;

    public Koszyk() {
        super();
        counter++;
    }

    public Koszyk add(Product product) {
        storage.add(product);
        return this;
    }

    public ArrayList<Product> getStorage() {
        return storage;
    }

    public String toString() {
        return "koszyk sklepowy nr." + counter;
    }
}
