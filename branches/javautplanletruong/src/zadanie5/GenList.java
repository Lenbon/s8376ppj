package zadanie5;

public class GenList<T extends Comparable<T>>
{
    Node<T> front, rear;
    int size;

    /**
     * Tworzy pustą listę z wartownikami
     */
    public GenList()
    {
        front = new Node<T>(null, null, null);
        rear = new Node<T>(null, null, null);

        front.setNext(rear);
        rear.setPrev(front);

        size = 0;
    }

    /**
     * Sprawdzanie, czy lista jest pusta
     * 
     * @return boolean
     */
    public boolean isEmpty()
    {
        if (front.getNext() == rear) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Zwraca pierwszy węzeł listy
     * 
     * @return Node<T>
     */
    public Node<T> first()
    {
        if (!isEmpty()) {
            return front.next;
        }

        return null;
    }

    /**
     * Zwraca ilosc wezlow listy
     * 
     * @return int
     */
    public int getSize()
    {
        return size;
    }

    /**
     * Zwraca ostatni węzeł listy
     * 
     * @return Node<T>
     */
    public Node<T> last()
    {
        if (!isEmpty()) {
            return rear.getPrev();
        }

        return null;
    }

    /**
     * Zwraca referencję do węzła n z listy, lub null jeśli takiego węzła
     * nie ma na liście
     * 
     * @param n
     * @return Node<T>
     */
    public Node<T> locate(Node<T> n)
    {
        if (!isEmpty()) {
            Node<T> node = front;
            while (node != rear.getPrev()) {
                node = node.getNext();
                if (node == n) {
                    return node;
                }
            }
        }

        return null;
    }

    /**
     * Dodaje węzeł n (jeśli nie było go wcześniej) na początek listy i zwraca
     * zmodyfikowaną listę
     * 
     * @param n
     * @return GenList<T> 
     */
    public GenList<T> push(Node<T> n)
    {
        Node<T> testNode = locate(n);

        if (testNode == null) {
            Node<T> node = front.getNext();
            front.setNext(n);
            n.setPrev(front);
            node.setPrev(n);
            n.setNext(node);

            size++;
        }

        return this;
    }

    /**
     * Dodaje węzeł n (jeśli nie było go wcześniej) na koniec listy i zwraca
     * zmodyfikowaną listę
     * 
     * @param n
     * @return GenList<T>
     */
    public GenList<T> inject(Node<T> n)
    {
        Node<T> testNode = locate(n);

        if (testNode == null) {
            Node<T> node = rear.getPrev();
            node.setNext(n);
            n.setPrev(node);
            rear.setPrev(n);
            n.setNext(rear);

            size++;
        }

        return this;
    }

    /**
     * Dodaje do listy węzeł n (jeśli nie było go wcześniej) na pozycji
     * pos (licząc od 0) i zwraca zmodyfikowaną listę
     * 
     * @param n
     * @param pos
     * @return GenList<T>
     */
    public GenList<T> insert(Node<T> n, int pos)
    {
        if (!isEmpty()) {
            Node<T> testNode = locate(n);
            if (testNode == null) {
                Node<T> iNode = front;
                int counter = 0;
                while (iNode != rear.getPrev()) {
                    iNode = iNode.getNext();
                    counter++;

                    if (counter == pos) {
                        Node<T> bNode = iNode.getNext();
                        iNode.setNext(n);
                        n.setPrev(iNode);
                        bNode.setPrev(n);
                        n.setNext(bNode);

                        size++;
                    }
                }
            }
        }

        return this;
    }

    /**
     * Usuwa z listy pierwszy węzeł i zwraca zmodyfikowaną listę
     * 
     * @return GenList<T> 
     */
    public GenList<T> pop()
    {
        if (!isEmpty()) {
            Node<T> node = front.getNext();
            front.setNext(node.getNext());
            node.getNext().setPrev(front);

            node = null;
            size--;
        }

        return this;
    }

    /**
     * Usuwa z listy ostatni węzeł i zwraca zmodyfikowaną listę
     * 
     * @return GenList<T>
     */
    public GenList<T> eject()
    {
        if (!isEmpty()) {
            Node<T> node = rear.getPrev();
            rear.setPrev(node.getPrev());
            node.getPrev().setNext(rear);

            node = null;
            size--;
        }

        return this;
    }

    /**
     * Usuwa z listy węzeł na pozycji pos i zwraca zmodyfikowaną listę
     * 
     * @param pos
     * @return GenList<T>
     */
    public GenList<T> delete(int pos)
    {
        if (!isEmpty()) {
            Node<T> iNode = front;
            int counter = 0;
            while (iNode != rear.getPrev()) {
                iNode = iNode.getNext();
                counter++;

                if (counter == pos) {
                    iNode.getPrev().setNext(iNode.getNext());
                    iNode.getNext().setPrev(iNode.getPrev());

                    iNode = null;
                    size--;
                }
            }
        }

        return this;
    }

    /**
     * Zwraca referencję do węzła z listy na pozycji pos (licząc od 0),
     * lub null, jeśli takiego węzła nie ma na liście,
     * 
     * @param pos
     * @return Node<T>
     */
    public Node<T> retrieve(int pos)
    {
        if (!isEmpty()) {
            Node<T> iNode = front;
            int counter = 0;
            while (iNode != rear.getPrev()) {
                iNode = iNode.getNext();
                counter++;

                if (counter == pos) {
                    return iNode;
                }
            }

        }

        return null;
    }

    /**
     * Zwraca referencję do węzła listy z najmniejszą wartością według
     * zdefiniowanego porządku naturalnego w klasie T
     * 
     * @return Node<T>
     */
    public Node<T> min()
    {
        if (!isEmpty()) {
            Node<T> iNode = front;
            Node<T> rNode = null;
            boolean firstFlag = false;

            while (iNode != rear.getPrev()) {
                iNode = iNode.getNext();

                if (firstFlag == false) {
                    rNode = iNode;
                    firstFlag = true;
                } else if (rNode.compareTo(iNode.getValue()) < 0) {
                    rNode = iNode;
                }
            }

            return rNode;
        }

        return null;
    }

    /**
     * Wypisuje informacje o wszystkich węzłach z listy, w kolejności
     * od lewej do prawej
     * 
     * @return void
     */
    public void printLR()
    {
        if (!isEmpty()) {
            Node<T> iNode = front;

            while (iNode != rear.getPrev()) {
                iNode = iNode.getNext();
                System.out.println(iNode.toString());
            }
        }
    }

    /**
     * Wypisuje informacje o wszystkich węzłach z listy, w kolejności
     * od prawej do lewej
     * 
     * @return void
     */
    public void printRL()
    {
        if (!isEmpty()) {
            Node<T> iNode = rear;

            while (iNode != front.getNext()) {
                iNode = iNode.getPrev();
                System.out.println(iNode.toString());
            }
        }
    }
}
