package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

class PersonaTestCase {
	
	private Persona thiago;
	private Persona aisha;
	private LocalDate nacimientoT;
	private LocalDate nacimientoA;
	
	@BeforeEach
	public void setUp() throws Exception {
		nacimientoT = LocalDate.of(2003,01,05);
		nacimientoA = LocalDate.of(2001, 01, 01);
		thiago = new Persona ("Thiago", nacimientoT);
		aisha = new Persona ("Aisha", nacimientoA);
	}

	@Test
	public void testEdad() {
		int edad = thiago.getEdad();
		
		assertEquals(edad, 22);
	}
	
	@Test
	public void testNombre() {
		String nombre = thiago.getNombre();
		
		assertEquals(nombre, "Thiago");
	}

	@Test
	public void testFechaDeNacimiento() {
		LocalDate unaFecha = thiago.getFechaDeNacimiento();
		
		assertEquals(unaFecha, nacimientoT);
	}

	@Test
	public void testThiagoEsMenorQueAisha() {
		assertTrue(thiago.menorQue(aisha));
	}
	
	@Test
	public void testAishaNoEsMenorQueThiago() {
		assertFalse(aisha.menorQue(thiago));
	}

}
