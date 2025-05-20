package ar.edu.unq.po2.tp3;

public class Punto {
	
	private int x;
	private int y;
	
	// CONSTRUCTORES
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Punto() {
		super();
		this.x = 0;
		this.y = 0;
	}
	
	// METODOS
	public void moverX(int newX) {
		setX(newX);
	}
	
	public void moverY(int newY) {
		setY(newY);
	}
	
	public int sumarPuntos() {
		return this.x + this.y;
	}
	
	// GETTERS & SETTERS
	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

}
