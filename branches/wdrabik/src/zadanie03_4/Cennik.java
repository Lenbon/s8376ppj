package zadanie03_4;

import java.util.Hashtable;

public class Cennik {
	protected Hashtable<String, Double> tariff;
	public Cennik() {
		tariff = new Hashtable<String, Double>();	
	}
	public double getPrice(String name) {
		return tariff.get(name); 
	}
	public boolean hasPrice(String name) {
		return tariff.containsKey(name) ? true : false;
	}
	public Cennik set(String name, double price) {
		tariff.put(name, (Double) price);
		return this;
	}
}
