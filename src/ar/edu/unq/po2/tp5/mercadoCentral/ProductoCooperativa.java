package ar.edu.unq.po2.tp5.mercadoCentral;

public class ProductoCooperativa extends Producto {
	
	// CONSTRUCTORES
	public ProductoCooperativa(int id, Double precioBase) {
		super(id, precioBase);
		this.esDeCooperativa = true;
	}
	// METODOS
	private Double aplicar10PorcientoDeDescuento() {
		return getPrecioBase() - (getPrecioBase() * 10) / 100;
	}
	
	// GETTERS & SETTERS
	public Double getPrecioFinal() {
		return aplicar10PorcientoDeDescuento();
	}
}
