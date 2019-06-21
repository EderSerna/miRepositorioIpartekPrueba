package com.ipartek.formacion;

public class Perrera {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Perro p1=new Perro();
		Perro p2 =new Perro("Chucho", "Pastor Aleman", 3,true);
		PerroPresa pp1=new PerroPresa();
		PerroPresa pp2=new PerroPresa("Dientes","pitbull",5,true);
		pp1.setNombre("—am—am");
		p1.setEdad(-3);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(pp1.toString());
		pp1.atacar();
		System.out.println(pp2.toString());
		pp2.atacar();
	}

}
