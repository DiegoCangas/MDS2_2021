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

public class UsuarioDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public UsuarioDetachedCriteria() {
		super(Usuario.class, UsuarioCriteria.class);
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
	}
	
	public UsuarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, UsuarioCriteria.class);
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
	
	public Usuario uniqueUsuario(PersistentSession session) {
		return (Usuario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario[] listUsuario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario[]) list.toArray(new Usuario[list.size()]);
	}
}

