/**
 * Licensee: PABLO DANIEL(University of Almeria)
 * License Type: Academic
 */
package com.MDS2.ForoUal.Backend.ORM.src;

import org.orm.*;

import com.MDS2.ForoUal.Backend.BDs.PasswordUtils;
public class CreateMDS1Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = MDS1PersistentManager.instance().getSession().beginTransaction();
		try {
			/*Reporte reporte = ReporteDAO.createReporte();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : motivo
			ReporteDAO.save(reporte);
			Tema tema = TemaDAO.createTema();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : gustaTema, subtitulo, Titulo
			TemaDAO.save(tema);
			Seccion seccion = SeccionDAO.createSeccion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : subtitulo, Titulo
			SeccionDAO.save(seccion);
			Mensaje mensaje = MensajeDAO.createMensaje();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : respuesta_de, gustaMensaje, respondido_por, texto
			MensajeDAO.save(mensaje);
			Usuario usuario = UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : megusta_tema, megusta, usuarios, amigo_de, nombreReal, contrasenia, descripcion, nombreUsuario, email
			UsuarioDAO.save(usuario);
			Moderador moderador = ModeradorDAO.createModerador();
			// Initialize the properties of the persistent object here
			ModeradorDAO.save(moderador);*/
			Administrador administrador = AdministradorDAO.createAdministrador();
			administrador.setFotoPerfil("https://thumbs.dreamstime.com/b/inicio-de-sesi%C3%B3n-administrador-en-el-icono-del-port%C3%A1til-vector-stock-166205404.jpg");
			administrador.setNombreUsuario("Administrador");
			administrador.setEmail("Administrador");
			administrador.setContrasenia(PasswordUtils.generateSecurePassword("Administrador", "EqdmPh53c9x33EygXpTpcoJvc4VXLK"));
			administrador.setNombreReal("Administrador");
			administrador.setDescripcion("El administrador del sistema");
			// Initialize the properties of the persistent object here
			AdministradorDAO.save(administrador);
			//Media_ media_ = Media_DAO.createMedia_();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : url
			//Media_DAO.save(media_);
			//Notificacion notificacion = NotificacionDAO.createNotificacion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : mensaje
			//NotificacionDAO.save(notificacion);
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
