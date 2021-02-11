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

public class Media_Criteria extends AbstractORMCriteria {
	public final IntegerExpression IDmedia;
	public final StringExpression url;
	
	public Media_Criteria(Criteria criteria) {
		super(criteria);
		IDmedia = new IntegerExpression("IDmedia", this);
		url = new StringExpression("url", this);
	}
	
	public Media_Criteria(PersistentSession session) {
		this(session.createCriteria(Media_.class));
	}
	
	public Media_Criteria() throws PersistentException {
		this(MDS1PersistentManager.instance().getSession());
	}
	
	public Media_ uniqueMedia_() {
		return (Media_) super.uniqueResult();
	}
	
	public Media_[] listMedia_() {
		java.util.List list = super.list();
		return (Media_[]) list.toArray(new Media_[list.size()]);
	}
}

