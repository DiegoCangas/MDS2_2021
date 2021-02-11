package com.MDS2.ForoUal.Interfaz;


import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component.Event;


public class Opciones_Perfil_Usuario extends Opciones_Perfil_Usuario_Ventana{
	private Event _cerrar_Sesion;
	public Opciones_Perfil _opciones_Perfil;
	public Darse_de_baja _darse_de_baja;
	public Editar_Perfil _editar_Perfil;
	public Buscar_Amigos _buscar_Amigos;

	
	public Opciones_Perfil_Usuario () {
		
		editarPerfil.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Window pv = new Window("", new Editar_Perfil());
				pv.center();
				UI.getCurrent().addWindow(pv);
			}
		});
		darseDeBaja.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Window pv = new Window("", new Darse_de_baja());
				pv.center();
				UI.getCurrent().addWindow(pv);
			}
		});
		buscarAmigos.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Window pv = new Window("", new Buscar_Amigos());
				pv.center();
				pv.setClosable(false);
				UI.getCurrent().addWindow(pv);
			}
		});
	}
	public void Cerrar_Sesion() {
		throw new UnsupportedOperationException();
	}
}