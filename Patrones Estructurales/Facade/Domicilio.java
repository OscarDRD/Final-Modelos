package Facade;

// Fachada 
public class Domicilio {
	
	private Envio envio;
	private Pago pago;
	private Registro registro; 

	public Domicilio() { 
		envio = new Envio();
		pago = new Pago();
		registro = new Registro();
		
	}
	public String iniciarSesion(String usuario, String contrase�a ){
		registro.setUsuario(usuario);
		registro.setContrase�a(contrase�a);
		return registro.estado();
	}
	
	public String pagar(){
		return pago.realizarPago();
	}
	public String estadoEnvio() {
		return envio.realizarEnvio();
	}
}
