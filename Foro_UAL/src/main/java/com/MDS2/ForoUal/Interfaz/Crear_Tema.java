package com.MDS2.ForoUal.Interfaz;


import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Interfaz.Opciones.Crear_Tema_Ventana;
import com.vaadin.ui.Component.Event;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Crear_Tema extends Crear_Tema_Ventana{
	private Event _crear;
	private Label _titulo;
	private Label _subitutlo;
	public Opciones_Temas _opciones_Temas;

	public Crear_Tema() {
		cancelar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI c = UI.getCurrent();
				Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
				c.removeWindow(w);
			}
		});
		continuar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				foroUI.db.Crear_Tema(nombre.getValue(), descripcion.getValue(),foroUI.user.getORMID());
				UI c = UI.getCurrent();
				Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
				c.removeWindow(w);
				foroUI.singleton.VisualizarSeccion(Visualizar_Temas_Registrado.sec);
				
			}
		});
	}
}