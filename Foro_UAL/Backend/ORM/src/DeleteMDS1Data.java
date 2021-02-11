/**
 * Licensee: PABLO DANIEL(University of Almeria)
 * License Type: Academic
 */
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
			Media_ media_ = Media_DAO.loadMedia_ByQuery(null, null);
			// Delete the persistent object
			Media_DAO.delete(media_);
			Video video = VideoDAO.loadVideoByQuery(null, null);
			// Delete the persistent object
			VideoDAO.delete(video);
			Imagen imagen = ImagenDAO.loadImagenByQuery(null, null);
			// Delete the persistent object
			ImagenDAO.delete(imagen);
			Ticket ticket = TicketDAO.loadTicketByQuery(null, null);
			// Delete the persistent object
			TicketDAO.delete(ticket);
			Administrador administrador = AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			AdministradorDAO.delete(administrador);
			Moderadores moderadores = ModeradoresDAO.loadModeradoresByQuery(null, null);
			// Delete the persistent object
			ModeradoresDAO.delete(moderadores);
			Moderador moderador = ModeradorDAO.loadModeradorByQuery(null, null);
			// Delete the persistent object
			ModeradorDAO.delete(moderador);
			Administradores administradores = AdministradoresDAO.loadAdministradoresByQuery(null, null);
			// Delete the persistent object
			AdministradoresDAO.delete(administradores);
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
