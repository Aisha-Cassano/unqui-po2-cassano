package ar.edu.unq.po2.tp3;

public class Cuadrado {
	
	private Punto esquinaInfIzq;
	private int lados;
	
	// CONSTRUCTORES
	public Cuadrado (Punto esquinaInferiorIzquierda, int lado) {
		this.esquinaInfIzq = esquinaInferiorIzquierda;
		this.lados = lado;
	}
	// METODOS	
	public int getPerimetro() {
		return this.lados * 4;
	}
		
	public int getArea() {
		return this.lados * this.lados;
	}	
}
