package com.MDS2.ForoUal.Interfaz;

import org.orm.PersistentException;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;
import com.MDS2.ForoUal.Backend.ORM.src.UsuarioCriteria;
import com.MDS2.ForoUal.Backend.ORM.src.UsuarioDAO;
import com.MDS2.ForoUal.Interfaz.Opciones.Registrase_Ventana;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

public class Registrarse extends Registrase_Ventana{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2795991294979556391L;
	public Panel_Superior _panel_Superior;

	public String Validar_datos_Registras(String aUsuario, String aEmail, String aNombreCompleto, String aContrasena, String aDescripcion) {
		if(aUsuario == "" || aEmail == "" || aContrasena == "" || aDescripcion == "")
			return "Todos los datos son obligatorios";
		if(aUsuario.length() < 5 || aUsuario.length() > 15)
			return "El nombre ha de tener entre 5 y 15 caracteres";
		if(!aEmail.contains("@")) 
			return "Introduce un email real";
		if(aNombreCompleto.contains("|") || aDescripcion.contains("|"))
			return "Hay carácteres no admitidos";
		 try {
			 if(UsuarioDAO.loadUsuarioByQuery(String.format("Email = '%s'",aEmail), "Email")!= null)
				 return "El correo ya eiste";
			 if(UsuarioDAO.loadUsuarioByQuery(String.format("NombreUsuario = '%s'",aEmail), "NombreUsuario")!= null)
				 return "El nombre de usuario ya existe";
					 
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 
		
		//if(NombreUsuario no existe ya) return "El nombre de usuario ya existe";
		//if(email no existe ya) return "El correo ya eiste";
		
		return "";		
	}
	public Registrarse() {
		
		cancelar.addClickListener(new Button.ClickListener() {
			private static final long serialVersionUID = 2411752154015008999L;

			@Override
			public void buttonClick(ClickEvent event) {
				UI c = UI.getCurrent();
				Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
				c.removeWindow(w);
				
			}
		});
		continuar.addClickListener(new Button.ClickListener() {
			private static final long serialVersionUID = 4865963736755932057L;

			@Override
			public void buttonClick(ClickEvent event) {
				String s = Validar_datos_Registras(userName.getValue().trim(),email.getValue().trim(),nombreCompleto.getValue().trim(),password.getValue(),description.getValue().trim());
				if(s=="")
				{
					foroUI.db.Registrar_Usuario(email.getValue().trim(), userName.getValue().trim(), password.getValue(),password.getValue(), nombreCompleto.getValue().trim(), photo.getValue().trim(), description.getValue().trim());
						UI c = UI.getCurrent();
						Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
						c.removeWindow(w);
				}
				else {
					error.setVisible(true);
					error.setValue(s);
				}
				
			}
		});
	}
}