package com.MDS2.ForoUal.Backend.BDs;

import java.sql.Date;
import java.sql.Time;
import java.time.Instant;
import java.util.Vector;

import javax.print.attribute.standard.Media;

import org.orm.PersistentException;

import com.MDS2.ForoUal.foroUI;

import com.MDS2.ForoUal.Backend.ORM.src.Media_;
import com.MDS2.ForoUal.Backend.ORM.src.Media_DAO;
import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.MensajeDAO;
import com.MDS2.ForoUal.Backend.ORM.src.Seccion;
import com.MDS2.ForoUal.Backend.ORM.src.SeccionDAO;
import com.MDS2.ForoUal.Backend.ORM.src.Tema;
import com.MDS2.ForoUal.Backend.ORM.src.TemaDAO;
import com.MDS2.ForoUal.Interfaz.Visualizar_Mensajes;
import com.MDS2.ForoUal.Interfaz.Visualizar_Temas_Registrado;

public class BD_Mensajes {
	public BD_Principal _bd_main_mensajes;
	public Vector<MensajeDAO> _unnamed_Mensaje_ = new Vector<MensajeDAO>();

	public Mensaje Crear_Mensaje(String aTexto, String[] urls, Mensaje respuestaA) {
		Mensaje m = MensajeDAO.createMensaje();
		
		
		
		
		m.setEnvia_mensaje(foroUI.user);
		m.setTexto(aTexto);
		m.setFechaCreacion(Time.from(Instant.now()));
		if(respuestaA != null) m.respuesta_de.add(respuestaA);
		m.setMensaje_(Visualizar_Mensajes.tema);
			
		
		try {
			m.setIdMensaje((long)(MensajeDAO.listMensajeByQuery(null, null).length+10));
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			m.setIdMensaje((long)1);
		}
		
		
		try {
			MensajeDAO.save(m);
			Tema t = TemaDAO.getTemaByORMID(Visualizar_Mensajes.tema.getORMID());
			t.setNumMensjes(t.getNumMensjes()+1);
			TemaDAO.save(t);
			Seccion s = SeccionDAO.getSeccionByORMID(Visualizar_Temas_Registrado.sec.getORMID());
			s.setNumMensajes(s.getNumMensajes()+1); 
			SeccionDAO.save(s);
			
			for(String me : urls) {
				if(me == "") continue;
				Media_ med = Media_DAO.createMedia_();
				med.setUrl(me);
				med.setMensaje_media(m);
				try {
					Media_DAO.save(med);
				} catch (PersistentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//m.media_mensaje.add(med);
			}
			
			return m;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	public void Dar_Megusta_Mensaje(Long aId) {
		Mensaje m = null;
		try {
			m = MensajeDAO.loadMensajeByORMID(aId.intValue());
			System.out.println(m.gustaMensaje);
			
			if(!m.gustaMensaje.contains(foroUI.user))
				m.gustaMensaje.add(foroUI.user);
			else m.gustaMensaje.remove(foroUI.user);
			m.setNumeroMeGusta(m.gustaMensaje.size());
			try {
				MensajeDAO.save(m);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return;
		}
		
		
	}

	public void Eliminar_Mensaje(Long aId) {
		try {
			Mensaje m = MensajeDAO.getMensajeByORMID(aId.intValue());
			m.setTexto(m.getTexto()+"<Borrado>");
			MensajeDAO.save(m);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Ocultar_Mensaje(Long aId) {
		try {
			Mensaje m = MensajeDAO.getMensajeByORMID(aId.intValue());
			m.setTexto(m.getTexto()+"<Ocultado>");
			MensajeDAO.save(m);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
/*	public void Denunciar_Mensaje(Long aId) {
		Mensaje m = null;
		try {
			m = MensajeDAO.getMensajeByORMID(aId.intValue());
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(m==null) return;
		m.setMarcado(true);
		try {
			MensajeDAO.save(m);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/

	public Mensaje[] Ordenar_Mensajes(Mensaje[] aMensajes, String aOrden) {
		throw new UnsupportedOperationException();
	}
	
	public Mensaje[] Cargar_Mensajes(Tema t) {
		try {
			return MensajeDAO.listMensajeByQuery("TemaID = " + t.getID(), null);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Mensaje[] {};
		}
	}
}