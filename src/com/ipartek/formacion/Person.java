package com.ipartek.formacion;

import com.ipartek.formacion.excepciones.PersonException;

public class Person {
	//anonim 18 0 0 marrones i
	//sobrescribir nombre edad sexo
	static final String NOMBRE_DEF="anonimo";
	static final int EDAD_DEF=0;
	static final double ALTURA_DEF=0;
	static final double PESO_DEF=0;
	static final String OJOS_DEF="marrones";
	static final char SEXO_DEF='i';
	static final String NIF_DEF="000000000T";
	
	
	private String nombre;
	private int edad;
	private double altura;
	private double peso;
	private String ojos;
	private char sexo;
	private String nif;
	
	public Person() {
		this.nombre=NOMBRE_DEF;
		this.edad=EDAD_DEF;
		this.altura=ALTURA_DEF;
		this.peso=PESO_DEF;
		this.ojos=OJOS_DEF;
		this.sexo=SEXO_DEF;
		this.nif=NIF_DEF;
	}
	
	public Person(final Person p) {
		nombre=p.nombre;
		edad=p.edad;
		altura=p.altura;
		peso=p.peso;
		ojos=p.ojos;
		sexo=p.sexo;
		nif=p.nif;
	}
	public Person(String nif) {
		this.nif=nif;
		this.nombre=NOMBRE_DEF;
		this.edad=EDAD_DEF;
		this.altura=ALTURA_DEF;
		this.peso=PESO_DEF;
		this.ojos=OJOS_DEF;
		this.sexo=SEXO_DEF;
	}
	public Person(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.altura=ALTURA_DEF;
		this.peso=PESO_DEF;
		this.ojos=OJOS_DEF;
		this.nif=NIF_DEF;

	}
	
	public void generarDni(Integer n) throws PersonException {
		if(n.toString().length() < 8) {
			throw new PersonException(PersonException.ERROR_GENERAR_DNI_CORTO);
		}else if(n < 0) {
			throw new PersonException(PersonException.ERROR_GENERAR_DNI_NEG);
		}else {
			Dni d1=new Dni(n);
			this.nif=(d1.getNum().toString()+d1.getLetra());
		}

	}

	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String saludar() {
		return "Hola me llamo "+this.nombre;
	}
	
	public String toString() {
		return nif +" "+ nombre +" "+ edad +" "+ sexo;
		
	}

	//Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws PersonException {
		if (edad < 0) {
			//this.edad = 0;
			throw new PersonException(PersonException.ERROR_EDAD);
		}
		else
			this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) throws PersonException {
		if (altura < 0) {
			//this.edad = 0;
			throw new PersonException(PersonException.ERROR_ALTURA);
		}
		else
			this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) throws PersonException {
		if (peso < 0) {
			//this.edad = 0;
			throw new PersonException(PersonException.ERROR_PESO);
		}
		else
			this.peso = peso;
	}

	public String getOjos() {
		return ojos;
	}

	public void setOjos(String ojos) {
		this.ojos = ojos;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) throws PersonException {
		if(sexo!='h' && sexo!='H' && sexo!='m' && sexo!='M' && sexo!='i' && sexo!='I') {
			throw new PersonException(PersonException.ERROR_SEXO);
		}else
			this.sexo = sexo;
	}
	
}
