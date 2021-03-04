package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;
import com.MDS2.ForoUal.Interfaz.Opciones.Banear_Ventana;
import com.vaadin.ui.Component.Event;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;


public class Banear extends Banear_Ventana{
	private Label _confirmacion;
	private Event _aceptar;
	public Opciones_OtroUsuario_Administrador _opciones_OtroUsuario_Administrador;

	public Banear(Usuario u) {
		
		if(u.getBaneado()) {
			
			titulo.setValue(titulo.getValue().replace("Banear", "Desbanear"));
			desc.setValue(desc.getValue().replace("Banear", "Desbanear"));
			
		}
		
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
				banear(u);
				UI c = UI.getCurrent();
				Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
				c.removeWindow(w);
				w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
				c.removeWindow(w);
				
				Window pv = new Window("", new Visualizar_OtroUsuario_Admininistrador(u));
				pv.center();
				pv.setSizeFull();
				pv.setResizable(false);
				UI.getCurrent().addWindow(pv);
			}
		});
	}
	public boolean banear(Usuario u) {
		if(u.getBaneado())
			foroUI.db.Desbanear(u.getNombreUsuario());
		else
			foroUI.db.Banear(u.getNombreUsuario());
		return true;
	}
}