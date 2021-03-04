/**
 * Licensee: PABLO DANIEL(University of Almeria)
 * License Type: Academic
 */
package com.MDS2.ForoUal.Backend.ORM.src;

import org.orm.*;
public class DeleteMDS1Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		try {
			Reporte reporte = ReporteDAO.loadReporteByQuery(null, null);
			// Delete the persistent object
			ReporteDAO.delete(reporte);
			Tema tema = TemaDAO.loadTemaByQuery(null, null);
			// Delete the persistent object
			TemaDAO.delete(tema);
			Seccion seccion = SeccionDAO.loadSeccionByQuery(null, null);
			// Delete the persistent object
			SeccionDAO.delete(seccion);
			Mensaje mensaje = MensajeDAO.loadMensajeByQuery(null, null);
			// Delete the persistent object
			MensajeDAO.delete(mensaje);
			Usuario usuario = UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			UsuarioDAO.delete(usuario);
			Moderador moderador = ModeradorDAO.loadModeradorByQuery(null, null);
			// Delete the persistent object
			ModeradorDAO.delete(moderador);
			Administrador administrador = AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			AdministradorDAO.delete(administrador);
			Media_ media_ = Media_DAO.loadMedia_ByQuery(null, null);
			// Delete the persistent object
			Media_DAO.delete(media_);
			Notificacion notificacion = NotificacionDAO.loadNotificacionByQuery(null, null);
			// Delete the persistent object
			NotificacionDAO.delete(notificacion);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteMDS1Data deleteMDS1Data = new DeleteMDS1Data();
			try {
				deleteMDS1Data.deleteTestData();
			}
			finally {
				MDS1PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
