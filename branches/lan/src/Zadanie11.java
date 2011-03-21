/**
 * Zadanie 11
 * 
 * Jakie wartości będą miały zmienne a, b, c, d w kolejnych punktach tego programu. Odpowiedzieć bez pisania programu.
 *        int a = 1;
 *        a++;    
 *        ++a;    
 *        int b = a++;    
 *        int c = ++b;    
 *        int d = ++a/b++;
 * Sprawdzić swoją odpowiedź pisząc program, który pokazuje wyniki operacji.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie11 {
	public static void main(String[] args) {

		int a = 1;
		int b = 0;
		int c = 0;
		int d = 0;

		System.out.println("Inicjacja: int a = 1;");

		a++;
		System.out.println("a++;                 a: " + a + "; b: " + b
				+ "; c: " + c + "; d: " + d + ";");

		++a;
		System.out.println("++a;                 a: " + a + "; b: " + b
				+ "; c: " + c + "; d: " + d + ";");

		b = a++;
		System.out.println("int b = a++;         a: " + a + "; b: " + b
				+ "; c: " + c + "; d: " + d + ";");

		c += b;
		System.out.println("int c = ++b;         a: " + a + "; b: " + b
				+ "; c: " + c + "; d: " + d + ";");

		d = ++a / b++;
		System.out.println("int d = ++a / b++;   a: " + a + "; b: " + b
				+ "; c: " + c + "; d: " + d);

	}
}
