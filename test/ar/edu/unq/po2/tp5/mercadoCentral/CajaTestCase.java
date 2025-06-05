package ar.edu.unq.po2.tp5.mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTestCase {
	
	MercadoCentral mercado;
	Caja cajaDelMercado;
	Producto leche;
	Producto arroz;
	Producto arroz2;
	Producto gaseosa;
	
	@BeforeEach
	void setUp() throws Exception {
		//cada tipo de elemento tendra su propio ID, si es el mismo producto
		//pero uno de cooperativa y otro de empresa, seran diferente ID.
		mercado = new MercadoCentral();
		cajaDelMercado = mercado.getCaja1();
		
		leche = new ProductoCooperativa(111, 100d);
		arroz = new ProductoEmpresa(222, 50d);
		arroz2 = new ProductoEmpresa(222, 50d);
		gaseosa = new ProductoEmpresa(333, 75d);
				
		mercado.agregarAlStock(arroz);
		mercado.agregarAlStock(arroz2);
		mercado.agregarAlStock(gaseosa);
	}
	
	@Test
	void testLosProductosAparecenAgregadosAlCarrito() {
		cajaDelMercado.agregarProducto(arroz);
		assertEquals(cajaDelMercado.getCarrito().size(), 1);
	} 
	
	@Test
	void testAlAgregarUnProductoAlCarrito_SeVaDelStock() {
		cajaDelMercado.agregarProducto(arroz);
		assertEquals(mercado.cantDeProductosEnStock(), 2);
	}
	
	@Test
	void testPagarReseteaElMontoTotalYListaDeProductos() {
		cajaDelMercado.agregarProducto(arroz);
		cajaDelMercado.pagar();
		assertEquals(cajaDelMercado.getCarrito().size(), 0);
		assertEquals(cajaDelMercado.getTotal(), 0d);
	}

}
