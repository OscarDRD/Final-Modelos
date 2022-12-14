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
	public String iniciarSesion(String usuario, String contraseña ){
		registro.setUsuario(usuario);
		registro.setContraseña(contraseña);
		return registro.estado();
	}
	
	public String pagar(){
		return pago.realizarPago();
	}
	public String estadoEnvio() {
		return envio.realizarEnvio();
	}
}
