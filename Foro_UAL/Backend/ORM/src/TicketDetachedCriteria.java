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

public class TicketDetachedCriteria extends AbstractORMDetachedCriteria {
	public final LongExpression idticket;
	public final StringExpression mensaje;
	public final StringExpression nombreUsuario;
	public final LongExpression enviaId;
	public final AssociationExpression envia;
	public final CollectionExpression tiene;
	public final CollectionExpression recibe;
	
	public TicketDetachedCriteria() {
		super(Ticket.class, TicketCriteria.class);
		idticket = new LongExpression("idticket", this.getDetachedCriteria());
		mensaje = new StringExpression("mensaje", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		enviaId = new LongExpression("envia.", this.getDetachedCriteria());
		envia = new AssociationExpression("envia", this.getDetachedCriteria());
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
		recibe = new CollectionExpression("ORM_recibe", this.getDetachedCriteria());
	}
	
	public TicketDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, TicketCriteria.class);
		idticket = new LongExpression("idticket", this.getDetachedCriteria());
		mensaje = new StringExpression("mensaje", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		enviaId = new LongExpression("envia.", this.getDetachedCriteria());
		envia = new AssociationExpression("envia", this.getDetachedCriteria());
		tiene = new CollectionExpression("ORM_tiene", this.getDetachedCriteria());
		recibe = new CollectionExpression("ORM_recibe", this.getDetachedCriteria());
	}
	
	public ModeradorDetachedCriteria createEnviaCriteria() {
		return new ModeradorDetachedCriteria(createCriteria("envia"));
	}
	
	public UsuarioDetachedCriteria createTieneCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("ORM_tiene"));
	}
	
	public AdministradoresDetachedCriteria createRecibeCriteria() {
		return new AdministradoresDetachedCriteria(createCriteria("ORM_recibe"));
	}
	
	public Ticket uniqueTicket(PersistentSession session) {
		return (Ticket) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Ticket[] listTicket(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Ticket[]) list.toArray(new Ticket[list.size()]);
	}
}

