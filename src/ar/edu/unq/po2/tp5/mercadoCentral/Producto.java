package ar.edu.unq.po2.tp5.mercadoCentral;

public abstract class Producto {
	
	protected String nombre;
	protected Double precioBase;
	protected boolean esDeCooperativa = false;
	
	// GETTERS & SETTERS
	public abstract Double getPrecioFinal();
}
