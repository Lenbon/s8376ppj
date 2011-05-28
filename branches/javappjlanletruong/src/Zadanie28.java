/**
 * Zadanie 28
 * 
 * W głównej funkcji main(...) zainicjować tablicę 10 elementową liczbami całkowitymi.
 * Napisać oraz testować następujące metody:
 * *     void parzyste(int[] tab), która zwraca liczby parzyste z podanej tablicy tab,
 * *     int[] nieParzyste(int[] tab), która zwraca nową tablicę zawierającą liczby
 * nieparzyste z podanej tablicy tab,
 * *     int sumaNieparzystych(int[] tab), która zwraca sumę liczb o indeksach
 * nieparzystych z tablicy tab.
 * 
 * @author s8376
 * @version $Revison$
 */
public class Zadanie28 {
    public static void main(String[] args) {
        int[] tab = { -4, -3, -2, -1, 0, 1, 2, 3, 4, 5 };

        parzyste(tab);

        System.out.println("---------------------");

        int[] newTab = nieParzyste(tab);
        for (int val : newTab) {
            System.out.println(val);
        }

        System.out.println("---------------------");

        int result = sumaNieparzystych(tab);
        System.out.println(result);
    }

    public static void parzyste(int[] tab) {
        String result = "";

        for (int val : tab) {
            if (val % 2 == 0) {
                result += val + ", ";
            }
        }

        System.out.println(result);
    }

    public static int[] nieParzyste(int[] tab) {
        int newTabLenght = 0;

        for (int val : tab) {
            if (val != 0 && val % 2 != 0) {
                ++newTabLenght;
            }
        }

        int[] result = new int[newTabLenght];
        int x = 0;

        for (int val : tab) {
            if (val != 0 && val % 2 != 0) {
                result[x] = val;
                ++x;
            }
        }

        return result;
    }

    public static int sumaNieparzystych(int[] tab) {
        int result = 0;
        int counter = tab.length;

        for (int x = 0; x < counter; ++x) {
            if (x % 2 != 0) {
                //				System.out.println("" + x + " - " + tab[x]);
                result += tab[x];
            }
        }

        return result;
    }
}
