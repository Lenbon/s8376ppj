package zadanie03_3;

public class Kolo extends Figura {
	protected double pi = 3.14;
	public Kolo(int r) {
		super("Kolo", new double[] {(double) r}, new String[] {"promien"});
	}
	public double podajPole() {
		return pi * wymiary[0] * wymiary[0];
	}
	public double podajObwod() {
		return 2.0 * pi * wymiary[0];
	}
}
