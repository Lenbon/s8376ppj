import zadanie6.*;
import java.lang.reflect.*;

/**
 * Zadanie 6 (3p)
 *
 * Korzystając z refleksji, napisać program, który dla klasy podanej w pliku/ach
 * .class wypisuje raport zawierający informacje o:
 * a. wszystkich konstruktorach zadeklarowanych w tej klasie w formie:
 *  modyfikator nazwa (typy parametrów), np. public FirstClass(int, String),
 * b. wszystkich metodach zadeklarowanych w tej klasie w formie: modyfikator
 *  typWyniku nazwa (typyParametrów), np. private void set(boolean, int),
 * c. wszystkich atrybutach zadeklarowanych w tej klasie w formie: modyfikator
 *  typ nazwa, np. public static final java.awt.Color c,
 * d. wszystkich atrybutach zadeklarowanych w (bezpośredniej) nadklasie tej
 *  klasy, które są dostępne w tej klasie.
 *
 * Następnie na podstawie w/w informacji utworzyć nowy obiekt podanej klasy
 * za pomocą jedngeo z uzyskanych konstruktorów oraz wywołać na rzecz tego
 * obiektu metodę tej klasy. Dla uproszczenia można przyjąć, ze wybrany
 * konstruktor oraz metoda przyjmują jeden argument typu String.
 *
 * @version     $Id$
 */
public class Zadanie6
{
    public Zadanie6()
    {
        Dummy subject = new Dummy();

        Class c = subject.getClass();

        System.out.println("\nKonstruktory:\n");

        Constructor[] constructors = c.getDeclaredConstructors();

        for (Constructor construtor : constructors) {
            System.out.println(construtor.toGenericString());
        }

        System.out.println("\nMetody:\n");

        for (Method method : c.getDeclaredMethods()) {
            System.out.println(method.toGenericString());
        }

        System.out.println("\nPola:\n");

        for (Field field : c.getDeclaredFields()) {
            System.out.println(field.toGenericString());
        }

        System.out.println("\nPola klasy dziedziczonej:\n");

        for (Field superField : c.getSuperclass().getDeclaredFields()) {
            if (!Modifier.isPrivate(superField.getModifiers())) {
                System.out.println(superField.toGenericString());
            }
        }

        try {
            Constructor cconstructor = c
                    .getConstructor(java.lang.String.class);
            Dummy cc = (Dummy) cconstructor.newInstance("lipsum");

            System.out.println(cc.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        new Zadanie6();
    }
}
