package zadanie03_3;

public class Prostokat extends Figura {
    public Prostokat(int x, int y) {
        super("Prostokat", new double[] { (double) x, (double) y },
                new String[] { "dlugosc", "szerokosc" });
    }

    public double podajPole() {
        return wymiary[0] * wymiary[1];
    }

    public double podajObwod() {
        return 2.0 * wymiary[0] + 2.0 * wymiary[1];
    }
}
