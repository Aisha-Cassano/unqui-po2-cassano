package ar.edu.unq.po2.tp3.equipoDeTrabajo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class PersonaTestCase {
	
	private Persona persona;
	
	@BeforeEach
	public void setUp() throws Exception {
		persona = new Persona("Aisha", "Cassano", 24);
	}
	
	@Test
	void testNombre() {
		assertTrue (persona.getNombre() == "Aisha");
	}
	
	@Test
	void testApellido() {
		assertTrue (persona.getApellido() == "Cassano");
	}
	
	@Test
	void testEdad() {
		assertTrue (persona.getEdad() == 24);
	}

}
