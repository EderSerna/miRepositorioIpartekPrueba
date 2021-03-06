package com.ipartek.formacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.formacion.excepciones.PersonException;

public class Gente {
	static ArrayList<Person> copiaPer = new ArrayList<Person>();
	static ArrayList<Integer> copiaCont = new ArrayList<Integer>();
	static ArrayList<Person> ordPer = new ArrayList<Person>();
	static ArrayList<Integer> contVolun = new ArrayList<Integer>();
	static ArrayList<Person> personas = new ArrayList<Person>();
	static ArrayList<String> nombres = new ArrayList<String>();
	static String nombre;
	static int opcion;
	static int cont;
	static int n;
	static Person x;
	static Scanner sc = new Scanner(System.in);
	static boolean b = false;

	public static void main(String[] args) throws PersonException, InterruptedException {
		// copiaPer.addAll(personas);
		cargarDatos();
		inicializarArray();
		do {
			mensaje();
			opcion = Integer.parseInt(sc.nextLine());
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
			case 5:
				ordenarArray();
				break;
			default:
				System.out.println("Adios!");
				break;
			}
		} while (opcion != 0);

		sc.close();
		guardarDatos();
	}
	
	/**
	 * carga los datos que hay guardados en un fichero, en caso de no haber simplemente no hace nada
	 */
	private static void cargarDatos() {
		File archivoNombres = null, archivoCont = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			archivoNombres = new File("C:\\1713\\DocumentosPrueba\\nombres.txt");
			fr = new FileReader(archivoNombres);
			br = new BufferedReader(fr);

			// Lectura del fichero
			String linea;
			while ((linea = br.readLine()) != null)
				nombres.add(linea);
		} catch (Exception e) {
			//e.printStackTrace();

		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				//e2.printStackTrace();
			}
		}

		try {
			archivoCont = new File("C:\\1713\\DocumentosPrueba\\contadores.txt");
			fr = new FileReader(archivoCont);
			br = new BufferedReader(fr);

			// Lectura del fichero
			String linea;
			while ((linea = br.readLine()) != null)
				contVolun.add(Integer.parseInt(linea));
		} catch (Exception e) {
			//e.printStackTrace();

		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				//e2.printStackTrace();
			}
		}

	}
	
	/**
	 * Guardado de datos en fichero de texto, para que no se pierdan y eso
	 */
	private static void guardarDatos() {
		FileWriter ficheroNombres = null, ficheroCont = null;
		PrintWriter pw = null;
		try {
			ficheroNombres = new FileWriter("C:\\1713\\DocumentosPrueba\\nombres.txt");
			pw = new PrintWriter(ficheroNombres);

			for (int i = 0; i < personas.size(); i++)
				pw.println(personas.get(i).getNombre());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != ficheroNombres)
					ficheroNombres.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		try {
			ficheroCont = new FileWriter("C:\\1713\\DocumentosPrueba\\contadores.txt");
			pw = new PrintWriter(ficheroCont);

			for (int i = 0; i < personas.size(); i++)
				pw.println(contVolun.get(i));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != ficheroCont)
					ficheroCont.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	/**
	 * Funcion que inicializa el array con los valores por defecto en case de estar vacio
	 * si no, llena la lista con los nombre en el array nombres
	 */
	public static void inicializarArray() {

		/*
		 * "Ander", "Mounir", "Andoni", "Asier", "Jon C", "Arkaitz", "Aritz", "Manuel",
		 * "Eder I", "Eder S", "Gaizka", "Borja", "Ver�nica", "Jon A", "Jos� Luis"
		 */
		if (nombres.isEmpty()) {
			personas.add(new Person("Ander"));
			personas.add(new Person("Mounir"));
			personas.add(new Person("Andoni"));
			personas.add(new Person("Asier"));
			personas.add(new Person("Jon C"));
			personas.add(new Person("Arkaitz"));
			personas.add(new Person("Aritz"));
			personas.add(new Person("Manuel"));
			personas.add(new Person("Eder I"));
			personas.add(new Person("Eder S"));
			personas.add(new Person("Gaizka"));
			personas.add(new Person("Borja"));
			personas.add(new Person("Verónica"));
			personas.add(new Person("Jon A"));
			personas.add(new Person("Jose Luis"));

			copiaPer.addAll(personas);
			for (int i = 0; i < personas.size(); i++) {
				contVolun.add(0);
			}
		} else {
			for (int i = 0; i < nombres.size(); i++) {
				personas.add(new Person(nombres.get(i)));
				// copiaPer.add(new Person(nombres.get(i)));
				copiaPer.addAll(personas);
			}
		}

	}

	/**
	 * Muestra los alumnos del array junto con las veces que han sido voluntarios
	 * desde que la aplicacion de lanza
	 * 
	 * @throws InterruptedException me obliga a ponerlo pero no salta
	 */
	private static void listar() throws InterruptedException {
		for (int i = 0; i < personas.size(); i++) {
			if (b) {
				if (i == n)
					System.out
							.println("Afortunado!!! " + personas.get(i).getNombre() + " Nº Veces: " + contVolun.get(i));
				else
					System.out.println("Nombre: " + personas.get(i).getNombre() + " Nº Veces: " + contVolun.get(i));

			} else
				System.out.println("Nombre: " + personas.get(i).getNombre() + " Nº Veces: " + contVolun.get(i));
		}
		espera(1);
	}

	/**
	 * Le dices el numero de personas que vas a crear y a�ades el nombre de cada una
	 * de ellas
	 * 
	 * @throws PersonException salta si introduces algo que no debes en persona
	 */
	public static void crearPersona() throws PersonException {
		System.out.println("Introduce el numero de personas que vas a crear");
		cont = Integer.parseInt(sc.nextLine());
		sc.nextLine();
		while (cont != 0) {

			for (int i = 0; i < cont; i++) {
				System.out.println("Persona " + (i + 1));
				System.out.println("Introduce nombre");
				nombre = sc.nextLine();
				// sc.nextLine();
//				System.out.println("Introduce edad");
//				edad=Integer.parseInt(sc.nextLine());
//				sc.nextLine();
//				System.out.println("Introduce sexo");
//				sexo=sc.nextLine().charAt(0);
				sc.nextLine();
				x = new Person();
				x.setNombre(nombre);
				// x.setEdad(edad);
				// x.setSexo(sexo);
				personas.add(x);
				copiaPer.add(x);
				contVolun.add(0);
			}

			System.out.println("Introduce el numero de personas que vas a crear");
			cont = Integer.parseInt(sc.nextLine());
		}
		guardarDatos();
	}

	/**
	 * comprueba el nombre de la persona que vas a eliminar y la borra
	 */
	private static void eliminarPersona() {
		System.out.println("Introduce el nombre de la persona que vayas a eliminar");
		String nombre = sc.nextLine().toLowerCase();
		Person elim;
		for (int i = 0; i < personas.size(); i++) {
			elim = new Person(personas.get(i));
			if (nombre.equals(elim.getNombre().toLowerCase())) {
				personas.remove(i);
				contVolun.remove(i);
				copiaPer.remove(i);
				guardarDatos();
			}
		}
	}

	/**
	 * Escoge aleatoriamente una persona
	 * 
	 * @throws InterruptedException En realidad nunca salta
	 */
	private static void buscarVoluntario() throws InterruptedException {
		// copiaCont=contVolun;
		boolean todoNull = true;
		do {
			for (int i = 0; i < copiaPer.size(); i++) {
				if (copiaPer.get(i) == null) {
					todoNull = true;
				} else {
					todoNull = false;
					break;
				}
			}
			n = (int) (Math.random() * personas.size());
		} while (copiaPer.get(n) == null && todoNull == false);
		if (todoNull == false) {
			copiaPer.set(n, null);
			int aux = contVolun.get(n) + 1;
			contVolun.set(n, aux);
			b = true;
			listar();
			b = false;
		} else {
			System.out.println("***No pueden salir mas voluntarios por ahora***");
		}

	}
	
	public static void ordenarArray() {
		copiaCont.clear();
		ordPer.clear();
		Integer x=0;
		Person p;
		copiaCont.addAll(contVolun);
		ordPer.addAll(personas);
		for (int i = 0; i < copiaCont.size(); i++) {
			for (int j = 0; j < copiaCont.size(); j++) {
				if (copiaCont.get(j) < copiaCont.get(i)) {
					x = copiaCont.get(i);
					p=ordPer.get(i);
					copiaCont.set(i,copiaCont.get(j));
					copiaCont.set(j,x);
					ordPer.set(i,ordPer.get(j));
					ordPer.set(j,p);
				}
			}
		}
		
		for (int i = 0; i < copiaCont.size(); i++) {
			System.out.println(ordPer.get(i).getNombre()+"          "+copiaCont.get(i));
		}
	}
	
	/**
	 * Simplemente el menu en una funcion
	 */
	public static void mensaje() {
		System.out.println("==============MENU==============");
		System.out.println("================================\n");
		System.out.println("Opcion 1 - Listar Personas");
		System.out.println("Opcion 2 - Crear  Persona");
		System.out.println("Opcion 3 - Borrar Persona");
		System.out.println("Opcion 4 - Buscar Voluntario");
		System.out.println("Opcion 5 - Ranking");
		System.out.println("Opcion 0 - S A L I R");

		System.out.print("\nIntroduce una opcion:");
	}
	
	/**
	 * Tiempo de espera para pura estetica
	 * @param n le pasa los segundos que quieres que espere
	 * @throws InterruptedException Manda ponerlo pero no salta
	 */
	public static void espera(int n) throws InterruptedException {
		Thread.sleep(n*1000);
	}

}
