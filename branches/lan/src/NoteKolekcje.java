//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.TreeMap;
//import java.util.TreeSet;
//
//
//public class NoteKolekcje {
////	relacja zwrotna: tablica musi zawierać wszystkie pary : x,x
////	relacja symetryczna: musi zawierac pary : x,y i y,x
//	
//	
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//	
//		// Pojęcia kolekcja:
//		// lista - rozwinięcie tablicy
//		// zbiór - lista unikalnych elementów bez indeksów HashSet
//		// mapa - zbiór par: klucz wartość; klucz może być dowolnego typu HashMap
//		
//		
//		
//		
//		ArrayList list = new ArrayList();
//		
//		list.add(12);
//		list.add(13);
//		list.add("22");
//		list.add(14);
//		list.add(15);
//		
//		
//		
//		
//		for (Object e: list) {
//			if (e instanceof Integer) {
//				System.out.println(e);
//			} else {
//				System.out.println("ERROR1");
//			}
//		}
//		
//		HashSet<String> zbior = new HashSet<String>();
//		zbior.add("Ala");
//		zbior.add("Ma");
//		zbior.add("Kota");
//		zbior.add("Kota");
//		
//		for (Object val : zbior) {
//			System.out.println(val);
//		}
//		
//		TreeSet tree = new TreeSet();
//		tree.add(123);
//		
//		
//		// mapa
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
//		map.put(1, "Pierwszy");
//		map.put(2, "Drugi");
//		map.put(3, "Trzeci");
//		map.put(2, "Czwarty(nadpisuje Drugi)");
//		
////		map.
//		
//		System.out.println(map.get(2));
//		
//		TreeMap<String, String> treeMap = new TreeMap<String, String>();
//		treeMap.put("Ala", "Różowy");
//		treeMap.put("Kamila", "Żółty");
//		treeMap.put("Beata", "Niebieski");
//		treeMap.put("Ilona", "Zielony");
//		
////		treeMap.
//		
//		
//	}
//	
//}
