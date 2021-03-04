package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;
import com.MDS2.ForoUal.Interfaz.Opciones.Cerrar_Tema_Ventana;
import com.vaadin.ui.Component.Event;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;
public class Cerrar_Tema extends Cerrar_Tema_Ventana{
	private Event _cerrar;
	private Event _selectTema;
	private Tema _tema;
	public Opciones_Temas_Administrador _opciones_Temas_Administrador;

	public Cerrar_Tema(Tema t) {
		continuar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				cerrar_Tema(t);
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
	public void cerrar_Tema(Tema t) {
		foroUI.db.Cambiar_Estado(t,(long)3);	
	}
}