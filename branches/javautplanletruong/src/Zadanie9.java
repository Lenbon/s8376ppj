import java.sql.*;
import java.lang.reflect.*;

/**
 * Zadanie 9
 *
 * (Łączenie z bazą danych i uzyskiwanie metainformacji o bazie danych)
 *
 * Program pokazuje, że do połączenia z BD potrzebne są dwa kroki:
 * - załadowanie odpowiedniej klasy sterownika
 * - uzyskanie połączenie poprzez uzyskanie obiektu typu Connection
 * Od obiektu Connection możemy otrzymać metainformacje związane
 * ze sterownikiem, systemem zarządzania BD i samą BD poprzez uzyskanie obiektu
 * typu DatabaseMetaData, który możemy odpytywać za pomocą wielu metod
 * interfejsu DatabaseMetaData.
 * Należy napisać program, łączący się z bazą danych książek i uzyskujący
 * niektóre informacje o bazie danych.
 * Częściowy gotowy program (bez części odpowiedzialnej za połączenie z bazą
 * i uzyskanie metainformacji) jest pokazany poniżej. Należy go uzupełnić
 * o brakujące fragmenty kodu.
 *
 * @version     $Id$
 */
public class Zadanie9
{
    static {
        System.setProperty("derby.system.home", "Z:/DerbyAid");
    }

    String driverName = "org.apache.derby.jdbc.ClientDriver";
    String url = "jdbc:derby://localhost/ksidb";

    Connection con;
    DatabaseMetaData md;

    public Zadanie9()
    {
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(url);
            md = con.getMetaData();

            reportInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Metoda raportująca informacje zebrane w DatabaseMetaData w wywołaniach
     * metody info podano jako argumenty nazwy metod tego interfejsu
     * a w metodzie info korszystamy z metod refleksji; ten sposób
     * oprogramowania jest zaawansowany, ale wygodny, bo dużo mniej pisania
     * i kod jest bardziej klarowny klauzula throws SQLException mówi o tym,
     * że w trakcie działania reportInfo może powstać wyjątek SQLException,
     * ale nie będziemy go tu obsługiwać, obsługę przekażemy do miejsca
     * wywołania czyli bloku try w konstruktorze.
     *
     * @throws SQLException
     */
    void reportInfo() throws SQLException
    {
        info("getDatabaseProductName");
        info("getDatabaseProductVersion");
        info("getDriverName");
        info("getURL");
        info("getUserName");

        info("supportsAlterTableWithAddColumn");
        info("supportsAlterTableWithDropColumn");
        info("supportsANSI92FullSQL");
        info("supportsBatchUpdates");
        info("supportsMixedCaseIdentifiers");
        info("supportsMultipleTransactions");
        info("supportsPositionedDelete");
        info("supportsPositionedUpdate");
        info("supportsSchemasInDataManipulation");
        info("supportsTransactions");

        System.out.println("ResultSet  TYPE_SCROLL_INSENSITIVE :"
                + md.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE));
        System.out.println("ResultSet  TYPE_SCROLL_SENSITIVE :"
                + md.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE));
        System.out.println("insertsAreDetected :"
                + md.insertsAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
        System.out.println("updatesAreDetected :"
                + md.updatesAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
    }

    /**
     * Metoda info korzysta z metod refleksji do wywołania metod podanych "przez" nazwy.
     *
     * @param metName
     */
    void info(String metName)
    {
        Class mdc = DatabaseMetaData.class;
        Class[] paramTypes = {};
        Object[] params = {};
        String infoTyp;
        if (metName.startsWith("get"))
            infoTyp = metName.substring(3, metName.length());
        else
            infoTyp = metName;
        try {
            Method m = mdc.getDeclaredMethod(metName, paramTypes);
            System.out.println(infoTyp + ": " + m.invoke(md, params)); // dynamiczne wywołanie metody
        } catch (Exception exc) { // Możliwe powody wyjątków: nie ma takiej metody, niewłaściwe wywołanie
            System.out.println(exc);
        }
    }

    public static void main(String[] args)
    {
        new Zadanie9();
    }
}
