package ar.edu.unq.po2.tp3.equipoDeTrabajo;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	
	private ArrayList<Persona> integrantes = new ArrayList<Persona>();
	private String nombre;
	
	// CONSTRUCTOR
	public EquipoDeTrabajo (String nombre, ArrayList<Persona> personas) {
		this.integrantes = personas;
		this.nombre = nombre;
	}
	
	// METODOS
	public int promedioDeEdad() {
		int sumaDeLasEdades = 0;
		
		for (Persona integrante : this.integrantes) {
			sumaDeLasEdades = sumaDeLasEdades + integrante.getEdad(); 
		}
		return sumaDeLasEdades / this.integrantes.size();
	}
	
	// GETTERS & SETTERS
	public String getNombre() {
		return this.nombre;
	}
}
