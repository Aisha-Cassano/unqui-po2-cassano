package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PuntoTestCase {
	private Punto punto;
	
	@Test
	public void testPuntoCon0Y0() {
		punto = new Punto();	//inicializo sin argumentos
		
		assertEquals(punto.getX(), 0);
		assertEquals(punto.getY(), 0);
	}
	
	@Test
	public void testPuntoCon4Y6() {
		punto = new Punto(4, 6);	//inicializo con argumentos
		
		assertEquals(punto.getX(), 4);
		assertEquals(punto.getY(), 6);
	}
	
	@Test
	public void testSumarPuntos() {
		punto = new Punto(4, 6);	//inicializo
		
		assertEquals(punto.sumarPuntos(), 10);
	}
	
	@Test
	public void testMoverX() {
		punto = new Punto();	//inicializo
		punto.moverX(10);
		
		assertEquals(punto.getX(), 10);
	}
	
	@Test
	public void testMoverY() {
		punto = new Punto();	//inicializo
		punto.moverY(5);
		
		assertEquals(punto.getY(), 5);
	}
}
