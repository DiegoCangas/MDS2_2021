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

public class SeccionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final LongExpression creaId;
	public final AssociationExpression crea;
	public final LongExpression IDseccion;
	public final StringExpression Titulo;
	public final StringExpression subtitulo;
	public final DateExpression fechaCreacion;
	public final IntegerExpression numMensajes;
	public final BooleanExpression marcado;
	public final CollectionExpression temas;
	
	public SeccionDetachedCriteria() {
		super(com.MDS2.ForoUal.Backend.ORM.src.Seccion.class, com.MDS2.ForoUal.Backend.ORM.src.SeccionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		creaId = new LongExpression("crea.", this.getDetachedCriteria());
		crea = new AssociationExpression("crea", this.getDetachedCriteria());
		IDseccion = new LongExpression("IDseccion", this.getDetachedCriteria());
		Titulo = new StringExpression("Titulo", this.getDetachedCriteria());
		subtitulo = new StringExpression("subtitulo", this.getDetachedCriteria());
		fechaCreacion = new DateExpression("fechaCreacion", this.getDetachedCriteria());
		numMensajes = new IntegerExpression("numMensajes", this.getDetachedCriteria());
		marcado = new BooleanExpression("marcado", this.getDetachedCriteria());
		temas = new CollectionExpression("ORM_temas", this.getDetachedCriteria());
	}
	
	public SeccionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.MDS2.ForoUal.Backend.ORM.src.SeccionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		creaId = new LongExpression("crea.", this.getDetachedCriteria());
		crea = new AssociationExpression("crea", this.getDetachedCriteria());
		IDseccion = new LongExpression("IDseccion", this.getDetachedCriteria());
		Titulo = new StringExpression("Titulo", this.getDetachedCriteria());
		subtitulo = new StringExpression("subtitulo", this.getDetachedCriteria());
		fechaCreacion = new DateExpression("fechaCreacion", this.getDetachedCriteria());
		numMensajes = new IntegerExpression("numMensajes", this.getDetachedCriteria());
		marcado = new BooleanExpression("marcado", this.getDetachedCriteria());
		temas = new CollectionExpression("ORM_temas", this.getDetachedCriteria());
	}
	
	public com.MDS2.ForoUal.Backend.ORM.src.AdministradorDetachedCriteria createCreaCriteria() {
		return new com.MDS2.ForoUal.Backend.ORM.src.AdministradorDetachedCriteria(createCriteria("crea"));
	}
	
	public TemaDetachedCriteria createTemasCriteria() {
		return new TemaDetachedCriteria(createCriteria("ORM_temas"));
	}
	
	public Seccion uniqueSeccion(PersistentSession session) {
		return (Seccion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Seccion[] listSeccion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Seccion[]) list.toArray(new Seccion[list.size()]);
	}
}

