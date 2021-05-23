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

public class TemaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final LongExpression crea_temaId;
	public final AssociationExpression crea_tema;
	public final IntegerExpression contieneId;
	public final AssociationExpression contiene;
	public final IntegerExpression numeroMeGusta;
	public final StringExpression nombreUsuario;
	public final IntegerExpression tipoTema;
	public final StringExpression Titulo;
	public final StringExpression subtitulo;
	public final DateExpression fechaCreacion;
	public final IntegerExpression numMensjes;
	public final LongExpression idTema;
	public final CollectionExpression compone;
	public final CollectionExpression gustaTema;
	
	public TemaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		crea_temaId = new LongExpression("crea_tema.ID", this);
		crea_tema = new AssociationExpression("crea_tema", this);
		contieneId = new IntegerExpression("contiene.ID", this);
		contiene = new AssociationExpression("contiene", this);
		numeroMeGusta = new IntegerExpression("numeroMeGusta", this);
		nombreUsuario = new StringExpression("nombreUsuario", this);
		tipoTema = new IntegerExpression("tipoTema", this);
		Titulo = new StringExpression("Titulo", this);
		subtitulo = new StringExpression("subtitulo", this);
		fechaCreacion = new DateExpression("fechaCreacion", this);
		numMensjes = new IntegerExpression("numMensjes", this);
		idTema = new LongExpression("idTema", this);
		compone = new CollectionExpression("ORM_compone", this);
		gustaTema = new CollectionExpression("ORM_gustaTema", this);
	}
	
	public TemaCriteria(PersistentSession session) {
		this(session.createCriteria(Tema.class));
	}
	
	public TemaCriteria() throws PersistentException {
		this(com.MDS2.ForoUal.Backend.ORM.src.MDS1PersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createCrea_temaCriteria() {
		return new UsuarioCriteria(createCriteria("crea_tema"));
	}
	
	public SeccionCriteria createContieneCriteria() {
		return new SeccionCriteria(createCriteria("contiene"));
	}
	
	public com.MDS2.ForoUal.Backend.ORM.src.MensajeCriteria createComponeCriteria() {
		return new com.MDS2.ForoUal.Backend.ORM.src.MensajeCriteria(createCriteria("ORM_compone"));
	}
	
	public com.MDS2.ForoUal.Backend.ORM.src.UsuarioCriteria createGustaTemaCriteria() {
		return new com.MDS2.ForoUal.Backend.ORM.src.UsuarioCriteria(createCriteria("ORM_gustaTema"));
	}
	
	public Tema uniqueTema() {
		return (Tema) super.uniqueResult();
	}
	
	public Tema[] listTema() {
		java.util.List list = super.list();
		return (Tema[]) list.toArray(new Tema[list.size()]);
	}
}

