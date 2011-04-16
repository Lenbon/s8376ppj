import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

/**
 * Imię i nazwisko: Filip Turkiewicz 
 * Grupa: 117 
 * Indeks: 8376
 * 
 * @author s8376
 * @version $Revision$
 */
public class s8376 {
    public static void main(String[] args) {
        String input, message = "";
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();

        boolean inputFlag = false, breakFlag = false;
        int rowCounter = 0;
        ArrayList<Integer> row = new ArrayList<Integer>();

        for (int x = 0; x < 16; x++) {
            inputFlag = false;
            while (inputFlag != true) {
                input = JOptionPane
                        .showInputDialog((message.length() > 0 ? message + "\n"
                                : "")
                                + "Podaj liczbę " + (x + 1) + ":");
                if (input == null) {
                    breakFlag = true;
                    break;
                }

                try {
                    row.add(Integer.parseInt(input));
                    message = "";
                    rowCounter++;
                    inputFlag = true;

                    if (rowCounter == 4) {
                        matrix.add(row);
                        row = new ArrayList<Integer>();
                        rowCounter = 0;
                    }
                } catch (Exception e) {
                    message = "Podana wartość nie jest liczbą.";
                    inputFlag = false;
                }
            }
            if (breakFlag == true) {
                break;
            }
        }

        System.out.println(matrix.toString());

        int counterEven = 0;
        int counterOdd = 0;

        rowCounter = 0;
        int colCounter = 0;
        HashMap<Integer, Integer> columnsCounter = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> onlyOnce = new HashMap<Integer, Integer>();

        for (ArrayList<Integer> val : matrix) {
            rowCounter++;
            for (Integer subVal : val) {
                colCounter++;
                if (subVal % 2 == 0) {
                    counterEven++;
                    if (onlyOnce.containsKey(subVal)) {
                        onlyOnce.put(subVal, onlyOnce.get(subVal) + 1);
                    } else {
                        onlyOnce.put(subVal, 1);
                    }
                } else {
                    counterOdd++;
                }

                if (columnsCounter.containsKey(colCounter)) {
                    columnsCounter.put(colCounter, columnsCounter
                            .get(colCounter) + 1);
                } else {
                    columnsCounter.put(colCounter, 1);
                }
            }
            colCounter = 0;
        }

        int columnNumberWithMost = 0;
        colCounter = 0;
        int colMaxValue = 0;
        for (Integer val : columnsCounter.keySet()) {
            colCounter++;
            if (columnNumberWithMost == 0) {
                columnNumberWithMost = colCounter;
                colMaxValue = val;
            }
            if (val > colMaxValue) {
                columnNumberWithMost = colCounter;
            }
        }

        int onlyOnceCounter = 0;
        for (Integer val : onlyOnce.keySet()) {
            if (onlyOnce.get(val) == 1) {
                onlyOnceCounter++;
            }
        }

        System.out
                .println("Wynik:\n"
                        + "Ilość argumentów parzystych: "
                        + counterEven
                        + "\n"
                        + "Ilość argumentów nieparzystych: "
                        + counterOdd
                        + "\n"
                        + (counterEven + counterOdd != 16 ? "suma elementów nie jest adekwatna\n"
                                : "")
                        + "Numer kolumny z największą sumą: "
                        + columnNumberWithMost
                        + "\n"
                        + "Ilość argumentów parzystych występujących tylko raz: "
                        + onlyOnceCounter);
    }
}
