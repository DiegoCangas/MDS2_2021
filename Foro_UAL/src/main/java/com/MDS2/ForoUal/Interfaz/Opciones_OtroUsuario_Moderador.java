package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.Backend.ORM.src.Usuario;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component.Event;

public class Opciones_OtroUsuario_Moderador extends Opciones_OtroUsuario_Moderador_Ventana{
	private Event _notificar_Administrador;
	public Visualizar_OtroUsuario_Moderador _visualizar_Perfil_OtroUsuario_Mod;

	public Opciones_OtroUsuario_Moderador(Usuario u) {
		
		reportar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Notificar_Administrador(u);
			}
		});
	}
	public void Notificar_Administrador(Usuario u) {
		Window pv = new Window("", new Marcar_Usuario(u));
		pv.center();
		UI.getCurrent().addWindow(pv);
	}
}