/**
 * Zadanie 15 dodatkowe
 * 
 * Zalozenia: piec liczb - a, b, c, d, e posortowac za pomoca jak najmniejszej
 * ilosci testow
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie15Dodatkowe {
	public static void main(String[] args) {
		// FIXME poprawic
		
		int a = 3;
		int b = 6;
		int c = 9;
		int d = 2;
		int e = 0;
		
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;
		int dCount = 0;
		int eCount = 0;
		
		if (a < b) {
			++bCount;
		} else {
			++aCount;
		}
		if (a < c) {
			++cCount;
		} else {
			++aCount;
		}
		if (a < d) {
			++dCount;
		} else {
			++aCount;
		}
		if (a < e) {
			++eCount;
		} else {
			++aCount;
		}
		
		if (b < c) {
			++cCount;
		} else {
			++bCount;
		}
		if (b < d) {
			++dCount;
		} else {
			++bCount;
		}
		if (b < e) {
			++eCount;
		} else {
			++bCount;
		}
		
		if (c < d) {
			++dCount;
		} else {
			++cCount;
		}
		if (c < e) {
			++eCount;
		} else {
			++cCount;
		}
		
		if (d < e) {
			++eCount;
		} else {
			++dCount;
		}
		
		System.out.println("Count: a" + aCount + ", b" + bCount + ", c" + cCount + ", d" + dCount + ", e" + eCount);
		System.out.println("Wynik: a:" + a + "; b:" + b + "; c:" + c + "; d:" + d + "; e:" + e);
	}
}
