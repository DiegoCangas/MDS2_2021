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

public class AdministradorDAO {
	public static Administrador loadAdministradorByORMID(long ID) throws PersistentException {
		try {
			PersistentSession session = com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession();
			return loadAdministradorByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador getAdministradorByORMID(long ID) throws PersistentException {
		try {
			PersistentSession session = com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession();
			return getAdministradorByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByORMID(long ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession();
			return loadAdministradorByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador getAdministradorByORMID(long ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession();
			return getAdministradorByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByORMID(PersistentSession session, long ID) throws PersistentException {
		try {
			return (Administrador) session.load(com.MDS2.ForoUal.Backend.ORM.src.Administrador.class, new Long(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador getAdministradorByORMID(PersistentSession session, long ID) throws PersistentException {
		try {
			return (Administrador) session.get(com.MDS2.ForoUal.Backend.ORM.src.Administrador.class, new Long(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByORMID(PersistentSession session, long ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Administrador) session.load(com.MDS2.ForoUal.Backend.ORM.src.Administrador.class, new Long(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador getAdministradorByORMID(PersistentSession session, long ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Administrador) session.get(com.MDS2.ForoUal.Backend.ORM.src.Administrador.class, new Long(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrador(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession();
			return queryAdministrador(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrador(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession();
			return queryAdministrador(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador[] listAdministradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession();
			return listAdministradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador[] listAdministradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession();
			return listAdministradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrador(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.MDS2.ForoUal.Backend.ORM.src.Administrador as Administrador");
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
	
	public static List queryAdministrador(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.MDS2.ForoUal.Backend.ORM.src.Administrador as Administrador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Administrador", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador[] listAdministradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAdministrador(session, condition, orderBy);
			return (Administrador[]) list.toArray(new Administrador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador[] listAdministradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAdministrador(session, condition, orderBy, lockMode);
			return (Administrador[]) list.toArray(new Administrador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession();
			return loadAdministradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession();
			return loadAdministradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Administrador[] administradors = listAdministradorByQuery(session, condition, orderBy);
		if (administradors != null && administradors.length > 0)
			return administradors[0];
		else
			return null;
	}
	
	public static Administrador loadAdministradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Administrador[] administradors = listAdministradorByQuery(session, condition, orderBy, lockMode);
		if (administradors != null && administradors.length > 0)
			return administradors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAdministradorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession();
			return iterateAdministradorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministradorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession();
			return iterateAdministradorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministradorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.MDS2.ForoUal.Backend.ORM.src.Administrador as Administrador");
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
	
	public static java.util.Iterator iterateAdministradorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.MDS2.ForoUal.Backend.ORM.src.Administrador as Administrador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Administrador", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador createAdministrador() {
		return new com.MDS2.ForoUal.Backend.ORM.src.Administrador();
	}
	
	public static boolean save(com.MDS2.ForoUal.Backend.ORM.src.Administrador administrador) throws PersistentException {
		try {
			com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().saveObject(administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.MDS2.ForoUal.Backend.ORM.src.Administrador administrador) throws PersistentException {
		try {
			com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().deleteObject(administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.MDS2.ForoUal.Backend.ORM.src.Administrador administrador)throws PersistentException {
		try {
			com.MDS2.ForoUal.Backend.ORM.src.Seccion[] lEs_creadas = administrador.es_creada.toArray();
			for(int i = 0; i < lEs_creadas.length; i++) {
				lEs_creadas[i].setCrea(null);
			}
			com.MDS2.ForoUal.Backend.ORM.src.Reporte[] lReportes_usuarios = administrador.reportes_usuario.toArray();
			for(int i = 0; i < lReportes_usuarios.length; i++) {
				lReportes_usuarios[i].setUsuario_reporte(null);
			}
			com.MDS2.ForoUal.Backend.ORM.src.Usuario[] lAmigo_des = administrador.amigo_de.toArray();
			for(int i = 0; i < lAmigo_des.length; i++) {
				lAmigo_des[i].usuarios.remove(administrador);
			}
			com.MDS2.ForoUal.Backend.ORM.src.Mensaje[] lPerteneces = administrador.pertenece.toArray();
			for(int i = 0; i < lPerteneces.length; i++) {
				lPerteneces[i].setEnvia_mensaje(null);
			}
			com.MDS2.ForoUal.Backend.ORM.src.Usuario[] lUsuarioss = administrador.usuarios.toArray();
			for(int i = 0; i < lUsuarioss.length; i++) {
				lUsuarioss[i].amigo_de.remove(administrador);
			}
			com.MDS2.ForoUal.Backend.ORM.src.Tema[] lEs_creados = administrador.es_creado.toArray();
			for(int i = 0; i < lEs_creados.length; i++) {
				lEs_creados[i].setCrea_tema(null);
			}
			com.MDS2.ForoUal.Backend.ORM.src.Notificacion[] lNotificacion_usuarios = administrador.notificacion_usuario.toArray();
			for(int i = 0; i < lNotificacion_usuarios.length; i++) {
				lNotificacion_usuarios[i].setUsuario_ticket(null);
			}
			com.MDS2.ForoUal.Backend.ORM.src.Mensaje[] lMegustas = administrador.megusta.toArray();
			for(int i = 0; i < lMegustas.length; i++) {
				lMegustas[i].gustaMensaje.remove(administrador);
			}
			com.MDS2.ForoUal.Backend.ORM.src.Tema[] lMegusta_temas = administrador.megusta_tema.toArray();
			for(int i = 0; i < lMegusta_temas.length; i++) {
				lMegusta_temas[i].gustaTema.remove(administrador);
			}
			return delete(administrador);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.MDS2.ForoUal.Backend.ORM.src.Administrador administrador, org.orm.PersistentSession session)throws PersistentException {
		try {
			com.MDS2.ForoUal.Backend.ORM.src.Seccion[] lEs_creadas = administrador.es_creada.toArray();
			for(int i = 0; i < lEs_creadas.length; i++) {
				lEs_creadas[i].setCrea(null);
			}
			com.MDS2.ForoUal.Backend.ORM.src.Reporte[] lReportes_usuarios = administrador.reportes_usuario.toArray();
			for(int i = 0; i < lReportes_usuarios.length; i++) {
				lReportes_usuarios[i].setUsuario_reporte(null);
			}
			com.MDS2.ForoUal.Backend.ORM.src.Usuario[] lAmigo_des = administrador.amigo_de.toArray();
			for(int i = 0; i < lAmigo_des.length; i++) {
				lAmigo_des[i].usuarios.remove(administrador);
			}
			com.MDS2.ForoUal.Backend.ORM.src.Mensaje[] lPerteneces = administrador.pertenece.toArray();
			for(int i = 0; i < lPerteneces.length; i++) {
				lPerteneces[i].setEnvia_mensaje(null);
			}
			com.MDS2.ForoUal.Backend.ORM.src.Usuario[] lUsuarioss = administrador.usuarios.toArray();
			for(int i = 0; i < lUsuarioss.length; i++) {
				lUsuarioss[i].amigo_de.remove(administrador);
			}
			com.MDS2.ForoUal.Backend.ORM.src.Tema[] lEs_creados = administrador.es_creado.toArray();
			for(int i = 0; i < lEs_creados.length; i++) {
				lEs_creados[i].setCrea_tema(null);
			}
			com.MDS2.ForoUal.Backend.ORM.src.Notificacion[] lNotificacion_usuarios = administrador.notificacion_usuario.toArray();
			for(int i = 0; i < lNotificacion_usuarios.length; i++) {
				lNotificacion_usuarios[i].setUsuario_ticket(null);
			}
			com.MDS2.ForoUal.Backend.ORM.src.Mensaje[] lMegustas = administrador.megusta.toArray();
			for(int i = 0; i < lMegustas.length; i++) {
				lMegustas[i].gustaMensaje.remove(administrador);
			}
			com.MDS2.ForoUal.Backend.ORM.src.Tema[] lMegusta_temas = administrador.megusta_tema.toArray();
			for(int i = 0; i < lMegusta_temas.length; i++) {
				lMegusta_temas[i].gustaTema.remove(administrador);
			}
			try {
				session.delete(administrador);
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
	
	public static boolean refresh(com.MDS2.ForoUal.Backend.ORM.src.Administrador administrador) throws PersistentException {
		try {
			com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession().refresh(administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.MDS2.ForoUal.Backend.ORM.src.Administrador administrador) throws PersistentException {
		try {
			com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession().evict(administrador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador loadAdministradorByCriteria(AdministradorCriteria administradorCriteria) {
		Administrador[] administradors = listAdministradorByCriteria(administradorCriteria);
		if(administradors == null || administradors.length == 0) {
			return null;
		}
		return administradors[0];
	}
	
	public static Administrador[] listAdministradorByCriteria(AdministradorCriteria administradorCriteria) {
		return administradorCriteria.listAdministrador();
	}
}
