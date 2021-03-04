/**
 * Licensee: PABLO DANIEL(University of Almeria)
 * License Type: Academic
 */
package com.MDS2.ForoUal.Backend.ORM.src;

import org.orm.*;
public class RetrieveAndUpdateMDS1Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		try {
			Reporte reporte = ReporteDAO.loadReporteByQuery(null, null);
			// Update the properties of the persistent object
			ReporteDAO.save(reporte);
			Tema tema = TemaDAO.loadTemaByQuery(null, null);
			// Update the properties of the persistent object
			TemaDAO.save(tema);
			Seccion seccion = SeccionDAO.loadSeccionByQuery(null, null);
			// Update the properties of the persistent object
			SeccionDAO.save(seccion);
			Mensaje mensaje = MensajeDAO.loadMensajeByQuery(null, null);
			// Update the properties of the persistent object
			MensajeDAO.save(mensaje);
			Usuario usuario = UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			UsuarioDAO.save(usuario);
			Moderador moderador = ModeradorDAO.loadModeradorByQuery(null, null);
			// Update the properties of the persistent object
			ModeradorDAO.save(moderador);
			Administrador administrador = AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			AdministradorDAO.save(administrador);
			Media_ media_ = Media_DAO.loadMedia_ByQuery(null, null);
			// Update the properties of the persistent object
			Media_DAO.save(media_);
			Notificacion notificacion = NotificacionDAO.loadNotificacionByQuery(null, null);
			// Update the properties of the persistent object
			NotificacionDAO.save(notificacion);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Reporte by ReporteCriteria");
		ReporteCriteria reporteCriteria = new ReporteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//reporteCriteria.idReporte.eq();
		System.out.println(reporteCriteria.uniqueReporte());
		
		System.out.println("Retrieving Tema by TemaCriteria");
		TemaCriteria temaCriteria = new TemaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//temaCriteria.ID.eq();
		System.out.println(temaCriteria.uniqueTema());
		
		System.out.println("Retrieving Seccion by SeccionCriteria");
		SeccionCriteria seccionCriteria = new SeccionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//seccionCriteria.ID.eq();
		System.out.println(seccionCriteria.uniqueSeccion());
		
		System.out.println("Retrieving Mensaje by MensajeCriteria");
		MensajeCriteria mensajeCriteria = new MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//mensajeCriteria.ID.eq();
		System.out.println(mensajeCriteria.uniqueMensaje());
		
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		UsuarioCriteria usuarioCriteria = new UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//usuarioCriteria.ID.eq();
		System.out.println(usuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Moderador by ModeradorCriteria");
		ModeradorCriteria moderadorCriteria = new ModeradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//moderadorCriteria.ID.eq();
		System.out.println(moderadorCriteria.uniqueModerador());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		AdministradorCriteria administradorCriteria = new AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//administradorCriteria.ID.eq();
		System.out.println(administradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving Media_ by Media_Criteria");
		Media_Criteria media_Criteria = new Media_Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//media_Criteria.IDmedia.eq();
		System.out.println(media_Criteria.uniqueMedia_());
		
		System.out.println("Retrieving Notificacion by NotificacionCriteria");
		NotificacionCriteria notificacionCriteria = new NotificacionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//notificacionCriteria.idnotificacion.eq();
		System.out.println(notificacionCriteria.uniqueNotificacion());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateMDS1Data retrieveAndUpdateMDS1Data = new RetrieveAndUpdateMDS1Data();
			try {
				retrieveAndUpdateMDS1Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateMDS1Data.retrieveByCriteria();
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
