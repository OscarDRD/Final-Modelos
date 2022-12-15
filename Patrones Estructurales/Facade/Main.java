package Facade;

// Main
public class Main {

	public static void main(String[] args) {
		
		Domicilio domicilio = new Domicilio();
		System.out.println(domicilio.iniciarSesion("Jose", "Rf234"));
		System.out.println(domicilio.pagar());
		System.out.println(domicilio.estadoEnvio());

	}
}
