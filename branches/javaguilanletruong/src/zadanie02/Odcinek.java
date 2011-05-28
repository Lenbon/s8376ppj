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

    /**
     * @param Punkt p1
     * @param Punkt p2
     */
    public Odcinek(Punkt p1, Punkt p2) {
        counter++;
        number = counter;

        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * oblicza długość odcinka
     *
     * @return double
     */
    public double dlugosc() {
        return Math.sqrt((p2.getX() - p1.getX()) * (p2.getX() - p1.getX())
                + (p2.getY() - p1.getY()) * (p2.getY() - p1.getY()));
    }

    /**
     * oblicza odległość od środka odcinka do punktu p
     *
     * @param Punkt p
     * @return double
     */
    public double odleglosc(Punkt p) {
        Punkt pMiddle = new Punkt((int) ((p1.getX() + p2.getX()) / 2),
                (int) ((p1.getY() + p2.getY()) / 2));
        Odcinek odcinek = new Odcinek(p, pMiddle);
        return odcinek.dlugosc();
    }

    /**
     * zwraca dłuższy z 2 odcinków
     *
     * @param Odcinek od
     * @return Odcinek
     */
    public Odcinek dluzszy(Odcinek od) {
        if (dlugosc() < od.dlugosc()) {
            return od;
        } else {
            return this;
        }
    }

    /**
     * zwraca numer odcinka
     *
     * @return int
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
        return new Odcinek(new Punkt(p1.getX(), 0), new Punkt(p2.getX(), 0));
    }

    /**
     * zwracaja rzuty odcinka na os. Y
     *
     * @return
     */
    public Odcinek rzutY() {
        return new Odcinek(new Punkt(0, p1.getY()), new Punkt(0, p2.getY()));
    }

    /**
     * wyprowadza informacje o odcinku (przedefiniowanie metody toString() z klasy Object)
     *
     * @return String
     */
    @Override
    public String toString() {
        return "" + number + ":" + p1 + "-" + p2;
    }
}
