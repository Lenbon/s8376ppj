import zadanie4.Dictionary;

/**
 * Zadanie 4
 * 
 * Stworzyć klasę Dictionary reprezentującą proste słowniki pojęć oraz
 * umożliwiającą szybkie wykonanie operacji na nich. Dane do słownika są pobrane
 * z pliku tekstowego, w którym każdy poprawny wiesz jest postaci:
 * hasło = definicja, przy czym jedno hasło może mieć kilka różnych definicji.
 * Klasa Dictionary powinna posiadać między innymi konstruktor
 * i metody podane poniżej:
 * 
 * a. konstruktor - tworzy słownik czytając plik wejściowy, zawierący hasła
 *  z definicjami. Niepoprawne (składniowo) wiersze pliku wejściowego
 *  są ignorowane podczas czytania.
 * b. lookup - dla danego hasła podaje listę dostępnych, ponumerowanych
 *  definicji. Lista ta jest posortowana według porządku leksykograficznego
 *  definicji.
 * c. add - dodaje do słownika hasło z definicją (o ile nie było ich wcześniej
 *  w słowniku).
 * d. delete - usuwa ze słownika podane hasło z definicją, wskazaną np. przez
 *  numer porządkowy (patrz. punkt b.).
 * e. update - aktualizuje słownik, zamieniając starą definicję na nową
 *  dla podanego hasła.
 * f. save - zapisuje aktualny stan słownika do pliku wyjściowego.
 * 
 * @version $Id$
 */
public class Zadanie4
{

    public static void main(String[] args)
    {
        try {
            Dictionary dictionary = new Dictionary("files/zadanie4.txt");
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

}
