package zadanie04;

public class Kolo extends Figura {
    private int promien;
    protected String fig = "Kolo";

    /**
     * konstruowanie koła o środku w punkcie (x, y) i  promieniu r
     * 
     * @param int x
     * @param int y
     * @param int r
     */
    public Kolo(int x, int y, int r) {
        super(x, y);
        promien = r;
    }

    public void pozycja(int x, int y) {
        String message = "Punkt (" + x + ", " + y + ") znajduje sie ";

        if (x > this.x + promien || y > this.y + promien) {
            message += "na zewnatrz kola";
        } else {
            message += "wewnatrz kola";
        }

        System.out.println(message);
    }

    /**
     * wypisuje dodatkowo promień koła
     */
    public void pokaz() {
        super.pokaz();
        System.out.println("Promien - " + promien);
    }
}
