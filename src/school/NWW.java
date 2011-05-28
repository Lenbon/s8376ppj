package school;

/**
 * NWW - Najmniejsza wspolna wielokrotnosc
 * 
 * @author s8376
 * @version $Revision$
 */
public class NWW {
    /**
     * NWD Najwiekszy wspolny dzielnik
     */
    protected NWD _nwd;

    /**
     * Konstruktor
     */
    public NWW() {
        _nwd = new NWD();
    }

    /**
     * Oblicza najmniejsza wspolna wielokrotnosc dla liczb a i b
     * 
     * @param int a
     * @param int b
     * @return int
     */
    public int calculate(int a, int b) {
        return (a * b) / _nwd.calculate(a, b);
    }
}
