package com.ipartek.formacion.excepciones;

public class PersonException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String ERROR_EDAD ="Error!!! La edad no puede ser negativa";
	public static final String ERROR_ALTURA ="Error!!! La altura no puede ser negativa";
	public static final String ERROR_PESO ="Error!!! El peso no puede ser negativo";
	public static final String ERROR_GENERAR_DNI_CORTO ="Error!!! El numero de dni introducido es demasiado corto";
	public static final String ERROR_GENERAR_DNI_NEG ="Error!!! El numero de dni no puede ser negativo";
	public static final String ERROR_SEXO="Error!!! Ha introducido una opcion de sexo invalida";
	
	public PersonException(String error) {
		super(error);
	}
}
