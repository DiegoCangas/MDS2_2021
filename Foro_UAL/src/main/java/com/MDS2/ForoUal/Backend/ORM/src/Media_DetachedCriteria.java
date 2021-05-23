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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Media_DetachedCriteria extends AbstractORMDetachedCriteria {
	public final LongExpression IDmedia;
	public final IntegerExpression mensaje_mediaId;
	public final AssociationExpression mensaje_media;
	public final StringExpression url;
	
	public Media_DetachedCriteria() {
		super(com.MDS2.ForoUal.Backend.ORM.src.Media_.class, com.MDS2.ForoUal.Backend.ORM.src.Media_Criteria.class);
		IDmedia = new LongExpression("IDmedia", this.getDetachedCriteria());
		mensaje_mediaId = new IntegerExpression("mensaje_media.ID", this.getDetachedCriteria());
		mensaje_media = new AssociationExpression("mensaje_media", this.getDetachedCriteria());
		url = new StringExpression("url", this.getDetachedCriteria());
	}
	
	public Media_DetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.MDS2.ForoUal.Backend.ORM.src.Media_Criteria.class);
		IDmedia = new LongExpression("IDmedia", this.getDetachedCriteria());
		mensaje_mediaId = new IntegerExpression("mensaje_media.ID", this.getDetachedCriteria());
		mensaje_media = new AssociationExpression("mensaje_media", this.getDetachedCriteria());
		url = new StringExpression("url", this.getDetachedCriteria());
	}
	
	public com.MDS2.ForoUal.Backend.ORM.src.MensajeDetachedCriteria createMensaje_mediaCriteria() {
		return new com.MDS2.ForoUal.Backend.ORM.src.MensajeDetachedCriteria(createCriteria("mensaje_media"));
	}
	
	public Media_ uniqueMedia_(PersistentSession session) {
		return (Media_) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Media_[] listMedia_(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Media_[]) list.toArray(new Media_[list.size()]);
	}
}

