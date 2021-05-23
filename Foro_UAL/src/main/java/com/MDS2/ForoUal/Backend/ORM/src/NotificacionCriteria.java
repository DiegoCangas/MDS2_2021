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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class NotificacionCriteria extends AbstractORMCriteria {
	public final LongExpression idnotificacion;
	public final LongExpression usuario_ticketId;
	public final AssociationExpression usuario_ticket;
	public final StringExpression mensaje;
	
	public NotificacionCriteria(Criteria criteria) {
		super(criteria);
		idnotificacion = new LongExpression("idnotificacion", this);
		usuario_ticketId = new LongExpression("usuario_ticket.ID", this);
		usuario_ticket = new AssociationExpression("usuario_ticket", this);
		mensaje = new StringExpression("mensaje", this);
	}
	
	public NotificacionCriteria(PersistentSession session) {
		this(session.createCriteria(Notificacion.class));
	}
	
	public NotificacionCriteria() throws PersistentException {
		this(com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createUsuario_ticketCriteria() {
		return new UsuarioCriteria(createCriteria("usuario_ticket"));
	}
	
	public Notificacion uniqueNotificacion() {
		return (Notificacion) super.uniqueResult();
	}
	
	public Notificacion[] listNotificacion() {
		java.util.List list = super.list();
		return (Notificacion[]) list.toArray(new Notificacion[list.size()]);
	}
}

