package com.MDS2.ForoUal.Interfaz;

import org.orm.PersistentException;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.BDs.PasswordUtils;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;
import com.MDS2.ForoUal.Backend.ORM.src.UsuarioDAO;
import com.MDS2.ForoUal.Interfaz.Opciones.Recuperar_Contrasena_Ventana;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class recuperar_contrasena extends Recuperar_Contrasena_Ventana{
	private Label _contrasena;
	private Button _recuperar;
	public Correo_Electronico _correo_Electronico;
	public Opciones_Perfil_Usuario _opciones_Perfil_OtroUsuario;
	
	public recuperar_contrasena() {
		cancelar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI c = UI.getCurrent();
				Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
				c.removeWindow(w);
				
			}
		});
		continuar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				mandarCorreo();
			
			}
		});
	}

	public boolean mandarCorreo() {
		String s = PasswordUtils.getSalt(7);
		pass.setVisible(true);
		pass.setValue(s);
		foroUI.db.Recuperar_Contrasenia_Perfil(email.getValue(), s);
		return true;
	}
}