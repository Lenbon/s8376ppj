package zadanie03_5;

abstract public class Product {
    private String name;
    private double quantity;

    public Product(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getQuanity() {
        return quantity;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public Product setQuanity(double quanity) {
        this.quantity = quanity;
        return this;
    }
}
