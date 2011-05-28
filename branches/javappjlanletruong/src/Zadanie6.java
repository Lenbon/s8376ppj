import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Zadanie 6
 * 
 * Opracować algorytm symulujący działanie uproszczonego procesu wypłacania
 * pieniędzy z bankomatu. Z bankomatu można wypłacić tylko banknoty o
 * nominałach: 50 zł i 100 zł. Klient wprowadza kwotę pieniędzy do wypłaty.
 * Bankomat, o ile jest to możliwe, wydaje żądaną kwotę pieniędzy klientowi. W
 * przypadku braku możliwości wypłacenia podanej kwoty, bankomat wyprowadza
 * odpowiedni komunikat, zaś klient ma możliwość rezygnacji z całej operacji lub
 * podania innej kwoty kontynując operację. Zalóżmy, że w bankomacie znajduje
 * się nieograniczona ilość banknotów o podanych nominałach. Przedstawić
 * algorytm w pseudo-kodzie.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie6 {
    public static void main(String[] args) {
        boolean flag = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int amount = 0;

        do {
            try {
                System.out.println("Podaj kwotę: ");
                amount = Integer.parseInt(br.readLine());

                if (amount % 50 != 0) {
                    System.out
                            .println("Brak nominału, żeby wypłacić taką kwotę: "
                                    + amount);
                    throw new IOException();
                }
                if (amount <= 0) {
                    System.out.println("Podaj poprawną kwotę");
                    throw new IOException();
                }
                flag = true;
            } catch (NumberFormatException e) {
                System.out.println("Niepoprawny format wprowadzonej kwoty");
                flag = false;
            } catch (IOException e) {
                flag = false;
            }
        } while (flag == false);

        int numberOf100 = 0;
        int numberOf50 = 0;

        if (amount < 100) {
            numberOf50 = 1;
        } else {
            numberOf100 = amount / 100;
            if (amount % 100 != 0) {
                numberOf50 = 1;
            }
        }

        System.out.println("Wypłacam banknoty:\n" + "nominał 100PLN: "
                + numberOf100 + "\n" + "nominał 50PLN: " + numberOf50);
    }
}
