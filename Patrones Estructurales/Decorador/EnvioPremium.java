package Decorador;

public class EnvioPremium extends EnvioDecorador {

	public EnvioPremium(Envio envio) {
		super(envio);
	}

	@Override
	public String estado() {
		return super.estado()+"\n"+this.addPuntos()+"\n"+this.addBono();
	}
	
	private String addPuntos() {
		return "---Acumula puntos";
	}
	private String addBono() { 
		return "---Descuento en su siguiente pedido";
	}
}
