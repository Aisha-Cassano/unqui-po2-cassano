package ar.edu.unq.po2.tp5.mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MercadoCentralTestCase {

	MercadoCentral mercado;
	Producto leche;
	Producto arroz;
	Producto arroz2;
	Producto gaseosa;
	
	@BeforeEach
	void setUp() throws Exception {
		//cada tipo de elemento tendra su propio ID, si es el mismo producto
		//pero uno de cooperativa y otro de empresa, seran diferente ID.
		mercado = new MercadoCentral();
		
		leche = new ProductoCooperativa(111, 100d);
		arroz = new ProductoEmpresa(222, 50d);
		arroz2 = new ProductoEmpresa(222, 50d);
		gaseosa = new ProductoEmpresa(333, 75d);
		
		mercado.agregarAlStock(arroz);
	}

	@Test
	void testAgregarProductos() {
		assertEquals(mercado.cantDeProductosEnStock(), 1);
		mercado.agregarAlStock(arroz2);
		mercado.agregarAlStock(gaseosa);
		assertEquals(mercado.cantDeProductosEnStock(), 3);		
	}
	
	@Test
	void testQuitarProductos() {
		assertEquals(mercado.cantDeProductosEnStock(), 1);
		mercado.quitarDelStock(arroz);

		assertTrue(mercado.getStock().isEmpty());
	}
}
