package Proxy;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String acceso;
		String opcion; 
		String usuario; 
		Scanner sc = new Scanner(System.in);
		Inicio proxy  = new InicioProxy();
		
		System.out.println("Domicilios.net...\n1) Inciar sesion\n2) Registrar usuario");
		opcion = sc.nextLine();
		switch(opcion) {
			case "1":
				usuario = sc.nextLine();
				acceso = proxy.acceso(usuario);
				System.out.println(acceso+"\n\nRegistre el usuario");
			case "2": 
				usuario = sc.nextLine();
				proxy.registrarUsuario(usuario);
				acceso = proxy.acceso(usuario);
				System.out.println(acceso);
				
		}
	}
}
