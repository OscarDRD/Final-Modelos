package Adapter;

public class DireccionAdapter implements Target {
	
	private String cadena; 
	private String[] partes; 
	DireccionServicio direccion;

	@Override
	public String getDireccion() {
		partes = cadena.split("\\s");
		direccion = new DireccionServicio(partes[0],partes[1],partes[3],partes[4],partes[5]);
		return "Tipo: "+direccion.getPrincipal()+" # "+ direccion.getPrincipalNum()+"\nNumero: "+ 
				direccion.getPrimerNum()+" - " +direccion.getSegundoNum()+"\nLocalidad: "+direccion.getLocalidad();
	}

	@Override
	public void setDireccion(String cadena) {
		this.setCadena(cadena); 
	}
	
	
	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public String[] getPartes() {
		return partes;
	}

	public void setPartes(String[] partes) {
		this.partes = partes;
	}

}
