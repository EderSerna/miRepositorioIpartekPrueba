package com.ipartek.formacion;

import java.util.Date;

public class Employee extends Person {
	static final double SALARIO_DEF=937.5;
	static final int NUMERO_DEF=0;
	static final Date FECHA_DEF=new Date();
	
	private int numero;
	private Date fechaContrato;
	private double salario;
	
	public Employee() {
		super();
		this.numero=NUMERO_DEF;
		this.fechaContrato=FECHA_DEF;
		this.salario=SALARIO_DEF;
	}
	public String toString() {
		return super.toString()+" "+ this.salario;
	}
	public Employee(String nombre, int edad, char sexo, double salario) {
		super(nombre, edad, sexo);
		this.salario=salario;
		this.numero=NUMERO_DEF;
		this.fechaContrato=FECHA_DEF;		
	}
	
	//getters & setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
