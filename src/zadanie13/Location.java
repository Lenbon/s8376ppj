package zadanie13;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Location extends JPanel
{
    private final Locale _locale;
    private final JLabel _date;
    private final JLabel _name;
    private final JLabel _time;

    public Location(String locationName, String language, String country)
    {
        _locale = new Locale(language, country);

        setPreferredSize(new Dimension(200, 200));
        setLayout(new GridLayout(3, 1));

        _name = new JLabel(locationName);
        add(_name);

        _date = new JLabel(getDate());
        add(_date);

        _time = new JLabel(getTime());
        add(_time);
    }

    public String getDate()
    {
        return DateFormat.getDateInstance(DateFormat.LONG, _locale).format(
                new Date());
    }

    public String getTime()
    {
        return DateFormat.getTimeInstance(DateFormat.DEFAULT, _locale).format(
                new Date());
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);

        _date.setText(getDate());
        _time.setText(getTime());
    }

}
