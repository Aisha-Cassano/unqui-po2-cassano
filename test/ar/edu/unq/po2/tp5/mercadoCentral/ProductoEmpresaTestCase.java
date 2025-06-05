package ar.edu.unq.po2.tp5.mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class ProductoEmpresaTestCase {
		
		private ProductoEmpresa gaseosa;
		
		@BeforeEach
		public void setUp() throws Exception {
			gaseosa = new ProductoEmpresa(555, 500d);
		}
	
	@Test
	void testPrecioBase() {
		assertEquals(gaseosa.getPrecioBase(), 500d);
	}	
		
	@Test
	void testDescuentoPrecioFinal() {
		assertEquals(gaseosa.getPrecioFinal(), 500d);
	}
	
	@Test
	void testID() {
		assertEquals(gaseosa.getID(), 555);
	}
	
	@Test
	void testEsDeCooperativa() {
		assertFalse(gaseosa.getEsDeCooperativa());
	}
}