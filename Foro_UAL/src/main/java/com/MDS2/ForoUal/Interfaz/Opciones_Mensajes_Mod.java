package com.MDS2.ForoUal.Interfaz;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

public class Opciones_Mensajes_Mod extends Opciones_Mensajes_Mod_Ventana{
	public Visualizar_Mensajes_Mod _visualizar_Mensajes_Mod;
	public Ocultar_Mensaje _ocultar_Mensaje;
	
	public Opciones_Mensajes_Mod () {
		ocultarMensaje.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				ocultarMensajeMnj.setVisible(Visualizar_Mensajes.action != 3);
				Visualizar_Mensajes.action = Visualizar_Mensajes.action == 3?0:3;
				
			}
		});
	}
}