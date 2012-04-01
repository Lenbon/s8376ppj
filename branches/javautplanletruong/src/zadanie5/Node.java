package zadanie5;

public class Node<T> implements Comparable<T>
{
    T value;
    Node<T> next, prev;

    /**
     * Nowy węzeł z podanymi składowymi,
     */
    public Node(T value, Node<T> next, Node<T> prev)
    {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
    
    /**
     * Wypisuje informacje o wezle
     * 
     * @return String
     */
    public String toString()
    {
        return "" + value;
    }

    public Node<T> getNext()
    {
        return next;
    }
    
    public Node<T> getPrev()
    {
        return prev;
    }
    
    public T getValue() 
    {
        return value;
    }
    
    public void setNext(Node<T> t)
    {
        next = t;
    }

    public void setPrev(Node<T> t)
    {
        prev = t;
    }

    @Override
    public int compareTo(T o)
    {
//        if (value < o) {
//            
//        }

        return 0;
    }
}
