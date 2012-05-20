package zadanie13;

public class PlException implements LangException
{
    private final String[] _names = { "stycznia", "lutego", "marca",
            "kwietnia", "maja", "czerwca", "lipca", "sierpnia", "września",
            "października", "listopada", "grudnia" };

    public String[] getNames()
    {
        return _names;
    }
}
