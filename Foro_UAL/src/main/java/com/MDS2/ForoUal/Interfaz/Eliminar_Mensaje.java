package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Interfaz.Opciones.Eliminar_Mensaje_Ventana;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Eliminar_Mensaje extends Eliminar_Mensaje_Ventana{
	private Button _eliminar;
	private Button _seleccionarMnj;
	private Mensaje _mensaje;
	public Opciones_Mensajes_Administrador _opciones_Mensajes_Administrador;

	public Eliminar_Mensaje (Mensaje m) {
		continuar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				eliminar_mensaje((long)m.getORMID());
				UI c = UI.getCurrent();
				Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
				c.removeWindow(w);
				foroUI.singleton.VisualizarTema(m.getMensaje_());
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
	public void eliminar_mensaje(Long aId) {
		foroUI.db.Eliminar_Mensaje(aId);
	}
}