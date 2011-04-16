import school.Input;
import Figure.*;

/**
 * Zadanie 22
 * 
 * Dane są 2 klasy: Point (reprezentuje punkty na płaszczyźnie) oraz Circle
 * (reprezentuje koła na płaszczyźnie). Dostępne są następujące metody
 * (komunikaty-usługi):
 * 
 * Klasa Point: 1. int getX(): zwraca współrzędną x 2. int getY(): zwraca
 * współrzędną y 3. void setX(int a): ustawia wartość współrz. x 4. void
 * setY(int b): ustawia wartość współrz. y 5. void show(): wyprowadza informację
 * o punkcie 6. double distance(Point p): zwraca odległość między naszym punktem
 * a punktem p
 * 
 * Obiekty tej klasy tworzy się następująco:
 * 
 * Point p = new Point(x, y); // x i y są współrzędnymi całkowitymi punktu p
 * 
 * Klasa Circle: 1. Point getCenter(): zwraca środek koła 2. int getRadius():
 * zwraca promień koła 3. void setCenter(Point c): ustawia środek koła 4. void
 * setRadius(int r): ustawia promień koła 5. void show(): wyprowadza informację
 * o kole 6. boolean inside(Point p): sprawdza, czy punkt p leży wewnątrz
 * naszego koła 7. boolean isBigger(Circle c): sprawdza, czy nasze koło jest
 * większe niż koło c 8. double area(): zwraca pole koła
 * 
 * Obiekty tej klasy tworzy się następująco:
 * 
 * Point p = new Point(x,y); // x i y są współrzędnymi całkowitymi punktu p
 * Circle c = new Circle(p, r); // koło c ma środek w punkcie p i promień
 * całkowity r
 * 
 * Korzystając z dostarczonych definicji klas Point, Circle napisać program,
 * który tworzy obiekty tych klas i testuje działania WSZYSTKICH metod. Dane
 * wejściowe (współrzędne, promienie) podać z okienka dialogowego.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie22 {
    public static void main(String[] args) {

        Input handler = new Input();

        // punkt
        Point p1 = new Point();

        p1.setX(handler.getInt("Podaj współrzędną x punktu (int)"));
        p1.setY(handler.getInt("Podaj współrzędną y punktu (int)"));

        p1.show();

        Point p2 = new Point(0, 0); // punk kontrolny

        System.out.println("Odległość p1(" + p1.getX() + ", " + p1.getY()
                + ") od punktu p2(" + p2.getX() + ", " + p2.getY() + ") = "
                + p1.distance(p2));

        System.out.println("--------");

        // koło
        Circle c1 = new Circle();

        int c1x = handler.getInt("Podaj współrzędną x środka koła (int)");
        int c1y = handler.getInt("Podaj współrzędną y środka koła (int)");
        int c1r = handler.getInt("Podaj promień koła (int)");

        c1.setCenter(new Point(c1x, c1y));
        c1.setRadius(c1r);

        c1.show();
        Circle c2 = new Circle(p2, 15);

        System.out.print("Koło o środku w punkcie (" + c1.getCenter().getX()
                + ", " + c1.getCenter().getY() + ") i promieniu "
                + c1.getRadius() + " jest ");

        if (c1.getRadius() == c2.getRadius()) {
            System.out.print("równe kołu");
        } else {
            if (c1.isBigger(c2)) {
                System.out.print("większe");
            } else {
                System.out.print("mniejsze");
            }
            System.out.print(" od koła");
        }

        System.out.println(" o środku w punkcie (" + c2.getCenter().getX()
                + ", " + c2.getCenter().getY() + ") i promieniu "
                + c2.getRadius());

        // porownanie
        System.out
                .print("Punkt p1(" + p1.getX() + ", " + p1.getY() + ") leży ");
        if (c1.inside(p1)) {
            System.out.print("wewnątrz");
        } else {
            System.out.print("na zewnątrz");
        }
        System.out.println(" koła o środku (" + c1.getCenter().getX() + ", "
                + c1.getCenter().getY() + ") i promieniu " + c1.getRadius());
    }
}
