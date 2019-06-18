package com.ipartek.formacion;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.formacion.excepciones.PersonException;

public class Gente {
	static ArrayList<Integer> contVolun=new ArrayList<Integer>();
	static ArrayList<Person> personas=new ArrayList<Person>();
	static String nombre;
	static int opcion;
	static int edad;
	static int cont;
	static char sexo;
	static Person x;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws PersonException {

		do {
		mensaje();
		opcion=Integer.parseInt(sc.nextLine());
		switch (opcion) {
			case 1:
				listar();
				break;
			case 2:
				crearPersona();
				break;
			case 3:
				eliminarPersona();
				break;
			case 4:
				buscarVoluntario();
				break;
			default:
				System.out.println("Adios!");
				break;
			}
		}while(opcion!=0);


		sc.close();
		for (int i = 0; i < personas.size(); i++) {
			System.out.println(personas.get(i));
		}
		
	}
	
	private static void buscarVoluntario() {
		// TODO Auto-generated method stub
		
	}

	private static void eliminarPersona() {
		System.out.println("Introduce el nombre de la persona que vayas a eliminar");
		String nombre=sc.nextLine();
		Person elim;
		for (int i = 0; i < personas.size(); i++) {
			elim=new Person(personas.get(i));
			if(nombre.equals(elim.getNombre())) {
				personas.remove(i);
				contVolun.remove(i);
			}
		}
		
	}

	private static void listar() {
		
		
	}

	public static void mensaje() {
		System.out.println("==============MENU==============");
		System.out.println("================================\n");
		System.out.println("Opcion 1 - Listar Personas");
		System.out.println("Opcion 2 - Crear  Persona");
		System.out.println("Opcion 3 - Borrar Persona");
		System.out.println("Opcion 4 - Buscar Voluntario");
		System.out.println("Opcion 0 - S A L I R");
		
		System.out.print("\nIntroduce una opcion:");
	}
	
	public static void crearPersona() throws PersonException {
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
				contVolun.add(0);
			}
			
			System.out.println("Introduce el numero de personas que vas a crear");
			cont=sc.nextInt();
		}
	}

}
