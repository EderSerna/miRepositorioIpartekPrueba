package com.ipartek.formacion;

public class Triangulo extends ObjetoGrafico{
	private Double base,altura, area=calcArea();
	
	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Double calcArea() {
		return ((base*altura)/2);
	}
	
	public void dibujar(String color) {
		System.out.println("Dibujando triangulo "+color);
	}
}
