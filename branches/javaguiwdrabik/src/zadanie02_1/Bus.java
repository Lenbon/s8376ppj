package zadanie02_1;

import javax.print.attribute.standard.Sides;

public class Bus extends EngineVehicle {
    protected int seats; // liczba miejsc
    protected int seatsAvalible; // liczba wolnych miejsc
    protected boolean ztm = false;

    /**
     * 
     * @param rn numer rejestracyjny
     * @param p wlasciciel
     * @param w szerokosc w mm
     * @param h wysokosc w mm
     * @param l dlugosc w mm
     * @param ww masa w kg
     * @param fc pojemnosc zbiornika w  litrach
     * @param s ilosc miejsc siedzacych
     */
    public Bus(String rn, Person p, int w, int h, int l, int ww, int fc, int s) {
        super(rn, p, w, h, l, ww, fc);
        seats = seatsAvalible = s;
    }

    public void passengersEmbarking(int number) throws Exception {
        if (!ztm && number > seatsAvalible) {
            int atTheBusStop = number - seatsAvalible;
            seatsAvalible = 0;
            throw new Exception(
                    "Nie ma miejsc dla wszystkich pasażerów. Nie wsiadło "
                            + atTheBusStop + " pasażerów.");
        } else {
            seatsAvalible -= number;
        }
    }

    public void passengersDisembark(int number) throws Exception {
        if (seatsAvalible + number > seats) {
            seatsAvalible = seats;
            throw new Exception("Nie ma tylu pasażerów");
        } else {
            seatsAvalible += number;
        }
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

    // Metoda toString uwzględnia teraz,
    // że pojazd może jeszcze nie mieć właściciela
    public String toString() {
        String s = (owner == null ? "sklep" : owner.getName());
        return "Pojazd " + currNr + " (" + getRegisterNumber()
                + "), właścicielem którego jest " + s + " - " + states[state]
                + ";\nPasażerowie/miejsca: " + ((seatsAvalible - seats) * -1)
                + "/" + seats;
    }

    public Bus setZtmMode(boolean mode) {
        ztm = mode;
        return this;
    }
}
