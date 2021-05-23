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

	private Tema tema = new Tema();
	
	public Ocultar_Tema(Tema t) {
		this.tema = t;
	continuar.addClickListener(new Button.ClickListener() {
		
		@Override
		public void buttonClick(ClickEvent event) {
			ocultarTema();
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
	public void ocultarTema() {
		foroUI.db.Cambiar_Estado((long)tema.getORMID(),(long)2);	
	}
}