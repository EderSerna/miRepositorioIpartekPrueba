package com.ipartek.formacion;

import java.util.ArrayList;
import java.util.Scanner;

public class PruenaArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num,sum=0, cont=0;
		Double media;
		
		num=sc.nextInt();
		while (num!=-99) {
			numeros.add(num);
			num=sc.nextInt();
		}
		
		for (int i = 0; i < numeros.size(); i++) {
			sum+=numeros.get(i);
		}
		media=(double) (sum/numeros.size());
		
		for (int i = 0; i < numeros.size(); i++) {
			if(numeros.get(i) > media) 
				cont++;
		}
		
		System.out.println("La suma total de los numeros es: "+sum);
		System.out.println("La media es: "+media);
		System.out.println("Hay un total de "+cont+" numeros mayores que la media");
	}

}
