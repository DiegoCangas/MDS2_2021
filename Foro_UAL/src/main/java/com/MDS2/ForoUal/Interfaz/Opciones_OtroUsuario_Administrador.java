package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component.Event;

public class Opciones_OtroUsuario_Administrador extends Opciones_OtroUsuario_Administrador_Ventana{
	private Event _modificar_Rol;
	private Event _modificar_Estado_Usuario;
	public Visualizar_OtroUsuario_Admininistrador _visualizar_Usuarios_Administrador;
	public Modificar_Numero_Ultimos_Mensajes _modificar_Numero_Ultimos_Mensajes;
	public Banear _banear;

	public Opciones_OtroUsuario_Administrador(Usuario u) {
		
		if(u.getBaneado()) banear.setCaption("Desbanear");
		banear.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Modificcar_Estado_Usuario(u);
			}
		});
		cambiarRol.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
					cambiarRol.setCaption(foroUI.db.esModerador(u.getNombreUsuario())?"Quitar Moderador":"Hacer Moderador");
					Modificar_Rol(u);
			}
		});
		modMensajes.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Window pv = new Window("", new Modificar_Numero_Ultimos_Mensajes(u));
				pv.center();
				UI.getCurrent().addWindow(pv);
			}
		});
	}
	
	public void Modificar_Rol(Usuario u) {
		foroUI.db.Modificar_Rol(u.getNombreUsuario());
	}

	public void Modificcar_Estado_Usuario(Usuario u) {
		Window pv = new Window("", new Banear(u));
		pv.center();
		UI.getCurrent().addWindow(pv);
	}
}