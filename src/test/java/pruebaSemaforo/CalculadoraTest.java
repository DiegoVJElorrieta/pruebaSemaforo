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

}
