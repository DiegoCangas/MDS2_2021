package com.MDS2.ForoUal.Interfaz;

import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.MDS2.ForoUal.foroUI;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

public class panel_Superior_Registrado extends panel_Superior_Registrado_Ventana {
	private Image _imagen;
	private Label _usuario;
	private Pantallas_navegacion _listaVentanas;
	public Usuario_Logueado _unnamed_Usuario_Logueado_;
	public Visualizar_Secciones_Registrado _visualizar_Secciones_Registrado;
	public Visualizar_Temas_Registrado _visualizar_Temas_Registrado;
	public Pantallas_navegacion _unnamed_Pantallas_navegacion_;
	
	public panel_Superior_Registrado (boolean isPerfil) {
		
		if(!isPerfil) {
			username.setVisible(true);
			photo.setVisible(true);
			username.setValue(foroUI.user.getNombreUsuario());
			photo.setSource(new ExternalResource(foroUI.user.getFotoPerfil()));
			
		}
		notification.addLayoutClickListener(event -> {
			Window pv = new Window("", new Visualizar_Notificaciones());
			pv.center();
			UI.getCurrent().addWindow(pv);
		});
		cerrarSesion.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				foroUI.user = null;
				foroUI.privilegios = foroUI.Privilegios.usuario;
				foroUI.singleton.VisualizarRaiz();
				
			}
		});
		if(isPerfil)perfil.setCaption("Volver");
		
		perfil.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				if (!isPerfil)
				foroUI.singleton.VisualizarPerfil();
				else 
					foroUI.singleton.VisualizarRaiz();
				
			}
		});
	}
}