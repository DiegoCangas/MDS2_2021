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
@Table(name="`Tema`")
public class Tema implements Serializable {
	public Tema() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_TEMA_COMPONE) {
			return ORM_compone;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_TEMA_CREA_TEMAS) {
			this.crea_temas = (Usuario) owner;
		}
		
		else if (key == ORMConstants.KEY_TEMA_OCULTA) {
			this.oculta = (Moderador) owner;
		}
		
		else if (key == ORMConstants.KEY_TEMA_SECCION) {
			this.seccion = (Seccion) owner;
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
	@GeneratedValue(generator="TEMA_IDTEMA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="TEMA_IDTEMA_GENERATOR", strategy="identity")	
	private Long IDtema;
	
	@ManyToOne(targetEntity=Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`UsuarioID`", referencedColumnName="`ID`", nullable=false) }, foreignKey=@ForeignKey(name="FKTema627555"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Usuario crea_temas;
	
	@ManyToOne(targetEntity=Seccion.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`SeccionID`", referencedColumnName="`ID`") }, foreignKey=@ForeignKey(name="FKTema567611"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Seccion seccion;
	
	@Column(name="`NumeroMeGusta`", nullable=false, length=10)	
	private int numeroMeGusta;
	
	@Column(name="`NombreUsuario`", nullable=true, length=255)	
	private String nombreUsuario;
	
	@Column(name="`TipoTema`", nullable=true, length=10)	
	private Integer tipoTema;
	
	@Column(name="`Titulo`", nullable=true, length=255)	
	private String Titulo;
	
	@Column(name="`Subtitulo`", nullable=true, length=255)	
	private String subtitulo;
	
	@Column(name="`FechaCreacion`", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fechaCreacion;
	
	@Column(name="`NumMensjes`", nullable=false, length=10)	
	private int numMensjes;
	
	@ManyToOne(targetEntity=Moderador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`ModeradorUsuarioID2`", referencedColumnName="`UsuarioID`", nullable=false) }, foreignKey=@ForeignKey(name="FKTema714090"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Moderador oculta;
	
	@Column(name="`Fecha`", nullable=true)	
	private date fecha;
	
	@OneToMany(mappedBy="mensaje_", targetEntity=Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_compone = new java.util.HashSet();
	
	public void setNumeroMeGusta(int value) {
		this.numeroMeGusta = value;
	}
	
	public int getNumeroMeGusta() {
		return numeroMeGusta;
	}
	
	public void setNombreUsuario(String value) {
		this.nombreUsuario = value;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public void setTipoTema(int value) {
		setTipoTema(new Integer(value));
	}
	
	public void setTipoTema(Integer value) {
		this.tipoTema = value;
	}
	
	public Integer getTipoTema() {
		return tipoTema;
	}
	
	private void setIDtema(long value) {
		setIDtema(new Long(value));
	}
	
	private void setIDtema(Long value) {
		this.IDtema = value;
	}
	
	public Long getIDtema() {
		return IDtema;
	}
	
	public Long getORMID() {
		return getIDtema();
	}
	
	public void setTitulo(String value) {
		this.Titulo = value;
	}
	
	public String getTitulo() {
		return Titulo;
	}
	
	public void setSubtitulo(String value) {
		this.subtitulo = value;
	}
	
	public String getSubtitulo() {
		return subtitulo;
	}
	
	public void setFechaCreacion(java.util.Date value) {
		this.fechaCreacion = value;
	}
	
	public java.util.Date getFechaCreacion() {
		return fechaCreacion;
	}
	
	public void setNumMensjes(int value) {
		this.numMensjes = value;
	}
	
	public int getNumMensjes() {
		return numMensjes;
	}
	
	public void setFecha(date value) {
		this.fecha = value;
	}
	
	public date getFecha() {
		return fecha;
	}
	
	private void setORM_Compone(java.util.Set value) {
		this.ORM_compone = value;
	}
	
	private java.util.Set getORM_Compone() {
		return ORM_compone;
	}
	
	@Transient	
	public final MensajeSetCollection compone = new MensajeSetCollection(this, _ormAdapter, ORMConstants.KEY_TEMA_COMPONE, ORMConstants.KEY_MENSAJE_MENSAJE_, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setCrea_temas(Usuario value) {
		if (crea_temas != null) {
			crea_temas.es_creado.remove(this);
		}
		if (value != null) {
			value.es_creado.add(this);
		}
	}
	
	public Usuario getCrea_temas() {
		return crea_temas;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Crea_temas(Usuario value) {
		this.crea_temas = value;
	}
	
	private Usuario getORM_Crea_temas() {
		return crea_temas;
	}
	
	public void setOculta(Moderador value) {
		if (oculta != null) {
			oculta.temas.remove(this);
		}
		if (value != null) {
			value.temas.add(this);
		}
	}
	
	public Moderador getOculta() {
		return oculta;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Oculta(Moderador value) {
		this.oculta = value;
	}
	
	private Moderador getORM_Oculta() {
		return oculta;
	}
	
	public void setSeccion(Seccion value) {
		if (seccion != null) {
			seccion.temas.remove(this);
		}
		if (value != null) {
			value.temas.add(this);
		}
	}
	
	public Seccion getSeccion() {
		return seccion;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Seccion(Seccion value) {
		this.seccion = value;
	}
	
	private Seccion getORM_Seccion() {
		return seccion;
	}
	
	public String toString() {
		return String.valueOf(getIDtema());
	}
	
}
