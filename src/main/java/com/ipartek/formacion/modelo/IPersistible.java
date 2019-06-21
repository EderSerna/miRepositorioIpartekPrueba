package com.ipartek.formacion.modelo;

import java.sql.SQLException;
import java.util.List;

/**
 * Operaciones Basicas de CRUD para Pojos
 * 
 * @author ur00
 *
 */
public interface IPersistible<P> {

	List<P> getAll();

	P getById(int id);

	boolean insert(P pojo);

	boolean delete(int id);

	boolean update(P pojo);

}
