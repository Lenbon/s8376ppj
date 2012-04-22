package zadanie5.figura;

public class Kolo extends Figura
{
    private final int r;

    public Kolo(int r)
    {
        super();

        this.r = r;
        o = (int) (2 * 3.14 * r);
        p = (int) (3.14 * (r * r));
    }
}
