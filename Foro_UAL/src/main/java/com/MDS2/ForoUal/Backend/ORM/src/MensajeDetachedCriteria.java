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

public class MensajeDetachedCriteria extends AbstractORMDetachedCriteria {
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
	public final DateExpression fechaCreacion;
	public final CollectionExpression respondido_por;
	public final CollectionExpression reportes_mensaje;
	public final CollectionExpression media_mensaje;
	public final CollectionExpression gustaMensaje;
	public final CollectionExpression respuesta_de;
	
	public MensajeDetachedCriteria() {
		super(com.MDS2.ForoUal.Backend.ORM.src.Mensaje.class, com.MDS2.ForoUal.Backend.ORM.src.MensajeCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		envia_mensajeId = new LongExpression("envia_mensaje.ID", this.getDetachedCriteria());
		envia_mensaje = new AssociationExpression("envia_mensaje", this.getDetachedCriteria());
		mensaje_Id = new IntegerExpression("mensaje_.ID", this.getDetachedCriteria());
		mensaje_ = new AssociationExpression("mensaje_", this.getDetachedCriteria());
		idMensaje = new LongExpression("idMensaje", this.getDetachedCriteria());
		texto = new StringExpression("texto", this.getDetachedCriteria());
		numeroMeGusta = new IntegerExpression("numeroMeGusta", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		marcado = new BooleanExpression("marcado", this.getDetachedCriteria());
		fechaCreacion = new DateExpression("fechaCreacion", this.getDetachedCriteria());
		respondido_por = new CollectionExpression("ORM_respondido_por", this.getDetachedCriteria());
		reportes_mensaje = new CollectionExpression("ORM_reportes_mensaje", this.getDetachedCriteria());
		media_mensaje = new CollectionExpression("ORM_media_mensaje", this.getDetachedCriteria());
		gustaMensaje = new CollectionExpression("ORM_gustaMensaje", this.getDetachedCriteria());
		respuesta_de = new CollectionExpression("ORM_respuesta_de", this.getDetachedCriteria());
	}
	
	public MensajeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.MDS2.ForoUal.Backend.ORM.src.MensajeCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		envia_mensajeId = new LongExpression("envia_mensaje.ID", this.getDetachedCriteria());
		envia_mensaje = new AssociationExpression("envia_mensaje", this.getDetachedCriteria());
		mensaje_Id = new IntegerExpression("mensaje_.ID", this.getDetachedCriteria());
		mensaje_ = new AssociationExpression("mensaje_", this.getDetachedCriteria());
		idMensaje = new LongExpression("idMensaje", this.getDetachedCriteria());
		texto = new StringExpression("texto", this.getDetachedCriteria());
		numeroMeGusta = new IntegerExpression("numeroMeGusta", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		marcado = new BooleanExpression("marcado", this.getDetachedCriteria());
		fechaCreacion = new DateExpression("fechaCreacion", this.getDetachedCriteria());
		respondido_por = new CollectionExpression("ORM_respondido_por", this.getDetachedCriteria());
		reportes_mensaje = new CollectionExpression("ORM_reportes_mensaje", this.getDetachedCriteria());
		media_mensaje = new CollectionExpression("ORM_media_mensaje", this.getDetachedCriteria());
		gustaMensaje = new CollectionExpression("ORM_gustaMensaje", this.getDetachedCriteria());
		respuesta_de = new CollectionExpression("ORM_respuesta_de", this.getDetachedCriteria());
	}
	
	public com.MDS2.ForoUal.Backend.ORM.src.UsuarioDetachedCriteria createEnvia_mensajeCriteria() {
		return new com.MDS2.ForoUal.Backend.ORM.src.UsuarioDetachedCriteria(createCriteria("envia_mensaje"));
	}
	
	public com.MDS2.ForoUal.Backend.ORM.src.TemaDetachedCriteria createMensaje_Criteria() {
		return new com.MDS2.ForoUal.Backend.ORM.src.TemaDetachedCriteria(createCriteria("mensaje_"));
	}
	
	public MensajeDetachedCriteria createRespondido_porCriteria() {
		return new MensajeDetachedCriteria(createCriteria("ORM_respondido_por"));
	}
	
	public ReporteDetachedCriteria createReportes_mensajeCriteria() {
		return new ReporteDetachedCriteria(createCriteria("ORM_reportes_mensaje"));
	}
	
	public Media_DetachedCriteria createMedia_mensajeCriteria() {
		return new Media_DetachedCriteria(createCriteria("ORM_media_mensaje"));
	}
	
	public UsuarioDetachedCriteria createGustaMensajeCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("ORM_gustaMensaje"));
	}
	
	public MensajeDetachedCriteria createRespuesta_deCriteria() {
		return new MensajeDetachedCriteria(createCriteria("ORM_respuesta_de"));
	}
	
	public Mensaje uniqueMensaje(PersistentSession session) {
		return (Mensaje) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Mensaje[] listMensaje(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
	}
}

