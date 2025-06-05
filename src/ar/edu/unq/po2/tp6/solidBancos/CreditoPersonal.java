package ar.edu.unq.po2.tp6.solidBancos;

public class CreditoPersonal extends SolicitudDeCredito{
	// VARIABLES
	
	// CONSTRUCTORES
	public CreditoPersonal(Persona solicitante, Float monto, int plazoEnMeses) {
		super(solicitante, monto, plazoEnMeses);
	}
	
	// METODOS
	@Override
	public boolean esAceptable() {
		return (sueldoAnualValido() && montoCuotaValido() );
	}
	
	private boolean sueldoAnualValido() {
		return (super.getSolicitante().getSueldoAnual() >= 15000d);
	}
	
	private boolean montoCuotaValido() {
		return super.getMonto() < setentaPorcientoDelSueldo();
	}
	
	private Float setentaPorcientoDelSueldo() {
		return (float) (super.getSolicitante().getSueldoMensual() * 0.7);
	}
	
}
