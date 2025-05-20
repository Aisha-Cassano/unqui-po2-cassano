package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {
	private Rectangulo rectangulo;
	private Punto puntoOrigen;
	private Punto puntoDiagonal;
	
	@BeforeEach	//se tiene que importar
	public void setUp() throws Exception{
		puntoOrigen = new Punto(2,2);
		puntoDiagonal = new Punto (4,8);
		rectangulo = new Rectangulo(puntoOrigen, puntoDiagonal);
	}
	
	@Test
	void testArea() {
		int area = rectangulo.getArea();
		assertEquals(area, 12);
	}
	
	@Test
	void testPerimetro() {
		int perimetro = rectangulo.getPerimetro();
		assertEquals(perimetro, 16);
	}
	
	@Test
	void testDireccion() {
		String direccion = rectangulo.getDireccion();
		assertEquals(direccion, "Es Vertical.");
	}

}
