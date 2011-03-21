package zadanie03_3;

abstract public class Figura {
	private String nazwa; //nazwa figury
	protected double[] wymiary; //wymiary figury
	protected String[] opisWym;  // opis wymiarów
	public Figura(String nazwa, double[] wymiary, String[] opisWym) {
		this.nazwa = nazwa;
		this.wymiary = wymiary;
		this.opisWym = opisWym;
	}
	/**
	 * metoda abstrakcyjna-oblicza pole figury
	 */
	abstract public double podajPole();
	/**
	 * metoda abstrakcyjna - oblicza obwod figury
	 */
	abstract public double podajObwod();
	public void show() {
		System.out.println(toString());
	}
	public String toString() {
		String output = "Nazwa figury: " + nazwa + "\n";
		
		for (int x = 0; x < wymiary.length; x++) {
			output += opisWym[x] + ": " + wymiary[x] + "\n"; 
		}

		return output += "pole= " + podajPole() + "\n"+
			"obwod= " + podajObwod();
	}
}
