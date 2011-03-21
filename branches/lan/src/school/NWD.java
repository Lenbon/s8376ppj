package school;

/**
 * NWD - Najwiekszy wspolny dzielnik
 * 
 * @author s8376
 * @version $Revision$
 */
public class NWD {
	/**
	 * Oblicza najwiekszy wspolny dzielnik dla liczb a i b
	 * 
	 * @param int a
	 * @param int b
	 * @return int
	 */
	public int calculate(int a, int b) {
		int nwd = 0;

		do {
			nwd = a % b;
			a = b;
			b = nwd;
		} while (nwd != 0);

		return a;
	}
}
