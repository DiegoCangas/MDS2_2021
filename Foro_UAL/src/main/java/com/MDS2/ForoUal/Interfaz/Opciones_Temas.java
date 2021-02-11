package com.MDS2.ForoUal.Interfaz;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Opciones_Temas extends Opciones_Temas_Ventana {
	public Opciones_Temas () {
		crearTema.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				Window pv = new Window("", new Crear_Tema());
				pv.center();
				UI.getCurrent().addWindow(pv);
				
			}
		});
	}
}