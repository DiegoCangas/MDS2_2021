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
package com.MDS2.ForoUal.Backend.ORM.src;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class TemaDAO {
	public static Tema loadTemaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession();
			return loadTemaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema getTemaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession();
			return getTemaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema loadTemaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession();
			return loadTemaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema getTemaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession();
			return getTemaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema loadTemaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Tema) session.load(com.MDS2.ForoUal.Backend.ORM.src.Tema.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema getTemaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Tema) session.get(com.MDS2.ForoUal.Backend.ORM.src.Tema.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema loadTemaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tema) session.load(com.MDS2.ForoUal.Backend.ORM.src.Tema.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema getTemaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tema) session.get(com.MDS2.ForoUal.Backend.ORM.src.Tema.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTema(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession();
			return queryTema(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTema(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession();
			return queryTema(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema[] listTemaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession();
			return listTemaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema[] listTemaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession();
			return listTemaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTema(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.MDS2.ForoUal.Backend.ORM.src.Tema as Tema");
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
	
	public static List queryTema(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.MDS2.ForoUal.Backend.ORM.src.Tema as Tema");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tema", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema[] listTemaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTema(session, condition, orderBy);
			return (Tema[]) list.toArray(new Tema[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema[] listTemaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTema(session, condition, orderBy, lockMode);
			return (Tema[]) list.toArray(new Tema[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema loadTemaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession();
			return loadTemaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema loadTemaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession();
			return loadTemaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema loadTemaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Tema[] temas = listTemaByQuery(session, condition, orderBy);
		if (temas != null && temas.length > 0)
			return temas[0];
		else
			return null;
	}
	
	public static Tema loadTemaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Tema[] temas = listTemaByQuery(session, condition, orderBy, lockMode);
		if (temas != null && temas.length > 0)
			return temas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTemaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession();
			return iterateTemaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTemaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession();
			return iterateTemaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTemaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.MDS2.ForoUal.Backend.ORM.src.Tema as Tema");
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
	
	public static java.util.Iterator iterateTemaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.MDS2.ForoUal.Backend.ORM.src.Tema as Tema");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tema", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema createTema() {
		return new com.MDS2.ForoUal.Backend.ORM.src.Tema();
	}
	
	public static boolean save(com.MDS2.ForoUal.Backend.ORM.src.Tema tema) throws PersistentException {
		try {
			com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().saveObject(tema);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.MDS2.ForoUal.Backend.ORM.src.Tema tema) throws PersistentException {
		try {
			com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().deleteObject(tema);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.MDS2.ForoUal.Backend.ORM.src.Tema tema)throws PersistentException {
		try {
			if (tema.getCrea_tema() != null) {
				tema.getCrea_tema().es_creado.remove(tema);
			}
			
			if (tema.getContiene() != null) {
				tema.getContiene().temas.remove(tema);
			}
			
			com.MDS2.ForoUal.Backend.ORM.src.Mensaje[] lCompones = tema.compone.toArray();
			for(int i = 0; i < lCompones.length; i++) {
				lCompones[i].setMensaje_(null);
			}
			com.MDS2.ForoUal.Backend.ORM.src.Usuario[] lGustaTemas = tema.gustaTema.toArray();
			for(int i = 0; i < lGustaTemas.length; i++) {
				lGustaTemas[i].megusta_tema.remove(tema);
			}
			return delete(tema);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.MDS2.ForoUal.Backend.ORM.src.Tema tema, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (tema.getCrea_tema() != null) {
				tema.getCrea_tema().es_creado.remove(tema);
			}
			
			if (tema.getContiene() != null) {
				tema.getContiene().temas.remove(tema);
			}
			
			com.MDS2.ForoUal.Backend.ORM.src.Mensaje[] lCompones = tema.compone.toArray();
			for(int i = 0; i < lCompones.length; i++) {
				lCompones[i].setMensaje_(null);
			}
			com.MDS2.ForoUal.Backend.ORM.src.Usuario[] lGustaTemas = tema.gustaTema.toArray();
			for(int i = 0; i < lGustaTemas.length; i++) {
				lGustaTemas[i].megusta_tema.remove(tema);
			}
			try {
				session.delete(tema);
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
	
	public static boolean refresh(com.MDS2.ForoUal.Backend.ORM.src.Tema tema) throws PersistentException {
		try {
			com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession().refresh(tema);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.MDS2.ForoUal.Backend.ORM.src.Tema tema) throws PersistentException {
		try {
			com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession().evict(tema);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tema loadTemaByCriteria(TemaCriteria temaCriteria) {
		Tema[] temas = listTemaByCriteria(temaCriteria);
		if(temas == null || temas.length == 0) {
			return null;
		}
		return temas[0];
	}
	
	public static Tema[] listTemaByCriteria(TemaCriteria temaCriteria) {
		return temaCriteria.listTema();
	}
}
