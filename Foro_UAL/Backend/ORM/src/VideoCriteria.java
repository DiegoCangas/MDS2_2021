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

public class VideoCriteria extends AbstractORMCriteria {
	public final IntegerExpression IDmedia;
	public final StringExpression url;
	public final CollectionExpression contiene_video;
	
	public VideoCriteria(Criteria criteria) {
		super(criteria);
		IDmedia = new IntegerExpression("IDmedia", this);
		url = new StringExpression("url", this);
		contiene_video = new CollectionExpression("ORM_contiene_video", this);
	}
	
	public VideoCriteria(PersistentSession session) {
		this(session.createCriteria(Video.class));
	}
	
	public VideoCriteria() throws PersistentException {
		this(MDS1PersistentManager.instance().getSession());
	}
	
	public MensajeCriteria createContiene_videoCriteria() {
		return new MensajeCriteria(createCriteria("ORM_contiene_video"));
	}
	
	public Video uniqueVideo() {
		return (Video) super.uniqueResult();
	}
	
	public Video[] listVideo() {
		java.util.List list = super.list();
		return (Video[]) list.toArray(new Video[list.size()]);
	}
}

