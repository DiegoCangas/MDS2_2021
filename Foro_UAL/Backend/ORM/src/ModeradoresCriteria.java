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

public class ModeradoresCriteria extends AbstractORMCriteria {
	public final LongExpression ID;
	
	public ModeradoresCriteria(Criteria criteria) {
		super(criteria);
		ID = new LongExpression("ID", this);
	}
	
	public ModeradoresCriteria(PersistentSession session) {
		this(session.createCriteria(Moderadores.class));
	}
	
	public ModeradoresCriteria() throws PersistentException {
		this(MDS1PersistentManager.instance().getSession());
	}
	
	public Moderadores uniqueModeradores() {
		return (Moderadores) super.uniqueResult();
	}
	
	public Moderadores[] listModeradores() {
		java.util.List list = super.list();
		return (Moderadores[]) list.toArray(new Moderadores[list.size()]);
	}
}

