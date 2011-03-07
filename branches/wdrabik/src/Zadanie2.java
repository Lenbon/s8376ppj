import java.io.ObjectInputStream.GetField;
import java.util.Calendar;
import java.util.HashMap;

import javax.swing.JOptionPane;

import Zadanie2.*;

/**
 * Zadanie 2 - działanie bankomatu
 * 
 * Napisać program symulujący pobieranie pieniędzy z bankomatu  a w szczególności:
 * 
 * * wprowadzanie pinkodu
 * * sprawdanie czy dany pinkod znajduje się na predefiniowanej liście uprawnionych pinkodów
 * * blokada bankomatu po 3 nieudanych próbach zalogowania
 * * wypłacanie tylko wielokrotności 100 PL
 * * limit dzienny wypłaty
 * 
 * Jako prostej bazy danych można użyć  plików.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie2 {
	public static void main(String[] args) {
		try {
			
			Calendar calendar = Calendar.getInstance();
			
			System.out.println(calendar.getTime()); 
			
			System.exit(0);
			
			
			
			boolean inputFlag = false;
			String input, dialogTitle = "", faceValue = "PLN";
			String configFile = "files/Zadanie2Storage.txt";
			String cardNum = "555123112312314"; // symulacja wlozonej karty
			
			int tryLeft = 3;
			boolean pinBreakFlag = false;
			
			Model model = new Model(configFile);

			HashMap<String, String> account = model.getAccount(cardNum);
			
			System.out.println(account.toString());
			
			while (inputFlag == false) {
				try {
					if (tryLeft <= 0) {
						pinBreakFlag = true;
						throw new Exception("Wykorzystano limit prób wpisania numeru PIN");
					}
					
					input = JOptionPane.showInputDialog((dialogTitle.length() > 0 ? dialogTitle + "\n" : "") + "Wprowadź PIN (pozostały " + tryLeft + ")");
					
					if (account.get("pin").equals(input)) {
						inputFlag = true;	
					} else {
						throw new Exception("Niepoprawny numer PIN");
					}
				} catch (Exception e) {
					dialogTitle = e.getMessage();
					tryLeft--;
					inputFlag = false;
					if (pinBreakFlag == true) {
						JOptionPane.showMessageDialog(null, e.getMessage());
						System.exit(0);
					}
				}
			}
			
			inputFlag = false;
			dialogTitle = "";
			
			while (inputFlag == false) {
				try {
					input = JOptionPane.showInputDialog((dialogTitle.length() > 0 ? dialogTitle + "\n" : "") + "Podaj kwotę do pobrania");

					if (Double.parseDouble(input) % 100 != 0) {
						throw new Exception("Bankomat wypłaca jedynie banknoty o niminale 100" + faceValue);
					}
					
					if (Double.parseDouble(input) > Double.parseDouble(account.get("value"))) {
						throw new Exception("Podana kwota przewyższa dostępy stan konta: " + account.get("value") + faceValue);
					}

					
					
					
					
					if (Double.parseDouble(input) > Double.parseDouble(account.get("limit"))){
						throw new Exception("Podana kwota przewyższa jednorazowy limit wypłaty: " + account.get("limit") + faceValue);
					}
					
					JOptionPane.showMessageDialog(null, "Wypłacono kwotę: " + Double.parseDouble(input) + faceValue);
					
					inputFlag = true;
				} catch (NumberFormatException e) {
					dialogTitle = "Nieprawidłowy format kwoty";
					inputFlag = false;
				} catch (Exception e) {
					dialogTitle = e.getMessage();
					inputFlag = false;
				}
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}
