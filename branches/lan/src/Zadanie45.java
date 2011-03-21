import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Zadanie 45
 * 
 * Napisz program, który posortuje (w porządku niemalejącym) ciąg liczb
 * całkowitych (typu int), wprowadzonych przez użytkownika ze standardowego
 * wejścia (konsoli), oraz zapisuje posortowany ciąg do pliku tekstowego.
 * Dane wejściowe mają być wprowadzone do programu wierszami. Naciśnięcie
 * klawisza  '.' (kropki) + Enter powoduje zakończenie wczytywania liczb.
 * Skorzystać z klasy java.util.Scanner.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie45 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		boolean flagInput, flagBreak = false;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int index = 0;
		String input;

		while (true) {
			flagInput = false;
			while (flagInput != true) {
				try {
					System.out.println("Podaj liczbę " + (index + 1) + ":");
					input = br.readLine();
					if (input.equals(".")) {
						flagBreak = true;
						break;
					}
					list.add(Integer.parseInt(input));
					index++;
					flagInput = true;
				} catch (Exception e) {
					System.out.println("Podana wartość nie jest liczbą.");
					flagInput = false;
				}
			}
			if (flagBreak == true) {
				break;
			}
		}

		System.out.println(list.toString());
		
		boolean flagChange = true;
		int buffer;
		while (flagChange == true) {
			flagChange = false;
			for (int x = 0; x < (list.size() - 1); x++) {
				if (list.get(x) > list.get(x + 1)) {
					buffer = list.get(x);
					list.set(x, list.get(x + 1));
					list.set(x + 1, buffer);
					flagChange = true;
				}
			}
		}

		System.out.println(list.toString());
		
		String fileOut = "files/zadanie45Out.txt";
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut));
			for (Integer val : list) {
				bw.write("" + val + ", ");
			}
			bw.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}
}
