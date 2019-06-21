package com.ipartek.formacion;

public abstract class ObjetoGrafico {
	public void mover(int x, int y) {
		System.out.println("Movemos el objeto hacia una posicion");
	}
	
	public abstract void dibujar(String color);
	
}
