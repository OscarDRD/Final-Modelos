package Decorador;

public abstract class EnvioDecorador implements Envio{

	private final Envio envio;
	
	public EnvioDecorador(Envio envio) {
		this.envio = envio;
	}
	
	@Override
	public String estado() {
		return this.envio.estado();
	}
}
