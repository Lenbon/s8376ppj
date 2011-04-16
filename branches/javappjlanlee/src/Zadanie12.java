/**
 * Zadanie 12
 * 
 * Napisać program pokazujący kody wszystkich polskich liter.
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie12 {
    public static void main(String[] args) {
        char[] znaki = { 'ę', 'ó', 'ą', 'ś', 'ł', 'ż', 'ź', 'ć', 'ń', 'Ę', 'Ó',
                'Ą', 'Ś', 'Ł', 'Ż', 'Ź', 'Ć', 'Ń' };
        for (int x = 0; x < znaki.length; ++x) {
            System.out.println("" + znaki[x] + " " + (int) znaki[x]);
        }
    }
}
