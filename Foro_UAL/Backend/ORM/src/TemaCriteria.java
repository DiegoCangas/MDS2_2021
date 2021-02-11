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

public class TemaCriteria extends AbstractORMCriteria {
	public final LongExpression IDtema;
	public final LongExpression crea_temasId;
	public final AssociationExpression crea_temas;
	public final LongExpression seccionId;
	public final AssociationExpression seccion;
	public final IntegerExpression numeroMeGusta;
	public final StringExpression nombreUsuario;
	public final IntegerExpression tipoTema;
	public final StringExpression Titulo;
	public final StringExpression subtitulo;
	public final DateExpression fechaCreacion;
	public final IntegerExpression numMensjes;
	public final LongExpression ocultaId;
	public final AssociationExpression oculta;
	public final CollectionExpression compone;
	
	public TemaCriteria(Criteria criteria) {
		super(criteria);
		IDtema = new LongExpression("IDtema", this);
		crea_temasId = new LongExpression("crea_temas.ID", this);
		crea_temas = new AssociationExpression("crea_temas", this);
		seccionId = new LongExpression("seccion.IDseccion", this);
		seccion = new AssociationExpression("seccion", this);
		numeroMeGusta = new IntegerExpression("numeroMeGusta", this);
		nombreUsuario = new StringExpression("nombreUsuario", this);
		tipoTema = new IntegerExpression("tipoTema", this);
		Titulo = new StringExpression("Titulo", this);
		subtitulo = new StringExpression("subtitulo", this);
		fechaCreacion = new DateExpression("fechaCreacion", this);
		numMensjes = new IntegerExpression("numMensjes", this);
		ocultaId = new LongExpression("oculta.", this);
		oculta = new AssociationExpression("oculta", this);
		compone = new CollectionExpression("ORM_compone", this);
	}
	
	public TemaCriteria(PersistentSession session) {
		this(session.createCriteria(Tema.class));
	}
	
	public TemaCriteria() throws PersistentException {
		this(MDS1PersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createCrea_temasCriteria() {
		return new UsuarioCriteria(createCriteria("crea_temas"));
	}
	
	public SeccionCriteria createSeccionCriteria() {
		return new SeccionCriteria(createCriteria("seccion"));
	}
	
	public ModeradorCriteria createOcultaCriteria() {
		return new ModeradorCriteria(createCriteria("oculta"));
	}
	
	public MensajeCriteria createComponeCriteria() {
		return new MensajeCriteria(createCriteria("ORM_compone"));
	}
	
	public Tema uniqueTema() {
		return (Tema) super.uniqueResult();
	}
	
	public Tema[] listTema() {
		java.util.List list = super.list();
		return (Tema[]) list.toArray(new Tema[list.size()]);
	}
}

