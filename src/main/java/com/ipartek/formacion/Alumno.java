package com.ipartek.formacion;

public class Alumno extends Person implements Comparable<Alumno>, IAmigable{

	private int numVecesLeer;

	
	
	public Alumno(int id, String nombre) {
		super(nombre);
		super.setId(id);
		this.numVecesLeer = 0;
	}

	public int getNumVecesLeer() {
		return numVecesLeer;
	}

	public void setNumVecesLeer(int numVecesLeer) {
		this.numVecesLeer = numVecesLeer;
	}

	@Override
	public String toString() {
		return super.toString() + "Alumno [numVecesLeer=" + numVecesLeer + "]";
	}

	@Override
	public int compareTo(Alumno o) {		
		return o.getNumVecesLeer() - this.numVecesLeer;
	}

	@Override
	public String despedir() {		
		return "Agur Venur";
	}


	
	
	
}
