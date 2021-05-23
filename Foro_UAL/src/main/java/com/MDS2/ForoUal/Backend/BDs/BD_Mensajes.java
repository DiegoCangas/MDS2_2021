package com.MDS2.ForoUal.Backend.BDs;

import java.sql.Time;
import java.time.Instant;
import java.util.Vector;

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
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;
import com.MDS2.ForoUal.Backend.ORM.src.UsuarioDAO;
import com.MDS2.ForoUal.Interfaz.Visualizar_Mensajes;
import com.MDS2.ForoUal.Interfaz.Visualizar_Temas_Registrado;

public class BD_Mensajes {
	public BD_Principal _bd_main_mensajes;
	public Vector<Mensaje> _unnamed_Mensaje_ = new Vector<Mensaje>();

	public Mensaje[] Cargar_Mensajes(Tema aT) {
		try {
			return MensajeDAO.listMensajeByQuery("TemaID = " + aT.getID(), null);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Mensaje[] {};
		}
	}

	public Mensaje Crear_Mensaje(String aTexto, String[] aMedia, Mensaje respuestaA, Long aIdCreador) {
		Mensaje m = MensajeDAO.createMensaje();
		
		m.setTexto(aTexto);
		m.setFechaCreacion(Time.from(Instant.now()));
		if(respuestaA != null) m.respuesta_de.add(respuestaA);
		m.setMensaje_(Visualizar_Mensajes.tema);
			
		
		try {
			Usuario user = UsuarioDAO.getUsuarioByORMID(aIdCreador);
			m.setEnvia_mensaje(user);
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
			
			for(String me : aMedia) {
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

	public void Dar_Megusta_Mensaje(Long aIdMensaje, Long aIdUsuario) {
		Mensaje m = null;
		try {
			m = MensajeDAO.loadMensajeByORMID(aIdMensaje.intValue());
			Usuario user = UsuarioDAO.loadUsuarioByORMID(aIdUsuario);
			System.out.println(m.gustaMensaje);
			
			if(!m.gustaMensaje.contains(user))
				m.gustaMensaje.add(user);
			else m.gustaMensaje.remove(user);
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

	public Mensaje[] Ordenar_Mensajes(Mensaje[] aMensajes, String aOrden) {
		throw new UnsupportedOperationException();
	}

	public Mensaje[] Cargar_Mensajes_Moderador() {
		throw new UnsupportedOperationException();
	}
}