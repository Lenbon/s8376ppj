package zadanie03_6;

import java.util.ArrayList;

abstract public class ContainerAbstract {
    protected ArrayList<Product> storage;

    public ContainerAbstract() {
        storage = new ArrayList<Product>();
    }

    public void showContent() {
        String output = "Zawartość pojemnika \"" + toString() + "\" :\n";

        for (Product val : storage) {
            output += val.getName() + " " + val.getQuanity() + " kg\n";
        }

        System.out.println(output);
    }
}
