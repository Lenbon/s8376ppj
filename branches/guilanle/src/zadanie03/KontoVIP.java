package zadanie03;

/**
 * @author s8376
 * @version $Revision$
 */
public class KontoVIP extends Konto {

    protected double _debit;
    protected int _debitCounter = 0;

    public KontoVIP(Osoba owner, int interest, int debit) {
        super(owner, interest);
        this._debit = (double) debit;
    }

    @Override
    public void aktualizuj() {
        if (_balance > 0) {
            super.aktualizuj();
        }
        System.out.println(toString() + " - ilość prób przekroczenia debetu " + _debitCounter + "!");
    }

    @Override
    protected boolean _checkBalanceWithdraw(int ammount) {
        if (_balance - _debit - (double) ammount < 0) {
            _debitCounter++;
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", limit debetu " + _debit;
    }
}
