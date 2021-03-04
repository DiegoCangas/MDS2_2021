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
package com.MDS2.ForoUal.Backend.ORM.src;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ReporteCriteria extends AbstractORMCriteria {
	public final LongExpression idReporte;
	public final IntegerExpression mensaje_reporteId;
	public final AssociationExpression mensaje_reporte;
	public final LongExpression usuario_reporteId;
	public final AssociationExpression usuario_reporte;
	public final StringExpression motivo;
	
	public ReporteCriteria(Criteria criteria) {
		super(criteria);
		idReporte = new LongExpression("idReporte", this);
		mensaje_reporteId = new IntegerExpression("mensaje_reporte.ID", this);
		mensaje_reporte = new AssociationExpression("mensaje_reporte", this);
		usuario_reporteId = new LongExpression("usuario_reporte.ID", this);
		usuario_reporte = new AssociationExpression("usuario_reporte", this);
		motivo = new StringExpression("motivo", this);
	}
	
	public ReporteCriteria(PersistentSession session) {
		this(session.createCriteria(Reporte.class));
	}
	
	public ReporteCriteria() throws PersistentException {
		this(MDS1PersistentManager.instance().getSession());
	}
	
	public MensajeCriteria createMensaje_reporteCriteria() {
		return new MensajeCriteria(createCriteria("mensaje_reporte"));
	}
	
	public UsuarioCriteria createUsuario_reporteCriteria() {
		return new UsuarioCriteria(createCriteria("usuario_reporte"));
	}
	
	public Reporte uniqueReporte() {
		return (Reporte) super.uniqueResult();
	}
	
	public Reporte[] listReporte() {
		java.util.List list = super.list();
		return (Reporte[]) list.toArray(new Reporte[list.size()]);
	}
}

