package zadanie03_2;

public class Osoba {
	private String imie;
	private String nazwisko;
	private int wiek;
	public Osoba() {
		this("dummy", "dummy", 0);
	}
	public Osoba(String imie, String nazwisko, int wiek) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
	}
	public String getImie() {
		return imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public int getWiek() {
		return wiek;
	}
	public void show() {
		System.out.println(toString());
	}
	public String toString() {
		return getImie() + " " + getNazwisko() + " " + getWiek();
	}
}
