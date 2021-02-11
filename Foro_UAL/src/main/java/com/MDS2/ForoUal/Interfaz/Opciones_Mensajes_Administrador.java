package com.MDS2.ForoUal.Interfaz;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

public class Opciones_Mensajes_Administrador extends Opciones_Mensajes_Administrador_Ventana{
	public Eliminar_Mensaje _eliminar_Mensaje;
	public Visualizar_Mensajes_Administrador _visualizar_Mensajes_Administrador;
	
	Opciones_Mensajes_Administrador(){
		eliminarMensaje.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				eliminarMensajeMnj.setVisible(Visualizar_Mensajes.action != 4);
				Visualizar_Mensajes.action = Visualizar_Mensajes.action == 4?0:4;
				
			}
		});
	}
}