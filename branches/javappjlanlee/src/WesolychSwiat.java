/**
 * WesolychSwiat
 * 
 * Napisać program, który wyprowadza na konsolę choinkę, składającą się ze znaków
 * łańcucha, podanego przez użytkownika. Wygląd choinki jest ograniczony tylko
 * fantazją i poczuciem estetyki programisty.
 * 
 * @author s8376
 * @version $Revision$
 */
public class WesolychSwiat {

    public static void main(String[] args) {

        String s = "Wesołych Świąt i Szczęśliwego Nowego Rokku!";
        StringBuffer tree = new StringBuffer();

        s = s.replaceAll("([ ,.;_]{1})", "O");
        int rows = (int) Math.sqrt(s.length());

        int index = 0;
        int row = 1;
        for (int x = rows; x > 0; x--) {
            for (int y = x - 1; y > 0; y--) {
                tree.append(" ");
            }
            tree.append(s.substring(index, index + row) + "\n");
            index += row;
            row += 2;
        }

        int trunkWidth = (int) row / 4; // szerokosc pnia to 1/4 szerokosci podstawy choinki
        if (trunkWidth % 2 == 0) { // szerokosc pnia musi byc nieparzysta
            trunkWidth += 1;
        }

        String rest = s.substring(index);

        int trunk = (int) rest.length() / trunkWidth;
        //		int restOfTrunk = row % 3;
        StringBuffer spaces = new StringBuffer();

        for (int x = 0; x < (int) (row / 2) - ((int) trunkWidth / 2) - 1; x++) {
            spaces.append(" ");
        }

        index = 0;
        for (int x = 0; x < trunk; x++) {
            tree.append(spaces.toString()
                    + rest.subSequence(index, index + trunkWidth) + "\n");
            index += trunkWidth;
        }

        System.out.println(tree.toString());
    }
}
