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

public class ReporteDAO {
	public static Reporte loadReporteByORMID(int idReporte) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadReporteByORMID(session, idReporte);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte getReporteByORMID(int idReporte) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return getReporteByORMID(session, idReporte);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte loadReporteByORMID(int idReporte, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadReporteByORMID(session, idReporte, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte getReporteByORMID(int idReporte, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return getReporteByORMID(session, idReporte, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte loadReporteByORMID(PersistentSession session, int idReporte) throws PersistentException {
		try {
			return (Reporte) session.load(Reporte.class, new Integer(idReporte));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte getReporteByORMID(PersistentSession session, int idReporte) throws PersistentException {
		try {
			return (Reporte) session.get(Reporte.class, new Integer(idReporte));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte loadReporteByORMID(PersistentSession session, int idReporte, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Reporte) session.load(Reporte.class, new Integer(idReporte), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte getReporteByORMID(PersistentSession session, int idReporte, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Reporte) session.get(Reporte.class, new Integer(idReporte), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryReporte(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return queryReporte(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryReporte(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return queryReporte(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte[] listReporteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return listReporteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte[] listReporteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return listReporteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryReporte(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Reporte as Reporte");
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
	
	public static List queryReporte(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Reporte as Reporte");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Reporte", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte[] listReporteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryReporte(session, condition, orderBy);
			return (Reporte[]) list.toArray(new Reporte[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte[] listReporteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryReporte(session, condition, orderBy, lockMode);
			return (Reporte[]) list.toArray(new Reporte[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte loadReporteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadReporteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte loadReporteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadReporteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte loadReporteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Reporte[] reportes = listReporteByQuery(session, condition, orderBy);
		if (reportes != null && reportes.length > 0)
			return reportes[0];
		else
			return null;
	}
	
	public static Reporte loadReporteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Reporte[] reportes = listReporteByQuery(session, condition, orderBy, lockMode);
		if (reportes != null && reportes.length > 0)
			return reportes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateReporteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return iterateReporteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateReporteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return iterateReporteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateReporteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Reporte as Reporte");
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
	
	public static java.util.Iterator iterateReporteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Reporte as Reporte");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Reporte", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte createReporte() {
		return new Reporte();
	}
	
	public static boolean save(Reporte reporte) throws PersistentException {
		try {
			MDS1PersistentManager.instance().saveObject(reporte);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Reporte reporte) throws PersistentException {
		try {
			MDS1PersistentManager.instance().deleteObject(reporte);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Reporte reporte)throws PersistentException {
		try {
			if (reporte.getEs_reportado() != null) {
				reporte.getEs_reportado().corresponden.remove(reporte);
			}
			
			if (reporte.getUsuario() != null) {
				reporte.getUsuario().reportes.remove(reporte);
			}
			
			return delete(reporte);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Reporte reporte, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (reporte.getEs_reportado() != null) {
				reporte.getEs_reportado().corresponden.remove(reporte);
			}
			
			if (reporte.getUsuario() != null) {
				reporte.getUsuario().reportes.remove(reporte);
			}
			
			try {
				session.delete(reporte);
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
	
	public static boolean refresh(Reporte reporte) throws PersistentException {
		try {
			MDS1PersistentManager.instance().getSession().refresh(reporte);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Reporte reporte) throws PersistentException {
		try {
			MDS1PersistentManager.instance().getSession().evict(reporte);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reporte loadReporteByCriteria(ReporteCriteria reporteCriteria) {
		Reporte[] reportes = listReporteByCriteria(reporteCriteria);
		if(reportes == null || reportes.length == 0) {
			return null;
		}
		return reportes[0];
	}
	
	public static Reporte[] listReporteByCriteria(ReporteCriteria reporteCriteria) {
		return reporteCriteria.listReporte();
	}
}
