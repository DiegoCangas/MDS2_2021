package com.MDS2.ForoUal.Interfaz;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

public class Opciones_Temas_Moderador extends Opciones_Temas_Moderador_Ventana{

	
	public Opciones_Temas_Moderador(Opciones_Temas_Administrador ad) {
		ocultarTema.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				if(Ver_Temas.temaFuc == 1) {
					Ver_Temas.temaFuc = 0;
					ocultarTemaMnj.setVisible(false);
				}
				else {
				ocultarTemaMnj.setVisible(true);
				if(ad!= null) {
					ad.cambiarEstadoMnj.setVisible(false);
					ad.cerrarTemaMnj.setVisible(false);
				}
				Ver_Temas.temaFuc = 1;
				}
			}
		});
	}
}