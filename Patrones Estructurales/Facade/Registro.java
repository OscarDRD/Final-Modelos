package Facade;

public class Registro {
	
	private String usuario; 
	private String contraseña;
	
	// Constructor vacio 
	public Registro() {}
	
	// Constructor registro
	public Registro(String usuario, String constraseña) {
		this.usuario = usuario;
		this.contraseña = constraseña;
	}
	public String estado() {
		return "\nEl usuario "+getUsuario()+" a sido registrado exitosamente.\n"; 
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
}
