package zadanie03_4;

import java.util.ArrayList;

public class Torba {
	protected ArrayList<Product> storage;
	public Torba() {
		storage = new ArrayList<Product>();
	}
	public Torba loadFrom(Koszyk koszyk) {
		
		for (Product val : koszyk.getStorage()) {
			storage.add(val);
		}
		
		return this;
	}
	public Torba showContent() {
		System.out.println(toString());
		return this;
	}
	public String toString() {
		String output = "Zawartość torby\n";
		
		for (Product val : storage) {
			output += val.getName() + " " + val.getQuanity() + " kg\n";
		}
 
 		return output;
	}
}
