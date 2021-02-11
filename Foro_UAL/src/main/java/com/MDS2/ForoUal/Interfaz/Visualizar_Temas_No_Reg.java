package com.MDS2.ForoUal.Interfaz;

import java.util.List;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Seccion;
import com.vaadin.ui.MenuBar.Command;
import com.vaadin.ui.MenuBar.MenuItem;

public class Visualizar_Temas_No_Reg extends VIsualizar_temas_No_Reg_Ventana{
	public Usuario_no_Logueado _usuario_no_Logueado;
	public Ver_Temas _visualizar_Temas;

	public void cargarTemas() {
		throw new UnsupportedOperationException();
	}
	public Visualizar_Temas_No_Reg(Seccion s) {
		Panel_Superior ps = new Panel_Superior(this);
		panelSuperior.setContent(ps);
		listaTemas.setContent(new Ver_Temas(s));
		titulo.setValue(s.getTitulo());
		subtitulo.setValue(s.getSubtitulo());
		Ver_Temas.temaFuc = 0;
		

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
	}
}