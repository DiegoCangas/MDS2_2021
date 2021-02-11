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

public class MensajeCriteria extends AbstractORMCriteria {
	public final LongExpression idMensaje;
	public final IntegerExpression videosId;
	public final AssociationExpression videos;
	public final LongExpression enviaId;
	public final AssociationExpression envia;
	public final LongExpression mensaje_Id;
	public final AssociationExpression mensaje_;
	public final StringExpression texto;
	public final IntegerExpression numeroMeGusta;
	public final StringExpression nombreUsuario;
	public final BooleanExpression marcado;
	public final CollectionExpression corresponden;
	public final CollectionExpression imagen;
	public final CollectionExpression respondido_por;
	public final CollectionExpression mensajes;
	
	public MensajeCriteria(Criteria criteria) {
		super(criteria);
		idMensaje = new LongExpression("idMensaje", this);
		videosId = new IntegerExpression("videos.", this);
		videos = new AssociationExpression("videos", this);
		enviaId = new LongExpression("envia.ID", this);
		envia = new AssociationExpression("envia", this);
		mensaje_Id = new LongExpression("mensaje_.IDtema", this);
		mensaje_ = new AssociationExpression("mensaje_", this);
		texto = new StringExpression("texto", this);
		numeroMeGusta = new IntegerExpression("numeroMeGusta", this);
		nombreUsuario = new StringExpression("nombreUsuario", this);
		marcado = new BooleanExpression("marcado", this);
		corresponden = new CollectionExpression("ORM_corresponden", this);
		imagen = new CollectionExpression("ORM_imagen", this);
		respondido_por = new CollectionExpression("ORM_respondido_por", this);
		mensajes = new CollectionExpression("ORM_mensajes", this);
	}
	
	public MensajeCriteria(PersistentSession session) {
		this(session.createCriteria(Mensaje.class));
	}
	
	public MensajeCriteria() throws PersistentException {
		this(MDS1PersistentManager.instance().getSession());
	}
	
	public VideoCriteria createVideosCriteria() {
		return new VideoCriteria(createCriteria("videos"));
	}
	
	public UsuarioCriteria createEnviaCriteria() {
		return new UsuarioCriteria(createCriteria("envia"));
	}
	
	public TemaCriteria createMensaje_Criteria() {
		return new TemaCriteria(createCriteria("mensaje_"));
	}
	
	public ReporteCriteria createCorrespondenCriteria() {
		return new ReporteCriteria(createCriteria("ORM_corresponden"));
	}
	
	public ImagenCriteria createImagenCriteria() {
		return new ImagenCriteria(createCriteria("ORM_imagen"));
	}
	
	public MensajeCriteria createRespondido_porCriteria() {
		return new MensajeCriteria(createCriteria("ORM_respondido_por"));
	}
	
	public MensajeCriteria createMensajesCriteria() {
		return new MensajeCriteria(createCriteria("ORM_mensajes"));
	}
	
	public Mensaje uniqueMensaje() {
		return (Mensaje) super.uniqueResult();
	}
	
	public Mensaje[] listMensaje() {
		java.util.List list = super.list();
		return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
	}
}

