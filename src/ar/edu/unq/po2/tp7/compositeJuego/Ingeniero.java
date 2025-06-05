package ar.edu.unq.po2.tp7.compositeJuego;

public class Ingeniero extends Personaje{
	
	// es un leaf
	
	@Override
	public void caminar(int cantPasos) {
		int pasosRestantes = cantPasos;
		
		while (pasosRestantes != 0) {
			this.camino.colocarLaja();
			this.camino.avanzar();
			pasosRestantes--;
		}
	}

}
