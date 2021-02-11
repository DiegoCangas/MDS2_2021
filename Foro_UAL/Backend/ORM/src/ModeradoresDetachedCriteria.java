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

public class ModeradoresDetachedCriteria extends AbstractORMDetachedCriteria {
	public final LongExpression ID;
	
	public ModeradoresDetachedCriteria() {
		super(Moderadores.class, ModeradoresCriteria.class);
		ID = new LongExpression("ID", this.getDetachedCriteria());
	}
	
	public ModeradoresDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ModeradoresCriteria.class);
		ID = new LongExpression("ID", this.getDetachedCriteria());
	}
	
	public Moderadores uniqueModeradores(PersistentSession session) {
		return (Moderadores) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Moderadores[] listModeradores(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Moderadores[]) list.toArray(new Moderadores[list.size()]);
	}
}

