package ar.edu.unq.po2.tp5.mercadoCentral;

public abstract class Factura implements Facturable {
	
	public abstract Double getPrecioFinal();
	
	public abstract void registrarPago();
}
