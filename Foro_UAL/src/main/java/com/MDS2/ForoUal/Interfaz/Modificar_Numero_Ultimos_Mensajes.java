package com.MDS2.ForoUal.Interfaz;

import com.MDS2.ForoUal.Backend.ORM.src.Usuario;
import com.MDS2.ForoUal.Interfaz.Opciones.Modificar_Numero_Ultimos_Mensajes_Ventana;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Modificar_Numero_Ultimos_Mensajes extends Modificar_Numero_Ultimos_Mensajes_Ventana{
	private Label _numeroMensajes;
	private Button _aceptar;
	public Opciones_OtroUsuario_Administrador _opciones_OtroUsuario_Administrador;

	public Modificar_Numero_Ultimos_Mensajes(Usuario u) {
		
		ultimosMensajes.setValue((double)Ver_OtroPerfil.messageLimit);
		
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
				aceptar(ultimosMensajes.getValue().intValue());
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
	
	public void aceptar(int aNumeroMensajes) {
		Ver_OtroPerfil.messageLimit = aNumeroMensajes;
	}
	
}