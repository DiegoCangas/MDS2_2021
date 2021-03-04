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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class NotificacionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final LongExpression idnotificacion;
	public final LongExpression usuario_ticketId;
	public final AssociationExpression usuario_ticket;
	public final StringExpression mensaje;
	
	public NotificacionDetachedCriteria() {
		super(Notificacion.class, NotificacionCriteria.class);
		idnotificacion = new LongExpression("idnotificacion", this.getDetachedCriteria());
		usuario_ticketId = new LongExpression("usuario_ticket.ID", this.getDetachedCriteria());
		usuario_ticket = new AssociationExpression("usuario_ticket", this.getDetachedCriteria());
		mensaje = new StringExpression("mensaje", this.getDetachedCriteria());
	}
	
	public NotificacionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, NotificacionCriteria.class);
		idnotificacion = new LongExpression("idnotificacion", this.getDetachedCriteria());
		usuario_ticketId = new LongExpression("usuario_ticket.ID", this.getDetachedCriteria());
		usuario_ticket = new AssociationExpression("usuario_ticket", this.getDetachedCriteria());
		mensaje = new StringExpression("mensaje", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createUsuario_ticketCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("usuario_ticket"));
	}
	
	public Notificacion uniqueNotificacion(PersistentSession session) {
		return (Notificacion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Notificacion[] listNotificacion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Notificacion[]) list.toArray(new Notificacion[list.size()]);
	}
}

