/**
 * Licensee: PABLO DANIEL(University of Almeria)
 * License Type: Academic
 */
import org.orm.*;
public class CreateMDS1Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		try {
			Reporte reporte = ReporteDAO.createReporte();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuario
			ReporteDAO.save(reporte);
			Tema tema = TemaDAO.createTema();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : compone, oculta, numMensjes, numeroMeGusta, crea_temas
			TemaDAO.save(tema);
			Seccion seccion = SeccionDAO.createSeccion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : crea, numMensajes
			SeccionDAO.save(seccion);
			Mensaje mensaje = MensajeDAO.createMensaje();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : mensajes, respondido_por, imagen, marcado, numeroMeGusta, mensaje_, envia
			MensajeDAO.save(mensaje);
			Usuario usuario = UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_creado, usuarios, pertenece, amigo_de, reportes, baneado, marcado
			UsuarioDAO.save(usuario);
			Media_ media_ = Media_DAO.createMedia_();
			// Initialize the properties of the persistent object here
			Media_DAO.save(media_);
			Video video = VideoDAO.createVideo();
			// Initialize the properties of the persistent object here
			VideoDAO.save(video);
			Imagen imagen = ImagenDAO.createImagen();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene_imagen, tamanoKB
			ImagenDAO.save(imagen);
			Ticket ticket = TicketDAO.createTicket();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : recibe, envia
			TicketDAO.save(ticket);
			Administrador administrador = AdministradorDAO.createAdministrador();
			// Initialize the properties of the persistent object here
			AdministradorDAO.save(administrador);
			Moderadores moderadores = ModeradoresDAO.createModeradores();
			// Initialize the properties of the persistent object here
			ModeradoresDAO.save(moderadores);
			Moderador moderador = ModeradorDAO.createModerador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_enviado, temas
			ModeradorDAO.save(moderador);
			Administradores administradores = AdministradoresDAO.createAdministradores();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_creada, son_recibidos
			AdministradoresDAO.save(administradores);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateMDS1Data createMDS1Data = new CreateMDS1Data();
			try {
				createMDS1Data.createTestData();
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
