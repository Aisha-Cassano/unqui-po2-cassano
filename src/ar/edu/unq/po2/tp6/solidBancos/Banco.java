package ar.edu.unq.po2.tp6.solidBancos;

import java.util.ArrayList;

public class Banco {
	
	// VARIABLES
	private ArrayList<Persona> clientes = new ArrayList<Persona>();
	private ArrayList<SolicitudDeCredito> solicitudes = new ArrayList<SolicitudDeCredito>();
	private ArrayList<SolicitudDeCredito> aceptables = new ArrayList<SolicitudDeCredito>();	
	
	// METODOS
	public void ingresarCliente(Persona cliente) {
		this.clientes.add(cliente);
	}
	
	public void nuevaSolicitudDeCredito(SolicitudDeCredito solicitud) {
		this.solicitudes.add(solicitud);
		this.agregarSiEsAceptable(solicitud);
	}

	
	private void agregarSiEsAceptable(SolicitudDeCredito solicitud) {
		if (solicitud.esAceptable()) {
			this.aceptables.add(solicitud);
		}
	}
	
	// GETTERS & SETTERS
	public ArrayList<Persona> getClientes() {
		return this.clientes;
	}
	
	public ArrayList<SolicitudDeCredito> getSolicitudes() {
		return this.solicitudes;
	}
	
	public ArrayList<SolicitudDeCredito> getSolicitudesAceptables(){
		return this.aceptables;
	}
}
