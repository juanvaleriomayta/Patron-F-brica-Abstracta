package ConexionFabrica;

import Interfaz.IConexionBD;



public class ConexionMySQL implements IConexionBD {

	private String host;
	private String puerto;
	private String usuario;
	private String contraseña;

	public ConexionMySQL() {
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "root";
		this.contraseña = "123";
	}

	@Override
	public void conectar() {
		// Aqui puede ir c�digo JDBC
		System.out.println("Se conecto a MySQL");

	}

	@Override
	public void desconectar() {
		System.out.println("Se desconecto de MySQL");
	}

	@Override
	public String toString() {
		return "ConexionMySQL [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contraseña="
				+ contraseña + "]";
	}
}
