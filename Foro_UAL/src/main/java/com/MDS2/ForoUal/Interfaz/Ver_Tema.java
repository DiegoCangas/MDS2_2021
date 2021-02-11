package com.MDS2.ForoUal.Interfaz;

import org.orm.PersistentException;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.MensajeDAO;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;

public class Ver_Tema extends Ver_Tema_Ventana {

	public void Dar_Me_Gusta_Tema() {
		throw new UnsupportedOperationException();
	}
	
	private Tema tema = new Tema();
	
	public Ver_Tema (Tema t){
		nombreTema.setValue(t.getTitulo());
		descripcion.setValue(t.getSubtitulo());
		creadorYFecha.setValue(t.getCrea_tema()+" el " + t.getFechaCreacion());
		Mensaje m;
		try {
			m = MensajeDAO.loadMensajeByQuery("TemaID = "+t.getID(), "FechaCreacion");
			if(m!=null)
				ultimaEdicionYFecha.setValue(m.getNombreUsuario() + " el " + m.getFechaCreacion());
			else
				ultimaEdicionYFecha.setVisible(false);
		} catch (PersistentException e) {
			ultimaEdicionYFecha.setVisible(false);
			e.printStackTrace();
		}
			numeroMensajes.setValue(t.getNumMensjes()+"");
			numeroMeGusta.setValue(t.getNumeroMeGusta()+"");
		
		addLayoutClickListener((event) -> {
			if(Ver_Temas.temaFuc == 0)
				foroUI.singleton.VisualizarTema(t);
			if(foroUI.user == null) return;
			
			if(Ver_Temas.temaFuc == 1 && (foroUI.privilegios == foroUI.Privilegios.moderador || foroUI.privilegios == foroUI.Privilegios.administrador)){
				Window pv = new Window("", new Ocultar_Tema(t));
				pv.center();
				UI.getCurrent().addWindow(pv);
			}
			else if(Ver_Temas.temaFuc == 3 && foroUI.privilegios == foroUI.Privilegios.administrador) {
				Window pv = new Window("", new Cerrar_Tema(t));
				pv.center();
				UI.getCurrent().addWindow(pv);
			}
			else if (Ver_Temas.temaFuc == 2 && foroUI.privilegios == foroUI.Privilegios.administrador) {
				Window pv = new Window("", new Cambiar_Estado_Tema(t));
				pv.center();
				UI.getCurrent().addWindow(pv);
			}
			});
		meGustaLayout.addLayoutClickListener(e -> {
			if(foroUI.user == null) return;
			foroUI.db.Dar_Megusta_Tema((long)t.getORMID());
			foroUI.singleton.VisualizarSeccion(t.getContiene());
		});
	}
	
}