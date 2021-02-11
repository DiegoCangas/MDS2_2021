package com.MDS2.ForoUal.Interfaz;

import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Layout;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;

public class Panel_Superior extends Panel_Superior_Ventana{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Pantallas_navegacion _ventanas;
	public Usuario_no_Logueado _unnamed_Usuario_no_Logueado_;
	public Registrarse _registrarse;
	public Iniciar_Sesion _iniciar_Sesion;
	public Pantallas_navegacion _unnamed_Pantallas_navegacion_;
	
	@SuppressWarnings("serial")
	public Panel_Superior (Layout screen) {
		
		//this.setHeight(this.getWidth()*0.10f, Unit.PERCENTAGE);
		
		loginButton.addClickListener(new Button.ClickListener() {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			
			@Override
			public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
				Window pv = new Window("", new Iniciar_Sesion());
				pv.center();
				UI.getCurrent().addWindow(pv);				
				
			}
		});
		registrarseButton.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
				Window pv = new Window("", new Registrarse());
				pv.center();
				UI.getCurrent().addWindow(pv);
				
			}
		});
	}
	
}