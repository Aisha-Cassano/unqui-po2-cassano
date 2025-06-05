package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiOperatorTestCase {
private MultiOperator operator;

	//Creo un escenario donde agrego varios numeros
	
	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el contador
		operator = new MultiOperator();
		//Se agregan los numeros. Un solo par y nueve impares
		operator.addNumber(0);
		operator.addNumber(5);
		operator.addNumber(0);
		operator.addNumber(10);
	}
	
	@Test	//Verifico la suma
	public void testSumarNumeros() {
		int resultado = operator.sumarTodos();
		assertEquals(resultado, 15);
	}
	
	@Test	//Verifico la resta
	public void testRestarNumeros() {
		int resultado = operator.restarTodos();
		assertEquals(resultado, -15);
	}
	
	@Test	//Verifico la multiplicacion
	public void testMultiplicarNumeros() {
		int resultado = operator.multiplicarTodos();
		assertEquals(resultado, 0);
	}


}
