import java.sql.*;

/**
 * Zadanie 10
 *
 * (Tworzenie tabeli)
 *
 * Uwaga: Przed wykonaniem tego zadania należy zrobić kopię bazy.
 *
 * Przykład pokazuje następujące ważne kwestie:
 *
 * polecenia DDL lub SQL są wykonywane za pośrednictwem obiektu typu Statement
 * obiekt Statement uzyskujemy od obiektu Connection za pomocą zlecenia
 * createStatement()
 * wszelkie zmiany w bazie danych (w tym usuwanie i tworzenie tabel) wykonujemy
 * za pomocą metody executeUpdate aktywowanej na rzecz obiektu Statement
 * "na tym samym" obiekcie Statement możemy wykonać dowolnie wiele poleceń
 * SQL/DDL
 * od obiektu typu SQLException (wyjątku SQL) możemy się dowiedzieć wielu
 * rzeczy np. o standardowy "SQL State" lub zależny od dostawcy RDBMS kod błędu.
 *
 * Zadanie: utworzyć tabelę WYDAWCA z kolumnami:
 * AUTID (całkowitoliczbowy klucz pierwotny)
 * NAME (łańcuch znakowy zmiennej długości o maks. 255 znakach) – nazwa wydawcy.
 *
 * Napisać program w taki sposób, by zawsze (niezależnie od tego czy już w bazie
 * istnieje tabela WYDAWCA) była tworzona nowa tabela.
 *
 * Uwaga: tabela WYDAWCA jest tabelą macierzystą dla tabeli POZYCJE (klucz
 * zewnętrzny tabeli POZYCJE odnosi się do klucza pierwotnego
 * tabeli WYDAWCA; relacja ta wymusza spójność referencyjnej).
 *
 * @version     $Id$
 */
public class Zadanie10
{
    String driverName = "org.apache.derby.jdbc.ClientDriver";
    String url = "jdbc:derby://localhost/ksidbcpy";

    Connection con;
    Statement stmt;

    Zadanie10()
    {
        Connection con = null;
        try {
            // łączenie z bazą i utworzenie obiektu typu Statement
            Class.forName(driverName);
            con = DriverManager.getConnection(url);
            stmt = con.createStatement();
        } catch (Exception exc) {
            System.out.println(exc);
            System.exit(1);
        }

        // metoda dropTable jest naszą własną metodą napisaną dla skrócenia programu
        // usuwa ona tabelę podaną jako argument
        // Aby w każdych okolicznościach stworzyć nową tabelę WYDAWCA
        // musimy usunąć ew.  już istniejącą tabelę WYDAWCA
        //   dropTable("POZYCJE"); // usunięcie tabeli pochodnej, będącej w relacji z tabelą WYDAWCA
        //   dropTable("WYDAWCA"); // usinięcie tabeli WYDAWCA

        String crestmt = "CREATE TABLE WYDAWCA("
                + "AUTID INTEGER NOT NULL GENERATED BY DEFAULT AS IDENTITY,"
                + "NAME VARCHAR(32) NOT NULL," + "PRIMARY KEY (AUTID)" + ")";

        System.out.println(crestmt);

        try {
            // wykonanie polecenia zapisanego w crestmt
            stmt.executeUpdate(crestmt);
        } catch (SQLException exc) { // przechwycenie wyjątku:
            System.out.println("SQL except.: " + exc.getMessage());
            System.out.println("SQL state  : " + exc.getSQLState());
            System.out.println("Vendor errc: " + exc.getErrorCode());
            System.exit(1);
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (SQLException exc) {
                System.out.println(exc);
                System.exit(1);
            }
        }
    }

    private void dropTable(String tname)
    {
        String crestmt = "DROP TABLE " + tname;
        System.out.println(crestmt);

        try {
            // wykonanie polecenia zapisanego w crestmt
            stmt.executeUpdate(crestmt);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    static public void main(String[] args)
    {
        new Zadanie10();
    }
}
