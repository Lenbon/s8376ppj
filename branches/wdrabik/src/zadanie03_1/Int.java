package zadanie03_1;

public class Int implements Sortable{
	private int x;
	public Int() {
		this(0);
	}
	public Int(int x) {
		this.x = x;
	}
	@Override
	public int compare(Object obj1, Object obj2) {
		Int tmpObj1 = (Int) obj1;
		Int tmpObj2 = (Int) obj2;
		
		if (tmpObj1.getX() < tmpObj2.getX()) { //liczbę ujemną jeżeli obj1 < obj2
			return -1;
		} else if (tmpObj1.getX() == tmpObj2.getX()) { //liczbę równą zeru jeżeli obj1==object2
			return 0;
		} else { //liczbe dodatnią jeżeli obj1>obj2
			return 1;	
		}
	}
	public int getX() {
		return x;
	}
}
