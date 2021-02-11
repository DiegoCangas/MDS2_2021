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

public class ReporteCriteria extends AbstractORMCriteria {
	public final IntegerExpression idReporte;
	public final LongExpression es_reportadoId;
	public final AssociationExpression es_reportado;
	public final LongExpression usuarioId;
	public final AssociationExpression usuario;
	public final StringExpression motivo;
	
	public ReporteCriteria(Criteria criteria) {
		super(criteria);
		idReporte = new IntegerExpression("idReporte", this);
		es_reportadoId = new LongExpression("es_reportado.idMensaje", this);
		es_reportado = new AssociationExpression("es_reportado", this);
		usuarioId = new LongExpression("usuario.ID", this);
		usuario = new AssociationExpression("usuario", this);
		motivo = new StringExpression("motivo", this);
	}
	
	public ReporteCriteria(PersistentSession session) {
		this(session.createCriteria(Reporte.class));
	}
	
	public ReporteCriteria() throws PersistentException {
		this(MDS1PersistentManager.instance().getSession());
	}
	
	public MensajeCriteria createEs_reportadoCriteria() {
		return new MensajeCriteria(createCriteria("es_reportado"));
	}
	
	public UsuarioCriteria createUsuarioCriteria() {
		return new UsuarioCriteria(createCriteria("usuario"));
	}
	
	public Reporte uniqueReporte() {
		return (Reporte) super.uniqueResult();
	}
	
	public Reporte[] listReporte() {
		java.util.List list = super.list();
		return (Reporte[]) list.toArray(new Reporte[list.size()]);
	}
}

