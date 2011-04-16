import java.util.HashMap;
import java.util.Set;

class Student {	
	
	// inne pola
	
	HashMap<Przedmiot, double[]> wyniki;
	
	Student()
	{
		wyniki = new HashMap<Przedmiot, double[]>();
	}
}

class Przedmiot {
	
	String nazwa;	
	
	Przedmiot(String n)
	{
		nazwa = n;
	}
	
	public String toString()
	{
		return nazwa;
	}
}

public class Mapa{

	public static void main(String[] args)
	{
		Przedmiot p1 = new Przedmiot ("PPJ"),
				  p2 = new Przedmiot ("GUI"),
			  	  p3 = new Przedmiot ("MAD");
		
			// Utworzenie obiektu klasy HashMap, który umo¿liwia ³atwe 
			// odnajdywanie informacji wed³ug kluczy.
		HashMap<Przedmiot,double[]> wyniki = new HashMap<Przedmiot,double[]>();
		
			// Do obieku klasy HashMap dodajemy pary (klucz, wartoœæ)
			// za pomoca metody put 
			// np. pod kluczem-przedmiotem PPJ mamy wartoœæ-tablicê 2 ocen  
		wyniki.put(p1, new double[]{3,4});
		wyniki.put(p2, new double[]{3.5,5});
		wyniki.put(p3, new double[]{3,4}); 
	
			// Zbior kluczy obiektu klasy HashMap
		Set<Przedmiot> klucze = wyniki.keySet();

        double[] listaOcen = null;
        
			// Ze zbioru kluczy uzyskujemy wszystkie klucze
        for (Przedmiot p : klucze) {
        	
            	// Wartoœæ dla danego klucza
            listaOcen = wyniki.get(p);
   
        	System.out.println("Oceny przedmiotu " + p + ": " + 
        		listaOcen[0] + ", " + listaOcen[1]);
        }
	}
}
