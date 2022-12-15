package Decorador;

public class EnvioBasico implements Envio{

	@Override
	public String estado() {
		return "---5% Descuento proximo envio";
	}

}
