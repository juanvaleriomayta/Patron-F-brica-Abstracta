package Conexion;

import ConexionFabrica.FabricaConexionNoPatron;
import java.sql.Connection;
import java.sql.SQLException;


public class DaoNoPatron {
    private Connection cn = null;

    public void Conexion() {
        FabricaConexionNoPatron fcn;
        try {
            if (cn == null) {
                fcn = new FabricaConexionNoPatron();
                Class.forName("oracle.jdbc.OracleDriver");
                cn = fcn.familiaObject(fcn.local);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error -> " + e.getMessage());
        }
    }

    public void Cerrar() throws SQLException {      //Cerrar la coneccion
        if (cn != null) {
            if (cn.isClosed() == false) {
                cn.close();
                cn = null;
            }
        }
    }

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        DaoNoPatron dao = new DaoNoPatron();
        dao.Conexion();
        if (dao.getCn() != null) {
            System.out.println("Conectado");
        } else {
            System.err.println("Coneccion es null Error");
        }
    }
}
