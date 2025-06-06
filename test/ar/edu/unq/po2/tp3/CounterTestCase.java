package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CounterTestCase {
private Counter counter;
	/**
	* Crea un escenario de test básico, que consiste en un contador
	* con 10 enteros
	*
	* @throws Exception
	*/
	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el contador
		counter = new Counter();
		//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}
	/**
	* Verifica la cantidad de pares
	*/

	@Test
	public void testEvenNumbers() {
		// Getting the even occurrences
		int amount = counter.getEvenOcurrences();
		// I check the amount is the expected one
		assertEquals(amount, 1);
	} 
	
	@Test
	public void testOddNumbers() {
		// Getting the odd occurrences
		int amount = counter.getOddOcurrences();
		
		// I check the amount is the expected one
		assertEquals(amount, 9);
	}
	
	@Test
	public void testMultiplosDe() {
		// Consigo los multiplos de 3
		int amountOf3 = counter.multiplosDe(3);
		int amountOf1 = counter.multiplosDe(1);
		
		// Reviso que el valor de amountX sea el esperado
		assertEquals(amountOf3, 2);
		assertEquals(amountOf1, 10);
	}
		
}