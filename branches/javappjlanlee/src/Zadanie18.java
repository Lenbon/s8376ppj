import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Zadanie 18
 * 
 * Napisać program symulujący działanie podstawowych operacji logicznych na
 * dwóch argumentach: użytkownik podaje rodzaj operacji (negacja, i, lub,
 * implikacja, równoważność) i wartości logiczne argumentów, program wyświetla
 * wynik.
 * 
 * @author s8376
 * @version 18
 */
public class Zadanie18 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String input;
            boolean result = false;

            System.out.println("Podaj pierwszą wartość (TRUE / FALSE):");
            input = br.readLine().trim();
            boolean first = input.equals("TRUE") ? true : false;

            System.out.println("Podaj drugą wartość (TRUE / FALSE):");
            input = br.readLine().trim();
            boolean second = input.equals("TRUE") ? true : false;

            System.out
                    .println("Podaj rodzaj operacji (NOT, AND, OR, IMP, IAOI):");
            String operator = br.readLine().trim();

            if (operator.equals("NOT")) {
                if (first == false) {
                    result = true;
                }
            } else if (operator.equals("AND")) {
                if (first == true && second == true) {
                    result = true;
                }
            } else if (operator.equals("OR")) {
                if (first == true || second == true) {
                    result = true;
                }
            } else if (operator.equals("IMP")) { // IMPlikacja
                if (first == second) {
                    result = true;
                } else if (first == false && second == true) {
                    result = true;
                }
            } else if (operator.equals("IAOI")) { // If And Only If
                if (first == second) {
                    result = true;
                }
            } else {
                throw new Exception("Nieobsługiwany typ operacji");
            }

            String message = "Wynik: ";

            message += first == true ? "TRUE" : "FALSE";
            message += " " + operator + " ";
            message += second == true ? "TRUE" : "FALSE";
            message += " = " + (result == true ? "TRUE" : "FALSE");

            System.out.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
