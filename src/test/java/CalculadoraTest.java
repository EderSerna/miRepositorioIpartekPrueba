

import static org.junit.Assert.*;

import org.junit.Test;

import com.ipartek.formacion.utilidades.Calculadora;

public class CalculadoraTest {
	Double a=3d, b=5d;
	@Test
	public void testSumar() {
		Double res=Calculadora.sumar(a, b);
		Double esp=8d;
		assertEquals(esp, res);
	}

	@Test
	public void testRestar() {
		Double res=Calculadora.restar(a, b);
		Double esp=-2d;
		assertEquals(esp, res);
	}

	@Test
	public void testMultiplicar() {
		Double res=Calculadora.multiplicar(a, b);
		Double esp=15d;
		assertEquals(esp, res);
	}

	@Test
	public void testDividir() {
		Double res=Calculadora.dividir(a, b);
		Double esp=0.6;
		assertEquals(esp, res);
	}

}
