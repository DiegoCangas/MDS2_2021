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
@Table(name="`Usuario`")
@Inheritance(strategy=InheritanceType.JOINED)
public class Usuario implements Serializable {
	public Usuario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USUARIO_REPORTES) {
			return ORM_reportes;
		}
		else if (key == ORMConstants.KEY_USUARIO_AMIGO_DE) {
			return ORM_amigo_de;
		}
		else if (key == ORMConstants.KEY_USUARIO_PERTENECE) {
			return ORM_pertenece;
		}
		else if (key == ORMConstants.KEY_USUARIO_USUARIOS) {
			return ORM_usuarios;
		}
		else if (key == ORMConstants.KEY_USUARIO_ES_CREADO) {
			return ORM_es_creado;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_USUARIO_PERTENECE_A) {
			this.pertenece_a = (Ticket) owner;
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
	@GeneratedValue(generator="USUARIO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="USUARIO_ID_GENERATOR", strategy="identity")	
	private long ID;
	
	@ManyToOne(targetEntity=Ticket.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`TicketID`", referencedColumnName="`ID`") }, foreignKey=@ForeignKey(name="FKUsuario730539"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Ticket pertenece_a;
	
	@Column(name="`Email`", nullable=true, length=255)	
	private String email;
	
	@Column(name="`NombreUsuario`", nullable=true, length=255)	
	private String nombreUsuario;
	
	@Column(name="`FotoPerfil`", nullable=true, length=10)	
	private Integer fotoPerfil;
	
	@Column(name="`Descripcion`", nullable=true, length=255)	
	private String descripcion;
	
	@Column(name="`Contrasenia`", nullable=true, length=255)	
	private String contrasenia;
	
	@Column(name="`Marcado`", nullable=false, length=1)	
	private boolean marcado;
	
	@Column(name="`Baneado`", nullable=false, length=1)	
	private boolean baneado;
	
	@Column(name="`IDusuario`", nullable=true, length=20)	
	private Long IDusuario;
	
	@OneToMany(mappedBy="usuario", targetEntity=Reporte.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_reportes = new java.util.HashSet();
	
	@ManyToMany(targetEntity=Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="`usuario_usuario`", joinColumns={ @JoinColumn(name="`UsuarioID2`") }, inverseJoinColumns={ @JoinColumn(name="`UsuarioID`") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_amigo_de = new java.util.HashSet();
	
	@OneToMany(mappedBy="envia", targetEntity=Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_pertenece = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_amigo_de", targetEntity=Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_usuarios = new java.util.HashSet();
	
	@OneToMany(mappedBy="crea_temas", targetEntity=Tema.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_creado = new java.util.HashSet();
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setNombreUsuario(String value) {
		this.nombreUsuario = value;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public void setFotoPerfil(int value) {
		setFotoPerfil(new Integer(value));
	}
	
	public void setFotoPerfil(Integer value) {
		this.fotoPerfil = value;
	}
	
	public Integer getFotoPerfil() {
		return fotoPerfil;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setContrasenia(String value) {
		this.contrasenia = value;
	}
	
	public String getContrasenia() {
		return contrasenia;
	}
	
	public void setMarcado(boolean value) {
		this.marcado = value;
	}
	
	public boolean getMarcado() {
		return marcado;
	}
	
	public void setBaneado(boolean value) {
		this.baneado = value;
	}
	
	public boolean getBaneado() {
		return baneado;
	}
	
	public void setIDusuario(long value) {
		setIDusuario(new Long(value));
	}
	
	public void setIDusuario(Long value) {
		this.IDusuario = value;
	}
	
	public Long getIDusuario() {
		return IDusuario;
	}
	
	private void setID(long value) {
		this.ID = value;
	}
	
	public long getID() {
		return ID;
	}
	
	public long getORMID() {
		return getID();
	}
	
	private void setORM_Reportes(java.util.Set value) {
		this.ORM_reportes = value;
	}
	
	private java.util.Set getORM_Reportes() {
		return ORM_reportes;
	}
	
	@Transient	
	public final ReporteSetCollection reportes = new ReporteSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REPORTES, ORMConstants.KEY_REPORTE_USUARIO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Amigo_de(java.util.Set value) {
		this.ORM_amigo_de = value;
	}
	
	private java.util.Set getORM_Amigo_de() {
		return ORM_amigo_de;
	}
	
	@Transient	
	public final UsuarioSetCollection amigo_de = new UsuarioSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_AMIGO_DE, ORMConstants.KEY_USUARIO_USUARIOS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setPertenece_a(Ticket value) {
		if (pertenece_a != null) {
			pertenece_a.tiene.remove(this);
		}
		if (value != null) {
			value.tiene.add(this);
		}
	}
	
	public Ticket getPertenece_a() {
		return pertenece_a;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Pertenece_a(Ticket value) {
		this.pertenece_a = value;
	}
	
	private Ticket getORM_Pertenece_a() {
		return pertenece_a;
	}
	
	private void setORM_Pertenece(java.util.Set value) {
		this.ORM_pertenece = value;
	}
	
	private java.util.Set getORM_Pertenece() {
		return ORM_pertenece;
	}
	
	@Transient	
	public final MensajeSetCollection pertenece = new MensajeSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_PERTENECE, ORMConstants.KEY_MENSAJE_ENVIA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Usuarios(java.util.Set value) {
		this.ORM_usuarios = value;
	}
	
	private java.util.Set getORM_Usuarios() {
		return ORM_usuarios;
	}
	
	@Transient	
	public final UsuarioSetCollection usuarios = new UsuarioSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_USUARIOS, ORMConstants.KEY_USUARIO_AMIGO_DE, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Es_creado(java.util.Set value) {
		this.ORM_es_creado = value;
	}
	
	private java.util.Set getORM_Es_creado() {
		return ORM_es_creado;
	}
	
	@Transient	
	public final TemaSetCollection es_creado = new TemaSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_ES_CREADO, ORMConstants.KEY_TEMA_CREA_TEMAS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
