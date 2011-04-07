package zadanie02;

/**
 * @author s8376
 * @version $Revision$
 */
public class Odcinek {

    protected static int counter;
    protected int number;
    protected Punkt p1;
    protected Punkt p2;

    public Odcinek(Punkt p1, Punkt p2) {
        counter++;
        number = counter;

        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * oblicza długość odcinka
     *
     * @return
     */
    public double dlugosc() {
        return Math.sqrt((p2.getX() - p1.getX()) * (p2.getX() - p1.getX()) + (p2.getY() - p1.getY()) * (p2.getY() - p1.getY()));
    }

    /**
     * oblicza odległość od środka odcinka do punktu p
     *
     * @param p
     * @return
     */
    public double odleglosc(Punkt p) {
        Punkt pMiddle = new Punkt((int)((p1.getX() - p2.getX()) / 2), (int)((p1.getX() - p2.getX()) / 2));
        Odcinek odcinek = new Odcinek(p, pMiddle);

        return odcinek.dlugosc();
    }

    /**
     * zwraca dłuższy z 2 odcinków
     *
     * @param od
     * @return
     */
    public Odcinek dluzszy(Odcinek od) {
        return od; // FIXME
    }

    /**
     * zwraca numer odcinka
     *
     * @return
     */
    public int numer() {
        return number;
    }

    /**
     * zwracaja rzut odcinka na os. X
     *
     * @return
     */
    public Odcinek rzutX() {
        return this; // FIXME
    }

    /**
     * zwracaja rzuty odcinka na os. Y
     *
     * @return
     */
    public Odcinek rzutY() {
        return this; // FIXME
    }

    /**
     * wyprowadza informacje o odcinku (przedefiniowanie metody toString() z klasy Object)
     *
     * @return
     */
    public String toString() {
        return "" + number + ":" + p1 + "-" + p2;
    }
}
