package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Seccion;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;
import com.MDS2.ForoUal.Interfaz.Opciones.Cerrar_Seccion_Ventana;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Cerrar_Seccion extends Cerrar_Seccion_Ventana{
	
	private Seccion seccion = new Seccion();
	
	public Cerrar_Seccion(Seccion s) {
		
		seccion = s;
		continuar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				cerrar_Seccion();
				UI c = UI.getCurrent();
				Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
				c.removeWindow(w);
				foroUI.singleton.VisualizarRaiz();
				
				
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
	public void cerrar_Seccion() {
		foroUI.db.Eliminar_Seccion(seccion.getORMID());
	}
}
