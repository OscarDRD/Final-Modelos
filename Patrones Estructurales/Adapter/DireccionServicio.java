package Adapter;

public class DireccionServicio{
	
	private String principal;
	private String principalNum; 
	private String primerNum; 
	private String segundoNum; 
	private String localidad; 

	// Constructor vacio 
	public DireccionServicio() {
		
	}
	// Constructor dirrecion 
	public DireccionServicio(String principal,String principalNum, String primerNum, String segundoNum, String localidad) {
		this.setPrincipal(principal); 
		this.setPrincipalNum(principalNum);
		this.setPrimerNum(primerNum);
		this.setSegundoNum(segundoNum);
		this.setLocalidad(localidad);
	}

	// Getters y Setters 
	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getPrincipalNum() {
		return principalNum;
	}

	public void setPrincipalNum(String principalNum) {
		this.principalNum = principalNum;
	}

	public String getPrimerNum() {
		return primerNum;
	}

	public void setPrimerNum(String primerNum) {
		this.primerNum = primerNum;
	}

	public String getSegundoNum() {
		return segundoNum;
	}

	public void setSegundoNum(String segundoNum) {
		this.segundoNum = segundoNum;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
}
