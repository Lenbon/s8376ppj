package zadanie03_1;

public class Str implements Sortable {
	private String name;
	public Str() {
		this("default");
	}
	public Str(String name) {
		this.name = name;
	}
	@Override
	public int compare(Object obj1, Object obj2) {
		Str tmpObj1 = (Str) obj1;
		Str tmpObj2 = (Str) obj2;

		return tmpObj1.getName().compareTo(tmpObj2.getName());
	}
	public String getName() {
		return name;
	}
}
