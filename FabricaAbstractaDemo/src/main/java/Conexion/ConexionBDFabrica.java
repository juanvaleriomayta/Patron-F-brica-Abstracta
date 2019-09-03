package Conexion;

import ConexionFabrica.ConexionMySQL;
import ConexionFabrica.ConexionOracle;
import ConexionFabrica.ConexionSQLServer;
import ConexionFabrica.ConexionVacia;
import Interfaz.FabricaAbstracta;
import Interfaz.IConexionBD;



public class ConexionBDFabrica implements FabricaAbstracta{

	@Override
	public IConexionBD getBD(String motor) {
		if (motor == null) {
			return new ConexionVacia();
		}
		if (motor.equalsIgnoreCase("MYSQL")) {
			return new ConexionMySQL();
                        
		} else if (motor.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle();
                        
		} else if (motor.equalsIgnoreCase("SQL")) {
			return new ConexionSQLServer();
		}

		return new ConexionVacia();
	}

}
