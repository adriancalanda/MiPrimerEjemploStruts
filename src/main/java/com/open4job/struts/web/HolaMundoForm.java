package com.open4job.struts.web;

import org.apache.commons.validator.GenericValidator;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMessage;

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
	public ActionErrors validate(
			org.apache.struts.action.ActionMapping mapping,
			javax.servlet.http.HttpServletRequest request) {
			ActionErrors errors = new ActionErrors();
			if (GenericValidator.isBlankOrNull(this.nombre)) {
			errors.add("operando1",
			new ActionMessage("error.operando.negativo"));
			}
			if (GenericValidator.isBlankOrNull(this.apellido)) {
			errors.add("operando2",
			new ActionMessage("error.operando.negativo"));
			}
			return errors;
			}
}
