package ConexionFabrica;

import Interfaz.IConexionBD;


public class ConexionVacia implements IConexionBD{

	@Override
	public void conectar() {
		System.out.println("NO SE ESPECIFICO PROVEEDOR");		
	}

	@Override
	public void desconectar() {
		System.out.println("NO SE ESPECIFICO� PROVEEDOR");		
	}

}
