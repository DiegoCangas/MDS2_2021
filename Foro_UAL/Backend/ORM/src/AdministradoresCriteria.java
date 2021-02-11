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
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AdministradoresCriteria extends AbstractORMCriteria {
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
	
	public AdministradoresCriteria(Criteria criteria) {
		super(criteria);
		ID = new LongExpression("ID", this);
		pertenece_aId = new LongExpression("pertenece_a.idticket", this);
		pertenece_a = new AssociationExpression("pertenece_a", this);
		email = new StringExpression("email", this);
		nombreUsuario = new StringExpression("nombreUsuario", this);
		fotoPerfil = new IntegerExpression("fotoPerfil", this);
		descripcion = new StringExpression("descripcion", this);
		contrasenia = new StringExpression("contrasenia", this);
		marcado = new BooleanExpression("marcado", this);
		baneado = new BooleanExpression("baneado", this);
		IDusuario = new LongExpression("IDusuario", this);
		reportes = new CollectionExpression("ORM_reportes", this);
		amigo_de = new CollectionExpression("ORM_amigo_de", this);
		pertenece = new CollectionExpression("ORM_pertenece", this);
		usuarios = new CollectionExpression("ORM_usuarios", this);
		es_creado = new CollectionExpression("ORM_es_creado", this);
		temas = new CollectionExpression("ORM_temas", this);
		es_enviado = new CollectionExpression("ORM_es_enviado", this);
		son_recibidos = new CollectionExpression("ORM_son_recibidos", this);
		es_creada = new CollectionExpression("ORM_es_creada", this);
	}
	
	public AdministradoresCriteria(PersistentSession session) {
		this(session.createCriteria(Administradores.class));
	}
	
	public AdministradoresCriteria() throws PersistentException {
		this(MDS1PersistentManager.instance().getSession());
	}
	
	public TicketCriteria createSon_recibidosCriteria() {
		return new TicketCriteria(createCriteria("ORM_son_recibidos"));
	}
	
	public SeccionCriteria createEs_creadaCriteria() {
		return new SeccionCriteria(createCriteria("ORM_es_creada"));
	}
	
	public TemaCriteria createTemasCriteria() {
		return new TemaCriteria(createCriteria("ORM_temas"));
	}
	
	public TicketCriteria createEs_enviadoCriteria() {
		return new TicketCriteria(createCriteria("ORM_es_enviado"));
	}
	
	public TicketCriteria createPertenece_aCriteria() {
		return new TicketCriteria(createCriteria("pertenece_a"));
	}
	
	public ReporteCriteria createReportesCriteria() {
		return new ReporteCriteria(createCriteria("ORM_reportes"));
	}
	
	public UsuarioCriteria createAmigo_deCriteria() {
		return new UsuarioCriteria(createCriteria("ORM_amigo_de"));
	}
	
	public MensajeCriteria createPerteneceCriteria() {
		return new MensajeCriteria(createCriteria("ORM_pertenece"));
	}
	
	public UsuarioCriteria createUsuariosCriteria() {
		return new UsuarioCriteria(createCriteria("ORM_usuarios"));
	}
	
	public TemaCriteria createEs_creadoCriteria() {
		return new TemaCriteria(createCriteria("ORM_es_creado"));
	}
	
	public Administradores uniqueAdministradores() {
		return (Administradores) super.uniqueResult();
	}
	
	public Administradores[] listAdministradores() {
		java.util.List list = super.list();
		return (Administradores[]) list.toArray(new Administradores[list.size()]);
	}
}

