package com.ipartek.formacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CrearVideoYoutube {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("CREAR VIDEO YOUTUBE");
		System.out.println("===================\n\n");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce titulo de video, recuerde que tiene que usar minimo 2 caracteres y un maximo de 150");
		String tit=br.readLine();
		
		System.out.println("Introduce codigo del video, recuerde que debe contener 11 caracteres");
		String cod=br.readLine();
		
		Youtube y1 = new Youtube(tit,cod);

		try {
			Thread.sleep(5000);
			y1.abrirVideo();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	

}
