package ar.edu.unq.po2.tp7.compositeJuego;

import java.util.ArrayList;

public abstract class Personaje {
	
	// es el componente
	ArrayList<Personaje>personajes = new ArrayList<Personaje>();
	Camino camino;
	
	// constructor
	public Personaje(Camino camino) {
		this.camino = camino;
	}
	
	// METODOS
	abstract void caminar(int cantPasos);
	
	public void agregarPersonaje(Personaje p){
		this.personajes.add(p);
	}
	
	public void eliminarPersonaje(int n) {
		this.personajes.remove(n);
	}
	
	public void imprimirTeam() {
		System.out.println(this.personajes);
	}
	
	public ArrayList<Personaje> getTeam(){
		return this.personajes;
	}

}
