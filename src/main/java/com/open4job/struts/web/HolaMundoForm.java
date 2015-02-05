package com.open4job.struts.web;

import org.apache.struts.action.ActionForm;

/*
 Creacion de la clase extendiento a ActionForm que te realiza los setters 
 y getters, y ya no hace falta que hagas esos pasos.
*/
public class HolaMundoForm extends ActionForm {

	String nombre;
	String apellido;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
