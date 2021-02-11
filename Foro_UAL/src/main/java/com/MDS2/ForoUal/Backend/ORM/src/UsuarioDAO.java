package com.MDS2.ForoUal.Backend.ORM.src;
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

public class UsuarioDAO {
	public static Usuario loadUsuarioByORMID(long ID) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadUsuarioByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(long ID) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return getUsuarioByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByORMID(long ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadUsuarioByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(long ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return getUsuarioByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByORMID(PersistentSession session, long ID) throws PersistentException {
		try {
			return (Usuario) session.load(Usuario.class, new Long(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(PersistentSession session, long ID) throws PersistentException {
		try {
			return (Usuario) session.get(Usuario.class, new Long(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByORMID(PersistentSession session, long ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario) session.load(Usuario.class, new Long(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario getUsuarioByORMID(PersistentSession session, long ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario) session.get(Usuario.class, new Long(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return queryUsuario(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return queryUsuario(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return listUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return listUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Usuario as Usuario");
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
	
	public static List queryUsuario(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Usuario as Usuario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario(session, condition, orderBy);
			return (Usuario[]) list.toArray(new Usuario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario[] listUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario(session, condition, orderBy, lockMode);
			return (Usuario[]) list.toArray(new Usuario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return loadUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuario[] usuarios = listUsuarioByQuery(session, condition, orderBy);
		if (usuarios != null && usuarios.length > 0)
			return usuarios[0];
		else
			return null;
	}
	
	public static Usuario loadUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuario[] usuarios = listUsuarioByQuery(session, condition, orderBy, lockMode);
		if (usuarios != null && usuarios.length > 0)
			return usuarios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return iterateUsuarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS1PersistentManager.instance().getSession();
			return iterateUsuarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Usuario as Usuario");
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
	
	public static java.util.Iterator iterateUsuarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Usuario as Usuario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario createUsuario() {
		return new Usuario();
	}
	
	public static boolean save(Usuario usuario) throws PersistentException {
		try {
			MDS1PersistentManager.instance().saveObject(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Usuario usuario) throws PersistentException {
		try {
			MDS1PersistentManager.instance().deleteObject(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Usuario usuario)throws PersistentException {
		if (usuario instanceof Administrador) {
			return AdministradorDAO.deleteAndDissociate((Administrador) usuario);
		}
		
		try {
			Reporte[] lReportes_usuarios = usuario.reportes_usuario.toArray();
			for(int i = 0; i < lReportes_usuarios.length; i++) {
				lReportes_usuarios[i].setUsuario_reporte(null);
			}
			Usuario[] lAmigo_des = usuario.amigo_de.toArray();
			for(int i = 0; i < lAmigo_des.length; i++) {
				lAmigo_des[i].usuarios.remove(usuario);
			}
			Mensaje[] lPerteneces = usuario.pertenece.toArray();
			for(int i = 0; i < lPerteneces.length; i++) {
				lPerteneces[i].setEnvia_mensaje(null);
			}
			Usuario[] lUsuarioss = usuario.usuarios.toArray();
			for(int i = 0; i < lUsuarioss.length; i++) {
				lUsuarioss[i].amigo_de.remove(usuario);
			}
			Tema[] lEs_creados = usuario.es_creado.toArray();
			for(int i = 0; i < lEs_creados.length; i++) {
				lEs_creados[i].setCrea_tema(null);
			}
			Notificacion[] lNotificacion_usuarios = usuario.notificacion_usuario.toArray();
			for(int i = 0; i < lNotificacion_usuarios.length; i++) {
				lNotificacion_usuarios[i].setUsuario_ticket(null);
			}
			Mensaje[] lMegustas = usuario.megusta.toArray();
			for(int i = 0; i < lMegustas.length; i++) {
				lMegustas[i].gustaMensaje.remove(usuario);
			}
			Tema[] lMegusta_temas = usuario.megusta_tema.toArray();
			for(int i = 0; i < lMegusta_temas.length; i++) {
				lMegusta_temas[i].gustaTema.remove(usuario);
			}
			return delete(usuario);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Usuario usuario, org.orm.PersistentSession session)throws PersistentException {
		if (usuario instanceof Administrador) {
			return AdministradorDAO.deleteAndDissociate((Administrador) usuario, session);
		}
		
		try {
			Reporte[] lReportes_usuarios = usuario.reportes_usuario.toArray();
			for(int i = 0; i < lReportes_usuarios.length; i++) {
				lReportes_usuarios[i].setUsuario_reporte(null);
			}
			Usuario[] lAmigo_des = usuario.amigo_de.toArray();
			for(int i = 0; i < lAmigo_des.length; i++) {
				lAmigo_des[i].usuarios.remove(usuario);
			}
			Mensaje[] lPerteneces = usuario.pertenece.toArray();
			for(int i = 0; i < lPerteneces.length; i++) {
				lPerteneces[i].setEnvia_mensaje(null);
			}
			Usuario[] lUsuarioss = usuario.usuarios.toArray();
			for(int i = 0; i < lUsuarioss.length; i++) {
				lUsuarioss[i].amigo_de.remove(usuario);
			}
			Tema[] lEs_creados = usuario.es_creado.toArray();
			for(int i = 0; i < lEs_creados.length; i++) {
				lEs_creados[i].setCrea_tema(null);
			}
			Notificacion[] lNotificacion_usuarios = usuario.notificacion_usuario.toArray();
			for(int i = 0; i < lNotificacion_usuarios.length; i++) {
				lNotificacion_usuarios[i].setUsuario_ticket(null);
			}
			Mensaje[] lMegustas = usuario.megusta.toArray();
			for(int i = 0; i < lMegustas.length; i++) {
				lMegustas[i].gustaMensaje.remove(usuario);
			}
			Tema[] lMegusta_temas = usuario.megusta_tema.toArray();
			for(int i = 0; i < lMegusta_temas.length; i++) {
				lMegusta_temas[i].gustaTema.remove(usuario);
			}
			try {
				session.delete(usuario);
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
	
	public static boolean refresh(Usuario usuario) throws PersistentException {
		try {
			MDS1PersistentManager.instance().getSession().refresh(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Usuario usuario) throws PersistentException {
		try {
			MDS1PersistentManager.instance().getSession().evict(usuario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario loadUsuarioByCriteria(UsuarioCriteria usuarioCriteria) {
		Usuario[] usuarios = listUsuarioByCriteria(usuarioCriteria);
		if(usuarios == null || usuarios.length == 0) {
			return null;
		}
		return usuarios[0];
	}
	
	public static Usuario[] listUsuarioByCriteria(UsuarioCriteria usuarioCriteria) {
		return usuarioCriteria.listUsuario();
	}
}
