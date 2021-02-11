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

public class Media_DetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression IDmedia;
	public final StringExpression url;
	
	public Media_DetachedCriteria() {
		super(Media_.class, Media_Criteria.class);
		IDmedia = new IntegerExpression("IDmedia", this.getDetachedCriteria());
		url = new StringExpression("url", this.getDetachedCriteria());
	}
	
	public Media_DetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, Media_Criteria.class);
		IDmedia = new IntegerExpression("IDmedia", this.getDetachedCriteria());
		url = new StringExpression("url", this.getDetachedCriteria());
	}
	
	public Media_ uniqueMedia_(PersistentSession session) {
		return (Media_) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Media_[] listMedia_(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Media_[]) list.toArray(new Media_[list.size()]);
	}
}

