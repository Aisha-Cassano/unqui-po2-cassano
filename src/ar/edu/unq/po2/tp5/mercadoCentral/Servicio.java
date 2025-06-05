package ar.edu.unq.po2.tp5.mercadoCentral;

public class Servicio extends Factura{
	
	// VARIABLES DE INSTANCIA
	private Double costoPorUnidad;
	private int unidadesConsumidas;
	
	// CONSTRUCTORES
	public Servicio (Double costoPorUnidad, int unidadesConsumidas) {
		this.costoPorUnidad = costoPorUnidad;
		this.unidadesConsumidas = unidadesConsumidas;
	}
	
	// METODOS
	public void registrarPago() {
		/////////////////////////////////////////
	}
	
	// GETTERS & SETTERS
	public Double getPrecioFinal() {
		return (this.costoPorUnidad * this.unidadesConsumidas);
	}
	
	public Double getCostoPorUnidad() {
		return this.costoPorUnidad;
	}
	
	public int unidadesConsumidas() {
		return this.unidadesConsumidas;
	}
}
