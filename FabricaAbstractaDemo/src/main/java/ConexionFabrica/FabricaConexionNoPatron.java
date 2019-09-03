package ConexionFabrica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexionNoPatron {

    public int CloudJVM = 1;
    public int local = 2;
    public int Came = 3;

    public Connection familiaObject(int Servidor) throws SQLException {
        switch (Servidor) {
            case 1:
                return DriverManager.getConnection("jdbc:oracle:thin:@35.211.109.53:1521:XE", 
                        "user", "pass");
            case 2:
                return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", 
                        "user", "pass");
            case 3:
                return DriverManager.getConnection("jdbc:oracle:thin:@35.229.77.157:1521:XE", 
                        "user", "pass");
            default:
                return null;
        }
    }
}
