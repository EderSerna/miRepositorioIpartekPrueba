package com.ipartek.formacion;

import java.lang.reflect.Array;

public class Aula {

	public static void main(String[] args) {
		String[] alumnos = new String[20];

		for (int i = 0; i < alumnos.length; i++) {
			char[] palabra = new char[5];

			for (int j = 0; j < palabra.length; j++) {
				char letra = (char) ((Math.random() * 25) + 65);
				palabra[j] = letra;
				// System.out.println(palabra[j]);
			}
			alumnos[i] = String.valueOf(palabra);
			System.out.println(alumnos[i]);
		}
	}

}
