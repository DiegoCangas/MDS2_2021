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

public class ReporteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idReporte;
	public final LongExpression es_reportadoId;
	public final AssociationExpression es_reportado;
	public final LongExpression usuarioId;
	public final AssociationExpression usuario;
	public final StringExpression motivo;
	
	public ReporteDetachedCriteria() {
		super(Reporte.class, ReporteCriteria.class);
		idReporte = new IntegerExpression("idReporte", this.getDetachedCriteria());
		es_reportadoId = new LongExpression("es_reportado.idMensaje", this.getDetachedCriteria());
		es_reportado = new AssociationExpression("es_reportado", this.getDetachedCriteria());
		usuarioId = new LongExpression("usuario.ID", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
		motivo = new StringExpression("motivo", this.getDetachedCriteria());
	}
	
	public ReporteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ReporteCriteria.class);
		idReporte = new IntegerExpression("idReporte", this.getDetachedCriteria());
		es_reportadoId = new LongExpression("es_reportado.idMensaje", this.getDetachedCriteria());
		es_reportado = new AssociationExpression("es_reportado", this.getDetachedCriteria());
		usuarioId = new LongExpression("usuario.ID", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
		motivo = new StringExpression("motivo", this.getDetachedCriteria());
	}
	
	public MensajeDetachedCriteria createEs_reportadoCriteria() {
		return new MensajeDetachedCriteria(createCriteria("es_reportado"));
	}
	
	public UsuarioDetachedCriteria createUsuarioCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("usuario"));
	}
	
	public Reporte uniqueReporte(PersistentSession session) {
		return (Reporte) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Reporte[] listReporte(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Reporte[]) list.toArray(new Reporte[list.size()]);
	}
}

