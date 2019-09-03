package ConexionFabrica;

import Interfaz.IConexionBD;


public class ConexionSQLServer implements IConexionBD {

	private String host;
	private String puerto;
	private String usuario;
	private String contraseña;

	public ConexionSQLServer() {
		this.host = "localhost";
		this.puerto = "1433";
		this.usuario = "sqlval";
		this.contraseña = "123";
	}

	@Override
	public void conectar() {
		// Aqui puede ir c�digo JDBC
		System.out.println("Se conecto a SQLServer");

	}

	@Override
	public void desconectar() {
		System.out.println("Se desconecto de SQLServer");
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPuerto() {
		return puerto;
	}

	public void setPuerto(String puerto) {
		this.puerto = puerto;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contraseña;
	}

	public void setContrasena(String contraseña) {
		this.contraseña = contraseña;
	}

}
