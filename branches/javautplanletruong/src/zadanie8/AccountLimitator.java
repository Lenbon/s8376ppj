package zadanie8;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;

public class AccountLimitator implements VetoableChangeListener
{
    @Override
    public void vetoableChange(PropertyChangeEvent evt)
            throws PropertyVetoException
    {
        Account a = (Account) evt.getSource();
        if ((Double) evt.getNewValue() < ((Double) evt.getOldValue() - a
                .getDebitLimit())) {
            throw new PropertyVetoException("Przekroczenie limitu konta", evt);
        }
    }
}
