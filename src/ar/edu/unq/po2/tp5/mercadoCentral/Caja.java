package ar.edu.unq.po2.tp5.mercadoCentral;

import java.util.ArrayList;

public class Caja {
	
	// VARIABLES DE INSTANCIA
	private Double montoTotal = 0d;
	private MercadoCentral mercado;
	private ArrayList<Facturable> carrito = new ArrayList<Facturable>();	
	
	// CONSTRUCTORES
	public Caja(MercadoCentral mercado) {
		this.mercado = mercado;
	}
	
	// METODOS
	public void agregarProducto(Producto unProducto) {
		this.carrito.add(unProducto);
		sumarAlMonto (unProducto.getPrecioFinal());
		mercado.quitarDelStock(unProducto);
	}
	
	public void agregarFactura(Factura unaFactura) {
		this.carrito.add(unaFactura);
		sumarAlMonto(unaFactura.getPrecioFinal());
		unaFactura.registrarPago();
	}
	
	private void sumarAlMonto(Double precioDeFacturable) {
		this.montoTotal = this.montoTotal + precioDeFacturable;
	}
	
	public void pagar() {
		this.montoTotal = 0d;
		this.carrito.clear();
	}
	
	// GETTERS & SETTERS
	Double getTotal() {
		return this.montoTotal;
	}
	
	ArrayList<Facturable> getCarrito(){
		return this.carrito;
	}
}
