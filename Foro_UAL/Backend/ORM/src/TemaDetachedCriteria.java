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

public class TemaDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public TemaDetachedCriteria() {
		super(Tema.class, TemaCriteria.class);
		IDtema = new LongExpression("IDtema", this.getDetachedCriteria());
		crea_temasId = new LongExpression("crea_temas.ID", this.getDetachedCriteria());
		crea_temas = new AssociationExpression("crea_temas", this.getDetachedCriteria());
		seccionId = new LongExpression("seccion.IDseccion", this.getDetachedCriteria());
		seccion = new AssociationExpression("seccion", this.getDetachedCriteria());
		numeroMeGusta = new IntegerExpression("numeroMeGusta", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		tipoTema = new IntegerExpression("tipoTema", this.getDetachedCriteria());
		Titulo = new StringExpression("Titulo", this.getDetachedCriteria());
		subtitulo = new StringExpression("subtitulo", this.getDetachedCriteria());
		fechaCreacion = new DateExpression("fechaCreacion", this.getDetachedCriteria());
		numMensjes = new IntegerExpression("numMensjes", this.getDetachedCriteria());
		ocultaId = new LongExpression("oculta.", this.getDetachedCriteria());
		oculta = new AssociationExpression("oculta", this.getDetachedCriteria());
		compone = new CollectionExpression("ORM_compone", this.getDetachedCriteria());
	}
	
	public TemaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, TemaCriteria.class);
		IDtema = new LongExpression("IDtema", this.getDetachedCriteria());
		crea_temasId = new LongExpression("crea_temas.ID", this.getDetachedCriteria());
		crea_temas = new AssociationExpression("crea_temas", this.getDetachedCriteria());
		seccionId = new LongExpression("seccion.IDseccion", this.getDetachedCriteria());
		seccion = new AssociationExpression("seccion", this.getDetachedCriteria());
		numeroMeGusta = new IntegerExpression("numeroMeGusta", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		tipoTema = new IntegerExpression("tipoTema", this.getDetachedCriteria());
		Titulo = new StringExpression("Titulo", this.getDetachedCriteria());
		subtitulo = new StringExpression("subtitulo", this.getDetachedCriteria());
		fechaCreacion = new DateExpression("fechaCreacion", this.getDetachedCriteria());
		numMensjes = new IntegerExpression("numMensjes", this.getDetachedCriteria());
		ocultaId = new LongExpression("oculta.", this.getDetachedCriteria());
		oculta = new AssociationExpression("oculta", this.getDetachedCriteria());
		compone = new CollectionExpression("ORM_compone", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createCrea_temasCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("crea_temas"));
	}
	
	public SeccionDetachedCriteria createSeccionCriteria() {
		return new SeccionDetachedCriteria(createCriteria("seccion"));
	}
	
	public ModeradorDetachedCriteria createOcultaCriteria() {
		return new ModeradorDetachedCriteria(createCriteria("oculta"));
	}
	
	public MensajeDetachedCriteria createComponeCriteria() {
		return new MensajeDetachedCriteria(createCriteria("ORM_compone"));
	}
	
	public Tema uniqueTema(PersistentSession session) {
		return (Tema) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tema[] listTema(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tema[]) list.toArray(new Tema[list.size()]);
	}
}

