package ar.edu.unq.po2.tp3;
import java.time.LocalDate;	//(yyyy,mm,dd)  | "yyyy-mm-dd"
import java.time.Period;	//para marcar el periodo entre fecha A y B

public class Persona {
	private String nombre;
	private LocalDate fechaNacimiento;
	
	// CONSTRUCTOR
	public Persona (String nombre, LocalDate fecNacimiento) {	//no se pone tipo void ni nada en constructores
		this.nombre = nombre;
		this.fechaNacimiento = fecNacimiento;
	}
	
	// METODOS
	public boolean menorQue (Persona persona) {
		return this.getEdad() < persona.getEdad();
	}
	
	// GETTERS & SETTERS
	public int getEdad() {
		LocalDate fechaActual = LocalDate.now();
		
		return  Period.between(this.fechaNacimiento, fechaActual).getYears();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public LocalDate getFechaDeNacimiento() {
		return this.fechaNacimiento;
	}
}
