package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CommonMultipleTestCase {
	
	CommonMultiple commonMultiple = new CommonMultiple();	
	
	@Test
	void testCommonMultipleOf3And9() {
		int number = commonMultiple.highestCommonMultipleOf (3,9);
		
		assertEquals(number, 999);
	}
	
	@Test
	void testCommonMultipleOf4And6() {
		int number = commonMultiple.highestCommonMultipleOf (4,6);
		
		assertEquals(number, 996);
	}
	
	@Test
	void testCommonMultipleOf37And41() {
		int number = commonMultiple.highestCommonMultipleOf (37,41);
		
		assertEquals(number, -1);
	}
}
