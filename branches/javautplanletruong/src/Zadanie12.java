import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Zadanie 12
 *
 * Uwaga: Aby wykonać to zadanie należy przywrócić wyjściową wersję bazy
 *
 * Wyprowadzić z tabeli POZYCJE wszystkie rekordy, spełniające warunek
 * CENA > 30 zł i pokazać dla każdego z nich tytuł i cenę w PLN
 * i (obliczoną) cenę w USD.
 *
 * Program ma ilustrować następujące kwestie:
 *
 * instrukcja SELECT wykonywana jest za pomocą executeQuery(...)
 * executeQuery zwraca obiekt typy ResultSet (tzw. tabela wynikowa)
 * z ResultSet związany jest tzw. kursor, który wskazuje bieżący rekord
 * w tabeli wynikowej
 * inicjalnie kursor ustawiony jest przed pierwszym rekordem tabeli wynikowej
 * kursor możemy przesuwać (tylko w stronę końca tabeli, o ile nie wymagaliśmy
 * tego, by ResultSet mógł być "skrolowany") za pomocą metody next() interfejsu
 * ResultSet
 * wartości poszczególnych kolumn z bieżącego rekordu możemy pobrać za pomocą
 * metod get...
 *
 * @version     $Id$
 */
public class Zadanie12
{
    String driverName = "org.apache.derby.jdbc.ClientDriver";
    String url = "jdbc:derby://localhost/ksidb";
    Connection con;
    Statement stmt;

    public Zadanie12()
    {
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(url);
            stmt = con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }

        String sel = "SELECT AUTID, TYTUL, CENA FROM POZYCJE WHERE CENA > 40";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sel);
            while (rs.next()) {
                String tytul = rs.getString("TYTUL"); // ... ?
                float cena = rs.getFloat("CENA"); //  ... ?
                float usd = cena / 4;
                System.out.println("Tytul: " + tytul);
                System.out.println("Cena : " + cena + " PLN");
                System.out.println("USD  : " + usd + " USD");
                System.out.println("-----------------");
            }
            stmt.close();
            con.close();
        } catch (SQLException exc) {
            System.out.println(exc.getMessage());
        }
    }

    public static void main(String[] args)
    {
        new Zadanie12();
    }
}
