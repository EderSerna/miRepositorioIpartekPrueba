package com.ipartek.formacion.ejercicios.basicos;

import java.util.Scanner;

public class VariablesPrimitivasWrappers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un caracter");
		c = sc.nextLine().charAt(0);
		//System.out.println(() "Es una letra minuscula");
		if(Character.isLetter(c) && Character.isLowerCase(c)) 
			System.out.println("Es letra minuscula");
		else if(Character.isLetter(c) && Character.isUpperCase(c))
			System.out.println("Es mayuscula");
		else if(Character.isDigit(c))
			System.out.println("Es un numero");
		else if(Character.isWhitespace(c))
			System.out.println("Es espacio");
	}

}
