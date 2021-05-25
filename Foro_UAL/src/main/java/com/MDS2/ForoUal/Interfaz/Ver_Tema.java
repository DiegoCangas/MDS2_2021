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
		if(foroUI.user == null) return;
		foroUI.db.Dar_Megusta_Tema((long)tema.getORMID(),foroUI.user.getORMID());
		foroUI.singleton.VisualizarSeccion(tema.getContiene());
	}
	
	private Tema tema = new Tema();
	
	public Ver_Tema (Tema t){
		tema = t;
		
		nombreTema.setValue(tema.getTitulo());
		descripcion.setValue(tema.getSubtitulo());
		creadorYFecha.setValue(tema.getCrea_tema().getNombreUsuario()+" el " + tema.getFechaCreacion());
		
		//Muestra el estado de un tema
		if(tema.getTipoTema() == 0 || tema.getTipoTema() == 1)
			estado.setVisible(false);
		else if(tema.getTipoTema() == 2)
			estado.setValue("Tema Oculto");
		else if (tema.getTipoTema() == 3)
			estado.setValue("Tema Borrado");
		
		Mensaje m;
		try {
			Mensaje[] mensajes = MensajeDAO.listMensajeByQuery("TemaID = "+tema.getID(), "FechaCreacion");
			m = mensajes.length>0?mensajes[mensajes.length-1]:null;
			//m = MensajeDAO.loadMensajeByQuery("TemaID = "+t.getID(), "FechaCreacion DESC");
			if(m!=null)
				ultimaEdicionYFecha.setValue(m.getEnvia_mensaje().getNombreUsuario() + " el " + m.getFechaCreacion());
			else
				ultimaEdicionYFecha.setVisible(false);
		} catch (PersistentException e) {
			ultimaEdicionYFecha.setVisible(false);
			e.printStackTrace();
		}
			numeroMensajes.setValue(tema.getNumMensjes()+"");
			numeroMeGusta.setValue(tema.getNumeroMeGusta()+"");
		
		addLayoutClickListener((event) -> {
			if(Ver_Temas.temaFuc == 0)
				foroUI.singleton.VisualizarTema(tema);
			if(foroUI.user == null) return;
			
			if(Ver_Temas.temaFuc == 1 && (foroUI.privilegios == foroUI.Privilegios.moderador || foroUI.privilegios == foroUI.Privilegios.administrador)){
				Window pv = new Window("", new Ocultar_Tema(tema));
				pv.center();
				UI.getCurrent().addWindow(pv);
			}
			else if(Ver_Temas.temaFuc == 3 && foroUI.privilegios == foroUI.Privilegios.administrador) {
				Window pv = new Window("", new Cerrar_Tema(tema));
				pv.center();
				UI.getCurrent().addWindow(pv);
			}
			else if (Ver_Temas.temaFuc == 2 && foroUI.privilegios == foroUI.Privilegios.administrador) {
				Window pv = new Window("", new Cambiar_Estado_Tema(tema));
				pv.center();
				UI.getCurrent().addWindow(pv);
			}
			});
		meGustaLayout.addLayoutClickListener(e -> {
			Dar_Me_Gusta_Tema();
		});
	}
	
}