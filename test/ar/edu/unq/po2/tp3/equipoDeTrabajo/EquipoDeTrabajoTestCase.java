package ar.edu.unq.po2.tp3.equipoDeTrabajo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;

class EquipoDeTrabajoTestCase {

	private EquipoDeTrabajo equipo;
	private ArrayList<Persona> personas = new ArrayList<Persona>();
	
	@BeforeEach
	public void setUp() throws Exception {
		
		personas.add(new Persona ("Aisha", "Cassano", 24));
		personas.add(new Persona ("Thiago", "Sampaolo", 22));
		personas.add(new Persona ("Candela", "Batistuti", 24));
		personas.add(new Persona ("Camila", "Zorzi", 23));
		personas.add(new Persona ("Ivan", "Cassano", 34));
		
		equipo = new EquipoDeTrabajo("equipo23", personas);
	}
	
	@Test
	void testNombre() {
		assertTrue (equipo.getNombre() == "equipo23");
	}
	
	@Test
	void testPromedioDeEdades() {
		assertTrue (equipo.promedioDeEdad() == 25);
	}

}




