package ConexionFabrica;

import Interfaz.IConexionBD;


public class ConexionOracle implements IConexionBD {

	private String host;
	private String puerto;
	private String usuario;
	private String contraseña;

	public ConexionOracle() {
		this.host = "localhost";
		this.puerto = "1521";
		this.usuario = "admin";
		this.contraseña = "123";
	}

	@Override
	public void conectar() {
		// Aqui puede ir c�digo JDBC
		System.out.println("Se conecto a Oracle");

	}

	@Override
	public void desconectar() {
		System.out.println("Se desconecto de Oracle");
	}

	@Override
	public String toString() {
		return "ConexionOracle [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contraseña="
				+ contraseña + "]";
	}

}
