package zadanie13;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Location extends JPanel
{
    private final DateFormat _dateFormatDate;
    private final DateFormat _dateFormatTime;
    private final JLabel _date;
    private final JLabel _name;
    private final JLabel _time;

    public Location(String locationName, String language, String country,
            String timeZoneName, LangException langException)
    {
        Locale locale = new Locale(language, country);
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneName);

        if (langException != null) {
            DateFormatSymbols dfs = new DateFormatSymbols();
            dfs.setMonths(langException.getNames());
            _dateFormatDate = new SimpleDateFormat("dd MMMM yyyy", dfs);
        } else {
            _dateFormatDate = DateFormat.getDateInstance(DateFormat.LONG,
                    locale);
        }
        _dateFormatDate.setTimeZone(timeZone);

        _dateFormatTime = DateFormat
                .getTimeInstance(DateFormat.DEFAULT, locale);
        _dateFormatTime.setTimeZone(timeZone);

        //        setPreferredSize(new Dimension(200, 200));
        setLayout(new GridLayout(3, 1));

        _name = new JLabel(locationName);
        add(_name);

        _date = new JLabel(getDate());
        add(_date);

        _time = new JLabel(getTime());
        add(_time);
    }

    public Location(String locationName, String language, String country,
            String timeZoneName)
    {
        this(locationName, language, country, timeZoneName, null);
    }

    public String getDate()
    {
        return _dateFormatDate.format(new Date());
    }

    public String getTime()
    {
        return _dateFormatTime.format(new Date());
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);

        _date.setText(getDate());
        _time.setText(getTime());
    }
}
