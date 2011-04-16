package school;

/**
 * Point
 * 
 * @package school
 * @author s8376
 * @version $Revision$
 */
public class Point {
    protected int _x;
    protected int _y;

    public Point() {
        _x = 0;
        _y = 0;
    }

    public Point(int a) {
        _x = a;
        _y = 0;
    }

    public Point(int a, int b) {
        _x = a;
        _y = b;
    }

    public double distance(Point p) {
        return Math.sqrt((p.getX() - this.getX()) * (p.getX() - this.getX())
                + (p.getY() - this.getY()) * (p.getY() - this.getY()));
    }

    public int getX() {
        return _x;
    }

    public int getY() {
        return _y;
    }

    public boolean parallel(Point p) {
        if ((this.getX() == p.getX() && this.getY() != p.getY())
                || (this.getX() != p.getX() && this.getY() == p.getY())) {
            return true;
        } else {
            return false;
        }
    }

    public void setX(int a) {
        _x = a;
    }

    public void setY(int b) {
        _y = b;
    }

    public void show() {
        System.out.println(this.toString());
    }

    public String toString() {
        return ("Punkt x: " + _x + "; y:" + _y);
    }
}
