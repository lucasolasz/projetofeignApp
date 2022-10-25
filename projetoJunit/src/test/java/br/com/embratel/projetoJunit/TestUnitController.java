package br.com.embratel.projetoJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.embratel.projetoJunit.controller.TestController;

public class TestUnitController {
	
	@Test
	public void testUnit() {
		TestController controller = new TestController();
		String resultado = controller.saudacao("NARUTO");
		
		assertEquals("Bem vindo, NARUTO", resultado);
	}
}
