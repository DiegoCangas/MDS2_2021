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

public class ImagenCriteria extends AbstractORMCriteria {
	public final IntegerExpression IDmedia;
	public final StringExpression url;
	public final IntegerExpression tamanoKB;
	public final CollectionExpression contiene_imagen;
	
	public ImagenCriteria(Criteria criteria) {
		super(criteria);
		IDmedia = new IntegerExpression("IDmedia", this);
		url = new StringExpression("url", this);
		tamanoKB = new IntegerExpression("tamanoKB", this);
		contiene_imagen = new CollectionExpression("ORM_contiene_imagen", this);
	}
	
	public ImagenCriteria(PersistentSession session) {
		this(session.createCriteria(Imagen.class));
	}
	
	public ImagenCriteria() throws PersistentException {
		this(MDS1PersistentManager.instance().getSession());
	}
	
	public MensajeCriteria createContiene_imagenCriteria() {
		return new MensajeCriteria(createCriteria("ORM_contiene_imagen"));
	}
	
	public Imagen uniqueImagen() {
		return (Imagen) super.uniqueResult();
	}
	
	public Imagen[] listImagen() {
		java.util.List list = super.list();
		return (Imagen[]) list.toArray(new Imagen[list.size()]);
	}
}

