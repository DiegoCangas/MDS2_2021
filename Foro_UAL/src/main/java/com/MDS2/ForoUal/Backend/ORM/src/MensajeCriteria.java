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

public class MensajeCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final LongExpression envia_mensajeId;
	public final AssociationExpression envia_mensaje;
	public final IntegerExpression mensaje_Id;
	public final AssociationExpression mensaje_;
	public final LongExpression idMensaje;
	public final StringExpression texto;
	public final IntegerExpression numeroMeGusta;
	public final StringExpression nombreUsuario;
	public final BooleanExpression marcado;
	public final CollectionExpression respondido_por;
	public final CollectionExpression reportes_mensaje;
	public final CollectionExpression media_mensaje;
	public final CollectionExpression gustaMensaje;
	public final CollectionExpression respuesta_de;
	
	public MensajeCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		envia_mensajeId = new LongExpression("envia_mensaje.ID", this);
		envia_mensaje = new AssociationExpression("envia_mensaje", this);
		mensaje_Id = new IntegerExpression("mensaje_.ID", this);
		mensaje_ = new AssociationExpression("mensaje_", this);
		idMensaje = new LongExpression("idMensaje", this);
		texto = new StringExpression("texto", this);
		numeroMeGusta = new IntegerExpression("numeroMeGusta", this);
		nombreUsuario = new StringExpression("nombreUsuario", this);
		marcado = new BooleanExpression("marcado", this);
		respondido_por = new CollectionExpression("ORM_respondido_por", this);
		reportes_mensaje = new CollectionExpression("ORM_reportes_mensaje", this);
		media_mensaje = new CollectionExpression("ORM_media_mensaje", this);
		gustaMensaje = new CollectionExpression("ORM_gustaMensaje", this);
		respuesta_de = new CollectionExpression("ORM_respuesta_de", this);
	}
	
	public MensajeCriteria(PersistentSession session) {
		this(session.createCriteria(Mensaje.class));
	}
	
	public MensajeCriteria() throws PersistentException {
		this(MDS1PersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createEnvia_mensajeCriteria() {
		return new UsuarioCriteria(createCriteria("envia_mensaje"));
	}
	
	public TemaCriteria createMensaje_Criteria() {
		return new TemaCriteria(createCriteria("mensaje_"));
	}
	
	public MensajeCriteria createRespondido_porCriteria() {
		return new MensajeCriteria(createCriteria("ORM_respondido_por"));
	}
	
	public ReporteCriteria createReportes_mensajeCriteria() {
		return new ReporteCriteria(createCriteria("ORM_reportes_mensaje"));
	}
	
	public Media_Criteria createMedia_mensajeCriteria() {
		return new Media_Criteria(createCriteria("ORM_media_mensaje"));
	}
	
	public UsuarioCriteria createGustaMensajeCriteria() {
		return new UsuarioCriteria(createCriteria("ORM_gustaMensaje"));
	}
	
	public MensajeCriteria createRespuesta_deCriteria() {
		return new MensajeCriteria(createCriteria("ORM_respuesta_de"));
	}
	
	public Mensaje uniqueMensaje() {
		return (Mensaje) super.uniqueResult();
	}
	
	public Mensaje[] listMensaje() {
		java.util.List list = super.list();
		return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
	}
}

