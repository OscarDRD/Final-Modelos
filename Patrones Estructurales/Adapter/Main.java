package Adapter;

public class Main {

	public static void main(String[] args) {
	
		Target adaptador = new DireccionAdapter(); 
		System.out .println("Ingrese la dirrecion del domicilio...");
		
		System.out.println("\nDireccion Ingresada por el usuario...");
		System.out.println("calle 40 # 78 27 Suba");
		adaptador.setDireccion("calle 40 # 78 27 Suba");
		
		System.out.print("\nDireccion recivida por el sistema...\n");
		System.out.println(adaptador.getDireccion());
	}

}
