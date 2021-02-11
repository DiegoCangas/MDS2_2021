/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: PABLO DANIEL(University of Almeria)
 * License Type: Academic
 */
import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class MensajeDAO {
	public static Mensaje loadMensajeByORMID(Long idMensaje) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadMensajeByORMID(session, idMensaje);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje getMensajeByORMID(Long idMensaje) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return getMensajeByORMID(session, idMensaje);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByORMID(Long idMensaje, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadMensajeByORMID(session, idMensaje, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje getMensajeByORMID(Long idMensaje, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return getMensajeByORMID(session, idMensaje, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByORMID(PersistentSession session, Long idMensaje) throws PersistentException {
		try {
			return (Mensaje) session.load(Mensaje.class, idMensaje);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje getMensajeByORMID(PersistentSession session, Long idMensaje) throws PersistentException {
		try {
			return (Mensaje) session.get(Mensaje.class, idMensaje);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByORMID(PersistentSession session, Long idMensaje, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Mensaje) session.load(Mensaje.class, idMensaje, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje getMensajeByORMID(PersistentSession session, Long idMensaje, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Mensaje) session.get(Mensaje.class, idMensaje, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMensaje(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return queryMensaje(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMensaje(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return queryMensaje(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje[] listMensajeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return listMensajeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje[] listMensajeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return listMensajeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMensaje(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Mensaje as Mensaje");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMensaje(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Mensaje as Mensaje");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Mensaje", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje[] listMensajeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMensaje(session, condition, orderBy);
			return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje[] listMensajeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMensaje(session, condition, orderBy, lockMode);
			return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadMensajeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadMensajeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Mensaje[] mensajes = listMensajeByQuery(session, condition, orderBy);
		if (mensajes != null && mensajes.length > 0)
			return mensajes[0];
		else
			return null;
	}
	
	public static Mensaje loadMensajeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Mensaje[] mensajes = listMensajeByQuery(session, condition, orderBy, lockMode);
		if (mensajes != null && mensajes.length > 0)
			return mensajes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMensajeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return iterateMensajeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMensajeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return iterateMensajeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMensajeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Mensaje as Mensaje");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMensajeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Mensaje as Mensaje");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Mensaje", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje createMensaje() {
		return new Mensaje();
	}
	
	public static boolean save(Mensaje mensaje) throws PersistentException {
		try {
			MDS1PersistentManager.instance().saveObject(mensaje);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Mensaje mensaje) throws PersistentException {
		try {
			MDS1PersistentManager.instance().deleteObject(mensaje);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Mensaje mensaje)throws PersistentException {
		try {
			if (mensaje.getVideos() != null) {
				mensaje.getVideos().contiene_video.remove(mensaje);
			}
			
			if (mensaje.getEnvia() != null) {
				mensaje.getEnvia().pertenece.remove(mensaje);
			}
			
			if (mensaje.getMensaje_() != null) {
				mensaje.getMensaje_().compone.remove(mensaje);
			}
			
			Reporte[] lCorrespondens = mensaje.corresponden.toArray();
			for(int i = 0; i < lCorrespondens.length; i++) {
				lCorrespondens[i].setEs_reportado(null);
			}
			Imagen[] lImagens = mensaje.imagen.toArray();
			for(int i = 0; i < lImagens.length; i++) {
				lImagens[i].contiene_imagen.remove(mensaje);
			}
			Mensaje[] lRespondido_pors = mensaje.respondido_por.toArray();
			for(int i = 0; i < lRespondido_pors.length; i++) {
				lRespondido_pors[i].mensajes.remove(mensaje);
			}
			Mensaje[] lMensajess = mensaje.mensajes.toArray();
			for(int i = 0; i < lMensajess.length; i++) {
				lMensajess[i].respondido_por.remove(mensaje);
			}
			return delete(mensaje);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Mensaje mensaje, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (mensaje.getVideos() != null) {
				mensaje.getVideos().contiene_video.remove(mensaje);
			}
			
			if (mensaje.getEnvia() != null) {
				mensaje.getEnvia().pertenece.remove(mensaje);
			}
			
			if (mensaje.getMensaje_() != null) {
				mensaje.getMensaje_().compone.remove(mensaje);
			}
			
			Reporte[] lCorrespondens = mensaje.corresponden.toArray();
			for(int i = 0; i < lCorrespondens.length; i++) {
				lCorrespondens[i].setEs_reportado(null);
			}
			Imagen[] lImagens = mensaje.imagen.toArray();
			for(int i = 0; i < lImagens.length; i++) {
				lImagens[i].contiene_imagen.remove(mensaje);
			}
			Mensaje[] lRespondido_pors = mensaje.respondido_por.toArray();
			for(int i = 0; i < lRespondido_pors.length; i++) {
				lRespondido_pors[i].mensajes.remove(mensaje);
			}
			Mensaje[] lMensajess = mensaje.mensajes.toArray();
			for(int i = 0; i < lMensajess.length; i++) {
				lMensajess[i].respondido_por.remove(mensaje);
			}
			try {
				session.delete(mensaje);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Mensaje mensaje) throws PersistentException {
		try {
			MDS1PersistentManager.instance().getSession().refresh(mensaje);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Mensaje mensaje) throws PersistentException {
		try {
			MDS1PersistentManager.instance().getSession().evict(mensaje);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Mensaje loadMensajeByCriteria(MensajeCriteria mensajeCriteria) {
		Mensaje[] mensajes = listMensajeByCriteria(mensajeCriteria);
		if(mensajes == null || mensajes.length == 0) {
			return null;
		}
		return mensajes[0];
	}
	
	public static Mensaje[] listMensajeByCriteria(MensajeCriteria mensajeCriteria) {
		return mensajeCriteria.listMensaje();
	}
}
