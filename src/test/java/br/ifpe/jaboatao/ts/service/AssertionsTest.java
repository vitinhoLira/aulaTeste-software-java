package br.ifpe.jaboatao.ts.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.ifpe.jaboatao.ts.entidades.Usuario;

public class AssertionsTest {
	
	@Test
	public void teste01() {
			
		Assertions.assertTrue(true);
		Assertions.assertFalse(false);
		
	}
	
	@Test
	public void teste02() {
			//Number
			Assertions.assertEquals(1, 1);
			
			//String
			//Assertions.assertEquals("Casa", "Casa");
			//Assertions.assertEquals("Casa", "casa");
			Assertions.assertNotEquals(1, 2);
			
			//Objetos
			Usuario u1 = new Usuario("Usuario 01");
			Usuario u2 = new Usuario("Usuario 01");
			
			Assertions.assertEquals(u1, u2);
			
		
	}
	
	@Test
	public void teste03() {
			
			//Objetos
			Usuario u1 = new Usuario("Usuario 01");
			Usuario u2 = new Usuario("Usuario 01");
			Usuario u3 = u1; 
			Usuario u4 = u1;
			Usuario u5 = null;
			Assertions.assertEquals(u1, u3);
			
			Assertions.assertNull(u5);
			Assertions.assertNotNull(u5, "Não deveria ser null"); //msg aparece quando dá erro
			Assertions.assertNotNull(u4);
		
	}
	

}
