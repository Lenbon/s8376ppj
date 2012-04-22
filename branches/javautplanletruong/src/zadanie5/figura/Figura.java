package zadanie5.figura;

public abstract class Figura implements Comparable<Figura>
{
    public static int nubmerCounter = 0;
    protected int number;
    protected int o;
    protected int p;

    public Figura()
    {
        nubmerCounter++;
        number = nubmerCounter;
    }

    @Override
    public int compareTo(Figura o)
    {
        return 0;
    }

    public int getO()
    {
        return o;
    }

    public int getP()
    {
        return p;
    }

    public int getNumber()
    {
        return number;
    }
}
