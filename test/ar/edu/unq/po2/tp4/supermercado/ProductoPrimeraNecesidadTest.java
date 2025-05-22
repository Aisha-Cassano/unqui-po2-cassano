package ar.edu.unq.po2.tp4.supermercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false);
		arroz = new ProductoPrimeraNecesidad("Arroz", 10d, false, 5);
	}
	
	@Test
	public void testCalcularPrecioConDescuentoGeneral() {
		assertEquals(7.2, leche.getPrecio());
	}
	
	@Test
	public void testCalcularPrecioConDescuentoParticular() {
		assertEquals(9.50, arroz.getPrecio());
	}
}
