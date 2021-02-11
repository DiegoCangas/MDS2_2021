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

public class TicketCriteria extends AbstractORMCriteria {
	public final LongExpression idticket;
	public final StringExpression mensaje;
	public final StringExpression nombreUsuario;
	public final LongExpression enviaId;
	public final AssociationExpression envia;
	public final CollectionExpression tiene;
	public final CollectionExpression recibe;
	
	public TicketCriteria(Criteria criteria) {
		super(criteria);
		idticket = new LongExpression("idticket", this);
		mensaje = new StringExpression("mensaje", this);
		nombreUsuario = new StringExpression("nombreUsuario", this);
		enviaId = new LongExpression("envia.", this);
		envia = new AssociationExpression("envia", this);
		tiene = new CollectionExpression("ORM_tiene", this);
		recibe = new CollectionExpression("ORM_recibe", this);
	}
	
	public TicketCriteria(PersistentSession session) {
		this(session.createCriteria(Ticket.class));
	}
	
	public TicketCriteria() throws PersistentException {
		this(MDS1PersistentManager.instance().getSession());
	}
	
	public ModeradorCriteria createEnviaCriteria() {
		return new ModeradorCriteria(createCriteria("envia"));
	}
	
	public UsuarioCriteria createTieneCriteria() {
		return new UsuarioCriteria(createCriteria("ORM_tiene"));
	}
	
	public AdministradoresCriteria createRecibeCriteria() {
		return new AdministradoresCriteria(createCriteria("ORM_recibe"));
	}
	
	public Ticket uniqueTicket() {
		return (Ticket) super.uniqueResult();
	}
	
	public Ticket[] listTicket() {
		java.util.List list = super.list();
		return (Ticket[]) list.toArray(new Ticket[list.size()]);
	}
}

