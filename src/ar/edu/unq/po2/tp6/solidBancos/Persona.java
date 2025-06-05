package ar.edu.unq.po2.tp6.solidBancos;

import java.time.LocalDate;	// (yyyy,mm,dd)  | "yyyy-mm-dd"
import java.time.Period;	// para marcar el periodo entre fecha A y B

public class Persona {
	
	// Variables
	private Propiedad hogar;
	private String nombre;
	private String apellido;
	private LocalDate nacimiento;
	private Float sueldo;
	private Banco banco;
	
	// CONSTRUCTOR
	public Persona (String nombre, String apellido, LocalDate nacimiento, Float sueldo, Propiedad propiedad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacimiento = nacimiento;
		this.sueldo = sueldo;		
		this.hogar = propiedad;	//podria ser una lista de propiedades
	}
	// METODOS
	public void solicitarCreditoPersonal(Float monto, int plazoEnMeses) {
		//genero el credito
		SolicitudDeCredito credito = new CreditoPersonal(this, monto, plazoEnMeses);
		//se lo solicito al banco (podria hacerlo todo junto)
		this.banco.nuevaSolicitudDeCredito(credito);
	}
	
	public void solicitarCreditoHipotecario(Float monto, int plazoEnMeses) {
		//genero el credito
		SolicitudDeCredito credito = new CreditoHipotecario(this, monto, plazoEnMeses);
		//se lo solicito al banco (podria hacerlo todo junto)
		this.banco.nuevaSolicitudDeCredito(credito);
	}
	
	public int edadDentroDe(int cantMeses) {
		//a la fecha actual (dia en q se llame a esta funcion) le sumo cantMeses
		LocalDate fechaDeseada = LocalDate.now().plusMonths(cantMeses);
		//a la fecha de nacimiento le resto la fecha deseada y pido solo los años que pasaron
		return Period.between(this.nacimiento, fechaDeseada).getYears();
	}
	
	// GETTERS & SETTERS
	public void setBanco(Banco unBanco) {
		this.banco = unBanco;
	}
	
	public Banco getBanco() {
		return this.banco;
	}
	
	public Propiedad getPropiedad() {
		return this.hogar;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public Float getSueldoMensual() {
		return this.sueldo;
	}
	
	public Float getSueldoAnual() {
		return (this.getSueldoMensual() * 12);
	}
	
	public int getEdadActual() {
		LocalDate fechaActual = LocalDate.now();
		
		return  Period.between(this.nacimiento, fechaActual).getYears();
	}
}
