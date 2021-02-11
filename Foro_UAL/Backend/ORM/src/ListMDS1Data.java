/**
 * Licensee: PABLO DANIEL(University of Almeria)
 * License Type: Academic
 */
import org.orm.*;
public class ListMDS1Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Reporte...");
		Reporte[] reportes = ReporteDAO.listReporteByQuery(null, null);
		int length = Math.min(reportes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(reportes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tema...");
		Tema[] temas = TemaDAO.listTemaByQuery(null, null);
		length = Math.min(temas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(temas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Seccion...");
		Seccion[] seccions = SeccionDAO.listSeccionByQuery(null, null);
		length = Math.min(seccions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(seccions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Mensaje...");
		Mensaje[] mensajes = MensajeDAO.listMensajeByQuery(null, null);
		length = Math.min(mensajes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(mensajes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario...");
		Usuario[] usuarios = UsuarioDAO.listUsuarioByQuery(null, null);
		length = Math.min(usuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(usuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Media_...");
		Media_[] media_s = Media_DAO.listMedia_ByQuery(null, null);
		length = Math.min(media_s.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(media_s[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Video...");
		Video[] videos = VideoDAO.listVideoByQuery(null, null);
		length = Math.min(videos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(videos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Imagen...");
		Imagen[] imagens = ImagenDAO.listImagenByQuery(null, null);
		length = Math.min(imagens.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(imagens[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Ticket...");
		Ticket[] tickets = TicketDAO.listTicketByQuery(null, null);
		length = Math.min(tickets.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(tickets[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		Administrador[] administradors = AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(administradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(administradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Moderadores...");
		Moderadores[] moderadoreses = ModeradoresDAO.listModeradoresByQuery(null, null);
		length = Math.min(moderadoreses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(moderadoreses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Moderador...");
		Moderador[] moderadors = ModeradorDAO.listModeradorByQuery(null, null);
		length = Math.min(moderadors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(moderadors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administradores...");
		Administradores[] administradoreses = AdministradoresDAO.listAdministradoresByQuery(null, null);
		length = Math.min(administradoreses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(administradoreses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Reporte by Criteria...");
		ReporteCriteria reporteCriteria = new ReporteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//reporteCriteria.idReporte.eq();
		reporteCriteria.setMaxResults(ROW_COUNT);
		Reporte[] reportes = reporteCriteria.listReporte();
		int length =reportes== null ? 0 : Math.min(reportes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(reportes[i]);
		}
		System.out.println(length + " Reporte record(s) retrieved."); 
		
		System.out.println("Listing Tema by Criteria...");
		TemaCriteria temaCriteria = new TemaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//temaCriteria.IDtema.eq();
		temaCriteria.setMaxResults(ROW_COUNT);
		Tema[] temas = temaCriteria.listTema();
		length =temas== null ? 0 : Math.min(temas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(temas[i]);
		}
		System.out.println(length + " Tema record(s) retrieved."); 
		
		System.out.println("Listing Seccion by Criteria...");
		SeccionCriteria seccionCriteria = new SeccionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//seccionCriteria.IDseccion.eq();
		seccionCriteria.setMaxResults(ROW_COUNT);
		Seccion[] seccions = seccionCriteria.listSeccion();
		length =seccions== null ? 0 : Math.min(seccions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(seccions[i]);
		}
		System.out.println(length + " Seccion record(s) retrieved."); 
		
		System.out.println("Listing Mensaje by Criteria...");
		MensajeCriteria mensajeCriteria = new MensajeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//mensajeCriteria.idMensaje.eq();
		mensajeCriteria.setMaxResults(ROW_COUNT);
		Mensaje[] mensajes = mensajeCriteria.listMensaje();
		length =mensajes== null ? 0 : Math.min(mensajes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(mensajes[i]);
		}
		System.out.println(length + " Mensaje record(s) retrieved."); 
		
		System.out.println("Listing Usuario by Criteria...");
		UsuarioCriteria usuarioCriteria = new UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//usuarioCriteria.ID.eq();
		usuarioCriteria.setMaxResults(ROW_COUNT);
		Usuario[] usuarios = usuarioCriteria.listUsuario();
		length =usuarios== null ? 0 : Math.min(usuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(usuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Media_ by Criteria...");
		Media_Criteria media_Criteria = new Media_Criteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//media_Criteria.IDmedia.eq();
		media_Criteria.setMaxResults(ROW_COUNT);
		Media_[] media_s = media_Criteria.listMedia_();
		length =media_s== null ? 0 : Math.min(media_s.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(media_s[i]);
		}
		System.out.println(length + " Media_ record(s) retrieved."); 
		
		System.out.println("Listing Video by Criteria...");
		VideoCriteria videoCriteria = new VideoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//videoCriteria.IDmedia.eq();
		videoCriteria.setMaxResults(ROW_COUNT);
		Video[] videos = videoCriteria.listVideo();
		length =videos== null ? 0 : Math.min(videos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(videos[i]);
		}
		System.out.println(length + " Video record(s) retrieved."); 
		
		System.out.println("Listing Imagen by Criteria...");
		ImagenCriteria imagenCriteria = new ImagenCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//imagenCriteria.IDmedia.eq();
		imagenCriteria.setMaxResults(ROW_COUNT);
		Imagen[] imagens = imagenCriteria.listImagen();
		length =imagens== null ? 0 : Math.min(imagens.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(imagens[i]);
		}
		System.out.println(length + " Imagen record(s) retrieved."); 
		
		System.out.println("Listing Ticket by Criteria...");
		TicketCriteria ticketCriteria = new TicketCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ticketCriteria.idticket.eq();
		ticketCriteria.setMaxResults(ROW_COUNT);
		Ticket[] tickets = ticketCriteria.listTicket();
		length =tickets== null ? 0 : Math.min(tickets.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(tickets[i]);
		}
		System.out.println(length + " Ticket record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		AdministradorCriteria administradorCriteria = new AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		administradorCriteria.setMaxResults(ROW_COUNT);
		Administrador[] administradors = administradorCriteria.listAdministrador();
		length =administradors== null ? 0 : Math.min(administradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(administradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing Moderadores by Criteria...");
		ModeradoresCriteria moderadoresCriteria = new ModeradoresCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//moderadoresCriteria.ID.eq();
		moderadoresCriteria.setMaxResults(ROW_COUNT);
		Moderadores[] moderadoreses = moderadoresCriteria.listModeradores();
		length =moderadoreses== null ? 0 : Math.min(moderadoreses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(moderadoreses[i]);
		}
		System.out.println(length + " Moderadores record(s) retrieved."); 
		
		System.out.println("Listing Moderador by Criteria...");
		ModeradorCriteria moderadorCriteria = new ModeradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//moderadorCriteria.ID.eq();
		moderadorCriteria.setMaxResults(ROW_COUNT);
		Moderador[] moderadors = moderadorCriteria.listModerador();
		length =moderadors== null ? 0 : Math.min(moderadors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(moderadors[i]);
		}
		System.out.println(length + " Moderador record(s) retrieved."); 
		
		System.out.println("Listing Administradores by Criteria...");
		AdministradoresCriteria administradoresCriteria = new AdministradoresCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//administradoresCriteria.ID.eq();
		administradoresCriteria.setMaxResults(ROW_COUNT);
		Administradores[] administradoreses = administradoresCriteria.listAdministradores();
		length =administradoreses== null ? 0 : Math.min(administradoreses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(administradoreses[i]);
		}
		System.out.println(length + " Administradores record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListMDS1Data listMDS1Data = new ListMDS1Data();
			try {
				listMDS1Data.listTestData();
				//listMDS1Data.listByCriteria();
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
