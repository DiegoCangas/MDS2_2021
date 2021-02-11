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

public class ModeradoresDAO {
	public static Moderadores loadModeradoresByORMID(long ID) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadModeradoresByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderadores getModeradoresByORMID(long ID) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return getModeradoresByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderadores loadModeradoresByORMID(long ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadModeradoresByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderadores getModeradoresByORMID(long ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return getModeradoresByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderadores loadModeradoresByORMID(PersistentSession session, long ID) throws PersistentException {
		try {
			return (Moderadores) session.load(Moderadores.class, new Long(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderadores getModeradoresByORMID(PersistentSession session, long ID) throws PersistentException {
		try {
			return (Moderadores) session.get(Moderadores.class, new Long(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderadores loadModeradoresByORMID(PersistentSession session, long ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Moderadores) session.load(Moderadores.class, new Long(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderadores getModeradoresByORMID(PersistentSession session, long ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Moderadores) session.get(Moderadores.class, new Long(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryModeradores(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return queryModeradores(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryModeradores(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return queryModeradores(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderadores[] listModeradoresByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return listModeradoresByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderadores[] listModeradoresByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return listModeradoresByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryModeradores(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Moderadores as Moderadores");
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
	
	public static List queryModeradores(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Moderadores as Moderadores");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Moderadores", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderadores[] listModeradoresByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryModeradores(session, condition, orderBy);
			return (Moderadores[]) list.toArray(new Moderadores[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderadores[] listModeradoresByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryModeradores(session, condition, orderBy, lockMode);
			return (Moderadores[]) list.toArray(new Moderadores[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderadores loadModeradoresByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadModeradoresByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderadores loadModeradoresByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadModeradoresByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderadores loadModeradoresByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Moderadores[] moderadoreses = listModeradoresByQuery(session, condition, orderBy);
		if (moderadoreses != null && moderadoreses.length > 0)
			return moderadoreses[0];
		else
			return null;
	}
	
	public static Moderadores loadModeradoresByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Moderadores[] moderadoreses = listModeradoresByQuery(session, condition, orderBy, lockMode);
		if (moderadoreses != null && moderadoreses.length > 0)
			return moderadoreses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateModeradoresByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return iterateModeradoresByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateModeradoresByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return iterateModeradoresByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateModeradoresByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Moderadores as Moderadores");
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
	
	public static java.util.Iterator iterateModeradoresByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Moderadores as Moderadores");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Moderadores", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderadores createModeradores() {
		return new Moderadores();
	}
	
	public static boolean save(Moderadores moderadores) throws PersistentException {
		try {
			MDS1PersistentManager.instance().saveObject(moderadores);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Moderadores moderadores) throws PersistentException {
		try {
			MDS1PersistentManager.instance().deleteObject(moderadores);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Moderadores moderadores) throws PersistentException {
		try {
			MDS1PersistentManager.instance().getSession().refresh(moderadores);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Moderadores moderadores) throws PersistentException {
		try {
			MDS1PersistentManager.instance().getSession().evict(moderadores);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Moderadores loadModeradoresByCriteria(ModeradoresCriteria moderadoresCriteria) {
		Moderadores[] moderadoreses = listModeradoresByCriteria(moderadoresCriteria);
		if(moderadoreses == null || moderadoreses.length == 0) {
			return null;
		}
		return moderadoreses[0];
	}
	
	public static Moderadores[] listModeradoresByCriteria(ModeradoresCriteria moderadoresCriteria) {
		return moderadoresCriteria.listModeradores();
	}
}
