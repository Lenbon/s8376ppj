package zadanie03;

/**
 * @author s8376
 * @version $Revision$
 */
public class Rachunek {

    protected double _balance;
    protected static int _counter;
    protected int _number;
    protected Osoba _owner;

    public Rachunek(Osoba owner) {
        _owner = owner;
        _counter++;
        _number = _counter;
    }

    protected boolean _checkBalanceWithdraw(int ammount) {
        return (_balance - ammount < 0 ? false : true);
    }

    public void aktualizuj() {
    }

    public double getBalance() {
        return _balance;
    }

    public int getNumber() {
        return _number;
    }

    public void przelew(Rachunek target, int ammount) {
        if (_checkBalanceWithdraw(ammount)) {
            _balance -= ammount;
            target.wplata(ammount);
        } else {
            System.out.println(this + " - nie dozwolona operacja: przelew!");
        }
    }

    @Override
    public String toString() {
        return "Konto nr " + _number + ": " + _owner + ", stan " + _balance;
    }

    public void wplata(int ammount) {
        _balance += ammount;
    }

    public void wyplata(int ammount) {
        if (_checkBalanceWithdraw(ammount)) {
            _balance -= ammount;
        } else {
            System.out.println(this + " - nie dozwolona operacja: wypłata!");
        }
    }
}
