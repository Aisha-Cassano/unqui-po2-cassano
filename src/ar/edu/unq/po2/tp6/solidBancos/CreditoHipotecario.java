package ar.edu.unq.po2.tp6.solidBancos;

public class CreditoHipotecario extends SolicitudDeCredito{
	
	// VARIABLES
	private Propiedad propiedad;
	
	// CONSTRUCTORES - si el solicitante tuviera una lista de propiedades, deberia 
	//traer como parametro para este constructor alguna propiedad.
	public CreditoHipotecario (Persona solicitante, Float monto, int plazoEnMeses) {
		super(solicitante, monto, plazoEnMeses);
		this.propiedad = solicitante.getPropiedad();
	}
	
	// METODOS
	@Override
	public boolean esAceptable() {
		return (esMontoMensualValido() && esMontoTotalValido() && esEdadValida());
	}
	
	private boolean esMontoMensualValido() {
		return (super.montoDeLaCuota() <= cincuentaPorcientoDeLosIngresosMensuales());
	}
	
	private boolean esMontoTotalValido() {
		return (super.montoSolicitado <= setentaPorcientoDelValorFiscal());
	}
	
	private boolean esEdadValida() {
		// la edad al momento de terminar el plazo no debe superar los 65
		return (super.getSolicitante().edadDentroDe(super.plazoEnMeses) <= 65);
	}
	
	private Float cincuentaPorcientoDeLosIngresosMensuales() {
		return (float) (super.getSolicitante().getSueldoMensual() * 0.5);
	}
	
	private Float setentaPorcientoDelValorFiscal() {
		return (float) (this.propiedad.getValorFiscal() * 0.7);
	}
	
	
	// GETTERS & SETTERS
	public Propiedad getPropiedadEnGarantia() {
		return this.propiedad;
	}
}
