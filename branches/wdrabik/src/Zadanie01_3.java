import javax.swing.JOptionPane;

/**
 * Zadanie 3 - symulacja gry w totolotka
 * 
 * Napisać i przetestować program w Javie symulujący grę w TotoLotka.
 * 
 * Etap-1: wybór przez użytkownika 6 różnych liczb całkowitych z przedziału [1,49]
 * Etap-2: losowanie przez generator 6 losowych, różnych liczb całkowitych z przedziału [1,49]
 * Etap-3: szybkie porównanie wyników losowania – określenie ilości trafień
 *    
 * W programie mogą być pomocne takie elementy jak:
 * 
 * * wprowadzanie danych (z konsoli, z okienek dialogowych)
 * * tablice,
 * * pętle iteracyjne,
 * * funkcje
 * * sortowanie danych
 * * obsługa wyjatków (jeżeli taka obsługa jest konieczna)
 * * użycie klasy BigInteger i operacji bitowych do porównania wyników
 * * użycie klasy Math lub Integer do generowania liczb losowych
 * * wyprowadzenie danych (na konsolę,do okienek dialogowych)
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie01_3 {
	public static Integer[] sort(Integer[] array) {
		return array;
	}
	public static void main(String[] args) {
		Integer[] user = new Integer[6];
		Integer[] machine = new Integer[6];

//		Integer inputInteger;
//		String input, message = "";
//		String[] array;
//		boolean inputFlag = false;
//		
//		while (inputFlag == false) {
//			try {
//				input = JOptionPane.showInputDialog((message.length() > 0 ? message + "\n" : "") + "Podaj ciąg znaków:");
//				if (input == null) {
//					System.exit(0);
//				}
//				array = input.split(" ");
//			
//				if (array.length != 6) {
//					throw new Exception("Podaj dokładnie 6 liczb");
//				}
//				for (int x = 0; x < array.length; x++) {
//					try {
//						inputInteger = Integer.parseInt(array[x]);
//						if (inputInteger < 1 || inputInteger > 49) {
//							throw new Exception("Podane liczby muszą być z zakresu 1 - 49 (podano " + inputInteger + ")");	
//						}
//						for (Integer val : user) {
//							if (val.equals(input)) {
//								throw new Exception("Zdublowana liczba " + inputInteger);		
//							}
//						}
//						user[x] = inputInteger;
//					} catch (NumberFormatException e) {
//						throw new Exception("Nieprawidłowy format danych wejściowych.\nSpróbuj: 1 2 3 4 5 6");
//					}
//				}
//				
//				inputFlag = true;
//			} catch (Exception e) {
//				message = e.getMessage();
//				inputFlag = false;
//			}
//		}
//		
//		user = sort(user);
		
		
		
		System.out.println((1 + (int) Math.random() * 48));
		System.exit(0);
		
		boolean randomFlag;
		int machineItems = 0, random;

		while (machineItems < 6) {
			randomFlag = true;
			random = (1 + (int) Math.random() * 48);

			for (Integer val : user) {
				if (val.equals(random)) {
					randomFlag = false;
					break;
				}
			}
			if (randomFlag == true) {
				machine[machineItems] = random;
				machineItems++;
			}
		}

//		machine = sort(machine);
		
//		System.out.println("Liczby podane przez użytkownika:");

//		for (Integer val : user) {
//			System.out.print(" " + val);
//		}

		System.out.println("\nLiczby podane przez użytkownika:");

		for (Integer val : machine) {
			System.out.print(" " + val);
		}
	}
}
