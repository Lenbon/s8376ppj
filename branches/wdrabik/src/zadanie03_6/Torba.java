package zadanie03_6;

public class Torba extends ContainerAbstract {
	protected String owner;
	public Torba(String owner) {
		super();
		this.owner = owner;
	}
	public Torba loadFrom(Koszyk koszyk) {
		
		for (Product val : koszyk.getStorage()) {
			storage.add(val);
		}
		
		return this;
	}
	public String toString() {
		return "torba [ właściciel: " + owner + " ]";
	}
}
