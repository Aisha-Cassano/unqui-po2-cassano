package ar.edu.unq.po2.tp7.compositeJuego;

public class Caballero extends Personaje {
	
	// es un leaf
	@Override
	public void caminar(int cantPasos) {
		int pasosRestantes = cantPasos;
		
		while (pasosRestantes != 0) {
			this.vigilarEnZicZac();
			this.camino.avanzar();
			pasosRestantes--;
		}
	}
	
	public void vigilarEnZicZac() {
		
	}
}
