package zadanie04;

public abstract class Figura {
	/**
	 * położenie figury
	 */
	protected int x, y;
	/**
	 * nazwa figury z wartością początkową
	 */
	protected String fig = "Jeszcze nie wiadomo";
	/**
	 * konstruowanie figury na podstawie podanego położenia
	 * 
	 * @param int x
	 * @param int y
	 */
	public Figura(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * wypisuje nazwę figury i położenie
	 */
	public void pokaz() {
		System.out.println(fig + "\nSrodek - (" + x + ", " + y + ")");
	}
	/**
	 * wypisuje komunikat, czy punkt (x, y) znajduje się wewnątrz figury
	 * 
	 * @param int x
	 * @param int y
	 */
	public abstract void pozycja(int x, int y);
}
