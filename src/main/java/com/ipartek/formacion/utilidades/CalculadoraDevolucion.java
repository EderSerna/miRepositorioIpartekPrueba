package com.ipartek.formacion.utilidades;

public class CalculadoraDevolucion {
	public static final Double[] BILLETES_MONEDAS = {
			// Billetes
			500d, 200d, 100d, 50d, 20d, 10d, 5d,
			// Monedas
			2d, 1d, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01 };
	
	/**
	 * Calcula las vueltas optimas para devolver el menor numero de monedas y billetes
	 * @param importe, coste del articulo
	 * @param entregado, dinero entregado para pagar
	 * @return
	 * @throws Exception importe > entregado
	 */
	public static int[] vueltas(Double importe, Double entregado)throws Exception {
			Double v=entregado - importe;
			int div=0;
			Double resto=v;
			int[] cont= new int[BILLETES_MONEDAS.length];
			for (int i = 0; i < cont.length; i++) {
				cont[i]=0;
			}
			if(v>0) {
				for (int i = 0; i < BILLETES_MONEDAS.length; i++) {											
						div=(int) (resto/BILLETES_MONEDAS[i]);
						resto=Math.round((resto%BILLETES_MONEDAS[i])*100.0d)/100.0d;
						cont[i]=div;					
				}
			}else if(v<0) {
				throw new Exception("Paga lo que me debes ratilla!");
			}
		return cont;

	}
}
