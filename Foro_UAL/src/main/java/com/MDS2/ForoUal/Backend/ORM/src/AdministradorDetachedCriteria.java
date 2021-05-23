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

public class AdministradorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final LongExpression ID;
	public final StringExpression email;
	public final StringExpression nombreUsuario;
	public final StringExpression fotoPerfil;
	public final StringExpression descripcion;
	public final StringExpression contrasenia;
	public final BooleanExpression marcado;
	public final BooleanExpression baneado;
	public final LongExpression IDusuario;
	public final StringExpression nombreReal;
	public final BooleanExpression esModerador;
	public final CollectionExpression reportes_usuario;
	public final CollectionExpression amigo_de;
	public final CollectionExpression pertenece;
	public final CollectionExpression usuarios;
	public final CollectionExpression es_creado;
	public final CollectionExpression notificacion_usuario;
	public final CollectionExpression megusta;
	public final CollectionExpression megusta_tema;
	public final LongExpression idAdmin;
	public final CollectionExpression es_creada;
	
	public AdministradorDetachedCriteria() {
		super(com.MDS2.ForoUal.Backend.ORM.src.Administrador.class, com.MDS2.ForoUal.Backend.ORM.src.AdministradorCriteria.class);
		ID = new LongExpression("ID", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		fotoPerfil = new StringExpression("fotoPerfil", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		contrasenia = new StringExpression("contrasenia", this.getDetachedCriteria());
		marcado = new BooleanExpression("marcado", this.getDetachedCriteria());
		baneado = new BooleanExpression("baneado", this.getDetachedCriteria());
		IDusuario = new LongExpression("IDusuario", this.getDetachedCriteria());
		nombreReal = new StringExpression("nombreReal", this.getDetachedCriteria());
		esModerador = new BooleanExpression("esModerador", this.getDetachedCriteria());
		reportes_usuario = new CollectionExpression("ORM_reportes_usuario", this.getDetachedCriteria());
		amigo_de = new CollectionExpression("ORM_amigo_de", this.getDetachedCriteria());
		pertenece = new CollectionExpression("ORM_pertenece", this.getDetachedCriteria());
		usuarios = new CollectionExpression("ORM_usuarios", this.getDetachedCriteria());
		es_creado = new CollectionExpression("ORM_es_creado", this.getDetachedCriteria());
		notificacion_usuario = new CollectionExpression("ORM_notificacion_usuario", this.getDetachedCriteria());
		megusta = new CollectionExpression("ORM_megusta", this.getDetachedCriteria());
		megusta_tema = new CollectionExpression("ORM_megusta_tema", this.getDetachedCriteria());
		idAdmin = new LongExpression("idAdmin", this.getDetachedCriteria());
		es_creada = new CollectionExpression("ORM_es_creada", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.MDS2.ForoUal.Backend.ORM.src.AdministradorCriteria.class);
		ID = new LongExpression("ID", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		fotoPerfil = new StringExpression("fotoPerfil", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		contrasenia = new StringExpression("contrasenia", this.getDetachedCriteria());
		marcado = new BooleanExpression("marcado", this.getDetachedCriteria());
		baneado = new BooleanExpression("baneado", this.getDetachedCriteria());
		IDusuario = new LongExpression("IDusuario", this.getDetachedCriteria());
		nombreReal = new StringExpression("nombreReal", this.getDetachedCriteria());
		esModerador = new BooleanExpression("esModerador", this.getDetachedCriteria());
		reportes_usuario = new CollectionExpression("ORM_reportes_usuario", this.getDetachedCriteria());
		amigo_de = new CollectionExpression("ORM_amigo_de", this.getDetachedCriteria());
		pertenece = new CollectionExpression("ORM_pertenece", this.getDetachedCriteria());
		usuarios = new CollectionExpression("ORM_usuarios", this.getDetachedCriteria());
		es_creado = new CollectionExpression("ORM_es_creado", this.getDetachedCriteria());
		notificacion_usuario = new CollectionExpression("ORM_notificacion_usuario", this.getDetachedCriteria());
		megusta = new CollectionExpression("ORM_megusta", this.getDetachedCriteria());
		megusta_tema = new CollectionExpression("ORM_megusta_tema", this.getDetachedCriteria());
		idAdmin = new LongExpression("idAdmin", this.getDetachedCriteria());
		es_creada = new CollectionExpression("ORM_es_creada", this.getDetachedCriteria());
	}
	
	public SeccionDetachedCriteria createEs_creadaCriteria() {
		return new SeccionDetachedCriteria(createCriteria("ORM_es_creada"));
	}
	
	public ReporteDetachedCriteria createReportes_usuarioCriteria() {
		return new ReporteDetachedCriteria(createCriteria("ORM_reportes_usuario"));
	}
	
	public UsuarioDetachedCriteria createAmigo_deCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("ORM_amigo_de"));
	}
	
	public MensajeDetachedCriteria createPerteneceCriteria() {
		return new MensajeDetachedCriteria(createCriteria("ORM_pertenece"));
	}
	
	public UsuarioDetachedCriteria createUsuariosCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("ORM_usuarios"));
	}
	
	public TemaDetachedCriteria createEs_creadoCriteria() {
		return new TemaDetachedCriteria(createCriteria("ORM_es_creado"));
	}
	
	public NotificacionDetachedCriteria createNotificacion_usuarioCriteria() {
		return new NotificacionDetachedCriteria(createCriteria("ORM_notificacion_usuario"));
	}
	
	public MensajeDetachedCriteria createMegustaCriteria() {
		return new MensajeDetachedCriteria(createCriteria("ORM_megusta"));
	}
	
	public TemaDetachedCriteria createMegusta_temaCriteria() {
		return new TemaDetachedCriteria(createCriteria("ORM_megusta_tema"));
	}
	
	public Administrador uniqueAdministrador(PersistentSession session) {
		return (Administrador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Administrador[] listAdministrador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

