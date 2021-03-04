package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;
import com.MDS2.ForoUal.Interfaz.Opciones.Ocultar_Mensaje_Ventana;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;


public class Ocultar_Mensaje extends Ocultar_Mensaje_Ventana{
	private Mensaje _mensaje;
	private Button _ocultar;
	public Opciones_Mensajes_Mod _opciones_Mensajes_Mod;

	public Ocultar_Mensaje (Mensaje m) {
		continuar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				ocultar_mensaje(m);
				UI c = UI.getCurrent();
				Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
				c.removeWindow(w);
				foroUI.singleton.VisualizarTema(m.getMensaje_());
			}
		});
		cancelar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI c = UI.getCurrent();
				Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
				c.removeWindow(w);
				foroUI.singleton.VisualizarTema(m.getMensaje_());
			}
		});
	}
	public void ocultar_mensaje(Mensaje m) {
		foroUI.db.Ocultar_Mensaje((long)m.getORMID());
	}
}