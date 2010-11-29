import school.Fraction;

/**
 * Zadanie 26
 * 
 * Zaprojektować (i przetestować) klasę Fraction reprezentujacą ułamki liczb
 * całkowitych (licznik/mianownik), z:
 * 
 * a) konstruktorami: 
 * Fraction(int a, int b) - tworzy ułamek a/b, gdzie a,b są liczbami całkowitymi
 * Fraction(int a) - tworzy ułamek a/10, gdzie a jest liczbą całkowitą
 * 
 * b) metodami publicznymi:
 * void setNumerator(int num) - zmienia licznik danego ułamka void
 * setDenominator(int denom) - zmienia mianownik danego ułamka
 * double value() - oblicza wartość ułamka
 * Fraction greater(Fraction f) - zwraca ułamek z większą wartością
 * void show() - wyświetla ułamek w odpowiedniej formie (patrz. wynik działania przykładowego programu)
 * Fraction simplify(Fraction f) - zwraca nowy ułamek bedący uproszczeniem podanego ułamka
 * Fraction add(Fraction f) - zwraca nowy ułamek bedący wynikiem dodawania dwóch ułamków
 * Fraction sub(Fraction f) - zwraca nowy ułamek bedący wynikiem odejmowania dwóch ułamków
 * Fraction mult(Fraction f) - zwraca nowy ułamek bedący wynikiem mnożenia dwóch ułamków
 * Fraction div(Fraction f) - zwraca nowy ułamek bedący wynikiem dzielenia dwóch ułamków
 * 
 * Wynik (w komentarzy) działania przykładowego programu powinien wyglądać następująco:
 * 
 * Fraction f1 = new Fraction(2,5), f2 = new Fraction(3), f3 = new Fraction(4,0);
 * 
 * f1.show(); // 2/5 = 0.4
 * f2.show(); // 3/10 = 0.3
 * f3.show(); // 4/0 = Error
 * 
 * f1.setNumerator(15);
 * f1.show(); // 15/5 = 3
 * 
 * f2.setDenominator(-2);
 * f2.show(); // 3/-2 = -(1+1/2) = -1.5
 * 
 * f3.setNumerator(20);
 * f3.setDenominator(4);
 * f3.show(); // 20/4 = 5
 * 
 * f2.setDenominator(2);
 * f3.greater(f2).show(); // 20/4 = 5
 * 
 * f3.simplify().show(); // 20/4 = 5
 * 
 * f3.setDenominator(12);
 * f3.simplify().show(); // 5/3 = 1+2/3
 * 
 * f1.add(f2).show(); // 45/10 = 4+5/10 = 4+1/2 = 4.5
 * f1.sub(f2).show(); // 15/10 = 1+ 5/10 = 1.5
 * f1.mult(f2).show(); // 45/10 = 4+5/10 = 4+1/2 = 4.5
 * f1.div(f2).show(); // 30/15 = 2
 * 
 * @author s8376
 * @version $Revison$
 */
public class Zadanie26 {
	public static void main(String[] args) {
		try {
			Fraction f1 = new Fraction(2, 5), f2 = new Fraction(3), f3 = new Fraction(4, 0);

//			f1.show(); // 2/5 = 0.4
//			f2.show(); // 3/10 = 0.3
//			f3.show(); // 4/0 = Error

			f1.setNumerator(15);
//			f1.show(); // 15/5 = 3

			f2.setDenominator(-2);
//			f2.show(); // 3/-2 = -(1+1/2) = -1.5 // FIXME

			f3.setNumerator(20);
			f3.setDenominator(4);
//			f3.show(); // 20/4 = 5

//			f2.setDenominator(2);
//			f3.greater(f2).show(); // 20/4 = 5

			f3.simplify().show(); // 20/4 = 5

//			f3.setDenominator(12);
//			f3.simplify().show(); // 5/3 = 1+2/3

			// f1.add(f2).show(); // 45/10 = 4+5/10 = 4+1/2 = 4.5 // FIXME
			// f1.sub(f2).show(); // 15/10 = 1+ 5/10 = 1.5 // FIXME
			// f1.mult(f2).show(); // 45/10 = 4+5/10 = 4+1/2 = 4.5 // FIXME
			// f1.div(f2).show(); // 30/15 = 2 // FIXME
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
