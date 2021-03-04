package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Interfaz.Opciones.Reportar_Mensaje_Ventana;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Reportar_Mensaje extends Reportar_Mensaje_Ventana{
	private Button _reportar;
	public Opciones_Mensajes _opciones_Mensajes;

	public Reportar_Mensaje(Mensaje m) {
		continuar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				reportar(m);
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

			}
		});
	}
	public void reportar(Mensaje m) {
		foroUI.db.Denunciar_Mensaje((long)m.getORMID(),motivo.getValue());
	}

}