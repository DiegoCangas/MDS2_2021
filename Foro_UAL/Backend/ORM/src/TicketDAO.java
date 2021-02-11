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

public class TicketDAO {
	public static Ticket loadTicketByORMID(Long idticket) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadTicketByORMID(session, idticket);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket getTicketByORMID(Long idticket) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return getTicketByORMID(session, idticket);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket loadTicketByORMID(Long idticket, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadTicketByORMID(session, idticket, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket getTicketByORMID(Long idticket, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return getTicketByORMID(session, idticket, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket loadTicketByORMID(PersistentSession session, Long idticket) throws PersistentException {
		try {
			return (Ticket) session.load(Ticket.class, idticket);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket getTicketByORMID(PersistentSession session, Long idticket) throws PersistentException {
		try {
			return (Ticket) session.get(Ticket.class, idticket);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket loadTicketByORMID(PersistentSession session, Long idticket, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Ticket) session.load(Ticket.class, idticket, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket getTicketByORMID(PersistentSession session, Long idticket, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Ticket) session.get(Ticket.class, idticket, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTicket(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return queryTicket(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTicket(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return queryTicket(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket[] listTicketByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return listTicketByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket[] listTicketByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return listTicketByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTicket(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Ticket as Ticket");
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
	
	public static List queryTicket(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Ticket as Ticket");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Ticket", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket[] listTicketByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTicket(session, condition, orderBy);
			return (Ticket[]) list.toArray(new Ticket[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket[] listTicketByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTicket(session, condition, orderBy, lockMode);
			return (Ticket[]) list.toArray(new Ticket[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket loadTicketByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadTicketByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket loadTicketByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadTicketByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket loadTicketByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Ticket[] tickets = listTicketByQuery(session, condition, orderBy);
		if (tickets != null && tickets.length > 0)
			return tickets[0];
		else
			return null;
	}
	
	public static Ticket loadTicketByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Ticket[] tickets = listTicketByQuery(session, condition, orderBy, lockMode);
		if (tickets != null && tickets.length > 0)
			return tickets[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTicketByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return iterateTicketByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTicketByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return iterateTicketByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTicketByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Ticket as Ticket");
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
	
	public static java.util.Iterator iterateTicketByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Ticket as Ticket");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Ticket", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket createTicket() {
		return new Ticket();
	}
	
	public static boolean save(Ticket ticket) throws PersistentException {
		try {
			MDS1PersistentManager.instance().saveObject(ticket);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Ticket ticket) throws PersistentException {
		try {
			MDS1PersistentManager.instance().deleteObject(ticket);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Ticket ticket)throws PersistentException {
		try {
			if (ticket.getEnvia() != null) {
				ticket.getEnvia().es_enviado.remove(ticket);
			}
			
			Usuario[] lTienes = ticket.tiene.toArray();
			for(int i = 0; i < lTienes.length; i++) {
				lTienes[i].setPertenece_a(null);
			}
			Administradores[] lRecibes = ticket.recibe.toArray();
			for(int i = 0; i < lRecibes.length; i++) {
				lRecibes[i].son_recibidos.remove(ticket);
			}
			return delete(ticket);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Ticket ticket, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (ticket.getEnvia() != null) {
				ticket.getEnvia().es_enviado.remove(ticket);
			}
			
			Usuario[] lTienes = ticket.tiene.toArray();
			for(int i = 0; i < lTienes.length; i++) {
				lTienes[i].setPertenece_a(null);
			}
			Administradores[] lRecibes = ticket.recibe.toArray();
			for(int i = 0; i < lRecibes.length; i++) {
				lRecibes[i].son_recibidos.remove(ticket);
			}
			try {
				session.delete(ticket);
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
	
	public static boolean refresh(Ticket ticket) throws PersistentException {
		try {
			MDS1PersistentManager.instance().getSession().refresh(ticket);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Ticket ticket) throws PersistentException {
		try {
			MDS1PersistentManager.instance().getSession().evict(ticket);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket loadTicketByCriteria(TicketCriteria ticketCriteria) {
		Ticket[] tickets = listTicketByCriteria(ticketCriteria);
		if(tickets == null || tickets.length == 0) {
			return null;
		}
		return tickets[0];
	}
	
	public static Ticket[] listTicketByCriteria(TicketCriteria ticketCriteria) {
		return ticketCriteria.listTicket();
	}
}
