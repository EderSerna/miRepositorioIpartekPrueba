package com.ipartek.formacion;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.formacion.excepciones.PersonException;

public class Gente {

	public static void main(String[] args) throws PersonException {
		/*String a=" ";
		String s="asdf";
		Employee[] ricos= new Employee[3];
		ricos[0]= new Employee("Jeff Bezos",55,'h',150000);
		ricos[1]= new Employee("Bill Gates",63,'h',136000);
		ricos[2]= new Employee("Warren Buffett",88,'h',87000);*/
		/*Person p1=new Person();
		try {
			p1.generarDni(79181049);
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*for (int i = 0; i < ricos.length; i++) {
			System.out.println(ricos[i].toString());
		}
		*/
		/*for (int i = 0; i < ricos.length; i++) {
			String[] datos=ricos[i].toString().split(a);
			System.out.print((i+1)+" ");
			for (int j = 0; j < datos.length; j++) {
				if(j!=3 && j!=2)
					System.out.print(datos[j]+" ");
			}
			System.out.println();
		}*/
		
		//System.out.println(p1.getNif());
		
		
		
		ArrayList<Person> personas=new ArrayList<Person>();
		String nombre;
		int edad, cont;
		char sexo;
		Person x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el numero de personas que vas a crear");
		cont=Integer.parseInt(sc.nextLine());
		sc.nextLine();
		while(cont !=0) {

			for (int i = 0; i < cont; i++) {
				System.out.println("Persona "+(i+1));
				System.out.println("Introduce nombre");
				nombre = sc.nextLine();
				sc.nextLine();
				System.out.println("Introduce edad");
				edad=Integer.parseInt(sc.nextLine());
				sc.nextLine();
				System.out.println("Introduce sexo");
				sexo=sc.nextLine().charAt(0);
				sc.nextLine();
				x=new Person();
				x.setNombre(nombre);
				x.setEdad(edad);
				x.setSexo(sexo);
				personas.add(x);
			}
			
			System.out.println("Introduce el numero de personas que vas a crear");
			cont=sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < personas.size(); i++) {
			System.out.println(personas.get(i));
		}
		
	}

}
