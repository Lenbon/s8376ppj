package school;

public class NWD {
	public int calculate(int a, int b) {
		int nwd = 0;

		do {
			nwd = a % b;
			a = b;
			b = nwd;
		} while (nwd != 0);

		return a;
	}
}
