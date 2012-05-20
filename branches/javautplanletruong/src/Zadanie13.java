import zadanie13.*;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Zadanie 13
 *
 * Napisać program ilustrujący działanie zegara cyfrowego, który pokazuje
 * na ekranie datę (według kalendarza gregoriańskiego) i czas w różnych miastach
 * świata: Warszawa, Nowy York, Londyn oraz Moskwa. Zegar powinnien działać
 * w sposób "ciągły", tzn. tykać co sekudę (tu może działać specjalny wątek,
 * który co sekundę aktualizuje czas).
 *
 * @version     $Id$
 */
public class Zadanie13 extends JPanel
{
    public Zadanie13()
    {
        setLayout(new GridLayout(1, 4));

        setPreferredSize(new Dimension(600, 100));

        add(new Location("Warszawa", "pl", "PL", "Europe/Warsaw", new PlException()));
        add(new Location("Nowy Jork", "en", "US", "America/New_York"));
        add(new Location("Londyn", "en", "GB", "Europe/London"));
        add(new Location("Moskwa", "ru", "RU", "Europe/Moscow"));
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);

        System.out.println("stuk!");
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Hello world");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final Zadanie13 panel = new Zadanie13();
        frame.add(panel);

        Timer timer = new Timer();
        timer.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                panel.repaint();
            }
        }, 0, 1000);

        frame.pack();
        frame.setVisible(true);
    }
}
