package com.MDS2.ForoUal.Interfaz;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Opciones_Mensajes extends Opciones_Mensajes_Ventana{
	public Visualizar_Mensajes_Registrado _opciones_Perfil;
	public Crear_Mensaje _crear_Mensaje;
	public Responder_Mensaje _responder_Mensaje;
	public Reportar_Mensaje _reportar_Mensaje;
	
	public Opciones_Mensajes() {
		crearMensaje.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				Window pv = new Window("", new Crear_Mensaje());
				pv.center();
				UI.getCurrent().addWindow(pv);
			}
		});
		reportarMensaje.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				reportarMensajeMnj.setVisible(Visualizar_Mensajes.action != 1);
				Visualizar_Mensajes.action = Visualizar_Mensajes.action == 1?0:1;
			}
		});
		responderMensaje.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				responderMensajeMnj.setVisible(Visualizar_Mensajes.action != 2);
				Visualizar_Mensajes.action = Visualizar_Mensajes.action == 2?0:2;
				
			}
		});
		
	}
}