package com.ipartek.formacion;

public class Perro {


	// valores de las variables del contructor default
	private static final String NOMBRE_DEF = "Perro";
	private static final String RAZA_DEF = "Raza";
	private static final int EDAD_DEF = 0;
	private static final boolean VACUN_DEF = false;
	// variables
	private String nombre;
	private String raza;
	private int edad;
	private boolean vacunado;

	// Constructores
	public Perro() {
		this.nombre = NOMBRE_DEF;
		this.raza = RAZA_DEF;
		this.edad = EDAD_DEF;
		this.vacunado = VACUN_DEF;

	}
	
	public Perro(String nombre) {
		this.nombre = nombre;
	}

	
	public Perro(String nombre, String raza, int edad, boolean vacunado) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.vacunado = vacunado;
	}




	/*
	public Perro(String n, String r, int e, boolean v) {
		this.nombre = n;
		this.raza = r;
		this.edad = e;
		this.vacunado = v;
	}
*/
	public String toString() {
		if (this.vacunado == true) {
			return "El perro se llama " + this.nombre + " es de la raza " + this.raza + " tiene " + this.edad
					+ " años y si esta vacunado";

		} else {
			return "El perro se llama " + this.nombre + " es de la raza " + this.raza + " tiene " + this.edad
					+ " años y no esta vacunado";

		}
	}

	// getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}
	/**
	 * When the parameter "edad" is < 0
	 * @param edad
	 * @throws Exception
	 */
	public void setEdad(int edad) throws Exception {
		if (edad < 0) {
			//this.edad = 0;
			throw new PerroException(PerroException.ERROR_EDAD);
		}
		else
			this.edad = edad;

	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}
}
