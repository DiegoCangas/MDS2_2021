package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;
import com.MDS2.ForoUal.Interfaz.Opciones.Marcar_Usuario_Ventana;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Marcar_Usuario extends Marcar_Usuario_Ventana{
 
	public Marcar_Usuario(Usuario u) {
	 cancelar.addClickListener(new Button.ClickListener() {
		
		@Override
		public void buttonClick(ClickEvent event) {
			UI c = UI.getCurrent();
			Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
			c.removeWindow(w);
			
		}
	});
	 continuar.addClickListener(new Button.ClickListener() {
		
		@Override
		public void buttonClick(ClickEvent event) {
			// TODO Auto-generated method stub
			foroUI.db.Notificar_Admin(u.getNombreUsuario(), "El usuario " + u.getNombreUsuario() + "ha sido reportado por mala conducta");
			UI c = UI.getCurrent();
			Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
			c.removeWindow(w);
			w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
			c.removeWindow(w);
			
			Window pv = null;
			if(foroUI.privilegios == foroUI.Privilegios.moderador)
				pv = new Window("", new Visualizar_OtroUsuario_Moderador(u));
			else
				if(foroUI.privilegios == foroUI.Privilegios.moderador)
					pv = new Window("", new Visualizar_OtroUsuario_Admininistrador(u));
			pv.center();
			pv.setSizeFull();
			pv.setResizable(false);
			UI.getCurrent().addWindow(pv);
		}
	});
 }
}
