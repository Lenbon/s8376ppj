package zadanie03_2;

public class Pracownik extends Osoba{
	private String zawod;
	private double pensja;
	public Pracownik() {
		super();
		zawod = "dummy";
		pensja = 0.0;
	}
	public Pracownik(String imie, String nazwisko, int wiek, String zawod, double pensja) {
		super(imie, nazwisko, wiek);
		this.zawod = zawod;
		this.pensja = pensja;
	}
	public String getZawod() {
		return zawod;
	}
	public double getPensja() {
		return pensja;
	}
	public void show() {
		super.show();
	}
	public String toString() {
		return super.toString() + " " + getZawod() + " " + getPensja();
	}
}
