/**
 * Zadanie5
 * 
 * Zaprojektować i testować opisane niżej klasy sparametryzowane.
 * 
 * GenList - klasa reprezentująca dwu-kierunkową listę dowiązaniową węzłów 
 * z wartownikami przed pierwszym i po ostatnim węzle.
 * 
 * Każdy węzeł listy, będący elementem klasy Node jest identyfikowany przez 
 * wartość węzła oraz referencje do następnego/poprzedniego węzła na liście. 
 * Wartość węzła jest obiektem DOWOLNEJ klasy (T) posiadającej naturalny 
 * porządek (tj. klasy implementującej sparametryzowanej wersji  interfejsu 
 * Comparable).
 * 
 * Lista jest identyfikowana przez referencje do swoich wartowników 
 * (początkowego i końcowego) oraz ilość faktycznych węzłów (bez wartowników) 
 * na liście.
 * 
 * Node <...T...>:
 *  T value;
 *  Node<T> next, prev;
 *  
 * GenList <...T...>:
 *  Node<T> front, rear;
 *  int size;
 * 
 * Zrealizować m.in. poniższe konstruktory/metody, o  następujących sygnaturach:
 * 
 * Klasa Node:
 * 
 * a. Node(T value, Node<T> next, Node<T> prev) - utworzy nowy węzeł 
 *  z podanymi składowymi,
 *  b. public String toString() - wypisuje informacje o węzle.
 *  
 * Klasa GenList:
 *  
 * a. GenList() - utworzy pustą listę z wartownikami,
 * b. boolean  isEmpty() - sprawdzanie, czy lista jest pusta,
 * c. Node<T>  first() - zwraca pierwszy węzeł listy,
 * d. Node<T>  last() - zwraca ostatni węzeł listy,
 * e. Node<T>  locate(Node<T> n) - zwraca referencję do węzła n z listy, 
 *  lub null jeśli takiego węzła nie ma na liście,
 * f. GenList<T> push(Node<T> n) - dodaje węzeł n (jeśli nie było go wcześniej)
 *  na początek listy i zwraca zmodyfikowaną listę,
 * g. GenList<T>  inject(Node<T> n) - dodaje węzeł n (jeśli nie było
 *  go wcześniej) na koniec listy i zwraca zmodyfikowaną listę,
 * h. GenList<T>  insert(Node<T> n, int pos) - dodaje do listy węzeł n 
 *  (jeśli nie było go wcześniej) na pozycji pos (licząc od 0) i zwraca 
 *  zmodyfikowaną listę,
 * i. GenList<T>  pop() - usuwa z listy pierwszy węzeł i zwraca zmodyfikowaną
 *  listę,
 * j. GenList<T>  eject() - usuwa z listy ostatni węzeł i zwraca zmodyfikowaną 
 *  listę,
 * k. GenList<T>  delete(int pos) - usuwa z listy węzeł na pozycji pos 
 *  i zwraca zmodyfikowaną listę,
 * l. Node<T>  retrieve(int pos) - zwraca referencję do węzła z listy na pozycji
 *  pos (licząc od 0), lub null, jeśli takiego węzła nie ma na liście,
 * m. Node<T> min() - zwraca referencję do węzła listy z najmniejszą wartością
 *  według zdefiniowanego porządku naturalnego w klasie T,
 * n. void  printLR() - wypisuje informacje o wszystkich węzłach z listy,
 *  w kolejności od lewej do prawej,
 * o. void  printRL() - wypisuje informacje o wszystkich węzłach z listy,
 *  w kolejności od prawej do lewej.
 * 
 * W celu testowania, oprócz korzystania z gotowych klasy Javy (np. String, 
 * Integer, ...) stworzyć własne klasy posiadające naturalne porządki między 
 * elementami, np: Figura i rozszerzające ją Kolo, Prostokat z następującymi 
 * kryteriami uporządkowania: porównujemy najpierw wartości pola, w dalszej 
 * kolejności wartości obwodu, potem numery figur (automatycznie nadane 
 * przy tworzeniu).
 * 
 * @version $Id$
 */
public class Zadanie5
{
    public static void main(String[] args)
    {

    }
}
