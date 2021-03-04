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

public class TemaDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public TemaDetachedCriteria() {
		super(Tema.class, TemaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		crea_temaId = new LongExpression("crea_tema.ID", this.getDetachedCriteria());
		crea_tema = new AssociationExpression("crea_tema", this.getDetachedCriteria());
		contieneId = new IntegerExpression("contiene.ID", this.getDetachedCriteria());
		contiene = new AssociationExpression("contiene", this.getDetachedCriteria());
		numeroMeGusta = new IntegerExpression("numeroMeGusta", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		tipoTema = new IntegerExpression("tipoTema", this.getDetachedCriteria());
		Titulo = new StringExpression("Titulo", this.getDetachedCriteria());
		subtitulo = new StringExpression("subtitulo", this.getDetachedCriteria());
		fechaCreacion = new DateExpression("fechaCreacion", this.getDetachedCriteria());
		numMensjes = new IntegerExpression("numMensjes", this.getDetachedCriteria());
		idTema = new LongExpression("idTema", this.getDetachedCriteria());
		compone = new CollectionExpression("ORM_compone", this.getDetachedCriteria());
		gustaTema = new CollectionExpression("ORM_gustaTema", this.getDetachedCriteria());
	}
	
	public TemaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, TemaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		crea_temaId = new LongExpression("crea_tema.ID", this.getDetachedCriteria());
		crea_tema = new AssociationExpression("crea_tema", this.getDetachedCriteria());
		contieneId = new IntegerExpression("contiene.ID", this.getDetachedCriteria());
		contiene = new AssociationExpression("contiene", this.getDetachedCriteria());
		numeroMeGusta = new IntegerExpression("numeroMeGusta", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		tipoTema = new IntegerExpression("tipoTema", this.getDetachedCriteria());
		Titulo = new StringExpression("Titulo", this.getDetachedCriteria());
		subtitulo = new StringExpression("subtitulo", this.getDetachedCriteria());
		fechaCreacion = new DateExpression("fechaCreacion", this.getDetachedCriteria());
		numMensjes = new IntegerExpression("numMensjes", this.getDetachedCriteria());
		idTema = new LongExpression("idTema", this.getDetachedCriteria());
		compone = new CollectionExpression("ORM_compone", this.getDetachedCriteria());
		gustaTema = new CollectionExpression("ORM_gustaTema", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createCrea_temaCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("crea_tema"));
	}
	
	public SeccionDetachedCriteria createContieneCriteria() {
		return new SeccionDetachedCriteria(createCriteria("contiene"));
	}
	
	public MensajeDetachedCriteria createComponeCriteria() {
		return new MensajeDetachedCriteria(createCriteria("ORM_compone"));
	}
	
	public UsuarioDetachedCriteria createGustaTemaCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("ORM_gustaTema"));
	}
	
	public Tema uniqueTema(PersistentSession session) {
		return (Tema) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tema[] listTema(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tema[]) list.toArray(new Tema[list.size()]);
	}
}

