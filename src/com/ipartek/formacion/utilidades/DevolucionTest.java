package com.ipartek.formacion.utilidades;

import static org.junit.Assert.*;

import org.junit.Test;

public class DevolucionTest {

	@Test
	public void testVueltas() throws Exception {
		int[] asdf=CalculadoraDevolucion.vueltas(2387.25, 3000d);
		for (int i = 0; i < CalculadoraDevolucion.BILLETES_MONEDAS.length; i++) {
			System.out.println(asdf[i]);
		}
		
	}
	@Test
	public void testVueltas2() throws Exception {
		int[] asdf=CalculadoraDevolucion.vueltas(10000d, 10000d);
		int[] qwert=new int[asdf.length];
		for (int i = 0; i < qwert.length; i++) {
			qwert[i]=0;
		}
		
		for (int i = 0; i < qwert.length; i++) {
			assertEquals(qwert[i], asdf[i]);
		}
		
	}
	@Test(expected = Exception.class)
	public void testVueltas3() throws Exception {
		int[] asdf=CalculadoraDevolucion.vueltas(101000d, 10000d);
		for (int i = 0; i < CalculadoraDevolucion.BILLETES_MONEDAS.length; i++) {
			System.out.println(asdf[i]);
		}
		
	}

}
