package Facade;

public class Registro {
	
	private String usuario; 
	private String contrase�a;
	
	// Constructor vacio 
	public Registro() {}
	
	// Constructor registro
	public Registro(String usuario, String constrase�a) {
		this.usuario = usuario;
		this.contrase�a = constrase�a;
	}
	public String estado() {
		return "\nEl usuario "+getUsuario()+" a sido registrado exitosamente.\n"; 
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
}
