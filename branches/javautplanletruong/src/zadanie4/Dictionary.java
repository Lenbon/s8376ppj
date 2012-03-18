package zadanie4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Dictionary
 * 
 * @version     $Id$
 */
public class Dictionary
{
    private String _path;
    private Map<Integer, List<String>> _collection;

    /**
     * Konstruktor
     * 
     * @param path
     * @throws IOException
     */
    public Dictionary(String path) throws IOException
    {
        _path = path;

        FileReader fr = new FileReader(_path);
        BufferedReader br = new BufferedReader(fr);

        HashMap<String, ArrayList<String>> _collection = new HashMap<String, ArrayList<String>>();

        String line;
        while (true) {
            line = br.readLine();
            if (line == null) {
                break;
            }

            String[] split = line.split("([ =]+)");

//System.out.println(line);

            ArrayList<String> list = new ArrayList<String>();
            list.add(split[1]);

            _collection.put(split[0], list);
        }

        System.out.println(_collection);

        br.close();
    }

    /**
     * Dla danego hasła podaje listę dostępnych, ponumerowanych definicji. 
     * Lista ta jest posortowana według porządku leksykograficznego definicji.
     * 
     * @return void
     */
    public void lookup()
    {

    }

    /**
     * Dodaje do słownika hasło z definicją (o ile nie było ich wcześniej
     * w słowniku).
     * 
     * @return void
     */
    public void add()
    {

    }

    /**
     * Usuwa ze słownika podane hasło z definicją, wskazaną np. przez numer
     * porządkowy (patrz. punkt b.).
     * 
     * @return void
     */
    public void delete()
    {

    }

    /**
     * Aktualizuje słownik, zamieniając starą definicję na nową dla podanego 
     * hasła.
     */
    public void update()
    {

    }

    /**
     * Zapisuje aktualny stan słownika do pliku wyjściowego.
     * 
     * @throws IOException 
     * @return void
     */
    public void save() throws IOException
    {
        FileWriter fw = new FileWriter(_path + "BKP");
        BufferedWriter bw = new BufferedWriter(fw);

// _collection

        bw.close();
    }

}
