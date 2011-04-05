
/**
 * Zadanie 2
 * (3p)
 * 
 * Zaprojektować i testować klasy Punkt (punkty na płaszczyźnie) oraz Odcinek (odcinki na płaszczyźnie) zawierającą m. in. następujące metody:

double dlugosc(): oblicza długość odcinka,
double odleglosc(Punkt p): oblicza odległość od środka odcinka do punktu p,
Odcinek dluzszy(Odcinek od): zwraca dłuższy z 2 odcinków,
int numer(): zwraca numer odcinka,
Odcinek rzutX(), Odcinek rzutY(): zwracają rzuty odcinka na os. X, Y,
public String toString(): wyprowadza informacje o odcinku (przedefiniowanie metody toString() z klasy Object).

Każdy odcinek powinien mieć swój unikalny numer (zaczynając od 1), nadany automatycznie przy jego tworzeniu.

Stworzyć w/w klasy w taki sposób, aby następujący program:

public class Test {

public static void main(String[] args)
{
Punkt p1 = new Punkt(0,0), p2 = new Punkt(3,4), p3 = new Punkt(2,3), p4 = new Punkt(4,0);

Odcinek od1 = new Odcinek(p1, p2), od2 = new Odcinek(p1, p4);
Odcinek[] odcinki = {od1, od2, new Odcinek(p3, p4)};

for (Odcinek od : odcinki)
System.out.println(od);

System.out.println("Długość odcinka " + od1.numer() + " = " + od1.dlugosc());
System.out.println("Odległość od punktu " +  p3 + " do środka odcinka " + od2.numer() + " = " + od2.odleglosc(p3));
System.out.println("Dłuższy odcinek to " + od2.dluzszy(odcinki[2]));
System.out.println("Rzut odcinka " + od1 + " na X to " + od1.rzutX());
System.out.println("Rzut odcinka " + od1 + " na Y to " + od1.rzutY());
// własna metoda najdluzszy(...) z klasy Test do napisania!
System.out.println("Najdłuższy odcinek to " + najdluzszy(odcinki));
}
}

wyprowadził na konsolę poniższe wyniki:

1:(0,0)-(3,4)
2:(0,0)-(4,0)
3:(2,3)-(4,0)
Długość odcinka 1 = 5.0
Odległość od punktu (2,3) do środka odcinka 2 = 3.0
Dłuższy odcinek to 2:(0,0)-(4,0)
Rzut odcinka 1:(0,0)-(3,4) na X to 4:(0,0)-(3,0)
Rzut odcinka 1:(0,0)-(3,4) na Y to 5:(0,0)-(0,4)
Najdłuższy odcinek to 1:(0,0)-(3,4)

 * @author s8376
 *
 */
public class Zadanie02 {
}
