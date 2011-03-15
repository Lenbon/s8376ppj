import java.util.Calendar;
import java.util.Hashtable;

import javax.swing.JOptionPane;

import Zadanie01_2.*;

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
public class Zadanie01_2 {
	public static void main(String[] args) {
		boolean inputFlag;
		Calendar calendar;
		int pinCounter = 3;
		String input, titleMessage, faceValue = "PLN";
		Model model = new Model("Files/Zadanie2Storage.txt");
		
		String cardNum = "555123112312313"; // symulacja wlozonej karty
		
		while (true) {
			try {
				Hashtable<String, String> account = model.getAccount(cardNum);
				
				inputFlag = false;
				titleMessage = "";
				while (inputFlag == false) {
					try {
						input = JOptionPane.showInputDialog((titleMessage.length() > 0 ? titleMessage + "\n" : "") + "Podaj numer PIN");
						if (account.get("pin").equals(input)) {
							inputFlag = true;
						} else {
							throw new Exception("Niepoprawny numer PIN");
						}
					} catch (Exception e) {
						pinCounter--;
						if (pinCounter <= 0) {
							throw new Exception("Przekroczono limit prób podania numeru PIN");	
						}
						titleMessage = "Błędny PIN, pozostało prób:" + pinCounter;
						inputFlag = false;
					}
				}
				
				inputFlag = false;
				titleMessage = "";
				while (inputFlag == false) {
					try {
						input = JOptionPane.showInputDialog((titleMessage.length() > 0 ? titleMessage + "\n" : "") + "Podaj kwotę do pobrania");

						if (Double.parseDouble(input) % 100 != 0) {
							throw new Exception("Bankomat wypłaca jedynie banknoty o niminale 100" + faceValue);
						}

						if (Double.parseDouble(input) > Double.parseDouble(account.get("balance"))) {
							throw new Exception("Podana kwota przewyższa dostępny stan konta: " + account.get("balance") + faceValue);
						}
						
						if (Double.parseDouble(input) > Double.parseDouble(account.get("limitPerOnce"))){
							throw new Exception("Podana kwota przewyższa jednorazowy limit wypłaty: " + account.get("limitPerOnce") + faceValue);
						}
						
						if (Double.parseDouble(input) > Double.parseDouble(account.get("limitPerDay")) - Double.parseDouble(account.get("counterDay"))){
							throw new Exception("Przekroczono dzienny limit wypłaty: " + account.get("limitPerDay") + faceValue);
						}

						inputFlag = true;
						
						account.put("counterDay", "" + (Double.parseDouble(account.get("counterDay")) + Double.parseDouble(input)));
						
						calendar = Calendar.getInstance();
						account.put("timeLastUsage", "" + calendar.getTime());
						
						JOptionPane.showMessageDialog(null, "Wypłacono kwotę: " + Double.parseDouble(input) + faceValue);
						
						model.setAccount();
					} catch (NumberFormatException e) {
						titleMessage = "Nieprawidłowy format kwoty";
						inputFlag = false;
					} catch (Exception e) {
						titleMessage = e.getMessage();
						inputFlag = false;
					}
				}
				
				if (JOptionPane.showConfirmDialog(null, "Czy wykonać następną operację?") >= 1) {
					throw new Exception("Dziękujemy za skorzystanie z usług sieci.");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
				break;
			}
		}
		System.out.println("exit");
	}
}
