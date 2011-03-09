package Zadanie02_1;

public class Vehicle {

	public final static int BROKEN = 0, STOPPED = 1, MOVING = 2; // stany
	protected final static String[] states = { "ZEPSUTY", "STOI", "JEDZIE" }; // nazwy
																			// stanów

	protected static int count; // liczba dotąd utworzonych obiektów,
	// inicjalnie 0

	protected int currNr = ++count; // przy tworzeniu obiektu count zwiększa się o
									// 1
	// i staje się numerem pojazdu

	protected int width, height, length, weight; // atrybuty pojazdu
	protected Person owner; // ... właściciel
	protected int state = STOPPED; // ... stan

	public Vehicle() {
	} // konstruktor bezparametrowy

	// konstruktor; tworzy pojazdy bez właściciela
	public Vehicle(int w, int h, int l, int ww) {
		this(null, w, h, l, ww);
	}

	// pełny konstruktor
	public Vehicle(Person p, int w, int h, int l, int ww) {
		owner = p;
		width = w;
		height = h;
		length = l;
		weight = ww;
	}

	public void start() { // start pojazdu
		setState(MOVING);
	}

	public void stop() { // zatrzymanie pojazdu
		setState(STOPPED);
	}

	// Robocza metoda zmiany stanu, wykorzystywana w stop() i start()
	// Uwzględnia możliwe zmiany stanów (sprawdza to)
	// Jest prywatna: arbitralna zmiana stanu pojazdu
	// nie jest możliwa spoza klasy
	private void setState(int newState) {
		if (state == newState || state == BROKEN)
			System.out.println("Nie jest mozliwe przejscie ze stanu "
					+ states[state] + " do stanu " + states[newState]);
		else
			state = newState;
	}

	// Reperowanie pojazdu:
	// zawsze zakończone sukcesem, jeśli tylko można przystąpić do naprawy :-)
	public Vehicle repair() {
		if (state == MOVING)
			System.out.println("Nie można reperować jadącego pojazdu");
		else if (state != BROKEN)
			System.out.println("Pojazd sprawny");
		else
			state = STOPPED;
		return this;
	}

	// zwraca stan jako liczbę;
	// można ją porównać ze stałymi Vehicle.BROKEN, Vehicle.STOPPED itp.
	public int getState() {
		return state;
	}

	// Zwraca nazwę stanu podanego jako argument
	public static String getState(int state) {
		return states[state];
	}

	// czy pojazd stoi?
	public boolean isStopped() {
		return state == STOPPED;
	}

	// Kolizja: w wyniku kolizji oba pojazdy w niej uczestniczące
	// stają się niesprawne
	// Nie może być kolizji, jeśli oba pojazdy stoją
	public void crash(Vehicle v) {
		if (state != MOVING && v.state != MOVING)
			System.out.println("Nie ma kolizji");
		else {
			setState(BROKEN);
			v.setState(BROKEN);
		}
	}

	public void sellTo(Person p) { // sprzedaż pojazdu osobie p
		owner = p;
	}

	public int getNr() {
		return currNr;
	} // zwraca unikalny numer pojazdu

	// Czy pojazd może przejechać pod konstrukcją o podanej wysokości?
	public boolean isTooHighToGoUnder(int limit) {
		return height > limit ? true : false;
	}

	// Metoda toString uwzględnia teraz,
	// że pojazd może jeszcze nie mieć właściciela
	public String toString() {
		String s = (owner == null ? "sklep" : owner.getName());
		return "Pojazd " + currNr + " ,właścicielem którego jest " + s + " - "
				+ states[state];
	}

	// ile pojazdów utworzyliśmy dotąd?
	static int getCount() {
		return count;
	}

	// zwraca tablicę nazw dostępnych stanów pojazdu
	static String[] getAvailableStates() {
		return states;
	}

}
