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

public class MensajeDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public MensajeDetachedCriteria() {
		super(Mensaje.class, MensajeCriteria.class);
		idMensaje = new LongExpression("idMensaje", this.getDetachedCriteria());
		videosId = new IntegerExpression("videos.", this.getDetachedCriteria());
		videos = new AssociationExpression("videos", this.getDetachedCriteria());
		enviaId = new LongExpression("envia.ID", this.getDetachedCriteria());
		envia = new AssociationExpression("envia", this.getDetachedCriteria());
		mensaje_Id = new LongExpression("mensaje_.IDtema", this.getDetachedCriteria());
		mensaje_ = new AssociationExpression("mensaje_", this.getDetachedCriteria());
		texto = new StringExpression("texto", this.getDetachedCriteria());
		numeroMeGusta = new IntegerExpression("numeroMeGusta", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		marcado = new BooleanExpression("marcado", this.getDetachedCriteria());
		corresponden = new CollectionExpression("ORM_corresponden", this.getDetachedCriteria());
		imagen = new CollectionExpression("ORM_imagen", this.getDetachedCriteria());
		respondido_por = new CollectionExpression("ORM_respondido_por", this.getDetachedCriteria());
		mensajes = new CollectionExpression("ORM_mensajes", this.getDetachedCriteria());
	}
	
	public MensajeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, MensajeCriteria.class);
		idMensaje = new LongExpression("idMensaje", this.getDetachedCriteria());
		videosId = new IntegerExpression("videos.", this.getDetachedCriteria());
		videos = new AssociationExpression("videos", this.getDetachedCriteria());
		enviaId = new LongExpression("envia.ID", this.getDetachedCriteria());
		envia = new AssociationExpression("envia", this.getDetachedCriteria());
		mensaje_Id = new LongExpression("mensaje_.IDtema", this.getDetachedCriteria());
		mensaje_ = new AssociationExpression("mensaje_", this.getDetachedCriteria());
		texto = new StringExpression("texto", this.getDetachedCriteria());
		numeroMeGusta = new IntegerExpression("numeroMeGusta", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		marcado = new BooleanExpression("marcado", this.getDetachedCriteria());
		corresponden = new CollectionExpression("ORM_corresponden", this.getDetachedCriteria());
		imagen = new CollectionExpression("ORM_imagen", this.getDetachedCriteria());
		respondido_por = new CollectionExpression("ORM_respondido_por", this.getDetachedCriteria());
		mensajes = new CollectionExpression("ORM_mensajes", this.getDetachedCriteria());
	}
	
	public VideoDetachedCriteria createVideosCriteria() {
		return new VideoDetachedCriteria(createCriteria("videos"));
	}
	
	public UsuarioDetachedCriteria createEnviaCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("envia"));
	}
	
	public TemaDetachedCriteria createMensaje_Criteria() {
		return new TemaDetachedCriteria(createCriteria("mensaje_"));
	}
	
	public ReporteDetachedCriteria createCorrespondenCriteria() {
		return new ReporteDetachedCriteria(createCriteria("ORM_corresponden"));
	}
	
	public ImagenDetachedCriteria createImagenCriteria() {
		return new ImagenDetachedCriteria(createCriteria("ORM_imagen"));
	}
	
	public MensajeDetachedCriteria createRespondido_porCriteria() {
		return new MensajeDetachedCriteria(createCriteria("ORM_respondido_por"));
	}
	
	public MensajeDetachedCriteria createMensajesCriteria() {
		return new MensajeDetachedCriteria(createCriteria("ORM_mensajes"));
	}
	
	public Mensaje uniqueMensaje(PersistentSession session) {
		return (Mensaje) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Mensaje[] listMensaje(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Mensaje[]) list.toArray(new Mensaje[list.size()]);
	}
}

