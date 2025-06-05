package ar.edu.unq.po2.tp5.mercadoCentral;

public class Impuesto extends Factura {

	// VARIABLES DE INSTANCIA
	private Double tasaDelServicio;
	
	// CONSTRUCTORES
	public Impuesto (Double tasaDelServicio) {
		this.tasaDelServicio = tasaDelServicio;
	}
	
	public void registrarPago() {
		////////////////////////////////////////////
	}

	// GETTERS & SETTERS
	public Double getPrecioFinal() {
		return this.tasaDelServicio;
	}
	
	public Double getTasa() {
		return this.tasaDelServicio;
	}
}
