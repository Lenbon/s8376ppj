package Zadanie02_1;

public class Bus extends EngineVehicle {
	protected int seats; // liczba miejsc
	protected int seatsAvalible; // liczba wolnych miejsc
	public Bus(String rn, Person p, int w, int h, int l, int ww, int fc, int s) {
		super(rn, p, w, h, l, ww, fc);
		seats = s;
	}
	public int getSeats() {
		return seats;
	}
	public int getSeatsAvalible() {
		return seatsAvalible;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public void setSeatsAvalible(int seatsAvalible) {
		this.seatsAvalible = seatsAvalible;
	}
}
