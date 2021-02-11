package com.MDS2.ForoUal.Backend.ORM.src;
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
		else if (key == ORMConstants.KEY_TEMA_GUSTATEMA) {
			return ORM_gustaTema;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_TEMA_CREA_TEMA) {
			this.crea_tema = (Usuario) owner;
		}
		
		else if (key == ORMConstants.KEY_TEMA_CONTIENE) {
			this.contiene = (Seccion) owner;
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
	
	@Column(name="`ID`", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="TEMA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="TEMA_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`UsuarioID`", referencedColumnName="`ID`") }, foreignKey=@ForeignKey(name="FKTema627555"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Usuario crea_tema;
	
	@ManyToOne(targetEntity=Seccion.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`SeccionID`", referencedColumnName="`ID`") }, foreignKey=@ForeignKey(name="FKTema567611"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Seccion contiene;
	
	@Column(name="`NumeroMeGusta`", nullable=true, length=10)	
	private int numeroMeGusta;
	
	@Column(name="`NombreUsuario`", nullable=true, length=255)	
	private String nombreUsuario;
	
	@Column(name="`TipoTema`", nullable=true, length=10)	
	private Integer tipoTema;
	
	@Column(name="`Titulo`", nullable=false, length=255)	
	private String Titulo;
	
	@Column(name="`Subtitulo`", nullable=false, length=255)	
	private String subtitulo;
	
	@Column(name="`FechaCreacion`", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fechaCreacion;
	
	@Column(name="`NumMensjes`", nullable=true, length=10)	
	private int numMensjes;
	
	@Column(name="`IdTema`", nullable=true, length=20)	
	private long idTema;
	
	@OneToMany(mappedBy="mensaje_", targetEntity=Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_compone = new java.util.HashSet();
	
	@ManyToMany(targetEntity=Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="`Usuario_Tema`", joinColumns={ @JoinColumn(name="`TemaID`") }, inverseJoinColumns={ @JoinColumn(name="`UsuarioID`") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_gustaTema = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
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
	
	public void setIdTema(long value) {
		this.idTema = value;
	}
	
	public long getIdTema() {
		return idTema;
	}
	
	private void setORM_Compone(java.util.Set value) {
		this.ORM_compone = value;
	}
	
	private java.util.Set getORM_Compone() {
		return ORM_compone;
	}
	
	@Transient	
	public final MensajeSetCollection compone = new MensajeSetCollection(this, _ormAdapter, ORMConstants.KEY_TEMA_COMPONE, ORMConstants.KEY_MENSAJE_MENSAJE_, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setCrea_tema(Usuario value) {
		if (crea_tema != null) {
			crea_tema.es_creado.remove(this);
		}
		if (value != null) {
			value.es_creado.add(this);
		}
	}
	
	public Usuario getCrea_tema() {
		return crea_tema;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Crea_tema(Usuario value) {
		this.crea_tema = value;
	}
	
	private Usuario getORM_Crea_tema() {
		return crea_tema;
	}
	
	private void setORM_GustaTema(java.util.Set value) {
		this.ORM_gustaTema = value;
	}
	
	private java.util.Set getORM_GustaTema() {
		return ORM_gustaTema;
	}
	
	@Transient	
	public final UsuarioSetCollection gustaTema = new UsuarioSetCollection(this, _ormAdapter, ORMConstants.KEY_TEMA_GUSTATEMA, ORMConstants.KEY_USUARIO_MEGUSTA_TEMA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setContiene(Seccion value) {
		if (contiene != null) {
			contiene.temas.remove(this);
		}
		if (value != null) {
			value.temas.add(this);
		}
	}
	
	public Seccion getContiene() {
		return contiene;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Contiene(Seccion value) {
		this.contiene = value;
	}
	
	private Seccion getORM_Contiene() {
		return contiene;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
