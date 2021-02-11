package com.MDS2.ForoUal.Interfaz;


import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Interfaz.Opciones.Crear_Seccion_Ventana;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Crear_Seccion extends Crear_Seccion_Ventana {
	private Button _crear;
	public Opciones_Secciones _opciones_Secciones;

	public  Crear_Seccion() {
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
				foroUI.db.Crear_Seccion(nombre.getValue(), descripcion.getValue());
				UI c = UI.getCurrent();
				Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
				c.removeWindow(w);
				foroUI.singleton.VisualizarRaiz();
				
			}
		});
	}
}