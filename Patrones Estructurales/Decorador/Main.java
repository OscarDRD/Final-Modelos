package Decorador;

public class Main {

	public static void main(String[] args) {
		Envio basico = new EnvioBasico(); 
		Envio premium = new EnvioPremium(new EnvioBasico());
		Envio preferencial = new EnvioPreferencial(new EnvioPremium(new EnvioBasico()));
		
		System.out.println("Beneficios segun su tipo de cuenta:\n ");
		System.out.println("Cuenta basica:\n"+basico.estado()+"\n-----------");
		System.out.println("Cuenta premium:\n"+premium.estado()+"\n-----------");
		System.out.println("Cuenta preferencial:\n"+preferencial.estado()+"\n-----------");
	}
}
