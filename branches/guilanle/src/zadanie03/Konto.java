package zadanie03;

/**
 * @author s8376
 * @version $Revision$
 */
public class Konto extends Rachunek {

    protected double _interest;

    public Konto(Osoba owner, int interest) {
        super(owner);
        _interest = (double) interest;
    }

    @Override
    public void aktualizuj() {
        _balance += _balance * ((double) _interest / 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", oprocentowanie " + _interest;
    }
}
