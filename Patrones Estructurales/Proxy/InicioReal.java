package Proxy;

import java.util.ArrayList;

public class InicioReal implements Inicio{

	@Override
	public String acceso(String usuario) {
		return "Cuenta Conectada";
	}

	@Override
	public void registrarUsuario(String usuario) {}
}
