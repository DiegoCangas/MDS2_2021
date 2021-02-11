package com.MDS2.ForoUal.Interfaz;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

public class Opciones_Temas_Administrador extends Opciones_Temas_Administrador_Ventana{
	
	public Opciones_Temas_Administrador(Opciones_Temas_Moderador mod) {
		cerrarTema.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				if(Ver_Temas.temaFuc == 3) {
					Ver_Temas.temaFuc = 0;
					cerrarTemaMnj.setVisible(false);
				}
				else {
				cerrarTemaMnj.setVisible(true);
				cambiarEstadoMnj.setVisible(false);
				mod.ocultarTemaMnj.setVisible(false);
				Ver_Temas.temaFuc = 3;
				}
			}
		});
		cambiarEstado.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				if(Ver_Temas.temaFuc == 2) {
					Ver_Temas.temaFuc = 0;
					cambiarEstadoMnj.setVisible(false);
				}
				else {
				cambiarEstadoMnj.setVisible(true);
				cerrarTemaMnj.setVisible(false);
				mod.ocultarTemaMnj.setVisible(false);
				Ver_Temas.temaFuc = 2;
				}
			}
		});
	}
}