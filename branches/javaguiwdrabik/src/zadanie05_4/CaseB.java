package zadanie05_4;

import java.awt.Color;

public class CaseB extends Abstract {
    {
        eGauge = getWidth();
        sGauge = 30;

        color = Color.green;
    }
    public CaseB() {
        super(new char[]{ 'e', 's', 'w', 's' });
    }
}
