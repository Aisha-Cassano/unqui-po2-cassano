package ar.edu.unq.po2.tp3.equipoDeTrabajo;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	
	// CONSTRUCTOR
	public Persona (String nombre, String apellido, int edad) {	//no se pone tipo void ni nada en constructores
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	// GETTERS & SETTERS
	public int getEdad() {
		return this.edad;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
}
