package ar.edu.unq.po2.tp5.mercadoCentral;

public abstract class Producto implements Facturable {
	
	// VARIABLES DE INSTANCIA
	protected int id;
	protected Double precioBase;
	protected boolean esDeCooperativa;
	
	// CONSTRUCTORES
	public Producto (int id, Double precio) {
		this.id = id;
		this.precioBase = precio;
	}
	
	// GETTERS & SETTERS
	public abstract Double getPrecioFinal();
	
	public Double getPrecioBase() {
		return this.precioBase;
	}
	
	public int getID() {
		return this.id;
	}
	
	public boolean getEsDeCooperativa() {
		return this.esDeCooperativa;
	}
}
