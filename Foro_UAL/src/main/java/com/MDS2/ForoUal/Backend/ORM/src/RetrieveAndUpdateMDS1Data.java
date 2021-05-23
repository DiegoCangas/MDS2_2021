/**
 * Licensee: PABLO DANIEL(University of Almeria)
 * License Type: Academic
 */
package com.MDS2.ForoUal.Backend.ORM.src;

import org.orm.*;
public class RetrieveAndUpdateMDS1Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession().beginTransaction();
		try {
			com.MDS2.ForoUal.Backend.ORM.src.Reporte lpackage_comMDS2ForoUalBackendORMsrcReporte = com.MDS2.ForoUal.Backend.ORM.src.ReporteDAO.loadReporteByQuery(null, null);
			// Update the properties of the persistent object
			com.MDS2.ForoUal.Backend.ORM.src.ReporteDAO.save(lpackage_comMDS2ForoUalBackendORMsrcReporte);
			com.MDS2.ForoUal.Backend.ORM.src.Tema lpackage_comMDS2ForoUalBackendORMsrcTema = com.MDS2.ForoUal.Backend.ORM.src.TemaDAO.loadTemaByQuery(null, null);
			// Update the properties of the persistent object
			com.MDS2.ForoUal.Backend.ORM.src.TemaDAO.save(lpackage_comMDS2ForoUalBackendORMsrcTema);
			com.MDS2.ForoUal.Backend.ORM.src.Seccion lpackage_comMDS2ForoUalBackendORMsrcSeccion = com.MDS2.ForoUal.Backend.ORM.src.SeccionDAO.loadSeccionByQuery(null, null);
			// Update the properties of the persistent object
			com.MDS2.ForoUal.Backend.ORM.src.SeccionDAO.save(lpackage_comMDS2ForoUalBackendORMsrcSeccion);
			com.MDS2.ForoUal.Backend.ORM.src.Mensaje lpackage_comMDS2ForoUalBackendORMsrcMensaje = com.MDS2.ForoUal.Backend.ORM.src.MensajeDAO.loadMensajeByQuery(null, null);
			// Update the properties of the persistent object
			com.MDS2.ForoUal.Backend.ORM.src.MensajeDAO.save(lpackage_comMDS2ForoUalBackendORMsrcMensaje);
			com.MDS2.ForoUal.Backend.ORM.src.Usuario lpackage_comMDS2ForoUalBackendORMsrcUsuario = com.MDS2.ForoUal.Backend.ORM.src.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			com.MDS2.ForoUal.Backend.ORM.src.UsuarioDAO.save(lpackage_comMDS2ForoUalBackendORMsrcUsuario);
			com.MDS2.ForoUal.Backend.ORM.src.Media_ lpackage_comMDS2ForoUalBackendORMsrcMedia_ = com.MDS2.ForoUal.Backend.ORM.src.Media_DAO.loadMedia_ByQuery(null, null);
			// Update the properties of the persistent object
			com.MDS2.ForoUal.Backend.ORM.src.Media_DAO.save(lpackage_comMDS2ForoUalBackendORMsrcMedia_);
			com.MDS2.ForoUal.Backend.ORM.src.Notificacion lpackage_comMDS2ForoUalBackendORMsrcNotificacion = com.MDS2.ForoUal.Backend.ORM.src.NotificacionDAO.loadNotificacionByQuery(null, null);
			// Update the properties of the persistent object
			com.MDS2.ForoUal.Backend.ORM.src.NotificacionDAO.save(lpackage_comMDS2ForoUalBackendORMsrcNotificacion);
			com.MDS2.ForoUal.Backend.ORM.src.Administrador lpackage_comMDS2ForoUalBackendORMsrcAdministrador = com.MDS2.ForoUal.Backend.ORM.src.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			com.MDS2.ForoUal.Backend.ORM.src.AdministradorDAO.save(lpackage_comMDS2ForoUalBackendORMsrcAdministrador);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Reporte by ReporteCriteria");
		com.MDS2.ForoUal.Backend.ORM.src.ReporteCriteria lpackage_comMDS2ForoUalBackendORMsrcReporteCriteria = new com.MDS2.ForoUal.Backend.ORM.src.ReporteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lpackage_comMDS2ForoUalBackendORMsrcReporteCriteria.idReporte.eq();
		System.out.println(lpackage_comMDS2ForoUalBackendORMsrcReporteCriteria.uniqueReporte());
		
		System.out.println("Retrieving Tema by TemaCriteria");
		com.MDS2.ForoUal.Backend.ORM.src.TemaCriteria lpackage_comMDS2ForoUalBackendORMsrcTemaCriteria = new com.MDS2.ForoUal.Backend.ORM.src.TemaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lpackage_comMDS2ForoUalBackendORMsrcTemaCriteria.ID.eq();
		System.out.println(lpackage_comMDS2ForoUalBackendORMsrcTemaCriteria.uniqueTema());
		
		System.out.println("Retrieving Seccion by SeccionCriteria");
		com.MDS2.ForoUal.Backend.ORM.src.SeccionCriteria lpackage_comMDS2ForoUalBackendORMsrcSeccionCriteria = new com.MDS2.ForoUal.Backend.ORM.src.SeccionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lpackage_comMDS2ForoUalBackendORMsrcSeccionCriteria.ID.eq();
		System.out.println(lpackage_comMDS2ForoUalBackendORMsrcSeccionCriteria.uniqueSeccion());
		
		System.out.println("Retrieving Mensaje by MensajeCriteria");
		com.MDS2.ForoUal.Backend.ORM.src.MensajeCriteria lpackage_comMDS2ForoUalBackendORMsrcMensajeCriteria = new com.MDS2.ForoUal.Backend.ORM.src.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lpackage_comMDS2ForoUalBackendORMsrcMensajeCriteria.ID.eq();
		System.out.println(lpackage_comMDS2ForoUalBackendORMsrcMensajeCriteria.uniqueMensaje());
		
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		com.MDS2.ForoUal.Backend.ORM.src.UsuarioCriteria lpackage_comMDS2ForoUalBackendORMsrcUsuarioCriteria = new com.MDS2.ForoUal.Backend.ORM.src.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lpackage_comMDS2ForoUalBackendORMsrcUsuarioCriteria.ID.eq();
		System.out.println(lpackage_comMDS2ForoUalBackendORMsrcUsuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Media_ by Media_Criteria");
		com.MDS2.ForoUal.Backend.ORM.src.Media_Criteria lpackage_comMDS2ForoUalBackendORMsrcMedia_Criteria = new com.MDS2.ForoUal.Backend.ORM.src.Media_Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lpackage_comMDS2ForoUalBackendORMsrcMedia_Criteria.IDmedia.eq();
		System.out.println(lpackage_comMDS2ForoUalBackendORMsrcMedia_Criteria.uniqueMedia_());
		
		System.out.println("Retrieving Notificacion by NotificacionCriteria");
		com.MDS2.ForoUal.Backend.ORM.src.NotificacionCriteria lpackage_comMDS2ForoUalBackendORMsrcNotificacionCriteria = new com.MDS2.ForoUal.Backend.ORM.src.NotificacionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lpackage_comMDS2ForoUalBackendORMsrcNotificacionCriteria.idnotificacion.eq();
		System.out.println(lpackage_comMDS2ForoUalBackendORMsrcNotificacionCriteria.uniqueNotificacion());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		com.MDS2.ForoUal.Backend.ORM.src.AdministradorCriteria lpackage_comMDS2ForoUalBackendORMsrcAdministradorCriteria = new com.MDS2.ForoUal.Backend.ORM.src.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lpackage_comMDS2ForoUalBackendORMsrcAdministradorCriteria.ID.eq();
		System.out.println(lpackage_comMDS2ForoUalBackendORMsrcAdministradorCriteria.uniqueAdministrador());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateMDS1Data retrieveAndUpdateMDS1Data = new RetrieveAndUpdateMDS1Data();
			try {
				retrieveAndUpdateMDS1Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateMDS1Data.retrieveByCriteria();
			}
			finally {
				com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
