package com.MDS2.ForoUal.Interfaz;


import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Interfaz.Opciones.Darse_de_Baja_Ventana;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Darse_de_baja extends Darse_de_Baja_Ventana{
	private Label _contrasena;
	private Button _confirmar;
	public Opciones_Perfil_Usuario _opciones_Perfil_OtroUsuario;

	public Darse_de_baja () {
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
				darDeBaja();
				UI c = UI.getCurrent();
				Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
				c.removeWindow(w);
				
				
			}
		});
	}
	public boolean darDeBaja() {
		boolean b = foroUI.db.Darse_Baja(foroUI.user.getContrasenia(), foroUI.user.getNombreUsuario());
		foroUI.user = null;
		foroUI.singleton.VisualizarRaiz();
		
		return b;
	}
}