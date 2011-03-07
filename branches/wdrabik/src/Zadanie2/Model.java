package Zadanie2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Model {
	protected ArrayList<HashMap<String, String>> storage;
	public Model(String source) throws Exception {
		String input;
		String[] array;
		HashMap<String, String> entry;
		
		storage = new ArrayList<HashMap<String, String>>();
		// -> readData
		// -> writeData 
		try {
			BufferedReader br = new BufferedReader(new FileReader(source));
			
			while((input = br.readLine()) != null) {
				array = input.split(";");
				entry = new HashMap<String, String>();
				
				entry.put("card", array[0]); // numer karty
				entry.put("pin", array[1]); // pin
				entry.put("balance", array[2]); // saldo
				entry.put("limitPerPayoff", array[3]); // limit wyplaty
				entry.put("limitPerDay", array[4]); // limit dzienny
				entry.put("limitPerMonth", array[5]); // limit miesieczny
				entry.put("counterPerDay", array[6]); // licznik dzienny
				entry.put("counterPerMonth", array[7]); // licznik miesieczny
				entry.put("timeLastUse", array[8]); // timestamp ostatniej wyplaty
				
				storage.add(entry);
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			throw new Exception(e.getMessage());
		}
	}
	public HashMap<String, String> getAccount(String cardNum) throws Exception {
		boolean existFlag = false;
		String cardNumInModel;
		HashMap<String, String> output = new HashMap<String, String>(); 
		
		for (HashMap<String, String> val : storage) {
			cardNumInModel = val.get("cardnum");
			if (cardNumInModel.equals(cardNum)) {
				output = val;
				existFlag = true;
			}
		}
		
		if (existFlag == false) {
			throw new Exception("Brak w systemie karty o numerze: " + cardNum);
		}

		return output;
	}
	public void setAccount(HashMap<String, String> data) throws Exception {
		
//		BufferedReader br = new BufferedReader(new FileReader(source));
		
	}
}
