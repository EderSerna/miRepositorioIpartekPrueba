package com.ipartek.formacion;

public class PerroPresa extends Perro {
	
	
	
	
	public PerroPresa() {
		super();
		// TODO Auto-generated constructor stub
	}



	public PerroPresa(String nombre, String raza, int edad, boolean vacunado) {
		super(nombre, raza, edad, vacunado);
		// TODO Auto-generated constructor stub
	}



	void atacar() {
		System.out.println("Grrrrrrrrrrrrrr que te muerdo");
	}
}
