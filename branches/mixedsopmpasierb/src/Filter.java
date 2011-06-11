import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author s8376
 * @version $Id$
 */
public class Filter {
    public static void main(String[] args) {
        try {
            String input;
            try {
                input = args[0];
            } catch (Exception e) {
                throw new Exception("Nie podano ciagu znakow");
            }
            System.out.println(input);

            String mode1 = new String();
            String mode2 = new String();

            mode1 = System.getProperty("mode1");
            mode2 = System.getenv("mode2");

            System.out.println(mode1);
            System.out.println(mode2);
        } catch (Exception e) {
            System.err.println(e.toString());
            System.exit(1);
        }
    }
}
