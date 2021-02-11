package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Interfaz.Opciones.Inciar_Sesion_Ventana;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Iniciar_Sesion extends Inciar_Sesion_Ventana{
	private static final long serialVersionUID = 1L;
	public Panel_Superior _panel_Superior;

	public boolean Validar_datos_Inicio_Sesion(String aUsario, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public boolean Recuperar_contrasenia(String aEmail) {
		throw new UnsupportedOperationException();
	}
	
	@SuppressWarnings("serial")
	public Iniciar_Sesion() {
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
				// TODO Auto-generated method stub
				if(foroUI.db.Iniciar_Sesion(email.getValue().trim(), contrasena.getValue().trim())) {
										
					UI c = UI.getCurrent();
					Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
					c.removeWindow(w);
					
				}
				else
				{
					error.setVisible(true);
					error.setValue("Los datos de incio de sesión no son correctos");
				}
			}
		});
		olvidarPass.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
					Window pv = new Window("", new recuperar_contrasena());
					pv.center();
					UI.getCurrent().addWindow(pv);
			}
		});
	}
}