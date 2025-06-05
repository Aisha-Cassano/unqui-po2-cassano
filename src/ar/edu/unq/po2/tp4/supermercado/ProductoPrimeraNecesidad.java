package ar.edu.unq.po2.tp4.supermercado;

public class ProductoPrimeraNecesidad extends Producto{
	
	private int descuentoDel = 10;
	
	// CONSTRUCTOR
	public ProductoPrimeraNecesidad(String nombre, Double precio, boolean esCuidado) {
		super(nombre, precio, esCuidado);
	}
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, boolean esCuidado, int porcentajeDeDescuento) {
		super(nombre, precio, esCuidado);
		this.descuentoDel = porcentajeDeDescuento;
	}
	
	private Double aplicarDescuento() {
		return super.precio - (super.precio * this.descuentoDel) / 100;
	}
	
	// GETTERS & SETTERS
	public Double getPrecio() {
		return aplicarDescuento();
	}
	
	public void setDescuento(int porcentajeNuevo) {
		descuentoDel = porcentajeNuevo;
	}
}
