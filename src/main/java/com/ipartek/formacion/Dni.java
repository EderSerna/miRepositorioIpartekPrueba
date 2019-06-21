package com.ipartek.formacion;

public class Dni {
	static final Integer NUM_DEF = 00000000;
	private Integer num;
	private char letra;

	public Dni() {
		this.num = NUM_DEF;
		calcularLetra(num);
	}

	public Dni(int num) {
		this.num = num;
		calcularLetra(num);
	}

	private void calcularLetra(Integer n) {
		String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
		int pos = (n % 23);
		this.letra= juegoCaracteres.charAt(pos);
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		if (num.toString().length() < 9) {
			this.num = NUM_DEF;
		} else {

			this.num = num;
			calcularLetra(num);
		}

	}

	public char getLetra() {
		return letra;
	}

}
