package com.MDS2.ForoUal.Interfaz;

import java.util.Vector;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Media_;
import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.Reporte;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.UI;
import com.vaadin.ui.Window;
import com.vaadin.ui.Component.Event;

public class visualizar_Mensaje extends Visualizar_Mensaje_Ventana{
	private Event _dar__Me_Gusta__Mensaje;
	public Visualizar_Mensajes _visualizar_Mensajes;
	public Opciones_Perfil _unnamed_Opciones_Perfil_;
	public visualizar_Mensaje _respuesta_de;
	public Vector<visualizar_Mensaje> _unnamed_visualizar_Mensaje_ = new Vector<visualizar_Mensaje>();

	public visualizar_Mensaje(Mensaje m) {
		texto.setValue(m.getTexto().replaceAll("<Ocultado>", "").replaceAll("<Borrado>", ""));
		respuestaA.setVisible(!m.respuesta_de.isEmpty());
		if(!m.respuesta_de.isEmpty() && m.respuesta_de.toArray()[0] != null)
			respuestaA.setCaption(m.respuesta_de.toArray()[0].getTexto().replaceAll("<Ocultado>", "").replaceAll("<Borrado>", ""));
		
		if(m.getMarcado() && foroUI.user != null && (foroUI.privilegios == foroUI.Privilegios.administrador || foroUI.privilegios == foroUI.Privilegios.moderador)) {
			denuciado.setVisible(true);
			Reporte r = foroUI.db.Cargar_Reporte(m.getORMID());
			if(r==null) denuciado.setVisible(false);
			else {
				denuciadoText.setValue(denuciadoText.getValue()+ " " +r.getMotivo());
			}
		}
		
		
		if(m.media_mensaje.size() > 0) {
		if(foroUI.db.GetSourceType(m.media_mensaje.toArray()[0].getUrl()) != 1) {
			
			Media_[] im = m.media_mensaje.toArray();
			
			if(im.length > 0) imagen1.setSource(new ExternalResource(im[0].getUrl()));
			if(im.length > 1) imagen2.setSource(new ExternalResource(im[1].getUrl()));
			if(im.length > 2) imagen3.setSource(new ExternalResource(im[2].getUrl()));	
			
			imagen1.setVisible(im.length>0);
			imagen2.setVisible(im.length>1);
			imagen3.setVisible(im.length>2);
		}
		
		else { 
			video.setSource(new ExternalResource(m.media_mensaje.toArray()[0].getUrl()));
			video.setVisible(true);
		}
		}
		
		creadorYFecha.setValue(m.getEnvia_mensaje().getNombreUsuario()+" el "+m.getFechaCreacion());
		numeroMeGusta.setValue(m.getNumeroMeGusta()+"");
		
		meGustaLayout.addLayoutClickListener(e -> Dar__Me_Gusta__Mensaje(m));
		
		addLayoutClickListener(e -> {
			if(Visualizar_Mensajes.action == 1) {
				Window pv = new Window("", new Reportar_Mensaje(m));
				pv.center();
				UI.getCurrent().addWindow(pv);
				
			}
			else if(Visualizar_Mensajes.action == 3) {
				Window pv = new Window("", new Ocultar_Mensaje(m));
				pv.center();
				UI.getCurrent().addWindow(pv);
				
			}
			else if(Visualizar_Mensajes.action == 4) {
				Window pv = new Window("", new Eliminar_Mensaje(m));
				pv.center();
				UI.getCurrent().addWindow(pv);
			}
			else if (Visualizar_Mensajes.action == 2) {
				Window pv = new Window("", new Responder_Mensaje(m));
				pv.center();
				UI.getCurrent().addWindow(pv);
			}
			
			
		});
	}
	public void Dar__Me_Gusta__Mensaje(Mensaje m) {
		if(foroUI.user == null) return;
		foroUI.db.Dar_Megusta_Mensaje((long)m.getORMID());
		foroUI.singleton.VisualizarTema(m.getMensaje_());
	}
}