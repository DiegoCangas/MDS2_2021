package com.MDS2.ForoUal.Interfaz;

import java.util.List;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Seccion;
import com.vaadin.ui.Button;
import com.vaadin.ui.MenuBar.Command;
import com.vaadin.ui.MenuBar.MenuItem;


public class Visualizar_Temas_Registrado extends Visualizar_Temas_Registrado_Ventana{
	public Usuario_Logueado _usuario_Logueado;
	public panel_Superior_Registrado _panel_Superior_Registrado;
	public Ver_Temas _visualizar_Temas;
	public Opciones_Temas _opciones_Temas;
	public static Seccion sec;

	public Visualizar_Temas_Registrado (Seccion s) {
		sec = s;
		panel_Superior_Registrado ps = new panel_Superior_Registrado(false);
		panelSuperior.setContent(ps);
		_visualizar_Temas = new Ver_Temas(s);
		listaTemas.setContent(_visualizar_Temas);
		_opciones_Temas = new Opciones_Temas();
		panelOpcionesLayout.addComponent(_opciones_Temas);
		
		titulo.setValue(s.getTitulo());
		subtitulo.setValue(s.getSubtitulo());
		
		List<MenuItem> items = ordenar.getItems().get(0).getChildren();
		
			MenuItem i = items.get(0);
			i.setCommand(new Command() {
				@Override
				public void menuSelected(MenuItem selectedItem) {
					System.out.println("Prueba menu");
					Ver_Temas.order = 0;
					foroUI.singleton.VisualizarSeccion(s);
					
				}
			});
			i = items.get(1);
			i.setCommand(new Command() {
				@Override
				public void menuSelected(MenuItem selectedItem) {
					System.out.println("Prueba menu 1");
					Ver_Temas.order = 1;
					foroUI.singleton.VisualizarSeccion(s);
					
				}
			});
			i = items.get(2);
			i.setCommand(new Command() {
				@Override
				public void menuSelected(MenuItem selectedItem) {
					System.out.println("Prueba menu 2 ");
					Ver_Temas.order = 2;
					foroUI.singleton.VisualizarSeccion(s);
				}
			});
			return_button.addClickListener(new Button.ClickListener() {

				@Override
				public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
					foroUI.singleton.VisualizarRaiz();
					
				}
			});
			
	}
	public void cargarTemas() {
		throw new UnsupportedOperationException();
	}
}