package pruebaSemaforo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	Calculadora calc = new Calculadora();
	
	@Test
	public void testSumaEnteros() {
		int resultado = calc.sumaEnteros(2, 5);
		int resultadoEsperado = 7;
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void testRestaEnteros() {
		int resultado = calc.restaEnteros(5,  3);
		int resultadoEsperado = 2;
		assertEquals(resultadoEsperado, resultado);
	}

	@Test
	public void testRaizCuadrada() {
		int resultado = calc.raizCuadrada(16);
		int resultadoEsperado = 8;
		assertEquals(resultadoEsperado, resultado);
	}
	
}
