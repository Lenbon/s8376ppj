package school;

/**
 * Fraction
 * 
 * @author s8376
 * @version $Revision$
 */
public class Fraction {
	/**
	 * Mianownik
	 */
	protected int _denominator;
	/**
	 * Licznik
	 */
	protected int _numerator;

	/**
	 * Tworzy ułamek a/b, gdzie a,b są liczbami całkowitymi
	 * 
	 * @param int a
	 * @param int b
	 */
	public Fraction(int a, int b) {
		_numerator = a;
		_denominator = b;
	}

	/**
	 * Tworzy ułamek a/10, gdzie a jest liczbą całkowitą
	 * 
	 * @param a
	 */
	public Fraction(int a) {
		_numerator = a;
		_denominator = 10;
	}

	/**
	 * Zwraca nowy ułamek bedący wynikiem dodawania dwóch ułamków
	 * 
	 * @param Fraction
	 *            f
	 * @return Fraction
	 */
	public Fraction add(Fraction f) {
		return new Fraction(1); // FIXME
	}

	/**
	 * Zwraca nowy ułamek bedący wynikiem dzielenia dwóch ułamków
	 * 
	 * @param Fraction
	 *            f
	 * @return Fraction
	 */
	public Fraction div(Fraction f) {
		return new Fraction(this.getDenominator() * f.getNumerator(), this
				.getNumerator()
				* f.getDenominator());
	}

	public int getDenominator() {
		return _denominator;
	}

	public int getNumerator() {
		return _numerator;
	}

	/**
	 * Zwraca ułamek z większą wartością
	 * 
	 * @param Fraction
	 *            f
	 * @return Fraction
	 */
	public Fraction greater(Fraction f) {
		return new Fraction(1); // FIXME
	}

	/**
	 * Zwraca nowy ułamek bedący wynikiem mnożenia dwóch ułamków
	 * 
	 * @param Fraction
	 *            f
	 * @return Fraction
	 */
	public Fraction mult(Fraction f) {
		return new Fraction(1); // FIXME
	}

	/**
	 * Zmienia mianownik danego ułamka
	 * 
	 * @param int denom
	 */
	public void setDenominator(int denom) {
		_denominator = denom;
	}

	/**
	 * Zmienia licznik danego ułamka
	 * 
	 * @param int num
	 */
	public void setNumerator(int num) {
		_numerator = num;
	}

	/**
	 * Zwraca nowy ułamek bedący uproszczeniem podanego ułamka
	 * 
	 * @return Fraction
	 */
	public Fraction simplify() {
		return new Fraction(1); // FIXME
	}

	/**
	 * Wyświetla ułamek w odpowiedniej formie (patrz. wynik działania
	 * przykładowego programu)
	 * 
	 * @return void
	 */
	public void show() {
		System.out.println("" + _numerator + "/" + _denominator + " = " + 123); // FIXME
	}

	/**
	 * Zwraca nowy ułamek bedący wynikiem odejmowania dwóch ułamków
	 * 
	 * @param Fraction
	 *            f
	 * @return Fraction
	 */
	public Fraction sub(Fraction f) {
		return new Fraction(1); // FIXME
	}

	/**
	 * Oblicza wartość ułamka
	 * 
	 * @return double
	 */
	public double value() {
		return _numerator / _denominator;
	}
}
