package ar.edu.unq.po2.tp4.supermercado;

public class Producto {
	
	protected String nombre;		//protected lo hace accesible a las subclases solo
	protected Double precio;
	protected boolean esPrecioCuidado = false;
	
	// CONSTRUCTORES 
	public Producto (String nombre, Double precio){
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Producto (String nombre, Double precio, boolean esCuidado){
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esCuidado;
	}
	// METODOS
	public void aumentarPrecio(Double aumentaEn) {
		this.precio = precio + aumentaEn;
	}
	
	// GETTERS & SETTERS
	public String getNombre() {
		return this.nombre;
	}
	
	public Double getPrecio() {
		return this.precio;
	}
	
	public boolean esPrecioCuidado() {
		return this.esPrecioCuidado;
	}
	
}
