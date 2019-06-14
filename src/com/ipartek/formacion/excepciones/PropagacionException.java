package com.ipartek.formacion.excepciones;

import com.ipartek.formacion.Perro;

public class PropagacionException {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Comienza main");
		metodoA();
		System.out.println("Termina main");

	}
	
	private static void metodoA() throws Exception {
		System.out.println("Comienza metodo A");
		Perro p1=new Perro();
		p1.setEdad(-2);
		System.out.println(p1);
		System.out.println("Termina metodo A");
	}
	
	private static void metodoB() {
		System.out.println("Comienza metodo B");
		System.out.println("Termina metodo B");
	}

}
