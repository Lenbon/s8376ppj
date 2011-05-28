package zadanie04;

public class Prostokat extends Figura {
    /**
     * szerokość i wysokość prostokąta
     */
    private int szer, wys;
    protected String fig = "Prostokat";

    /**
     * konstruowanie prostokąta (o bokach równoległych do osi układu współrzędnych)
     * z podanym położeniem lewego górnego wierzchołka (x, y), szerokością s,
     * wysokością w
     * 
     * @param int x
     * @param int y
     * @param int s
     * @param int w
     */
    public Prostokat(int x, int y, int s, int w) {
        super(x, y);
        szer = s;
        wys = w;
    }

    public void pozycja(int x, int y) {
        String message = "Punkt (" + x + ", " + y + ") znajduje sie ";

        if (x < this.x || x > this.x + szer || y < this.y || y > this.y + wys) {
            message += "na zewnatrz prostokata";
        } else {
            message += "wewnatrz prostokata";
        }

        System.out.println(message);
    }

    /**
     * wypisuje dodatkowo parametry szer, wys
     */
    public void pokaz() {
        super.pokaz();
        System.out.println("Szerokosc: " + szer + ", Wysokosc: " + wys);
    }
}
