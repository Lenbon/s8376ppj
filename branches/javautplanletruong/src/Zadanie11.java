/**
 * 
 
Zadanie 11 (2p)
(Wpisywanie rekordów do tabeli)

Dodać do tabeli WYDAWCA trzy rekordy reprezentujące jakichś wydawców.

Przykład ilustruje następujące kwestie:

     instrukcja SQL do wpisywania ma postać INSERT...  (w kilka różnych formach)
     przy wpisywaniu rekordów używamy executeUpdate(...)
     przy wpisywaniu i modyfikowaniu metoda ta zwraca liczbę wpisanych/zmodyfikowanych rekordów,
    dane typu znakowego (CHAR, VARCHAR, LONGVARCHAR) są podawane w SQL w apostrofach
    
 * @version     $Id$
*/

import java.sql.*;

public class Zadanie11 {

    static public void main(String[] args) {
        new Zadanie11();
    }

    String driverName = "org.apache.derby.jdbc.ClientDriver";
    String url = "jdbc:derby://localhost/ksidbcpy";

    Connection con;
    Statement stmt;

    Zadanie11() {
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(url);
            stmt = con.createStatement();
        } catch (Exception exc) {
            System.out.println(exc);
            System.exit(1);
        }

        String[] ins = { "INSERT INTO WYDAWCA VALUES (7, \'Wyd 7\')",
                "INSERT INTO WYDAWCA VALUES (8, \'Wyd 8\')",
                "INSERT INTO WYDAWCA VALUES (9, \'Wyd 9\')", };
        int insCount = 0; // ile rekordów wpisano
        try {
            for (int i = 0; i < ins.length; i++) { // wpisywanie rekordów

                stmt.executeUpdate(ins[i]);
                insCount++;
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Dodano " + insCount + " wpisow.");

        // dodatkowo
        
        String[] wyd =  { "PWN", "PWE", "Czytelnik", "Amber", "HELION", "MIKOM" };
        int beginKey = 15;
        insCount =  0;
        
        try  {
          // przygotowanie instrukcji prekompilowanej
          PreparedStatement pstmt = con.prepareStatement("INSERT INTO WYDAWCA VALUES(?,?)");
          for (int i=0; i < wyd.length; i++)   {
              pstmt.setInt(1, beginKey);
              pstmt.setString(2, wyd[i]);
              pstmt.executeUpdate();
              beginKey++;
          }
          con.close();
        } catch(SQLException exc)  {
           System.out.println(exc);
        }

        
    }
}
