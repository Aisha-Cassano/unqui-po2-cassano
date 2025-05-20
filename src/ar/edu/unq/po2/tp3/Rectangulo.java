package ar.edu.unq.po2.tp3;

public class Rectangulo {

	private Punto origen;
	private Punto diagonal;

	
	// CONSTRUCTORES
	public Rectangulo(Punto origen, Punto diagonal) {
		super();
		this.origen = origen;
		this.diagonal = diagonal;	
	}
	
	// METODOS 
	private int base() {
		return (int) Math.abs(origen.getX() - diagonal.getX());
	}
	
	private int altura() {
		return (int) Math.abs(origen.getY() - diagonal.getY());
	}
	
	public String getDireccion() {
		boolean esHorizontal = this.base() > this.altura();
		
		return (esHorizontal? "Es Horizontal." : "Es Vertical.");	//ternario
	}
	
	public int getPerimetro() {
		return (this.base() * 2) + (this.altura() * 2);
	}
	
	public int getArea() {
		return this.base() * this.altura();
	}
	
}
