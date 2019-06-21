package com.ipartek.formacion.excepciones;

import com.ipartek.formacion.Perro;
import com.ipartek.formacion.PerroException;

public class CapturarTiposExceptiones {

	public static void main(String[] args) {
		try {
			Perro[] p=new Perro[2];
			p[2]=new Perro();
			//p.toString();
			p[2].setEdad(-2);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Que te has pasado");
		}
		catch(PerroException e) {
			e.printStackTrace();
		}catch(NullPointerException e){
			e.printStackTrace();
			System.out.println("Excepcion de null");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Excepcion generica, siempre la ultima");
		}
	}
}
