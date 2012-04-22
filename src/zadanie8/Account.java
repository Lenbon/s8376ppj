package zadanie8;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;

final public class Account
{
    private double _balance;
    private final double _debitLimit;

    private final PropertyChangeSupport _pcl = new PropertyChangeSupport(this);
    private final VetoableChangeSupport _vcl = new VetoableChangeSupport(this);

    public Account()
    {
        this(0.0);
    }

    public Account(double debitLimit)
    {
        if (debitLimit < 0.0) {
            debitLimit *= -1.0;
        }

        _debitLimit = debitLimit;
    }

    /**
     * wpłata
     */
    synchronized public void deposit(double ammount)
    {
        double oldBalance = _balance;
        _balance += ammount;
        _pcl.firePropertyChange("balance", oldBalance, _balance);
    }

    public double getBalance()
    {
        return _balance;
    }

    public double getDebitLimit()
    {
        return _debitLimit;
    }

    /**
     * wypłata
     */
    synchronized public boolean withdraw(double ammount)
    {
        double oldBalance = _balance;
        double newBalance = _balance - ammount;

        try {
            _vcl.fireVetoableChange("balance", oldBalance, newBalance);
            _balance = newBalance;
            _pcl.firePropertyChange("balance", oldBalance, newBalance);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    /**
     * przelew na inne konto
     */
    public void transfer(Account account, double ammount)
    {
        if (withdraw(ammount)) {
            account.deposit(ammount);
        }
    }

    synchronized public void addPropertyChangeListener(PropertyChangeListener l)
    {
        _pcl.addPropertyChangeListener(l);
    }

    synchronized public void removePropertyChangeListener(
            PropertyChangeListener l)
    {
        _pcl.removePropertyChangeListener(l);
    }

    synchronized public void addVetoableChangeListener(VetoableChangeListener l)
    {
        _vcl.addVetoableChangeListener(l);
    }

    synchronized public void removeVetoableChangeListener(
            VetoableChangeListener l)
    {
        _vcl.removeVetoableChangeListener(l);
    }

}
