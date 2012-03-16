import zadanie1.*;

/**
 * 
 * @author      s8376
 * @version     $Id$
 */
public class Zadanie1 {

	public static void main(String[] args) {
		Plik file = new Plik("files/doctree"); 
	
		System.out.println(file.listFilesRecurse());
		
		System.out.println(file.listFilesRecurse(new FileNameFilter()));
		
		
	}
}
