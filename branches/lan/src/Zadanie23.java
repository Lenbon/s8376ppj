import school.Input;
import school.Point;

/**
 * Zadanie 23
 * 
 * Wzorując się na przykładzie, stworzyć własną klasę Point reprezentujacą
 * obiekty - punkty w układzie współrzędnych Oxy, z:
 * 
 * a) konstruktorami: Point(): tworzy punkt (0,0) Point(int a): tworzy punkt
 * (a,0), gdzie a jest liczbą całkowitą Point(int a, int b): tworzy punkt (a,b),
 * gdzie a,b są liczbami całkowitymi
 * 
 * b) metodami 1-6 z zadania 22 c) metodą 7: boolean parallel(Point p) która
 * zwraca true jeśli odcinek łączący punkt p z naszym punktem jest równoległy do
 * jednej z osi układu współrzędnych, false w przeciwnym przypadku.
 * 
 * Przetestować jeszcze raz.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie23 {
	public static void main(String[] args) {
		
		Input handler = new Input();
		
		Point p1 = new Point();
		p1.setX(handler.getInt("Podaj współrzędną x punktu p1 (int)"));
		p1.setY(handler.getInt("Podaj współrzędną y punktu p1 (int)"));
		p1.show();
		
		Point p2 = new Point();
		
		p2.setX(handler.getInt("Podaj współrzędną x punktu p2 (int)"));
		p2.setY(handler.getInt("Podaj współrzędną y punktu p2 (int)"));
		p2.show();

		System.out.print("Prosta łącząca punkty p1(" + p1.getX() + ", " + p1.getY() + ") i p2(" + p2.getX() + ", " + p2.getY() + ") leżące w odległości " + p1.distance(p2) + " od siebie ");
		if (p1.parallel(p2)) {
			System.out.println("jest");
		} else {
			System.out.println("nie jest");
			
		}
		System.out.println(" równoległa do jednej z osi układu współrzędnych");		
	}
}
