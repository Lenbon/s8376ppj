import javax.swing.JOptionPane;

/**
 * Zadanie 29
 * 
 * Napisać program, który wprowadza z okienek dialogowych elementy tablicy dwuwymiarowej 3x3 typu int
 * i wypisuje na konsolę:
 * *    sumę, iloczyn, element najmniejszy i element największy tej tablicy,
 * *    sumę tych początkowych elementów wszystkich wierszy tablicy, które poprzedzają element nie-dodatni. 
 * 
 * @author s8376
 * @version $Revision$
 */
public class Zadanie29 {
	public static void main(String[] args) {

//1 -2 3
//-2 0 -1
//1 2 -2
		
		int[][] tab = new int[3][3];
		
		for (int y = 0; y < 3; ++y) {
			for (int x = 0; x < 3; ++x) {
				tab[y][x] = input("Podaj liczbe x:" + (x + 1)  + ", y:" + (y + 1));
			}
		}
		
		int sumAll = 0;
		int sumSpecial = 0;
		int multiplication = 1;
		int min = 0;
		int max = 0;
		
		boolean rowBreak = false;
		boolean init = true;
		
		for (int[] val : tab) {
			rowBreak = false;
			for (int subVal : val) {
				if (init == true) {
					min = subVal;
					max = subVal;
					init = false;
				}

				sumAll += subVal;
				multiplication *= subVal;
				min = subVal < min ? subVal : min;
				max = subVal > max ? subVal : max;
				
				if (subVal < 0) {
					rowBreak = true;
				}
				if (rowBreak == false) {
					sumSpecial += subVal;
				}				
			}
		}
		
		System.out.println("suma: " + sumAll);
		System.out.println("iloczyn: " + multiplication);
		System.out.println("najmniejszy: " + min);
		System.out.println("największy: " + max);
		System.out.println("suma poprzedzajaca: " + sumSpecial);
	}
	protected static int input(String message) {
		boolean flag = false;
		int number = 0;
		do {
			flag = false;
			String dane = JOptionPane.showInputDialog(message);
			try {
				number = Integer.parseInt(dane);
				flag = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Podana wartość nie jest liczbą (int)!");
				flag = false;
			}
		} while (flag == false);

		return number;
	}
}
