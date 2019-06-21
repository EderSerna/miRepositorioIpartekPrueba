package com.ipartek.formacion.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ipartek.formacion.Alumno;

public class DAOAlumnoArrayList implements IPersistible<Alumno>, ISingleton<Alumno> {

	private ArrayList<Alumno> lista;
	
		
	public DAOAlumnoArrayList() {
		super();
		lista = new ArrayList<Alumno>();
		lista.add( new Alumno(12,"Antton") );
		lista.add( new Alumno(45,"MAriJose") );
		lista.add( new Alumno(2,"Pepe") );
		lista.add( new Alumno(44,"Txeila") );				
	}

	@Override
	public List<Alumno> getAll() {		
		return lista;
	}

	@Override
	public Alumno getById(int id) {
		Alumno resul = null;
		for (Alumno a: lista) {
			if ( a.getId() == id ) {
				resul = a;
				break;
			}
		}
		return resul;
	}

	@Override
	public boolean insert(Alumno pojo) {
		boolean b;
		try {
			if(pojo!=null) {
				lista.add(pojo);
				b=true;
			}else {
				b=false;
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			b=false;
		}
		return b;
	}

	@Override
	public boolean delete(int id) {
		boolean b;
		try {
			lista.remove(id);
			b=true;
		} catch (Exception e) {
			e.printStackTrace();
			b=false;
		}
		return b;
	}

	@Override
	public boolean update(Alumno pojo) {
		boolean b=false;
		try {
//			for (int i = 0; i < lista.size(); i++) {
//				if(lista.get(i).getId()==pojo.getId()) {
//					lista.set(i, pojo);
//					b=true;
//					break;
//				}else
//					b=false;
//			}
			
			Alumno a=getById(pojo.getId());
			
			lista.set(lista.indexOf(a), pojo);
			
		} catch (Exception e) {
			e.printStackTrace();
			b=false;
		}
		return b;
	}

	@Override
	public Alumno getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}
