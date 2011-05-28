import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Zadanie 21
 * 
 * Napisać i testować (w głównym programie) własną metodę: int nwd(int a, int
 * b), która oblicza największy wspólny dzielnik (NWD) 2 liczb naturalnych
 * wprowadzonych przez użytkownika.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie21 {
    /**
     * @param message
     * @return String
     */
    protected int _input(String message) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(message);
        int input = 0;

        try {
            input = Integer.parseInt(br.readLine());
            if (input <= 0) {
                throw new NumberFormatException("Input must be grater than 0");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return input;
    }

    /**
     * Zwraca NWD
     * 
     * @param int a
     * @param int b
     * @return int
     */
    protected int _nwd(int a, int b) {
        int nwd = 0;

        do {
            nwd = a % b;
            a = b;
            b = nwd;
        } while (nwd != 0);

        return a;
    }

    public static void main(String[] args) {
        Zadanie21 nwd = new Zadanie21();
        int a = nwd._input("Podaj pierwszą liczbę: ");
        int b = nwd._input("Podaj drugą liczbę: ");
        System.out.println("NWD dla liczb " + a + " i " + b + ": "
                + nwd._nwd(a, b));
    }
}
