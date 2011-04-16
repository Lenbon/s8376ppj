/**
 * Zadanie 8
 * 
 * Napisać program, który dla 2 liczb naturalnych podanych w programie,
 * wyprowadza ich sumę, różnicę, iloczyn, iloraz, resztę z dzielenia, wynik
 * dzielenia całkowitego z opisem, np. x = wartość; y = wartość; x+y = wartość
 * sumy x-y = wartość różnicy x*y = wartość iloczynu x:y = wartość ilorazu x%y =
 * reszta z dzielenia x/y = wynik dzielenia całkowitego
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie8 {
    public static void main(String[] args) {
        int x = 4;
        int y = 2;

        System.out.println("x = wartość: " + x + "\n" + "y = wartość: " + y
                + "\n" + "x+y = wartość sumy: " + (x + y) + "\n"
                + "x-y = wartość rónicy: " + (x - y) + "\n"
                + "x*y = wartość iloczynu: " + (x * y) + "\n"
                + "x:y = wartość ilorazu: " + ((double) x / (double) y) + "\n"
                + "x%y = reszta z dzielenia: " + (x % y) + "\n"
                + "x/y = wynik dzielenia całkowitego: " + (x / y));
    }
}
