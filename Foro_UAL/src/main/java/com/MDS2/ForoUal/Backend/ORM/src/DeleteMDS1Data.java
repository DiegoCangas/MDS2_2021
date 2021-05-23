/**
 * Licensee: PABLO DANIEL(University of Almeria)
 * License Type: Academic
 */
package com.MDS2.ForoUal.Backend.ORM.src;

import org.orm.*;
public class DeleteMDS1Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession().beginTransaction();
		try {
			com.MDS2.ForoUal.Backend.ORM.src.Reporte lpackage_comMDS2ForoUalBackendORMsrcReporte = com.MDS2.ForoUal.Backend.ORM.src.ReporteDAO.loadReporteByQuery(null, null);
			// Delete the persistent object
			com.MDS2.ForoUal.Backend.ORM.src.ReporteDAO.delete(lpackage_comMDS2ForoUalBackendORMsrcReporte);
			com.MDS2.ForoUal.Backend.ORM.src.Tema lpackage_comMDS2ForoUalBackendORMsrcTema = com.MDS2.ForoUal.Backend.ORM.src.TemaDAO.loadTemaByQuery(null, null);
			// Delete the persistent object
			com.MDS2.ForoUal.Backend.ORM.src.TemaDAO.delete(lpackage_comMDS2ForoUalBackendORMsrcTema);
			com.MDS2.ForoUal.Backend.ORM.src.Seccion lpackage_comMDS2ForoUalBackendORMsrcSeccion = com.MDS2.ForoUal.Backend.ORM.src.SeccionDAO.loadSeccionByQuery(null, null);
			// Delete the persistent object
			com.MDS2.ForoUal.Backend.ORM.src.SeccionDAO.delete(lpackage_comMDS2ForoUalBackendORMsrcSeccion);
			com.MDS2.ForoUal.Backend.ORM.src.Mensaje lpackage_comMDS2ForoUalBackendORMsrcMensaje = com.MDS2.ForoUal.Backend.ORM.src.MensajeDAO.loadMensajeByQuery(null, null);
			// Delete the persistent object
			com.MDS2.ForoUal.Backend.ORM.src.MensajeDAO.delete(lpackage_comMDS2ForoUalBackendORMsrcMensaje);
			com.MDS2.ForoUal.Backend.ORM.src.Usuario lpackage_comMDS2ForoUalBackendORMsrcUsuario = com.MDS2.ForoUal.Backend.ORM.src.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			com.MDS2.ForoUal.Backend.ORM.src.UsuarioDAO.delete(lpackage_comMDS2ForoUalBackendORMsrcUsuario);
			com.MDS2.ForoUal.Backend.ORM.src.Media_ lpackage_comMDS2ForoUalBackendORMsrcMedia_ = com.MDS2.ForoUal.Backend.ORM.src.Media_DAO.loadMedia_ByQuery(null, null);
			// Delete the persistent object
			com.MDS2.ForoUal.Backend.ORM.src.Media_DAO.delete(lpackage_comMDS2ForoUalBackendORMsrcMedia_);
			com.MDS2.ForoUal.Backend.ORM.src.Notificacion lpackage_comMDS2ForoUalBackendORMsrcNotificacion = com.MDS2.ForoUal.Backend.ORM.src.NotificacionDAO.loadNotificacionByQuery(null, null);
			// Delete the persistent object
			com.MDS2.ForoUal.Backend.ORM.src.NotificacionDAO.delete(lpackage_comMDS2ForoUalBackendORMsrcNotificacion);
			com.MDS2.ForoUal.Backend.ORM.src.Administrador lpackage_comMDS2ForoUalBackendORMsrcAdministrador = com.MDS2.ForoUal.Backend.ORM.src.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			com.MDS2.ForoUal.Backend.ORM.src.AdministradorDAO.delete(lpackage_comMDS2ForoUalBackendORMsrcAdministrador);
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
				com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
