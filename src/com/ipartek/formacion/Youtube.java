package com.ipartek.formacion;

import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Youtube {

	// Contructores

	// Variables
	private final String CADENA_VIDEO = "https://www.youtube.com/watch?v=";
	private static final Integer LONG_COD = 11;
	private static final Integer LONG_MIN_TIT = 2;
	private static final Integer LONG_MAX_TIT = 150;
	private static final String COD_DEF = "x7bIbVlIqEc";
	private static final String TIT_DEF = "Metallica - Nothing else matter lyrics";
	public static final Integer REP_DEF = 60495713;

	private String titulo; // minimo 2 letras max 150
	private String cod; // Unicamente 11
	private Integer repro;

	public Youtube() {
		this.titulo = TIT_DEF;
		this.cod = COD_DEF;
		this.repro = REP_DEF;
	}

	public Youtube(String titulo, String cod) {

		if (titulo != null && titulo.length() >= LONG_MIN_TIT && titulo.length() <= LONG_MAX_TIT && cod != null
				&& cod.length() == LONG_COD) {
			this.titulo = titulo;
			this.cod = cod;
			this.repro = REP_DEF;
		} else {
			this.titulo = TIT_DEF;
			this.cod = COD_DEF;
			this.repro = REP_DEF;
			Hilo h1=new Hilo();
			h1.start();
		}

	}

	// Getters & Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) throws Exception {
		if (titulo != null && titulo.length() >= LONG_MIN_TIT && titulo.length() <= LONG_MAX_TIT)
			this.titulo = titulo;
		else
			throw new Exception("El titulo debe tener una longitud entre " + LONG_MIN_TIT + " y " + LONG_MAX_TIT);
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) throws Exception {
		if (cod != null && cod.length() == LONG_COD)
			this.cod = cod;
		else
			throw new Exception("Longitud del codigo no es 11");

	}

	public Integer getRepro() {
		return repro;
	}

	public void setRepro(Integer repro) {
		this.repro = repro;
	}

	// Metodos
	public void abrirVideo() {
		URL url = null;
		try {
			url = new URL(this.CADENA_VIDEO + this.cod);
			try {
				Desktop.getDesktop().browse(url.toURI());
			} catch (IOException e) {
				e.printStackTrace();
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
	}

}

class Hilo extends Thread{
	public void run() {
		/*JOptionPane.showMessageDialog(
				   null,
				   "Datos introducidos incorrectamente, se usaron los datos por defecto");*/
		JOptionPane pane = new JOptionPane();  
		JDialog dialog = pane.createDialog("Datos introducidos incorrectamente, se usaron los datos por defecto");  
		dialog.setAlwaysOnTop(true);  
		dialog.setVisible(true);
  
	}
}
