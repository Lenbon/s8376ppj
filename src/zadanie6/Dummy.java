package zadanie6;

import java.util.ArrayList;

public class Dummy extends Parent
{
    protected int _protectedLocalOne;
    protected String _protectedLocalTwo;
    protected ArrayList<String> _protectedLocalThree;

    public Dummy()
    {
        this(0);
    }

    public Dummy(int value)
    {
        this(value, "noname");
    }

    public Dummy(int value, String name)
    {
        _protectedOne = value;
        _protectedTwo = name;

        _protectedLocalThree = new ArrayList<String>();
    }

    public String __toString()
    {
        return _protectedOne + ". " + _protectedTwo;
    }

    public void addToList(String name)
    {
        _protectedLocalThree.add(name);
    }

    public String getName()
    {
        return _protectedTwo;
    }

    public int getValue()
    {
        return _protectedOne;
    }

    public void setName(String name)
    {
        _protectedTwo = name;
    }

    public void setValue(int value)
    {
        _protectedOne = value;
    }
}
