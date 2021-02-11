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

public class VideoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression IDmedia;
	public final StringExpression url;
	public final CollectionExpression contiene_video;
	
	public VideoDetachedCriteria() {
		super(Video.class, VideoCriteria.class);
		IDmedia = new IntegerExpression("IDmedia", this.getDetachedCriteria());
		url = new StringExpression("url", this.getDetachedCriteria());
		contiene_video = new CollectionExpression("ORM_contiene_video", this.getDetachedCriteria());
	}
	
	public VideoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, VideoCriteria.class);
		IDmedia = new IntegerExpression("IDmedia", this.getDetachedCriteria());
		url = new StringExpression("url", this.getDetachedCriteria());
		contiene_video = new CollectionExpression("ORM_contiene_video", this.getDetachedCriteria());
	}
	
	public MensajeDetachedCriteria createContiene_videoCriteria() {
		return new MensajeDetachedCriteria(createCriteria("ORM_contiene_video"));
	}
	
	public Video uniqueVideo(PersistentSession session) {
		return (Video) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Video[] listVideo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Video[]) list.toArray(new Video[list.size()]);
	}
}

