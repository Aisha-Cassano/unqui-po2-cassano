package ar.edu.unq.po2.tp3;

public class CommonMultiple {
	
	int highestMultiple = 1000;
	
	//	METODOS
	public int highestCommonMultipleOf(int x, int y) {
		
		while ( (this.highestMultiple >= (-1)) && (!isCommonMultiple_Of_And_(this.highestMultiple, x, y)) ) {
			this.highestMultiple--;		//si no es comun denominador, resto uno y vuelvo a calcular
		}
		return highestMultiple();
	}
	
	public boolean isCommonMultiple_Of_And_(int aNumber, int x, int y) {
			
		return ((aNumber % x == 0) && (aNumber % y == 0));
	}
	
	// GETTERS & SETTERS
	public int highestMultiple() {
		if (highestMultiple == 0) {
			this.highestMultiple--;
		} 
		
		return this.highestMultiple;
	}
}
