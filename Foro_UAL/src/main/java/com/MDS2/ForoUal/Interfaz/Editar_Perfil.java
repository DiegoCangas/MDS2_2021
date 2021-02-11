package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Media_;
import com.MDS2.ForoUal.Interfaz.Opciones.Editar_Perfil_Ventana;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

public class Editar_Perfil extends Editar_Perfil_Ventana{
	private Label _nombre;
	private Label _nombreCompleto;
	private Label _descricpcion;
	private Label _correo;
	private Label _imagen;
	public Opciones_Perfil_Usuario _opciones_Perfil_OtroUsuario;
	String fotoPerfil;
	public Editar_Perfil() {
		nombre.setValue(foroUI.user.getNombreReal());
		descripcion.setValue(foroUI.user.getDescripcion());
		fotoPerfil = foroUI.user.getFotoPerfil();
		foto.setValue(fotoPerfil);
		email.setValue(foroUI.user.getEmail());
		
		
		continuar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				editarPerfil();
				UI c = UI.getCurrent();
				Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
				c.removeWindow(w);
				foroUI.singleton.VisualizarPerfil();
			}
		});
		cancelar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI c = UI.getCurrent();
				Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
				c.removeWindow(w);
			}
		});
	}
	public void editarPerfil() {
		foroUI.db.Editar_Perfil(descripcion.getValue(), email.getValue(), foto.getValue(), nombre.getValue());
	}
}