import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JOptionPane;

import zadanie3.Student;

/**
 * Zadanie 3
 * 
 * W nieskończonej pętli, za pośrednictwem okienka dialogowego, dostarcza się 
 * do kolekcji dane kolejnego studenta w postaci:
 * 
 * nazwisko    imię    numerIndeksu    średnia
 * Liczba studentów jest dowolna.
 * 
 * W tym samym okienku dialogowym, w dowolnym momencie (np. pomiędzy 
 * wprowadzeniem danych dwóch kolejnych studentów) użytkownik może wprowadzić 
 * odp. polecenie do wydrukowania na konsoli odp. wyników dotyczących dotychczas
 * wprowadzonych studentów. 
 * 
 * Możliwe polecenia z wynikami na konsoli:
 * 
 * 1.  average - średnia ocen wszystkich studentów,
 * 2.  surname - lista unikalnych nazwisk studentów,
 * 3.  name - lista unikalnych imion studentów,
 * 4.  id - lista numerów indeksu studentów,
 * 5.  all - posortowana lista wszystkich studentów, według kryteriów 
 * uporządkowania: najpierw numery indeksu są porównywane, potem nazwiska, 
 * dalej imiona a na końcu średnie ocen.
 * 
 * Wyjście z programu następuje po naciśnięciu przycisku "Cancel".
 * 
 * @version $Id$
 */
public class Zadanie3
{
    private List<Student> _collection;

    private void _average()
    {
        float average = 0;
        int counter = 0;

        for (Student student : _collection) {
            average += student.getAverage();
            counter++;
        }

        System.out.println(average / counter);
    }

    @SuppressWarnings("unchecked")
    private void _all()
    {
        Collections.sort(_collection);

        for (Student student : _collection) {
            System.out.println(student);
        }
    }

    private void _id()
    {
        for (Student student : _collection) {
            System.out.println(student.getIndex());
        }
    }

    private void _name()
    {
        Set<String> set = new HashSet<String>();

        for (Student student : _collection) {
            set.add(student.getName());
        }

        _printNames(set);
    }

    private void _surname()
    {
        Set<String> set = new HashSet<String>();

        for (Student student : _collection) {
            set.add(student.getSurname());
        }

        _printNames(set);
    }

    private void _printNames(Set<String> set)
    {
        for (String name : set) {
            System.out.println(name);
        }
    }

    public Zadanie3()
    {
        _collection = new ArrayList<Student>();
    }

    public void parse()
    {
        String input;

        while (true) {
            input = JOptionPane.showInputDialog("Podaj dane studenta:");

            if (input == null) {
                break;
            }

            if (input.equals("average")) {
                _average();
            } else if (input.equals("surname")) {
                _surname();
            } else if (input.equals("name")) {
                _name();
            } else if (input.equals("id")) {
                _id();
            } else if (input.equals("all")) {
                _all();
            } else {
                _collection.add(new Student(input));
            }

            System.out.println(input);

        }
    }

    public static void main(String[] args)
    {
        Zadanie3 zadanie = new Zadanie3();
        zadanie.parse();
    }
}
