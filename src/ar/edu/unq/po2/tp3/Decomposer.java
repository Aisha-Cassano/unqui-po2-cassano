package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Decomposer {
	
	private List<Integer>numeros = new ArrayList<Integer>();
	private int mostEven = 0;
	
	// METODOS
	public void addNumber(int nro) {
		this.numeros.add(nro);
		this.calculateMostEvenBetween(nro);
	}
	
	private void calculateMostEvenBetween(int newNumber) {
		if (this.amountOfEvensIn(newNumber) > this.amountOfEvensIn(mostEven)) {
			this.mostEven = newNumber;
		}
	}
	
	private int amountOfEvensIn(int aNumber) {
		ArrayList<Integer>digits = this.decomposeNumber (aNumber);	//cada digito de aNumber
		Counter counter = new Counter();	//inicio un counter
		
		for (Integer digit:digits) {
			counter.addNumber(digit);
		}
		return counter.getEvenOcurrences();
	}
	
	private ArrayList<Integer> decomposeNumber(int aNumber){
		int number = aNumber;	//se actualiza cada vez que lo divida (es decir que le saque un digito)
		ArrayList<Integer>eachDigit = new ArrayList<Integer>();
		
		while (number > 0) {
			// System.out.println("entreCon " + number);
			eachDigit.add(number % 10);
			number = number / 10;
		}
		return eachDigit;
	}

	// GETTER & SETTERS
	public int getMostEven() {
		return mostEven;
	}

}




