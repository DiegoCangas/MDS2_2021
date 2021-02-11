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

public class AdministradoresDAO {
	public static Administradores loadAdministradoresByORMID(long ID) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadAdministradoresByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administradores getAdministradoresByORMID(long ID) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return getAdministradoresByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administradores loadAdministradoresByORMID(long ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadAdministradoresByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administradores getAdministradoresByORMID(long ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return getAdministradoresByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administradores loadAdministradoresByORMID(PersistentSession session, long ID) throws PersistentException {
		try {
			return (Administradores) session.load(Administradores.class, new Long(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administradores getAdministradoresByORMID(PersistentSession session, long ID) throws PersistentException {
		try {
			return (Administradores) session.get(Administradores.class, new Long(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administradores loadAdministradoresByORMID(PersistentSession session, long ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Administradores) session.load(Administradores.class, new Long(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administradores getAdministradoresByORMID(PersistentSession session, long ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Administradores) session.get(Administradores.class, new Long(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministradores(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return queryAdministradores(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministradores(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return queryAdministradores(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administradores[] listAdministradoresByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return listAdministradoresByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administradores[] listAdministradoresByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return listAdministradoresByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministradores(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Administradores as Administradores");
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
	
	public static List queryAdministradores(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Administradores as Administradores");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Administradores", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administradores[] listAdministradoresByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAdministradores(session, condition, orderBy);
			return (Administradores[]) list.toArray(new Administradores[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administradores[] listAdministradoresByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAdministradores(session, condition, orderBy, lockMode);
			return (Administradores[]) list.toArray(new Administradores[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administradores loadAdministradoresByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadAdministradoresByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administradores loadAdministradoresByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadAdministradoresByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administradores loadAdministradoresByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Administradores[] administradoreses = listAdministradoresByQuery(session, condition, orderBy);
		if (administradoreses != null && administradoreses.length > 0)
			return administradoreses[0];
		else
			return null;
	}
	
	public static Administradores loadAdministradoresByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Administradores[] administradoreses = listAdministradoresByQuery(session, condition, orderBy, lockMode);
		if (administradoreses != null && administradoreses.length > 0)
			return administradoreses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAdministradoresByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return iterateAdministradoresByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministradoresByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return iterateAdministradoresByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministradoresByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Administradores as Administradores");
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
	
	public static java.util.Iterator iterateAdministradoresByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Administradores as Administradores");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Administradores", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administradores createAdministradores() {
		return new Administradores();
	}
	
	public static boolean save(Administradores administradores) throws PersistentException {
		try {
			MDS1PersistentManager.instance().saveObject(administradores);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Administradores administradores) throws PersistentException {
		try {
			MDS1PersistentManager.instance().deleteObject(administradores);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Administradores administradores)throws PersistentException {
		try {
			Ticket[] lSon_recibidoss = administradores.son_recibidos.toArray();
			for(int i = 0; i < lSon_recibidoss.length; i++) {
				lSon_recibidoss[i].recibe.remove(administradores);
			}
			Seccion[] lEs_creadas = administradores.es_creada.toArray();
			for(int i = 0; i < lEs_creadas.length; i++) {
				lEs_creadas[i].setCrea(null);
			}
			Tema[] lTemass = administradores.temas.toArray();
			for(int i = 0; i < lTemass.length; i++) {
				lTemass[i].setOculta(null);
			}
			Ticket[] lEs_enviados = administradores.es_enviado.toArray();
			for(int i = 0; i < lEs_enviados.length; i++) {
				lEs_enviados[i].setEnvia(null);
			}
			if (administradores.getPertenece_a() != null) {
				administradores.getPertenece_a().tiene.remove(administradores);
			}
			
			Reporte[] lReportess = administradores.reportes.toArray();
			for(int i = 0; i < lReportess.length; i++) {
				lReportess[i].setUsuario(null);
			}
			Usuario[] lAmigo_des = administradores.amigo_de.toArray();
			for(int i = 0; i < lAmigo_des.length; i++) {
				lAmigo_des[i].usuarios.remove(administradores);
			}
			Mensaje[] lPerteneces = administradores.pertenece.toArray();
			for(int i = 0; i < lPerteneces.length; i++) {
				lPerteneces[i].setEnvia(null);
			}
			Usuario[] lUsuarioss = administradores.usuarios.toArray();
			for(int i = 0; i < lUsuarioss.length; i++) {
				lUsuarioss[i].amigo_de.remove(administradores);
			}
			Tema[] lEs_creados = administradores.es_creado.toArray();
			for(int i = 0; i < lEs_creados.length; i++) {
				lEs_creados[i].setCrea_temas(null);
			}
			return delete(administradores);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Administradores administradores, org.orm.PersistentSession session)throws PersistentException {
		try {
			Ticket[] lSon_recibidoss = administradores.son_recibidos.toArray();
			for(int i = 0; i < lSon_recibidoss.length; i++) {
				lSon_recibidoss[i].recibe.remove(administradores);
			}
			Seccion[] lEs_creadas = administradores.es_creada.toArray();
			for(int i = 0; i < lEs_creadas.length; i++) {
				lEs_creadas[i].setCrea(null);
			}
			Tema[] lTemass = administradores.temas.toArray();
			for(int i = 0; i < lTemass.length; i++) {
				lTemass[i].setOculta(null);
			}
			Ticket[] lEs_enviados = administradores.es_enviado.toArray();
			for(int i = 0; i < lEs_enviados.length; i++) {
				lEs_enviados[i].setEnvia(null);
			}
			if (administradores.getPertenece_a() != null) {
				administradores.getPertenece_a().tiene.remove(administradores);
			}
			
			Reporte[] lReportess = administradores.reportes.toArray();
			for(int i = 0; i < lReportess.length; i++) {
				lReportess[i].setUsuario(null);
			}
			Usuario[] lAmigo_des = administradores.amigo_de.toArray();
			for(int i = 0; i < lAmigo_des.length; i++) {
				lAmigo_des[i].usuarios.remove(administradores);
			}
			Mensaje[] lPerteneces = administradores.pertenece.toArray();
			for(int i = 0; i < lPerteneces.length; i++) {
				lPerteneces[i].setEnvia(null);
			}
			Usuario[] lUsuarioss = administradores.usuarios.toArray();
			for(int i = 0; i < lUsuarioss.length; i++) {
				lUsuarioss[i].amigo_de.remove(administradores);
			}
			Tema[] lEs_creados = administradores.es_creado.toArray();
			for(int i = 0; i < lEs_creados.length; i++) {
				lEs_creados[i].setCrea_temas(null);
			}
			try {
				session.delete(administradores);
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
	
	public static boolean refresh(Administradores administradores) throws PersistentException {
		try {
			MDS1PersistentManager.instance().getSession().refresh(administradores);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Administradores administradores) throws PersistentException {
		try {
			MDS1PersistentManager.instance().getSession().evict(administradores);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administradores loadAdministradoresByCriteria(AdministradoresCriteria administradoresCriteria) {
		Administradores[] administradoreses = listAdministradoresByCriteria(administradoresCriteria);
		if(administradoreses == null || administradoreses.length == 0) {
			return null;
		}
		return administradoreses[0];
	}
	
	public static Administradores[] listAdministradoresByCriteria(AdministradoresCriteria administradoresCriteria) {
		return administradoresCriteria.listAdministradores();
	}
}
