package ar.edu.unq.po2.tp7.compositeJuego;

public class Ingeniero extends Personaje{
	
	// es un leaf
	
	public Ingeniero(Camino camino) {
		super(camino);
	}
	
	@Override
	public void caminar(int cantPasos) {
		int pasosRestantes = cantPasos;
		
		while (pasosRestantes != 0) {
			this.colocarLaja();
			this.camino.avanzar();
			pasosRestantes--;
		}
	}
	
	public void colocarLaja() {
		
	}
	

}
