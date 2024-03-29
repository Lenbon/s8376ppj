package zadanie14;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

/**
 * MyIcon
 *
 * @version     $Id$
 */
public class MyIcon implements javax.swing.Icon
{
    protected Color color;
    protected int widht, height;

    public MyIcon()
    {
        this(10, 10, Color.GREEN);
    }

    public MyIcon(Color color)
    {
        this(10, 10, color);
    }

    public MyIcon(int width, int height)
    {
        this(width, height, Color.GREEN);
    }

    public MyIcon(int width, int height, Color color)
    {
        this.widht = width;
        this.height = height;
        this.color = color;
    }

    public Color getColor()
    {
        return color;
    }

    @Override
    public int getIconHeight()
    {
        return height;
    }

    @Override
    public int getIconWidth()
    {
        return widht;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y)
    {
        g.setColor(color);
        g.fillOval(x, y, widht, height);
    }
}
