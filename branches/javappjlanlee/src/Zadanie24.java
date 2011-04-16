import school.Circle;
import school.Input;
import school.Point;

/**
 * Zadanie 24
 * 
 * Stworzyć własną klasę Circle (korzystając z własnej klasy Point, zadanie 23)
 * reprezentujacą obiekty - koła w układzie wspólrzędnych Oxy, z:
 * 
 * a) konstruktorami:
 * 
 * Circle(): tworzy koło z środkiem (0,0) i promieniem 1 Circle(int r): tworzy
 * koło z środkiem w punkcie (0,0), i promieniem całkowitym r Circle(Point p,
 * int r): tworzy koło z środkiem w punkcie p, i promieniem całkowitym r
 * 
 * b) metodami 1-8 z zadania 22.
 * 
 * Przetestować jeszcze raz.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie24 {
    public static void main(String[] args) {

        Input handler = new Input();

        int x;
        int y;
        int r;

        x = handler.getInt("Podaj współrzędną x środka koła c1 (int)");
        y = handler.getInt("Podaj współrzędną y środka koła c1 (int)");
        r = handler.getInt("Podaj promien koła c1 (int)");

        Circle c1 = new Circle();
        c1.setCenter(new Point(x, y));
        c1.setRadius(r);
        c1.show();

        x = handler.getInt("Podaj współrzędną x środka koła c2 (int)");
        y = handler.getInt("Podaj współrzędną y środka koła c2 (int)");
        r = handler.getInt("Podaj promien koła c2 (int)");

        Circle c2 = new Circle();
        c2.setCenter(new Point(x, y));
        c2.setRadius(r);
        c2.show();

        Point p1 = new Point();
        p1.setX(handler.getInt("Podaj współrzędną x punktu p1 (int)"));
        p1.setY(handler.getInt("Podaj współrzędną y punktu p1 (int)"));
        p1.show();

        System.out.print("Koło o środku c1(" + c1.getCenter().getX() + ", "
                + c1.getCenter().getY() + ") i promieniu " + c1.getRadius()
                + " jest ");

        if (c1.getRadius() == c2.getRadius()) {
            System.out.print("równe kołu");
        } else {
            if (c1.isBigger(c2)) {

                System.out.print("większe");
            } else {
                System.out.print("mniejsze");
            }
            System.out.print(" niż koło");
        }

        System.out.println(" o środku c2(" + c2.getCenter().getX() + ", "
                + c2.getCenter().getY() + ") i promieniu " + c2.getRadius()
                + ".");

        System.out.print("Punkt o środku p1(" + p1.getX() + ", " + p1.getY()
                + ") znajduje się ");

        if (c1.inside(p1)) {
            System.out.print("wewnątrz");
        } else {
            System.out.print("na zewnątrz");
        }

        System.out.println(" koła c1");
    }
}
