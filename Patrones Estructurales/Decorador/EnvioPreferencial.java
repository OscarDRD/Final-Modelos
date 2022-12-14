package Decorador;

public class EnvioPreferencial extends EnvioDecorador{

	public EnvioPreferencial(Envio envio) {
		super(envio);
	}

	@Override
	public String estado() {
		return super.estado()+"\n"+this.addEnvios();
	}
	private String addEnvios() {
		return "---Seguro de envio";
	}
}
