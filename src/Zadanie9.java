/**
 * Zadanie 9
 * 
 * Napisać program przekształcający dane o temperaturze podane w skali
 * Fahrenheita do skali Celsjusza. Dane wejściowe (w skali F.) podać w inicjacji
 * odpowiedniej zmiennej (typu double) w programie. Konwertować wynik do typu
 * int.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie9 {
    public static void main(String[] args) {
        double f = 125;
        int c = (int) ((5.0 / 9.0) * (f - 32.0));
        System.out.println("Wynik: " + c + "C");
    }
}
