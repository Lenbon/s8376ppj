/**
 * Zadanie 7
 * 
 * Napisać program, który za pomocą jednego wywołania System.out.println()
 * wypisze na konsoli następujące wyrażenie matematyczne, gdzie x oznacza wynik
 * obliczony przez program.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie7 {
    public static void main(String[] args) {
        int x = (((1 + 2 * 3 + 4) / (5 - 6)) + 78) / (9 - (10 / 11));
        System.out.println("       1 + 2 * 3 + 4\n"
                + "      --------------- + 78\n" + "           5 - 6\n"
                + "     ---------------------- = " + x + "\n"
                + "                 10\n" + "            9 - ----\n"
                + "                 11");
    }
}
