package zadanie8;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class AccountChange implements PropertyChangeListener
{
    @Override
    public void propertyChange(PropertyChangeEvent evt)
    {
        System.out.println("Zmiana stanu konta z " + evt.getOldValue()
                + " na: " + evt.getNewValue());
    }
}
