package zadanie4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
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
    private Map<String, List<String>> _collection;

    /**
     * Dodaje do slownika nowe haslo wraz z pierwsza definicja
     * 
     * @param key
     * @param value
     * @return void
     */
    private void _addNew(String key, String value)
    {
        ArrayList<String> newValue = new ArrayList<String>();
        newValue.add(value);
        _collection.put(key, newValue);
    }

    /**
     * Konstruktor
     * 
     * @param path
     * @throws IOException
     */
    public Dictionary(String path) throws IOException
    {
        _path = path;
        _collection = new HashMap<String, List<String>>();
        read();
    }

    /**
     * Czyta zadany plik zapisujac dane do kolekcji
     * 
     * @throws IOException
     * @return void
     */
    public void read() throws IOException
    {
        FileReader fr = new FileReader(_path);
        BufferedReader br = new BufferedReader(fr);

        String line, key, value;
        while ((line = br.readLine()) != null) {
            try {
                String[] split = line.split("(={1})");
                key = split[0].trim();
                value = split[1].trim();

                if (_collection.containsKey(key)) {
                    _collection.get(key).add(value);
                } else {
                    _addNew(key, value);
                }
            } catch (Exception e) {
                //System.out.println("skipping");
            }
        }

        br.close();

        for (String string : _collection.keySet()) {
            Collections.sort(_collection.get(string));
        }
    }

    /**
     * Dla danego hasła podaje listę dostępnych, ponumerowanych definicji.
     * Lista ta jest posortowana według porządku leksykograficznego definicji.
     * 
     * @param key
     * @return void
     */
    public void lookup(String key)
    {
        if (_collection.containsKey(key)) {
            List<String> collection = _collection.get(key);

            System.out.println(key + ":");
            
            int no = 0;
            for (String string : collection) {
                System.out.println((++no) + ". " + string);
            }
        } else {
            System.out.println("Nie ma takiego hasła: " + key);
        }
    }

    /**
     * Dodaje do słownika hasło z definicją (o ile nie było ich wcześniej
     * w słowniku).
     * 
     * @param key
     * @param value
     * @return void
     */
    public void add(String key, String value)
    {
        if (_collection.containsKey(key)) {
            if (_collection.get(key).contains(value)) {
                System.out.println("Słownik zawiera już tę definicję: " + key
                        + " - " + value);
            } else {
                _collection.get(key).add(value);
                Collections.sort(_collection.get(key));
            }
        } else {
            _addNew(key, value);
        }
    }

    /**
     * Usuwa ze słownika podane hasło z definicją, wskazaną np. przez numer
     * porządkowy (patrz. punkt b.).
     * 
     * @return void
     */
    public void delete(String key, int index)
    {
        if (_collection.containsKey(key)) {
            if (_collection.get(key).size() <= 1) {
                _collection.remove(key);
            } else {
                _collection.get(key).remove(index);
            }
        } else {
            System.out.println("Słownik nie zawiera hasła: " + key);
        }
    }

    /**
     * Aktualizuje słownik, zamieniając starą definicję na nową dla podanego 
     * hasła.
     * 
     * @param key
     * @param index
     * @param definiton
     * @return void
     */
    public void update(String key, int index, String definiton)
    {
        if (_collection.containsKey(key)) {
            _collection.get(key).set(index, definiton);
        } else {
            System.out.println("Słownik nie zawiera hasła: " + key);
        }
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
//        FileWriter fw = new FileWriter(_path);
        BufferedWriter bw = new BufferedWriter(fw);

        for (String key : _collection.keySet()) {
            for (String value : _collection.get(key)) {
                bw.write(key + " = " + value);
                bw.newLine();
            }
        }

        bw.close();
    }
}
