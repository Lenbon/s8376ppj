package zadanie02;

/**
 * @author s8376
 * @version $Revision$
 */
public class Punkt {
    protected int x;
    protected int y;

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
