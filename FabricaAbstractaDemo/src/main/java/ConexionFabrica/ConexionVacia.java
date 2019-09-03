package ConexionFabrica;

import Interfaz.IConexionBD;


public class ConexionVacia implements IConexionBD{

	@Override
	public void conectar() {
		System.out.println("CONEXION SIN EXITO");		
	}

	@Override
	public void desconectar() {
		System.out.println("CONEXION SIN EXITO");		
	}

}
