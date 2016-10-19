package br.com.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.Calculadora;

public class CalculadoraTest {
	Calculadora calculadora = new Calculadora();
	
	@Test
	public void testSoma() {
		Assert.assertEquals(4, calculadora.soma(2, 2));
	}
	
	@Test
	public void testSubtracao() {
		Assert.assertEquals(0, calculadora.subtracao(2, 2));
	}
	
	@Test
	public void testMultiplicacao() {
		Assert.assertEquals(4, calculadora.multiplicacao(2, 2));
	}
	
	@Test
	public void testDivisao() {
		Assert.assertEquals(1, calculadora.divisao(2, 2));
	}
}
