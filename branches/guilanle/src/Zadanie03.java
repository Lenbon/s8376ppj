import zadanie03.*;

/**
 * Zadanie 3 (4p)
 * 
 * Napisać program symulujący operacje na prostych kontach bankowych różnych typów.
 *
 * Każde konto - obiekt klasy Rachunek posiada właściciela (obiekt klasy Osoba)
 * oraz stan konta. Dostępne są  3 operacje na koncie: wpłata, wypłata, przelew.
 * Klasa Konto (dziedzicząca z klasy Rachunek) reprezetuje konta, które
 * dodatkowo posiadają możliwość doliczenia do stanu kont odsetek na podstawie
 * podanego oprocentowania.
 * Każde konto - obiekt klasy KontoVIP (dziedziczącej z klasy Konto) posiada
 * dodatkowo limit debetu.
 *
 * Konto posiada możliwość aktualizacji, w szczególności: dla konta typu Konto
 * dolicza odsetki do stanu, dla konta typu KontoVIP dodatkowo podaje ilość prób
 * przekroczenia limitu debetu.
 *
 * Każde konto powinien mieć swój unikalny numer (zaczynając od 1), nadany
 * automatycznie przy jego tworzeniu.
 * 
 * Stworzyć w/w klasy w taki sposób, aby następujący program:
 * 
 * public class Bank {
 *
 *     public static void main(String[] args)
 *     {
 *         Osoba klient1 = new Osoba("jan"), klient2 = new Osoba("anna");
 *         Osoba[] klienci = new Osoba[] {klient1, klient2, new Osoba("maria")};
 *
 *         for (Osoba o: klienci)
 *             System.out.print(o + "  ");
 *         System.out.println("\n");
 *
 *         Rachunek konto1 = new Rachunek(klient1);
 *         Rachunek konto2 = new Konto(klient2, 2);    // oprocentowanie: 2%
 *         Rachunek[] konta = {konto1,
 *                             konto2,
 *                             new KontoVIP(klienci[2], 5, -100)};    // oprocentowanie: 5%, limit debetu: -100
 *
 *         konto1.wplata(500);
 *         konto2.wplata(900);
 *         konto2.wyplata(300);
 *         konto1.przelew(konto2, 200);
 *
 *         for (Rachunek k: konta)
 *             System.out.println(k);
 *
 *         System.out.println();
 *
 *         konta[2].wyplata(101);
 *         konto2.przelew(konta[2], 801);
 *
 *         System.out.println();
 *
 *         konto2.przelew(konta[2], 700);
 *
 *         konta[2].przelew(konto1, 801);
 *         System.out.println();
 *
 *         konta[2].przelew(konto1, 800);
 *
 *         for (Rachunek k: konta)
 *             System.out.println(k);
 *
 *         System.out.println();
 *
 *         for (Rachunek k: konta)
 *             k.aktualizuj();
 *
 *         System.out.println();
 *
 *                 // własna metoda rekord(...) z klasy Bank do napisania!
 *         System.out.println("Konto z największym stanem - " + rekord(konta));
 *     }
 * }
 * 
 * wyprowadził na konsolę poniższe wyniki:
 *
 * jan  anna  maria
 *
 * Konto nr 1: jan, stan 300.0
 * Konto nr 2: anna, stan 800.0, oprocentowanie 2.0
 * Konto nr 3: maria, stan 0.0, oprocentowanie 5.0, limit debetu -100.0
 *
 * Konto nr 3: maria, stan 0.0, oprocentowanie 5.0, limit debetu -100.0 - nie dozwolona operacja: wypłata!
 * Konto nr 2: anna, stan 800.0, oprocentowanie 2.0 - nie dozwolona operacja: przelew!
 *
 * Konto nr 3: maria, stan 700.0, oprocentowanie 5.0, limit debetu -100.0 - nie dozwolona operacja: przelew!
 *
 * Konto nr 1: jan, stan 1100.0
 * Konto nr 2: anna, stan 100.0, oprocentowanie 2.0
 * Konto nr 3: maria, stan -100.0, oprocentowanie 5.0, limit debetu -100.0
 *
 * Konto nr 1: jan, stan 1100.0
 * Konto nr 2: anna, stan 102.0
 * Konto nr 3: maria, stan -100.0 - ilość prób przekroczenia debetu  2!
 *
 * Konto z największym stanem - Konto nr 1: jan, stan 1100.0
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie03 {

	public static void main(String[] args) {
		Osoba klient1 = new Osoba("jan"), klient2 = new Osoba("anna");
		Osoba[] klienci = new Osoba[] { klient1, klient2, new Osoba("maria") };

		for (Osoba o : klienci) {
			System.out.print(o + "  ");
		}
		System.out.println("\n");

		Rachunek konto1 = new Rachunek(klient1);
		Rachunek konto2 = new Konto(klient2, 2); // oprocentowanie: 2%
		Rachunek[] konta = { konto1, konto2, new KontoVIP(klienci[2], 5, -100) }; // oprocentowanie: 5%, limit debetu: -100

		konto1.wplata(500);
		konto2.wplata(900);
		konto2.wyplata(300);
		konto1.przelew(konto2, 200);

		for (Rachunek k : konta) {
			System.out.println(k);
		}

		System.out.println();

		konta[2].wyplata(101);
		konto2.przelew(konta[2], 801);

		System.out.println();

		konto2.przelew(konta[2], 700);

		konta[2].przelew(konto1, 801);
		System.out.println();

		konta[2].przelew(konto1, 800);

		for (Rachunek k : konta) {
			System.out.println(k);
		}

		System.out.println();

		for (Rachunek k : konta) {
			k.aktualizuj();
		}

		System.out.println();

		// własna metoda rekord(...) z klasy Bank do napisania!
		System.out.println("Konto z największym stanem - " + rekord(konta));
	}

	public static String rekord(Rachunek[] konta) {
		double value = 0.0;
		String output = "";
		boolean flag = false;
		for (Rachunek val : konta) {
			if (!flag) {
				value = val.getBalance();
				output = val.toString();
				flag = true;
			}
			if (value < val.getBalance()) {
				value = val.getBalance();
				output = val.toString();
			}
		}

		return output;
	}
}
