package ar.edu.unq.po2.tp5.mercadoCentral;

import java.util.ArrayList;

public class MercadoCentral {
	
	// VARIABLES DE INSTANCIA
	private Caja caja1 = new Caja(this);
	private ArrayList <Producto> stock = new ArrayList<Producto>();
	
	// METODOS
	public void agregarAlStock(Producto producto) {
		stock.add(producto);
	}
	public void quitarDelStock(Producto producto) {
	//supongo que el producto esta en stock si o si
		int index = 0;
		
		while (producto.getID() != getIDDelIndex(index)) {
			index ++;
		}
		stock.remove(index);
	}
		
	private int getIDDelIndex(int nro) {
		Producto unProducto = this.stock.get(nro);	//se puede hacer en una linea, pero me cuesta leerlo
		return unProducto.getID();
	}
	
	public int cantDeProductosEnStock() {
		return (this.getStock()).size();
	}
	
	// GETTERS & SETTERS
	public ArrayList <Producto> getStock() {
		return this.stock;
	}
	
	public Caja getCaja1() {
		return this.caja1;
	}
}
