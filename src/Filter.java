import java.util.Locale;

/**
 * @author s8376
 * @version $Id$
 */
public class Filter {
    public static void main(String[] args) {
        try {
            String stringToFilter;
            try {
                stringToFilter = args[0];
            } catch (Exception e) {
                throw new Exception("Nie podano ciagu znakow");
            }

            String input;
            
            // zmienna srodowiskowa
            boolean modeReplacement = false;
            input = System.getenv("mode1");
            if (input != null && !input.equals("")) {
                modeReplacement = true;
            }

            // wlasciwosc systemowa
            boolean modeToUpper = false;
            input = System.getProperty("mode2");
            if (input != null && !input.equals("")) {
                modeToUpper = true;
            }
            
            if (!modeToUpper && !modeReplacement) {
                throw new Exception("Nie ustalono zadnego trybu");
            }

            // spacje na znak nowej linii / #
            String replacement = modeReplacement ? "\n" : "_";
            stringToFilter = stringToFilter.replaceAll(" ", replacement);
            
            // litery na wielkie
            if (modeToUpper) {
                stringToFilter = stringToFilter
                        .toUpperCase(Locale.getDefault());
            }

            System.out.println(stringToFilter);
        } catch (Exception e) {
            System.err.println(e.toString());
            System.exit(1);
        }
    }
}
