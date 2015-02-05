package com.open4job.struts.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


public class ControladorAction extends Action{
	
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)
	        throws Exception {
			
			
			//Recibimos los parametros via "get" desde el index.jsp
			//String nombre = (String)request.getParameter("nombre");
			//String apellido = (String)request.getParameter("apellido");
			//Guardamos las variables
			//request.setAttribute("nombre",nombre);
			//request.setAttribute("apellido",apellido);
			
			return mapping.findForward("listadomundo");
		}
	
}
