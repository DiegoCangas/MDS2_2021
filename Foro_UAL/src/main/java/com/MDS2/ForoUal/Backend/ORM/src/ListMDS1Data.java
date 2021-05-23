/**
 * Licensee: PABLO DANIEL(University of Almeria)
 * License Type: Academic
 */
package com.MDS2.ForoUal.Backend.ORM.src;

import org.orm.*;
public class ListMDS1Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Reporte...");
		com.MDS2.ForoUal.Backend.ORM.src.Reporte[] package_comMDS2ForoUalBackendORMsrcReportes = com.MDS2.ForoUal.Backend.ORM.src.ReporteDAO.listReporteByQuery(null, null);
		int length = Math.min(package_comMDS2ForoUalBackendORMsrcReportes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(package_comMDS2ForoUalBackendORMsrcReportes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tema...");
		com.MDS2.ForoUal.Backend.ORM.src.Tema[] package_comMDS2ForoUalBackendORMsrcTemas = com.MDS2.ForoUal.Backend.ORM.src.TemaDAO.listTemaByQuery(null, null);
		length = Math.min(package_comMDS2ForoUalBackendORMsrcTemas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(package_comMDS2ForoUalBackendORMsrcTemas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Seccion...");
		com.MDS2.ForoUal.Backend.ORM.src.Seccion[] package_comMDS2ForoUalBackendORMsrcSeccions = com.MDS2.ForoUal.Backend.ORM.src.SeccionDAO.listSeccionByQuery(null, null);
		length = Math.min(package_comMDS2ForoUalBackendORMsrcSeccions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(package_comMDS2ForoUalBackendORMsrcSeccions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Mensaje...");
		com.MDS2.ForoUal.Backend.ORM.src.Mensaje[] package_comMDS2ForoUalBackendORMsrcMensajes = com.MDS2.ForoUal.Backend.ORM.src.MensajeDAO.listMensajeByQuery(null, null);
		length = Math.min(package_comMDS2ForoUalBackendORMsrcMensajes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(package_comMDS2ForoUalBackendORMsrcMensajes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario...");
		com.MDS2.ForoUal.Backend.ORM.src.Usuario[] package_comMDS2ForoUalBackendORMsrcUsuarios = com.MDS2.ForoUal.Backend.ORM.src.UsuarioDAO.listUsuarioByQuery(null, null);
		length = Math.min(package_comMDS2ForoUalBackendORMsrcUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(package_comMDS2ForoUalBackendORMsrcUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Media_...");
		com.MDS2.ForoUal.Backend.ORM.src.Media_[] package_comMDS2ForoUalBackendORMsrcMedia_s = com.MDS2.ForoUal.Backend.ORM.src.Media_DAO.listMedia_ByQuery(null, null);
		length = Math.min(package_comMDS2ForoUalBackendORMsrcMedia_s.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(package_comMDS2ForoUalBackendORMsrcMedia_s[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Notificacion...");
		com.MDS2.ForoUal.Backend.ORM.src.Notificacion[] package_comMDS2ForoUalBackendORMsrcNotificacions = com.MDS2.ForoUal.Backend.ORM.src.NotificacionDAO.listNotificacionByQuery(null, null);
		length = Math.min(package_comMDS2ForoUalBackendORMsrcNotificacions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(package_comMDS2ForoUalBackendORMsrcNotificacions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		com.MDS2.ForoUal.Backend.ORM.src.Administrador[] package_comMDS2ForoUalBackendORMsrcAdministradors = com.MDS2.ForoUal.Backend.ORM.src.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(package_comMDS2ForoUalBackendORMsrcAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(package_comMDS2ForoUalBackendORMsrcAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Reporte by Criteria...");
		com.MDS2.ForoUal.Backend.ORM.src.ReporteCriteria lpackage_comMDS2ForoUalBackendORMsrcReporteCriteria = new com.MDS2.ForoUal.Backend.ORM.src.ReporteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lpackage_comMDS2ForoUalBackendORMsrcReporteCriteria.idReporte.eq();
		lpackage_comMDS2ForoUalBackendORMsrcReporteCriteria.setMaxResults(ROW_COUNT);
		com.MDS2.ForoUal.Backend.ORM.src.Reporte[] package_comMDS2ForoUalBackendORMsrcReportes = lpackage_comMDS2ForoUalBackendORMsrcReporteCriteria.listReporte();
		int length =package_comMDS2ForoUalBackendORMsrcReportes== null ? 0 : Math.min(package_comMDS2ForoUalBackendORMsrcReportes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(package_comMDS2ForoUalBackendORMsrcReportes[i]);
		}
		System.out.println(length + " Reporte record(s) retrieved."); 
		
		System.out.println("Listing Tema by Criteria...");
		com.MDS2.ForoUal.Backend.ORM.src.TemaCriteria lpackage_comMDS2ForoUalBackendORMsrcTemaCriteria = new com.MDS2.ForoUal.Backend.ORM.src.TemaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lpackage_comMDS2ForoUalBackendORMsrcTemaCriteria.ID.eq();
		lpackage_comMDS2ForoUalBackendORMsrcTemaCriteria.setMaxResults(ROW_COUNT);
		com.MDS2.ForoUal.Backend.ORM.src.Tema[] package_comMDS2ForoUalBackendORMsrcTemas = lpackage_comMDS2ForoUalBackendORMsrcTemaCriteria.listTema();
		length =package_comMDS2ForoUalBackendORMsrcTemas== null ? 0 : Math.min(package_comMDS2ForoUalBackendORMsrcTemas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(package_comMDS2ForoUalBackendORMsrcTemas[i]);
		}
		System.out.println(length + " Tema record(s) retrieved."); 
		
		System.out.println("Listing Seccion by Criteria...");
		com.MDS2.ForoUal.Backend.ORM.src.SeccionCriteria lpackage_comMDS2ForoUalBackendORMsrcSeccionCriteria = new com.MDS2.ForoUal.Backend.ORM.src.SeccionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lpackage_comMDS2ForoUalBackendORMsrcSeccionCriteria.ID.eq();
		lpackage_comMDS2ForoUalBackendORMsrcSeccionCriteria.setMaxResults(ROW_COUNT);
		com.MDS2.ForoUal.Backend.ORM.src.Seccion[] package_comMDS2ForoUalBackendORMsrcSeccions = lpackage_comMDS2ForoUalBackendORMsrcSeccionCriteria.listSeccion();
		length =package_comMDS2ForoUalBackendORMsrcSeccions== null ? 0 : Math.min(package_comMDS2ForoUalBackendORMsrcSeccions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(package_comMDS2ForoUalBackendORMsrcSeccions[i]);
		}
		System.out.println(length + " Seccion record(s) retrieved."); 
		
		System.out.println("Listing Mensaje by Criteria...");
		com.MDS2.ForoUal.Backend.ORM.src.MensajeCriteria lpackage_comMDS2ForoUalBackendORMsrcMensajeCriteria = new com.MDS2.ForoUal.Backend.ORM.src.MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lpackage_comMDS2ForoUalBackendORMsrcMensajeCriteria.ID.eq();
		lpackage_comMDS2ForoUalBackendORMsrcMensajeCriteria.setMaxResults(ROW_COUNT);
		com.MDS2.ForoUal.Backend.ORM.src.Mensaje[] package_comMDS2ForoUalBackendORMsrcMensajes = lpackage_comMDS2ForoUalBackendORMsrcMensajeCriteria.listMensaje();
		length =package_comMDS2ForoUalBackendORMsrcMensajes== null ? 0 : Math.min(package_comMDS2ForoUalBackendORMsrcMensajes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(package_comMDS2ForoUalBackendORMsrcMensajes[i]);
		}
		System.out.println(length + " Mensaje record(s) retrieved."); 
		
		System.out.println("Listing Usuario by Criteria...");
		com.MDS2.ForoUal.Backend.ORM.src.UsuarioCriteria lpackage_comMDS2ForoUalBackendORMsrcUsuarioCriteria = new com.MDS2.ForoUal.Backend.ORM.src.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lpackage_comMDS2ForoUalBackendORMsrcUsuarioCriteria.ID.eq();
		lpackage_comMDS2ForoUalBackendORMsrcUsuarioCriteria.setMaxResults(ROW_COUNT);
		com.MDS2.ForoUal.Backend.ORM.src.Usuario[] package_comMDS2ForoUalBackendORMsrcUsuarios = lpackage_comMDS2ForoUalBackendORMsrcUsuarioCriteria.listUsuario();
		length =package_comMDS2ForoUalBackendORMsrcUsuarios== null ? 0 : Math.min(package_comMDS2ForoUalBackendORMsrcUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(package_comMDS2ForoUalBackendORMsrcUsuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Media_ by Criteria...");
		com.MDS2.ForoUal.Backend.ORM.src.Media_Criteria lpackage_comMDS2ForoUalBackendORMsrcMedia_Criteria = new com.MDS2.ForoUal.Backend.ORM.src.Media_Criteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lpackage_comMDS2ForoUalBackendORMsrcMedia_Criteria.IDmedia.eq();
		lpackage_comMDS2ForoUalBackendORMsrcMedia_Criteria.setMaxResults(ROW_COUNT);
		com.MDS2.ForoUal.Backend.ORM.src.Media_[] package_comMDS2ForoUalBackendORMsrcMedia_s = lpackage_comMDS2ForoUalBackendORMsrcMedia_Criteria.listMedia_();
		length =package_comMDS2ForoUalBackendORMsrcMedia_s== null ? 0 : Math.min(package_comMDS2ForoUalBackendORMsrcMedia_s.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(package_comMDS2ForoUalBackendORMsrcMedia_s[i]);
		}
		System.out.println(length + " Media_ record(s) retrieved."); 
		
		System.out.println("Listing Notificacion by Criteria...");
		com.MDS2.ForoUal.Backend.ORM.src.NotificacionCriteria lpackage_comMDS2ForoUalBackendORMsrcNotificacionCriteria = new com.MDS2.ForoUal.Backend.ORM.src.NotificacionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lpackage_comMDS2ForoUalBackendORMsrcNotificacionCriteria.idnotificacion.eq();
		lpackage_comMDS2ForoUalBackendORMsrcNotificacionCriteria.setMaxResults(ROW_COUNT);
		com.MDS2.ForoUal.Backend.ORM.src.Notificacion[] package_comMDS2ForoUalBackendORMsrcNotificacions = lpackage_comMDS2ForoUalBackendORMsrcNotificacionCriteria.listNotificacion();
		length =package_comMDS2ForoUalBackendORMsrcNotificacions== null ? 0 : Math.min(package_comMDS2ForoUalBackendORMsrcNotificacions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(package_comMDS2ForoUalBackendORMsrcNotificacions[i]);
		}
		System.out.println(length + " Notificacion record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		com.MDS2.ForoUal.Backend.ORM.src.AdministradorCriteria lpackage_comMDS2ForoUalBackendORMsrcAdministradorCriteria = new com.MDS2.ForoUal.Backend.ORM.src.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lpackage_comMDS2ForoUalBackendORMsrcAdministradorCriteria.ID.eq();
		lpackage_comMDS2ForoUalBackendORMsrcAdministradorCriteria.setMaxResults(ROW_COUNT);
		com.MDS2.ForoUal.Backend.ORM.src.Administrador[] package_comMDS2ForoUalBackendORMsrcAdministradors = lpackage_comMDS2ForoUalBackendORMsrcAdministradorCriteria.listAdministrador();
		length =package_comMDS2ForoUalBackendORMsrcAdministradors== null ? 0 : Math.min(package_comMDS2ForoUalBackendORMsrcAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(package_comMDS2ForoUalBackendORMsrcAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListMDS1Data listMDS1Data = new ListMDS1Data();
			try {
				listMDS1Data.listTestData();
				//listMDS1Data.listByCriteria();
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
