package zadanie04_3;

public class Sklep {
	private Kasa kasa;
	public Sklep() {
		// Na poczatku dnia ustalany jest cennik
		// i otwierana jest kasa
		Cennik cennik = Cennik.getCennik();
		cennik.set("Truskawki", 5);
		cennik.set("Banany", 6);
		cennik.set("Agrest", 7);
		kasa = new Kasa();
	}
 
	// tu definicja metody zakupy(....)
	public void zakupy(String owner, Owoce[] shopping) {
		Koszyk koszyk = new Koszyk();
		System.out.println(owner + " bierze " + koszyk);

		// FIXME przepisanie zakupow z kontenera do koszyka
		
		for (Owoce val : shopping) {
			koszyk.add((Product) val);
		}

		koszyk.showContent();
		kasa.printBill(koszyk);
 
		Torba torba = new Torba(owner);
		torba.loadFrom(koszyk);
 
		torba.showContent();
	}
}
