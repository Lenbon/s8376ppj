package zadanie7;

/**
 * Param
 *
 * @version     $Id$
 */
public class Param
{
    private String _method;
    private String[] _params;
    private String _type;

    public String getMethod()
    {
        return _method;
    }

    public String[] getParams()
    {
        return _params;
    }

    public String getType()
    {
        return _type;
    }

    public void setMethod(String method)
    {
        _method = method;
    }

    public void setParams(String[] params)
    {
        _params = params;
    }

    public void setType(String type)
    {
        _type = type;
    }
}
