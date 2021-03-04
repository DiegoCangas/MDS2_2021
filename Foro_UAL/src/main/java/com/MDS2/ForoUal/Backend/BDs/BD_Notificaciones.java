package com.MDS2.ForoUal.Backend.BDs;

import java.util.Vector;

import org.orm.PersistentException;

import com.MDS2.ForoUal.Backend.ORM.src.Notificacion;
import com.MDS2.ForoUal.Backend.ORM.src.NotificacionDAO;
import com.MDS2.ForoUal.Backend.ORM.src.Usuario;
import com.MDS2.ForoUal.Backend.ORM.src.UsuarioDAO;

public class BD_Notificaciones {
	public BD_Principal _bd_main_notificaciones;
	public Vector<NotificacionDAO> _unnamed_Ticket_ = new Vector<NotificacionDAO>();

	public void Eliminar_Notificacion(Long aId) {
		throw new UnsupportedOperationException();
	}

	public Notificacion Notificar_Admin(String aNombreUsuario, String aMensaje) {
		try {
			Usuario u = UsuarioDAO.loadUsuarioByQuery(String.format("NombreUsuario = '%s'",aNombreUsuario), null);
			u.setMarcado(true);
			UsuarioDAO.save(u);
			
			Notificacion t = NotificacionDAO.createNotificacion();
			t.setMensaje(aMensaje);
			t.setUsuario_ticket(u);
			NotificacionDAO.save(t);
			return t;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public void Crear_Notificacion (int aId, String aMensaje) {
		Usuario u;
		try {
			u = UsuarioDAO.getUsuarioByORMID((long)aId);
			Notificacion t = NotificacionDAO.createNotificacion();
			t.setMensaje(aMensaje);
			t.setUsuario_ticket(u);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public Notificacion[] Cargar_Notificaciones(int aId) {
		try {
			return NotificacionDAO.listNotificacionByQuery("UsuarioID = " +aId, "idnotificacion DESC");
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Notificacion[] {};
		}
	}
}