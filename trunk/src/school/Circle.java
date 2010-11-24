package school;

/**
 * Circle
 * 
 * @author s8376
 * @version $Revision$
 */
public class Circle {
	/**
	 * Punkt srodka okregu
	 */
	protected Point _center;
	/**
	 * Ilosc tworzonych okregow do chwili obecnej
	 */
	protected static int _ilosc;
	/**
	 * Numer danego kola
	 */
	protected int _nr;
	/**
	 * Promien okregu
	 */
	protected int _radius;

	/**
	 * Domyslny konstruktor
	 */
	public Circle() {
		_nr = ++_ilosc;
		_center = new Point();
		_radius = 1;
	}

	/**
	 * @param int r
	 */
	public Circle(int r) {
		_nr = ++_ilosc;
		_center = new Point();
		_radius = r;
	}

	/**
	 * @param Point
	 *            p
	 * @param int r
	 */
	public Circle(Point p, int r) {
		_nr = ++_ilosc;
		_center = p;
		_radius = r;
	}

	/**
	 * Zwraca pole okregu
	 * 
	 * @return double
	 */
	public double area() {
		double pi = 3.1415926535;
		return pi * (_radius * _radius);
	}

	/**
	 * Zwraca liczbe tworzonych kol do chwili obecnej
	 * 
	 * @return int
	 */
	public static int dajIlosc() {
		return _ilosc;
	}

	/**
	 * Zwraca numer danego kola
	 * 
	 * @return int
	 */
	public int dajNr() {
		return _nr;
	}

	/**
	 * Sprawdza, czy punkt jest wewnatrz kola
	 * 
	 * @param Point
	 *            p
	 * @return boolean
	 */
	public boolean inside(Point p) {
		if (this._radius >= Math.sqrt((p.getX() - this._center.getX())
				* (p.getX() - this._center.getX())
				+ (p.getY() - this._center.getY())
				* (p.getY() - this._center.getY()))) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Sprawdza, czy nasz okrag jest wiekszy niz okrag c
	 * 
	 * @param Circle
	 *            c
	 * @return boolean
	 */
	public boolean isBigger(Circle c) {
		if (this.area() > c.area()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Zwraca srodek okregu
	 * 
	 * @return Point
	 */
	public Point getCenter() {
		return _center;
	}

	/**
	 * Zwraca promien okregu
	 * 
	 * @return int
	 */
	public int getRadius() {
		return _radius;
	}

	/**
	 * Ustawia srodek okregu
	 * 
	 * @param Point
	 *            c
	 * @return void
	 */
	public void setCenter(Point c) {
		_center = c;
	}

	/**
	 * Ustawia promien okregu
	 * 
	 * @param int r
	 * @return void
	 */
	public void setRadius(int r) {
		_radius = r;
	}

	/**
	 * Wyswietla informacje o okregu
	 * 
	 * @return void
	 */
	public void show() {
		System.out.println(this.toString());
	}

	/**
	 * @return String
	 */
	public String toString() {
		return ("Okrąg o środku w punkcie x: " + _center.getX() + " y: "
				+ _center.getY() + " i promieniu r: " + _radius);
	}
}
