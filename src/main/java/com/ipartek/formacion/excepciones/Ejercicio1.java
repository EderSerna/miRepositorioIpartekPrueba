package com.ipartek.formacion.excepciones;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		String sNumero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Comienza programa");

		// TODO Auto-generated catch block
		System.out.println("Introduce un numero del 1 al 9");
		bandera: do {
			sNumero = sc.nextLine();
			switch (sNumero) {
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
				break bandera;
			default:
				System.out.println("Por favor, introduzca un numero del 1 al 9");
				continue;
			}
		} while (true);

		Integer numero = Integer.parseInt(sNumero);
		System.out.println("Introduce otro numero del 1 al 9");
		algo: 
		do {
			sNumero = sc.nextLine();
			switch (sNumero) {
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
				break algo;
			default:
				System.out.println("Por favor, introduzca un numero del 1 al 9");
				continue;
			}

		} while (true);
		Integer numero2 = Integer.parseInt(sNumero);

		Integer sum = numero + numero2;
		System.out.println("La suma de " + numero + " y " + numero2 + " es: " + sum);
		sc.close();
		System.out.println("Finaliza programa");

	}

}
