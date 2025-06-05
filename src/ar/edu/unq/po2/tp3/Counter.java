package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	
	private List<Integer> numeros = new ArrayList<Integer>();
	
	private int contadorPares = 0;
	private int contadorImpares = 0;

	// METODOS	
	public void addNumber(int nro) {
		this.numeros.add(nro);
		this.modificarContadores(nro);
	}
	
	private void modificarContadores(int nro) {
		if (nro % 2 == 0) {
			this.contadorPares++; 		//sumo uno TIENE QUE ESTAR PEGADO
		} else {
			this.contadorImpares++; 	//sumo uno TIENE QUE ESTAR PEGADO
		}
	}
	
	public int multiplosDe(int divisor) {
		List<Integer>multiplosDelDivisor = new ArrayList<>();
		
		for (Integer nro : this.numeros) {
			if (nro % divisor == 0) {
				multiplosDelDivisor.add(nro);
			}
		}
		return multiplosDelDivisor.size();
	}

	// GETTERS & SETTERS
	public List<Integer> getNumeros() {
		return this.numeros;
	}
	
	public int getEvenOcurrences() {
		return this.contadorPares;
	}

	public int getOddOcurrences() {
		return this.contadorImpares;
	}
}
