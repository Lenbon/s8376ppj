package Zadanie02_1;

public class EngineVehicle extends Vehicle {
	protected int fuelTankCapability; // pojemnosc zbiornika
	protected int fuelTankQuantity; // stan paliwa
	protected String registerNumber; // numer rejestracyjny,
	public EngineVehicle(String rn, Person p, int w, int h, int l, int ww, int fc) {
		registerNumber = rn;
		owner = p;
		width = w;
		height = h;
		length = l;
		weight = ww;
		fuelTankCapability = fc;
	}	
	public void fill(int quantity) {
		if (quantity < 0) {
			return;
		}
		if ((fuelTankQuantity + quantity) > fuelTankCapability) {
			return;
//			throw new Exception("Ilość paliwa przekracza pojemność zbiornika");
		}
	}
	public String getRegisterNumber() {
		return registerNumber;
	}
	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}
}
