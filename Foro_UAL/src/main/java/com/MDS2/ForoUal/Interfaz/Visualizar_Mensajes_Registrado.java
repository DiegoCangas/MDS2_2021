package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

public class Visualizar_Mensajes_Registrado extends Visualizar_Mensajes_Registrado_Ventana{
	public Usuario_Logueado _usuario_Logueado;
	public Opciones_Mensajes _opciones_Mensajes;
	public Visualizar_Mensajes _visualizar_Mensajes;

	public Visualizar_Mensajes_Registrado (Tema t) {
		panel_Superior_Registrado ps = new panel_Superior_Registrado(false);
		panelSuperior.setContent(ps);
		_visualizar_Mensajes = new Visualizar_Mensajes(t);
		listaMensajes.setContent(_visualizar_Mensajes);
		_opciones_Mensajes = new Opciones_Mensajes();
		panelOpcionesLayout.addComponent(_opciones_Mensajes);
		titulo.setValue(t.getTitulo());
		subtitulo.setValue(t.getSubtitulo());
		
		return_button.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				foroUI.singleton.VisualizarSeccion(t.getContiene());
				}
		});
	}
	
	public void cargarMensajes() {
		throw new UnsupportedOperationException();
	}
}