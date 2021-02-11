package com.MDS2.ForoUal.Interfaz;

import java.util.ArrayList;
import com.MDS2.ForoUal.Backend.ORM.src.*;


import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Interfaz.Opciones.Crear_Mensaje_Ventana;
import com.vaadin.ui.Component.Event;
import com.vaadin.data.HasValue.ValueChangeListener;
import com.vaadin.ui.Button;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.Video;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class Crear_Mensaje extends Crear_Mensaje_Ventana{
	private Label _textoMensaje;
	private Event _crear;
	private Image _imagen;
	private Video _video;
	public Opciones_Mensajes _opciones_Mensajes;
	int pos = 0;
	String[] urls = new String[] {"","",""};
	Mensaje respuestaAMensaje = null;
	int resourceType = 0; //0: Foto, 1:Video
	public Crear_Mensaje() {
		
		fotos.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				resourceType = 0;
			}
		});
		resourceURL.addValueChangeListener(event -> {urls[pos] = resourceURL.getValue();});
		video.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				resourceType = 1;
				urls[0] = resourceURL.getValue();
				urls[1] = "";
				urls[2] = "";
				add1.setVisible(false);
				add2.setVisible(false);
			}
		});
		
		respuestaA.setVisible(false);
		respuestaAText.setVisible(false);
		
		add.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				if(!add1.isVisible()) add1.setVisible(true);
				if(!resourceURL.isVisible()) resourceURL.setVisible(true);
				urls[pos] = resourceURL.getValue();
				
				if(resourceType == 1) {
					urls[0] = resourceURL.getValue();
					urls[1] = "";
					urls[2] = "";
					add1.setVisible(false);
					add2.setVisible(false);
				}
				
				pos = 0;
				resourceURL.setValue(urls[pos]);
				
				
				
			}
		});
		
		add1.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				if(!add2.isVisible()) add2.setVisible(true);
				urls[pos] = resourceURL.getValue();

				if(resourceType == 1) {
					urls[0] = resourceURL.getValue();
					urls[1] = "";
					urls[2] = "";
					add1.setVisible(false);
					add2.setVisible(false);
				}
				
				pos = 1;
				resourceURL.setValue(urls[pos]);
			}
		});
		
		add2.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {

				urls[pos] = resourceURL.getValue();
				
				if(resourceType == 1) {
					urls[0] = resourceURL.getValue();
					urls[1] = "";
					urls[2] = "";
					add1.setVisible(false);
					add2.setVisible(false);
				}
				
				
				pos = 2;
				resourceURL.setValue(urls[pos]);
			}
		});
		
		
		
		continuar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				crear();
				UI c = UI.getCurrent();
				Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
				c.removeWindow(w);
				foroUI.singleton.VisualizarTema(Visualizar_Mensajes.tema);
				
			}
		});
		cancelar.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				UI c = UI.getCurrent();
				Window w = (Window)c.getWindows().toArray()[c.getWindows().size()-1];
				c.removeWindow(w);
				
			}
		});
	}
	public void crear() {
				
		foroUI.db.Crear_Mensaje(texto.getValue(),urls, respuestaAMensaje);
	}
}