package zadanie01;

public class Wielomian {
	protected int[] params;
	public Wielomian(int ... params) {
		this.params = params;
	}
	private int[] operate(int[] array1, int[] array2, boolean sum) {
		int[] newArray;
		if (array1.length > array2.length) {
			newArray = new int[array1.length];
		} else {
			newArray = new int[array2.length];
		}

		for (int x = 0; x < array1.length; x++) {
			newArray[x] = array1[x];
		}
		for (int x = 0; x < array2.length; x++) {
			if (sum) {
				newArray[x] += array2[x];
			} else {
				if (newArray[x] == 0 || array2[x] == 0) {
					newArray[x] = 0; // FIXME
				} else {
					newArray[x] *= array2[x];	
				}
			}
		}
		return newArray;
	}
	
	/**
	 * metoda dodaj(...) zwraca nowy obiekt-wielomian będący sumą dwóch wielomianów
	 * 
	 * @param Wielomian w
	 * @return Wielomian
	 */
	public Wielomian dodaj(Wielomian w) {
		return new Wielomian(operate(params, w.params, true));
	}
	/**
	 * metoda mnoz(...) zwraca nowy obiekt-wielomian będący iloczynem dwóch wielomianów
	 *
	 * @param Wielomian w
	 * @return Wielomian
	 */
	public Wielomian mnoz(Wielomian w) {
		return new Wielomian(operate(params, w.params, false));
	}
	public String toString() {
		String output = "", element = "";
		int length = params.length;
		
 		for (int x = 0; x < length; x++) {
 			if (params[x] != 0) {
 				element = "";
 				if (params[x] > 0 && x != length - 1) {
 					element += "+";
 				}
 				if (params[x] != 1) {
 					element += params[x]; 
 				}
 				if (x != 0) {
 					element += "x";
 					if (x != 1) {
 						element += "^" + x;
 					}
 				}
 				output = element + output;
 			}
		}
		
		return output;
	}
	/**
	 * wywołanie metody wartosc(...) zwraca wartość wielomianu w1 dla podanej wartości zmiennej x=1
	 */
	public String wartosc(int x) {
		return "";
	}
}
