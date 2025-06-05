package ar.edu.unq.po2.tp6.solidBancos;

public abstract class SolicitudDeCredito {
	
	// VARIABLES
	protected Persona solicitante;
	protected Float montoSolicitado;
	protected int plazoEnMeses;
	
	// CONSTRUCTORES
	public SolicitudDeCredito (Persona solicitante, Float monto, int plazoEnMeses) {
		this.solicitante = solicitante;
		this.montoSolicitado = monto;
		this.plazoEnMeses = plazoEnMeses;
	}
	
	// METODOS
	public Float montoDeLaCuota() {
		return (this.montoSolicitado / this.plazoEnMeses);
	}
	
	public abstract boolean esAceptable();
	
	
	// GETTERS & SETTERS
	public Persona getSolicitante() {
		return this.solicitante;
	}
	
	public Float getMonto() {
		return this.montoSolicitado;
	}
	
	public int getPlazoEnMeses() {
		return this.plazoEnMeses;
	}

}
