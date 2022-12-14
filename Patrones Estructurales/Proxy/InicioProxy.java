package Proxy;

import java.util.ArrayList;

public class InicioProxy implements Inicio{
	
	private ArrayList<String> usuarios = new ArrayList<>();
	private final InicioReal real;
	
	private boolean conectado = false;
	
	public InicioProxy() {
		real = new InicioReal();
	}
	
	public void registrarUsuario(String usuario) {
		usuarios.add(usuario);
	}

	@Override
	public String acceso(String usuario) {
		String msm;
	    if (!usuario.isEmpty() && usuarios.contains(usuario)) {
	      msm =  real.acceso(usuario);
	      conectado = true;
	    } else {
	      msm = "Acceso denegado";
	    }
		return msm;
	}
}
