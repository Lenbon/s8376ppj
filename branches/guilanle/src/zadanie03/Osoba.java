package zadanie03;

/**
 * @author s8376
 * @version $Revision$
 */
public class Osoba {

    protected String name;

    public Osoba(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
