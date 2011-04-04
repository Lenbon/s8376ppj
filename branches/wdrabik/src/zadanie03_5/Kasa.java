package zadanie03_5;

import java.util.ArrayList;

public class Kasa {
	protected String name;
	public Kasa() {
		this("1");
	}
	public Kasa(String name) {
		this.name = name;
	}
	public Kasa(int name) {
		this.name = "" + name;
	}
	public void printBill(Koszyk koszyk) {
		Cennik cennik = Cennik.getCennik();
		double amount = 0.0;
		String output = "Kasa nr " + name + " (rachunek)\n";
		
		ArrayList<Product> storage = koszyk.getStorage();
		
		for(int x = 0; x < storage.size(); x++) {
			if (cennik.hasPrice(storage.get(x).getName())) {
				amount += storage.get(x).getQuanity() * cennik.getPrice(storage.get(x).getName());
				output += storage.get(x).getName() + " " + storage.get(x).getQuanity() + " kg * "
					+ cennik.getPrice(storage.get(x).getName()) + " zl/kg = "
					+ storage.get(x).getQuanity() * cennik.getPrice(storage.get(x).getName())
					+ "\n"
					;
			} else {
				storage.remove(x);
			}
		}
		
		output += "Razem: " + amount + " zl\n";
		
		System.out.println(output);
	}
}
