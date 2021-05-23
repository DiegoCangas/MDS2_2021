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

public class SeccionCriteria extends AbstractORMCriteria {
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
	
	public SeccionCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		creaId = new LongExpression("crea.", this);
		crea = new AssociationExpression("crea", this);
		IDseccion = new LongExpression("IDseccion", this);
		Titulo = new StringExpression("Titulo", this);
		subtitulo = new StringExpression("subtitulo", this);
		fechaCreacion = new DateExpression("fechaCreacion", this);
		numMensajes = new IntegerExpression("numMensajes", this);
		marcado = new BooleanExpression("marcado", this);
		temas = new CollectionExpression("ORM_temas", this);
	}
	
	public SeccionCriteria(PersistentSession session) {
		this(session.createCriteria(Seccion.class));
	}
	
	public SeccionCriteria() throws PersistentException {
		this(com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession());
	}
	
	public AdministradorCriteria createCreaCriteria() {
		return new AdministradorCriteria(createCriteria("crea"));
	}
	
	public com.MDS2.ForoUal.Backend.ORM.src.TemaCriteria createTemasCriteria() {
		return new com.MDS2.ForoUal.Backend.ORM.src.TemaCriteria(createCriteria("ORM_temas"));
	}
	
	public Seccion uniqueSeccion() {
		return (Seccion) super.uniqueResult();
	}
	
	public Seccion[] listSeccion() {
		java.util.List list = super.list();
		return (Seccion[]) list.toArray(new Seccion[list.size()]);
	}
}

