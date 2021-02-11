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
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AdministradoresDetachedCriteria extends AbstractORMDetachedCriteria {
	public final LongExpression ID;
	public final LongExpression pertenece_aId;
	public final AssociationExpression pertenece_a;
	public final StringExpression email;
	public final StringExpression nombreUsuario;
	public final IntegerExpression fotoPerfil;
	public final StringExpression descripcion;
	public final StringExpression contrasenia;
	public final BooleanExpression marcado;
	public final BooleanExpression baneado;
	public final LongExpression IDusuario;
	public final CollectionExpression reportes;
	public final CollectionExpression amigo_de;
	public final CollectionExpression pertenece;
	public final CollectionExpression usuarios;
	public final CollectionExpression es_creado;
	public final CollectionExpression temas;
	public final CollectionExpression es_enviado;
	public final CollectionExpression son_recibidos;
	public final CollectionExpression es_creada;
	
	public AdministradoresDetachedCriteria() {
		super(Administradores.class, AdministradoresCriteria.class);
		ID = new LongExpression("ID", this.getDetachedCriteria());
		pertenece_aId = new LongExpression("pertenece_a.idticket", this.getDetachedCriteria());
		pertenece_a = new AssociationExpression("pertenece_a", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		fotoPerfil = new IntegerExpression("fotoPerfil", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		contrasenia = new StringExpression("contrasenia", this.getDetachedCriteria());
		marcado = new BooleanExpression("marcado", this.getDetachedCriteria());
		baneado = new BooleanExpression("baneado", this.getDetachedCriteria());
		IDusuario = new LongExpression("IDusuario", this.getDetachedCriteria());
		reportes = new CollectionExpression("ORM_reportes", this.getDetachedCriteria());
		amigo_de = new CollectionExpression("ORM_amigo_de", this.getDetachedCriteria());
		pertenece = new CollectionExpression("ORM_pertenece", this.getDetachedCriteria());
		usuarios = new CollectionExpression("ORM_usuarios", this.getDetachedCriteria());
		es_creado = new CollectionExpression("ORM_es_creado", this.getDetachedCriteria());
		temas = new CollectionExpression("ORM_temas", this.getDetachedCriteria());
		es_enviado = new CollectionExpression("ORM_es_enviado", this.getDetachedCriteria());
		son_recibidos = new CollectionExpression("ORM_son_recibidos", this.getDetachedCriteria());
		es_creada = new CollectionExpression("ORM_es_creada", this.getDetachedCriteria());
	}
	
	public AdministradoresDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, AdministradoresCriteria.class);
		ID = new LongExpression("ID", this.getDetachedCriteria());
		pertenece_aId = new LongExpression("pertenece_a.idticket", this.getDetachedCriteria());
		pertenece_a = new AssociationExpression("pertenece_a", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		fotoPerfil = new IntegerExpression("fotoPerfil", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		contrasenia = new StringExpression("contrasenia", this.getDetachedCriteria());
		marcado = new BooleanExpression("marcado", this.getDetachedCriteria());
		baneado = new BooleanExpression("baneado", this.getDetachedCriteria());
		IDusuario = new LongExpression("IDusuario", this.getDetachedCriteria());
		reportes = new CollectionExpression("ORM_reportes", this.getDetachedCriteria());
		amigo_de = new CollectionExpression("ORM_amigo_de", this.getDetachedCriteria());
		pertenece = new CollectionExpression("ORM_pertenece", this.getDetachedCriteria());
		usuarios = new CollectionExpression("ORM_usuarios", this.getDetachedCriteria());
		es_creado = new CollectionExpression("ORM_es_creado", this.getDetachedCriteria());
		temas = new CollectionExpression("ORM_temas", this.getDetachedCriteria());
		es_enviado = new CollectionExpression("ORM_es_enviado", this.getDetachedCriteria());
		son_recibidos = new CollectionExpression("ORM_son_recibidos", this.getDetachedCriteria());
		es_creada = new CollectionExpression("ORM_es_creada", this.getDetachedCriteria());
	}
	
	public TicketDetachedCriteria createSon_recibidosCriteria() {
		return new TicketDetachedCriteria(createCriteria("ORM_son_recibidos"));
	}
	
	public SeccionDetachedCriteria createEs_creadaCriteria() {
		return new SeccionDetachedCriteria(createCriteria("ORM_es_creada"));
	}
	
	public TemaDetachedCriteria createTemasCriteria() {
		return new TemaDetachedCriteria(createCriteria("ORM_temas"));
	}
	
	public TicketDetachedCriteria createEs_enviadoCriteria() {
		return new TicketDetachedCriteria(createCriteria("ORM_es_enviado"));
	}
	
	public TicketDetachedCriteria createPertenece_aCriteria() {
		return new TicketDetachedCriteria(createCriteria("pertenece_a"));
	}
	
	public ReporteDetachedCriteria createReportesCriteria() {
		return new ReporteDetachedCriteria(createCriteria("ORM_reportes"));
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
	
	public Administradores uniqueAdministradores(PersistentSession session) {
		return (Administradores) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Administradores[] listAdministradores(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Administradores[]) list.toArray(new Administradores[list.size()]);
	}
}

