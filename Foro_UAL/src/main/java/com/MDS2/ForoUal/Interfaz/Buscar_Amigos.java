package com.MDS2.ForoUal.Interfaz;

import java.util.ArrayList;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;
import com.MDS2.ForoUal.Interfaz.Opciones.Buscar_Amigos_Ventana;
import com.vaadin.ui.Component.Event;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

import antlr.collections.List;

public class Buscar_Amigos extends Buscar_Amigos_Ventana{
	private Event _anadir_Amigo;
	private Event _eliminar_Amigo;
	public Opciones_Perfil_Usuario _opciones_Perfil_OtroUsuario;

	public Buscar_Amigos () {
		Generar_Amigos("");
		nombre.addValueChangeListener(event -> {
			Generar_Amigos(nombre.getValue());
		});
		cancelar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				UI c = UI.getCurrent();
				Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
				c.removeWindow(w);
				foroUI.singleton.VisualizarPerfil();
			}
		});
	}
	public void  Generar_Amigos(String s) {
		Usuario[] us = foroUI.db.Buscar_Amigo_PorNombre(s);
		System.out.println(us.length);
		amigos.removeAllComponents();
		for(Usuario u : us) {
			amigos.addComponent(new Ver_Amigo(u,true));
		}
	}

}