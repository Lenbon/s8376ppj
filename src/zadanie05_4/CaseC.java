package zadanie05_4;

import java.awt.Color;

public class CaseC extends Abstract {
    {
        eGauge = 30;
        sGauge = getHeight();

        color = Color.red;
    }

    public CaseC() {
        super(new char[]{ 's', 'e', 'n', 'e' });
    }
}
