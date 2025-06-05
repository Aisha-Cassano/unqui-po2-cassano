package ar.edu.unq.po2.tp5.mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class ProductoCooperativaTestCase {
		
		private ProductoCooperativa leche;
		
		@BeforeEach
		public void setUp() throws Exception {
			leche = new ProductoCooperativa(145, 100d);
		}
	
	@Test
	void testPrecioBase() {
		assertEquals(leche.getPrecioBase(), 100d);
	}	
		
	@Test
	void testDescuentoDel10Porciento() {
		assertEquals(leche.getPrecioFinal(), 90d);
	}
	
	@Test
	void testID() {
		assertEquals(leche.getID(), 145);
	}
	
	@Test
	void testEsDeCooperativa() {
		assertTrue(leche.getEsDeCooperativa());
	}
}