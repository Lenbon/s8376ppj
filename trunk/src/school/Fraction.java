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
	 * Log dzialan
	 */
	protected static String _log = "";

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
	 * @param Fraction f
	 * @return Fraction
	 */
	public Fraction add(Fraction f) {
		NWW nww = new NWW();
		int multiple = nww.calculate(getDenominator(), f.getDenominator());
		return new Fraction((multiple / getDenominator()) * getNumerator() + (multiple / f.getDenominator()) * f.getNumerator(), multiple);
	}

	/**
	 * Zwraca nowy ułamek bedący wynikiem dzielenia dwóch ułamków
	 * 
	 * @param Fraction f
	 * @return Fraction
	 */
	public Fraction div(Fraction f) {
		return new Fraction(getNumerator() * f.getDenominator(), getDenominator() * f.getNumerator());
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
	 * Zwraca zawartosc loga
	 * 
	 * @return String
	 */
	public String getLog() {
		return _log;
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
		return new Fraction(getNumerator() * f.getNumerator(), getDenominator() * f.getDenominator());
	}
	
	/**
	 * Czysci zawartosc loga
	 * 
	 * @return void
	 */
	public void resetLog() {
		_log = "";
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
	 * Ustawia zawartosc loga
	 * 
	 * @param String log
	 * @return void
	 */
	public void setLog(String log) {
		_log = log; 
	}
	
	/**
	 * Zmienia licznik danego ułamka
	 * 
	 * @param int value
	 * @return void
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
		NWD nwd = new NWD();
		int divisor = nwd.calculate(getNumerator(), getDenominator());
		return new Fraction(getNumerator() / divisor, getDenominator() / divisor);
	}

	/**
	 * Wyświetla ułamek w odpowiedniej formie (patrz. wynik działania przykładowego programu)
	 * 
	 * @return void
	 */
	public void show() {
		int integer = 0;
		boolean negative = false;
		int numerator = 0;
		String value = "";

		try {
			toLog("" + getNumerator() + "/" + getDenominator());
			
			if (getDenominator() == 0) {
				throw new Exception("ERROR");
			}
			
			// wyciagniecie czesci calkowitej
			if (getNumerator() > getDenominator()) {
				
				if ((getNumerator() < 0 && getDenominator() > 0) || (getNumerator() > 0 && getDenominator() < 0)) {
					negative = true;
				}
				
				integer = getNumerator() / getDenominator();
				numerator = getNumerator() % getDenominator();
				
				if (integer != 0 && numerator != 0) {
					toLog("" + (negative ? "-(" : "") + integer + "+" + numerator + "/" + getDenominator() + (negative ? ")" : ""));
				}
			} else {
				numerator = getNumerator();
			}
			
			// skrocenie ulamka
			NWD nwd = new NWD();
			int multiple = nwd.calculate(numerator, getDenominator());
			if (multiple > 1) {
				toLog("" + (integer != 0 ? integer + "+" : "") + (numerator / multiple) + "/" + (getDenominator() / multiple));
			}
			
			boolean flagCut = false;
			double result;

			if (integer != 0 && numerator == 0) { // wynik to liczba calkowita po skroceniu ulamka
				value += integer;
			} else if (integer != 0 && numerator != 0) { // wynik to liczba calkowita oraz ulamek
				result = (double) getNumerator() / (double) getDenominator();
				flagCut = getNumerator() % getDenominator() == 0 ? true : false; // czy uciac zero po kropce, jesli nie ma ulamka
				value += (flagCut ? (int) result : result);
			} else if (integer == 0 && numerator != 0) { // wynik to ulamek
				result = (double) getNumerator() / (double) getDenominator();
				flagCut = getNumerator() % getDenominator() == 0 ? true : false; // czy uciac zero po kropce, jesli nie ma ulamka
				value += (flagCut ? (int) result : result);
			}
		} catch (Exception e) {
			value = e.getMessage();
		}

		toLog(value);
		System.out.println(_log);
		resetLog();
	}

	/**
	 * Zwraca nowy ułamek bedący wynikiem odejmowania dwóch ułamków
	 * 
	 * @param Fraction f
	 * @return Fraction
	 */
	public Fraction sub(Fraction f) {
		NWW nww = new NWW();
		int multiple = nww.calculate(getDenominator(), f.getDenominator());
		return new Fraction((multiple / getDenominator()) * getNumerator() - (multiple / f.getDenominator()) * f.getNumerator(), multiple);
	}

	/**
	 * Dodaje porcje do logu
	 * 
	 * @param String log
	 * @return void
	 */
	public void toLog(String log) {
		_log += (_log != "" ? " = " : "") + log;
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
			
		return (double) getNumerator() / getDenominator();	
	}
}
