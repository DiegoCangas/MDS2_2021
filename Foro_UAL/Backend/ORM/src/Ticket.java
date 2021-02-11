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
@Table(name="`Ticket`")
public class Ticket implements Serializable {
	public Ticket() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_TICKET_TIENE) {
			return ORM_tiene;
		}
		else if (key == ORMConstants.KEY_TICKET_RECIBE) {
			return ORM_recibe;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_TICKET_ENVIA) {
			this.envia = (Moderador) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="`ID`", nullable=false, length=20)	
	@Id	
	@GeneratedValue(generator="TICKET_IDTICKET_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="TICKET_IDTICKET_GENERATOR", strategy="identity")	
	private Long idticket;
	
	@Column(name="`Mensaje`", nullable=true, length=255)	
	private String mensaje;
	
	@Column(name="`NombreUsuario`", nullable=true, length=255)	
	private String nombreUsuario;
	
	@ManyToOne(targetEntity=Moderador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`ModeradorUsuarioID2`", referencedColumnName="`UsuarioID`", nullable=false) }, foreignKey=@ForeignKey(name="FKTicket984206"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Moderador envia;
	
	@OneToMany(mappedBy="pertenece_a", targetEntity=Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tiene = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_son_recibidos", targetEntity=Administradores.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_recibe = new java.util.HashSet();
	
	private void setIdticket(long value) {
		setIdticket(new Long(value));
	}
	
	private void setIdticket(Long value) {
		this.idticket = value;
	}
	
	public Long getIdticket() {
		return idticket;
	}
	
	public Long getORMID() {
		return getIdticket();
	}
	
	public void setMensaje(String value) {
		this.mensaje = value;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	public void setNombreUsuario(String value) {
		this.nombreUsuario = value;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public void setEnvia(Moderador value) {
		if (envia != null) {
			envia.es_enviado.remove(this);
		}
		if (value != null) {
			value.es_enviado.add(this);
		}
	}
	
	public Moderador getEnvia() {
		return envia;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Envia(Moderador value) {
		this.envia = value;
	}
	
	private Moderador getORM_Envia() {
		return envia;
	}
	
	private void setORM_Tiene(java.util.Set value) {
		this.ORM_tiene = value;
	}
	
	private java.util.Set getORM_Tiene() {
		return ORM_tiene;
	}
	
	@Transient	
	public final UsuarioSetCollection tiene = new UsuarioSetCollection(this, _ormAdapter, ORMConstants.KEY_TICKET_TIENE, ORMConstants.KEY_USUARIO_PERTENECE_A, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Recibe(java.util.Set value) {
		this.ORM_recibe = value;
	}
	
	private java.util.Set getORM_Recibe() {
		return ORM_recibe;
	}
	
	@Transient	
	public final AdministradoresSetCollection recibe = new AdministradoresSetCollection(this, _ormAdapter, ORMConstants.KEY_TICKET_RECIBE, ORMConstants.KEY_ADMINISTRADORES_SON_RECIBIDOS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdticket());
	}
	
}
