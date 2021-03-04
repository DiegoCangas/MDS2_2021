package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;
import com.MDS2.ForoUal.Interfaz.Opciones.Ocultar_Tema_Ventana;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component.Event;


public class Ocultar_Tema extends Ocultar_Tema_Ventana{
	private Event _ocultar;
	private Event _selectTema;
	public Opciones_Temas_Moderador _opciones_Temas_Moderador;

	public Ocultar_Tema(Tema t) {
	continuar.addClickListener(new Button.ClickListener() {
		
		@Override
		public void buttonClick(ClickEvent event) {
			ocultarTema(t);
			UI c = UI.getCurrent();
			Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
			c.removeWindow(w);
			foroUI.singleton.VisualizarSeccion(t.getContiene());
			
			
		}
	});
	cancelar.addClickListener(new Button.ClickListener() {
		
		@Override
		public void buttonClick(ClickEvent event) {
			UI c = UI.getCurrent();
			Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
			c.removeWindow(w);	
		}
	});
	}
	public void ocultarTema(Tema t) {
		foroUI.db.Cambiar_Estado(t,(long)2);	
	}
}