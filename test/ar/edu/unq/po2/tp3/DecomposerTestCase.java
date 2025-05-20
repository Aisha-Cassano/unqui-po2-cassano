package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecomposerTestCase {
	private Decomposer decomposer;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		decomposer = new Decomposer();	//creo instancia del decomposer
		
		//agrego numeros al decomposer
		decomposer.addNumber(306);
		decomposer.addNumber(45);
		decomposer.addNumber(2000);
	}

	@Test
	public void testGetMostEven() {
		int amount = decomposer.getMostEven();
		
		assertEquals(amount,2000);
	}

}
