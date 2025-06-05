package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class MultiOperator {
	
	private ArrayList<Integer> numeros = new ArrayList<Integer>();
	
	// METODOS
	public void addNumber(int nro) {
		this.numeros.add(nro);
	}
	
	public Integer sumarTodos() {
		Integer contador = 0;
		
		for (Integer nro : this.numeros) {
			contador = contador + nro;
		}
		return contador;
	}
	
	public Integer restarTodos() {
		//el orden de la lista es relevante
		Integer contador = this.numeros.get(0);
		
		for (Integer nro : numerosSinElPrimero()) {
			contador = contador - nro;
		}
		return contador;
	}
	
	public Integer multiplicarTodos() {
		Integer contador = 1;
		
		for (Integer nro : this.numeros) {
			contador = contador * nro;
		}
		return contador;
	}
	
	private ArrayList<Integer>numerosSinElPrimero(){
		ArrayList<Integer> sinElPrimero = this.numeros;
		sinElPrimero.remove(0);
		
		return sinElPrimero;
	}
	
	
	
	
}
