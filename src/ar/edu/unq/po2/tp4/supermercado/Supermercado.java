package ar.edu.unq.po2.tp4.supermercado;

import java.util.List;
import java.util.ArrayList;

public class Supermercado {
	
	private String nombre;
	private String direccion;
	private List<Producto> productos = new ArrayList<Producto>();
	
	// CONSTRUCTORES
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	// METODOS
	public void agregarProducto(Producto unProducto) {
		productos.add(unProducto);
	}
	
	// GETTERS & SETTERS
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public Double getPrecioTotal() {
		double precioTotal = 0;
		
		for (Producto producto : productos) {
			precioTotal = precioTotal + producto.getPrecio();
		}		
		return precioTotal;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
}
