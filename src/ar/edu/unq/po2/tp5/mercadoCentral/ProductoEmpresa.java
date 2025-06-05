package ar.edu.unq.po2.tp5.mercadoCentral;

public class ProductoEmpresa extends Producto {
	
	//CONSTRUCTORES
	public ProductoEmpresa(int id, Double precio) {
		super(id, precio);
		this.esDeCooperativa = false;
	}
	
	//GETTERS & SETTERS
	public Double getPrecioFinal() {
		return getPrecioBase();
	}
}
