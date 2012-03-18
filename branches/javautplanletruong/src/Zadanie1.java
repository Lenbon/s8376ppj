import zadanie1.*;

/**
 * Zadanie 1
 * 
 * Rozszerzyć klasę java.io.File, dostarczając użytecznych metod:
 * 
 * a) (3p) zwracającą listę plików w danym katalogu i wszystkich jego podkatalogach (rekursywnie):
 * 
 * List<File> listFilesRecurse() 
 * List<File> listFilesRecurse(FilenameFilter) - z podanym filtrem/wzorcem dla nazw wynikowych plików
 * 
 * b) (2p) j.w. ale zwracającą listę katalogów  (rekursywnie):
 * List<File> listDirsRecurse() 
 * List<File> listDirsRecurse(FilenameFilter) - z podanym filtrem/wzorcem dla nazw wynikowych katalogów
 * 
 * c) (1p) usuwającą niepusty katalog:
 * boolean deleteDir() - najpierw usuwane są wszystkie jego pliki/podkatalogi potem usuwany jest sam katalog (pusty)
 * 
 * Przetestować wszystkie w/w metody.
 * 
 * @version $Id$
 */
public class Zadanie1
{

    public static void main(String[] args)
    {
        Plik file = new Plik("files/doctree");

        System.out.println(file.listFilesRecurse());

        System.out.println(file.listFilesRecurse(new FileNameFilter()));

    }
}
