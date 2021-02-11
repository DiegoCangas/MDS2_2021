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
@Table(name="`Administradores`")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Administradores")
public class Administradores extends Moderador implements Serializable {
	public Administradores() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ADMINISTRADORES_SON_RECIBIDOS) {
			return ORM_son_recibidos;
		}
		else if (key == ORMConstants.KEY_ADMINISTRADORES_ES_CREADA) {
			return ORM_es_creada;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@ManyToMany(targetEntity=Ticket.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="`Ticket_Administradores`", joinColumns={ @JoinColumn(name="`AdministradoresUsuarioID`") }, inverseJoinColumns={ @JoinColumn(name="`TicketID`") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_son_recibidos = new java.util.HashSet();
	
	@OneToMany(mappedBy="crea", targetEntity=Seccion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_creada = new java.util.HashSet();
	
	private void setORM_Son_recibidos(java.util.Set value) {
		this.ORM_son_recibidos = value;
	}
	
	private java.util.Set getORM_Son_recibidos() {
		return ORM_son_recibidos;
	}
	
	@Transient	
	public final TicketSetCollection son_recibidos = new TicketSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADORES_SON_RECIBIDOS, ORMConstants.KEY_TICKET_RECIBE, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Es_creada(java.util.Set value) {
		this.ORM_es_creada = value;
	}
	
	private java.util.Set getORM_Es_creada() {
		return ORM_es_creada;
	}
	
	@Transient	
	public final SeccionSetCollection es_creada = new SeccionSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADORES_ES_CREADA, ORMConstants.KEY_SECCION_CREA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
