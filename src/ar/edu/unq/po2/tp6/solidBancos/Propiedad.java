package ar.edu.unq.po2.tp6.solidBancos;

public class Propiedad {
	
	// VARIABLES
	private String dir;
	private Float valorFiscal;
	
	// CONSTRUCTOR
	public Propiedad (String direccion, Float valorFiscal) {
		this.dir = direccion;
		this.valorFiscal = valorFiscal;
	}
	
	// METODOS
	public Float getValorFiscal() {
		return this.valorFiscal;
	}
	
	public String getDireccion() {
		return this.dir;
	}
}
