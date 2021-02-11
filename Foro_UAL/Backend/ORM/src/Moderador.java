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
import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="`Moderador`")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Moderador")
@PrimaryKeyJoinColumn(name="`UsuarioID`", referencedColumnName="`ID`")
public class Moderador extends Usuario implements Serializable {
	public Moderador() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_MODERADOR_TEMAS) {
			return ORM_temas;
		}
		else if (key == ORMConstants.KEY_MODERADOR_ES_ENVIADO) {
			return ORM_es_enviado;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@OneToMany(mappedBy="oculta", targetEntity=Tema.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_temas = new java.util.HashSet();
	
	@OneToMany(mappedBy="envia", targetEntity=Ticket.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_enviado = new java.util.HashSet();
	
	private void setORM_Temas(java.util.Set value) {
		this.ORM_temas = value;
	}
	
	private java.util.Set getORM_Temas() {
		return ORM_temas;
	}
	
	@Transient	
	public final TemaSetCollection temas = new TemaSetCollection(this, _ormAdapter, ORMConstants.KEY_MODERADOR_TEMAS, ORMConstants.KEY_TEMA_OCULTA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Es_enviado(java.util.Set value) {
		this.ORM_es_enviado = value;
	}
	
	private java.util.Set getORM_Es_enviado() {
		return ORM_es_enviado;
	}
	
	@Transient	
	public final TicketSetCollection es_enviado = new TicketSetCollection(this, _ormAdapter, ORMConstants.KEY_MODERADOR_ES_ENVIADO, ORMConstants.KEY_TICKET_ENVIA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
