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
@Table(name="`Mensaje`")
public class Mensaje implements Serializable {
	public Mensaje() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_MENSAJE_CORRESPONDEN) {
			return ORM_corresponden;
		}
		else if (key == ORMConstants.KEY_MENSAJE_IMAGEN) {
			return ORM_imagen;
		}
		else if (key == ORMConstants.KEY_MENSAJE_RESPONDIDO_POR) {
			return ORM_respondido_por;
		}
		else if (key == ORMConstants.KEY_MENSAJE_MENSAJES) {
			return ORM_mensajes;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_MENSAJE_ENVIA) {
			this.envia = (Usuario) owner;
		}
		
		else if (key == ORMConstants.KEY_MENSAJE_VIDEOS) {
			this.videos = (Video) owner;
		}
		
		else if (key == ORMConstants.KEY_MENSAJE_MENSAJE_) {
			this.mensaje_ = (Tema) owner;
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
	@GeneratedValue(generator="MENSAJE_IDMENSAJE_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MENSAJE_IDMENSAJE_GENERATOR", strategy="identity")	
	private Long idMensaje;
	
	@ManyToOne(targetEntity=Video.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`VideoMediaID`", referencedColumnName="`MediaID`") }, foreignKey=@ForeignKey(name="FKMensaje9803"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Video videos;
	
	@ManyToOne(targetEntity=Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`UsuarioID`", referencedColumnName="`ID`", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje983572"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Usuario envia;
	
	@ManyToOne(targetEntity=Tema.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`TemaID`", referencedColumnName="`ID`", nullable=false) }, foreignKey=@ForeignKey(name="FKMensaje66743"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Tema mensaje_;
	
	@Column(name="`Texto`", nullable=true, length=255)	
	private String texto;
	
	@Column(name="`NumeroMeGusta`", nullable=false, length=10)	
	private int numeroMeGusta;
	
	@Column(name="`NombreUsuario`", nullable=true, length=255)	
	private String nombreUsuario;
	
	@Column(name="`Marcado`", nullable=false, length=1)	
	private boolean marcado;
	
	@Column(name="`Fecha`", nullable=true)	
	private date fecha;
	
	@OneToMany(mappedBy="es_reportado", targetEntity=Reporte.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_corresponden = new java.util.HashSet();
	
	@ManyToMany(targetEntity=Imagen.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="`imagen_mensaje`", joinColumns={ @JoinColumn(name="`MensajeID`") }, inverseJoinColumns={ @JoinColumn(name="`ImagenMediaID`") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_imagen = new java.util.HashSet();
	
	@ManyToMany(targetEntity=Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="`mensaje_mensaje`", joinColumns={ @JoinColumn(name="`MensajeID2`") }, inverseJoinColumns={ @JoinColumn(name="`MensajeID`") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_respondido_por = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_respondido_por", targetEntity=Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_mensajes = new java.util.HashSet();
	
	private void setIdMensaje(long value) {
		setIdMensaje(new Long(value));
	}
	
	private void setIdMensaje(Long value) {
		this.idMensaje = value;
	}
	
	public Long getIdMensaje() {
		return idMensaje;
	}
	
	public Long getORMID() {
		return getIdMensaje();
	}
	
	public void setTexto(String value) {
		this.texto = value;
	}
	
	public String getTexto() {
		return texto;
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
	
	public void setMarcado(boolean value) {
		this.marcado = value;
	}
	
	public boolean getMarcado() {
		return marcado;
	}
	
	public void setFecha(date value) {
		this.fecha = value;
	}
	
	public date getFecha() {
		return fecha;
	}
	
	public void setEnvia(Usuario value) {
		if (envia != null) {
			envia.pertenece.remove(this);
		}
		if (value != null) {
			value.pertenece.add(this);
		}
	}
	
	public Usuario getEnvia() {
		return envia;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Envia(Usuario value) {
		this.envia = value;
	}
	
	private Usuario getORM_Envia() {
		return envia;
	}
	
	private void setORM_Corresponden(java.util.Set value) {
		this.ORM_corresponden = value;
	}
	
	private java.util.Set getORM_Corresponden() {
		return ORM_corresponden;
	}
	
	@Transient	
	public final ReporteSetCollection corresponden = new ReporteSetCollection(this, _ormAdapter, ORMConstants.KEY_MENSAJE_CORRESPONDEN, ORMConstants.KEY_REPORTE_ES_REPORTADO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setVideos(Video value) {
		if (videos != null) {
			videos.contiene_video.remove(this);
		}
		if (value != null) {
			value.contiene_video.add(this);
		}
	}
	
	public Video getVideos() {
		return videos;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Videos(Video value) {
		this.videos = value;
	}
	
	private Video getORM_Videos() {
		return videos;
	}
	
	private void setORM_Imagen(java.util.Set value) {
		this.ORM_imagen = value;
	}
	
	private java.util.Set getORM_Imagen() {
		return ORM_imagen;
	}
	
	@Transient	
	public final ImagenSetCollection imagen = new ImagenSetCollection(this, _ormAdapter, ORMConstants.KEY_MENSAJE_IMAGEN, ORMConstants.KEY_IMAGEN_CONTIENE_IMAGEN, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Respondido_por(java.util.Set value) {
		this.ORM_respondido_por = value;
	}
	
	private java.util.Set getORM_Respondido_por() {
		return ORM_respondido_por;
	}
	
	@Transient	
	public final MensajeSetCollection respondido_por = new MensajeSetCollection(this, _ormAdapter, ORMConstants.KEY_MENSAJE_RESPONDIDO_POR, ORMConstants.KEY_MENSAJE_MENSAJES, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setMensaje_(Tema value) {
		if (mensaje_ != null) {
			mensaje_.compone.remove(this);
		}
		if (value != null) {
			value.compone.add(this);
		}
	}
	
	public Tema getMensaje_() {
		return mensaje_;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Mensaje_(Tema value) {
		this.mensaje_ = value;
	}
	
	private Tema getORM_Mensaje_() {
		return mensaje_;
	}
	
	private void setORM_Mensajes(java.util.Set value) {
		this.ORM_mensajes = value;
	}
	
	private java.util.Set getORM_Mensajes() {
		return ORM_mensajes;
	}
	
	@Transient	
	public final MensajeSetCollection mensajes = new MensajeSetCollection(this, _ormAdapter, ORMConstants.KEY_MENSAJE_MENSAJES, ORMConstants.KEY_MENSAJE_RESPONDIDO_POR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIdMensaje());
	}
	
}
