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

public class ModeradorDAO {
	public static Moderador loadModeradorByORMID(long ID) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadModeradorByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador getModeradorByORMID(long ID) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return getModeradorByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador loadModeradorByORMID(long ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadModeradorByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador getModeradorByORMID(long ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return getModeradorByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador loadModeradorByORMID(PersistentSession session, long ID) throws PersistentException {
		try {
			return (Moderador) session.load(Moderador.class, new Long(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador getModeradorByORMID(PersistentSession session, long ID) throws PersistentException {
		try {
			return (Moderador) session.get(Moderador.class, new Long(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador loadModeradorByORMID(PersistentSession session, long ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Moderador) session.load(Moderador.class, new Long(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador getModeradorByORMID(PersistentSession session, long ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Moderador) session.get(Moderador.class, new Long(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryModerador(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return queryModerador(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryModerador(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return queryModerador(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador[] listModeradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return listModeradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador[] listModeradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return listModeradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryModerador(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Moderador as Moderador");
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
	
	public static List queryModerador(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Moderador as Moderador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Moderador", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador[] listModeradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryModerador(session, condition, orderBy);
			return (Moderador[]) list.toArray(new Moderador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador[] listModeradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryModerador(session, condition, orderBy, lockMode);
			return (Moderador[]) list.toArray(new Moderador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador loadModeradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadModeradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador loadModeradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadModeradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador loadModeradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Moderador[] moderadors = listModeradorByQuery(session, condition, orderBy);
		if (moderadors != null && moderadors.length > 0)
			return moderadors[0];
		else
			return null;
	}
	
	public static Moderador loadModeradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Moderador[] moderadors = listModeradorByQuery(session, condition, orderBy, lockMode);
		if (moderadors != null && moderadors.length > 0)
			return moderadors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateModeradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return iterateModeradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateModeradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return iterateModeradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateModeradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Moderador as Moderador");
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
	
	public static java.util.Iterator iterateModeradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Moderador as Moderador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Moderador", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador createModerador() {
		return new Moderador();
	}
	
	public static boolean save(Moderador moderador) throws PersistentException {
		try {
			MDS1PersistentManager.instance().saveObject(moderador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Moderador moderador) throws PersistentException {
		try {
			MDS1PersistentManager.instance().deleteObject(moderador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Moderador moderador)throws PersistentException {
		if (moderador instanceof Administradores) {
			return AdministradoresDAO.deleteAndDissociate((Administradores) moderador);
		}
		
		try {
			Tema[] lTemass = moderador.temas.toArray();
			for(int i = 0; i < lTemass.length; i++) {
				lTemass[i].setOculta(null);
			}
			Ticket[] lEs_enviados = moderador.es_enviado.toArray();
			for(int i = 0; i < lEs_enviados.length; i++) {
				lEs_enviados[i].setEnvia(null);
			}
			if (moderador.getPertenece_a() != null) {
				moderador.getPertenece_a().tiene.remove(moderador);
			}
			
			Reporte[] lReportess = moderador.reportes.toArray();
			for(int i = 0; i < lReportess.length; i++) {
				lReportess[i].setUsuario(null);
			}
			Usuario[] lAmigo_des = moderador.amigo_de.toArray();
			for(int i = 0; i < lAmigo_des.length; i++) {
				lAmigo_des[i].usuarios.remove(moderador);
			}
			Mensaje[] lPerteneces = moderador.pertenece.toArray();
			for(int i = 0; i < lPerteneces.length; i++) {
				lPerteneces[i].setEnvia(null);
			}
			Usuario[] lUsuarioss = moderador.usuarios.toArray();
			for(int i = 0; i < lUsuarioss.length; i++) {
				lUsuarioss[i].amigo_de.remove(moderador);
			}
			Tema[] lEs_creados = moderador.es_creado.toArray();
			for(int i = 0; i < lEs_creados.length; i++) {
				lEs_creados[i].setCrea_temas(null);
			}
			return delete(moderador);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Moderador moderador, org.orm.PersistentSession session)throws PersistentException {
		if (moderador instanceof Administradores) {
			return AdministradoresDAO.deleteAndDissociate((Administradores) moderador, session);
		}
		
		try {
			Tema[] lTemass = moderador.temas.toArray();
			for(int i = 0; i < lTemass.length; i++) {
				lTemass[i].setOculta(null);
			}
			Ticket[] lEs_enviados = moderador.es_enviado.toArray();
			for(int i = 0; i < lEs_enviados.length; i++) {
				lEs_enviados[i].setEnvia(null);
			}
			if (moderador.getPertenece_a() != null) {
				moderador.getPertenece_a().tiene.remove(moderador);
			}
			
			Reporte[] lReportess = moderador.reportes.toArray();
			for(int i = 0; i < lReportess.length; i++) {
				lReportess[i].setUsuario(null);
			}
			Usuario[] lAmigo_des = moderador.amigo_de.toArray();
			for(int i = 0; i < lAmigo_des.length; i++) {
				lAmigo_des[i].usuarios.remove(moderador);
			}
			Mensaje[] lPerteneces = moderador.pertenece.toArray();
			for(int i = 0; i < lPerteneces.length; i++) {
				lPerteneces[i].setEnvia(null);
			}
			Usuario[] lUsuarioss = moderador.usuarios.toArray();
			for(int i = 0; i < lUsuarioss.length; i++) {
				lUsuarioss[i].amigo_de.remove(moderador);
			}
			Tema[] lEs_creados = moderador.es_creado.toArray();
			for(int i = 0; i < lEs_creados.length; i++) {
				lEs_creados[i].setCrea_temas(null);
			}
			try {
				session.delete(moderador);
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
	
	public static boolean refresh(Moderador moderador) throws PersistentException {
		try {
			MDS1PersistentManager.instance().getSession().refresh(moderador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Moderador moderador) throws PersistentException {
		try {
			MDS1PersistentManager.instance().getSession().evict(moderador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderador loadModeradorByCriteria(ModeradorCriteria moderadorCriteria) {
		Moderador[] moderadors = listModeradorByCriteria(moderadorCriteria);
		if(moderadors == null || moderadors.length == 0) {
			return null;
		}
		return moderadors[0];
	}
	
	public static Moderador[] listModeradorByCriteria(ModeradorCriteria moderadorCriteria) {
		return moderadorCriteria.listModerador();
	}
}
