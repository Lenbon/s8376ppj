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
	 * Czesc calkowita
	 */
	protected int _integer = 0;
	/**
	 * Licznik
	 */
	protected int _numerator;
	/**
	 * Log dzialan
	 */
	protected String _log = "";

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
	 * Dodaje porcje do logu
	 * 
	 * @param String log
	 * @return void
	 */
	protected void toLog(String log) {
		_log += (_log != "" ? " = " : "") + log;
	}

	/**
	 * Zwraca nowy ułamek bedący wynikiem dodawania dwóch ułamków
	 * 
	 * @param Fraction f
	 * @return Fraction
	 */
	public Fraction add(Fraction f) {
		return new Fraction(1); // FIXME
	}

	/**
	 * Zwraca nowy ułamek bedący wynikiem dzielenia dwóch ułamków
	 * 
	 * @param Fraction f
	 * @return Fraction
	 */
	public Fraction div(Fraction f) {
		return new Fraction(this.getDenominator() * f.getNumerator(), this.getNumerator() * f.getDenominator());
	}

	/**
	 * Zwraca mianownik
	 * 
	 * @return int
	 */
	public int getDenominator() {
		return _denominator;
	}
	
	/**
	 * Zwraca czesc calkowita
	 * 
	 * @return int
	 */
	public int  getInteger() {
		return _integer;
	}

	/**
	 * Zwraca licznik
	 * 
	 * @return int
	 */
	public int getNumerator() {
		return _numerator;
	}

	/**
	 * Zwraca ułamek z większą wartością
	 * 
	 * @param Fraction f
	 * @return Fraction
	 */
	public Fraction greater(Fraction f) throws Exception {
		if (getDenominator() == 0 || f.getDenominator() == 0) {
			throw new Exception("Denominator is zero");
		}
		
		int thisNumerator = getNumerator();
		int numerator = f.getNumerator();

		if (getDenominator() != f.getDenominator()) {
			NWD nwd = new NWD();
			int nww = (getDenominator() * f.getDenominator()) / nwd.calculate(getDenominator(), f.getDenominator());

			thisNumerator *= nww / getDenominator();
			numerator *= nww / f.getDenominator();
		}

		if (thisNumerator < numerator) {
			return f;
		} else {
			return this;
		}
	}

	/**
	 * Zwraca nowy ułamek bedący wynikiem mnożenia dwóch ułamków
	 * 
	 * @param Fraction f
	 * @return Fraction
	 */
	public Fraction mult(Fraction f) {
		return new Fraction(1); // FIXME
	}

	/**
	 * Zmienia mianownik danego ułamka
	 * 
	 * @param int value
	 */
	public void setDenominator(int value) {
		_denominator = value;
	}

	/**
	 * Ustawia czesc calkowita ulamka
	 * 
	 * @param value
	 */
	public void setInteger(int value) {
		_integer = value;
	}

	/**
	 * Zmienia licznik danego ułamka
	 * 
	 * @param int value
	 */
	public void setNumerator(int value) {
		_numerator = value;
	}

	/**
	 * Zwraca nowy ułamek bedący uproszczeniem podanego ułamka
	 * 
	 * @return Fraction
	 */
	public Fraction simplify() {
		Fraction f = new Fraction(getNumerator(), getDenominator());
		f.setInteger(getInteger());
		NWD nwd = new NWD();
		
		int divisor = nwd.calculate(f.getNumerator(), f.getDenominator());
		f.setNumerator(f.getNumerator() / divisor);
		f.setDenominator(f.getDenominator() / divisor);
	
		return f;
	}

	/**
	 * Wyświetla ułamek w odpowiedniej formie (patrz. wynik działania przykładowego programu)
	 * 
	 * @return void
	 */
	public void show() {
		String value = "";

		try {
			toLog("" + getNumerator() + "/" + getDenominator());
			
			if (getDenominator() == 0) {
				throw new Exception("ERROR");
			}
			
			if (getNumerator() > getDenominator()) {
				setInteger(getInteger() + (getNumerator() / getDenominator()));
				setNumerator(getNumerator() % getDenominator());
				
				if (getInteger() != 0 && getNumerator() != 0) {
					toLog("" + getInteger() + " + " + getNumerator() + "/" + getDenominator());
				}
			}
			
			boolean flagCut = false;
			double result;

			if (getInteger() != 0 && getNumerator() == 0) { // wynik to liczba calkowita po skroceniu ulamka
				value += getInteger();
			} else if (getInteger() != 0 && getNumerator() != 0) { // wynik to liczba calkowita oraz ulamek
				result = (double) getInteger() + (double) getNumerator() / (double) getDenominator();
				flagCut = getInteger() * getNumerator() % getDenominator() == 0 ? true : false; // czy uciac zero po kropce, jesli nie ma ulamka
//				value += getInteger() + " + " + getNumerator() + " / " + getDenominator() + " = " + (flagCut ? (int) result : result);
				value += (flagCut ? (int) result : result);
			} else if (getInteger() == 0 && getNumerator() != 0) { // wynik to ulamek
				result = (double) getNumerator() / (double) getDenominator();
				flagCut = getNumerator() % getDenominator() == 0 ? true : false; // czy uciac zero po kropce, jesli nie ma ulamka
//				value += getNumerator() + " / " + getDenominator() + " = " + (flagCut ? (int) result : result);
				value += (flagCut ? (int) result : result);
			}

		} catch (Exception e) {
			value = e.getMessage();
		}

		toLog(value);
		System.out.println(_log);
		_log = ""; // reset log
	}

	/**
	 * Zwraca nowy ułamek bedący wynikiem odejmowania dwóch ułamków
	 * 
	 * @param Fraction f
	 * @return Fraction
	 */
	public Fraction sub(Fraction f) {
		return new Fraction(1); // FIXME
	}

	/**
	 * Oblicza wartość ułamka
	 * 
	 * @return double
	 * @throws Exception
	 */
	public double value() throws Exception {
		if (_denominator == 0) {
			throw new Exception("ERROR");
		}

		if (getInteger() != 0) {
			return (double) getInteger() * getNumerator() / getDenominator();
		} else {
			return (double) getNumerator() / getDenominator();	
		}
	}
}
