import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Zadanie 2
 * 
 * Napisać program pokazujący drzewo katalogów/plików o podanym katalogu
 * początkowym - korzeniu. Nazwa katalogu - korzenia ma być wprowadzona do
 * programu ze standardowego wejścia (konsoli) korzystając z klasy
 * java.util.Scanner. Drzewo wynikowe zapisać do pliku tekstowego wyjściowego.
 * 
 * @version $Id$
 */
public class Zadanie2 implements FilenameFilter
{
    private String makeIdent(int num)
    {
        String result = "";

        for (int i = 0; i < num; i++) {
            result += "\t";
        }

        return result;
    }

    private void crawler(File file, BufferedWriter bw, int ident)
            throws IOException
    {
        File subFile;

        for (String s : file.list(this)) {
            subFile = new File(file.getPath() + "/" + s);

            if (subFile.isFile()) {
                bw.write(makeIdent((ident == 0 ? ident + 1 : ident))
                        + subFile.getName());
                bw.newLine();
            } else if (subFile.isDirectory()) {
                bw.write(makeIdent(ident) + "[" + subFile.getName() + "] ->");
                bw.newLine();
                crawler(subFile, bw, ident + 1);
            }
        }
    }

    public boolean accept(File dir, String name)
    {
        return !(name.startsWith(".svn"));
    }

    public void make(String path) throws IOException
    {
        FileWriter fw = new FileWriter("files/tree.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        crawler(new File(path), bw, 0);

        bw.close();

        System.out.println("OK");
    }

    public static void main(String[] args)
    {
        try {
            Zadanie2 crawler = new Zadanie2();
            Scanner sc = new Scanner(System.in);
            crawler.make(sc.nextLine());
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("Niepoprawna nazwa katalogu");
        }
    }
}
