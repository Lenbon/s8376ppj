import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author s8376
 * @version $Id$
 */
public class Filter {
    public static void main(String[] args) {

        // modyfikacja wc
        // tryby wc -w

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    System.in));
            System.out.println(br.readLine() + " ssss");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
