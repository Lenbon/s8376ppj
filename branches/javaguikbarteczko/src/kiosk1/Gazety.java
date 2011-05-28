package kiosk1;

public enum Gazety {
    Głos(1), Polityka(4.5), Gazeta(2.5);
    Gazety(double p) {
        price = p;
    }

    public double getPrice() {
        return price;
    }

    private final double price;
}
