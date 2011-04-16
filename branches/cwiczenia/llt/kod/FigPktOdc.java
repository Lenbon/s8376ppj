import java.util.*;

public class FigPktOdc {

	public static void main(String[] args) 
	{
			// punkty
		Punkt p1 = new Punkt(3,4), p2 = new Punkt(0,0),
			  p3 = new Punkt(2,3), p4 = new Punkt(4,0);

			// lista punktow
		List<Punkt> listaP = new ArrayList<Punkt>();
		listaP.add(p1); listaP.add(p2); listaP.add(p3); listaP.add(p4);
		
		System.out.print("Punkty przed sortowaniem: ");	
		for (Punkt p : listaP)
			System.out.print(p + " ");
		System.out.println();
		
		Collections.sort(listaP);	// sortowanie listy punktow wedlug porzadku naturalnego miedzy punktami
		
		System.out.print("Punkty po sortowaniu:     ");
		for (Punkt p: listaP)
			System.out.print(p + " ");
		System.out.println("\n-----");
		
		
		Odcinek od1 = new Odcinek(p1, p4), od2 = new Odcinek(p1, p2); // odcinki
		Odcinek[] tabOd = {od1, od2, new Odcinek(p3, p4)};			  // tablica odcinkow
		
		System.out.print("Odcinki przed sortowaniem: ");	
		for (Odcinek od : tabOd)
			System.out.print(od + " ");
		System.out.println();
		
		Arrays.sort(tabOd);	// sortowanie tablicy odcinkow wedlug porzadku naturalnego miedzy odcinkami
		
		System.out.print("Odcinki po sortowaniu:     ");			
		for (Odcinek od : tabOd)
			System.out.print(od + " ");
		System.out.println("\n-----");
	
		
			// tablica figur
		Figura tabFig[] = new Figura[]{
				new Prostokat(1, 1, 4, 9),
				new Kolo(1, 1, 5),
				new Prostokat(2, 2, 6, 6)};
		
			// lista figur
		List<Figura> listaFig = new ArrayList<Figura>();
		for (Figura f : tabFig)
			listaFig.add(f);
			
			// zbior figur, posortowany wzgledem porzadku naturalnego miedzy figurami
		Set<Figura> zbiorFig = new TreeSet<Figura>(listaFig);
		
		System.out.println("Figury przed sortowaniem: ");	
		for (Figura f : listaFig)
			System.out.println(f);
		System.out.println();
				
		System.out.println("Figury po sortowaniu:     ");	
		for (Figura f : zbiorFig)
			System.out.println(f);
		System.out.println();
	}
}
