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

public class ImagenDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression IDmedia;
	public final StringExpression url;
	public final IntegerExpression tamanoKB;
	public final CollectionExpression contiene_imagen;
	
	public ImagenDetachedCriteria() {
		super(Imagen.class, ImagenCriteria.class);
		IDmedia = new IntegerExpression("IDmedia", this.getDetachedCriteria());
		url = new StringExpression("url", this.getDetachedCriteria());
		tamanoKB = new IntegerExpression("tamanoKB", this.getDetachedCriteria());
		contiene_imagen = new CollectionExpression("ORM_contiene_imagen", this.getDetachedCriteria());
	}
	
	public ImagenDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ImagenCriteria.class);
		IDmedia = new IntegerExpression("IDmedia", this.getDetachedCriteria());
		url = new StringExpression("url", this.getDetachedCriteria());
		tamanoKB = new IntegerExpression("tamanoKB", this.getDetachedCriteria());
		contiene_imagen = new CollectionExpression("ORM_contiene_imagen", this.getDetachedCriteria());
	}
	
	public MensajeDetachedCriteria createContiene_imagenCriteria() {
		return new MensajeDetachedCriteria(createCriteria("ORM_contiene_imagen"));
	}
	
	public Imagen uniqueImagen(PersistentSession session) {
		return (Imagen) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Imagen[] listImagen(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Imagen[]) list.toArray(new Imagen[list.size()]);
	}
}

