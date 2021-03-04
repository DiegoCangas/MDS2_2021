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

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="`Mensaje`")
public class Mensaje implements Serializable {
	public Mensaje() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_MENSAJE_RESPONDIDO_POR) {
			return ORM_respondido_por;
		}
		else if (key == ORMConstants.KEY_MENSAJE_REPORTES_MENSAJE) {
			return ORM_reportes_mensaje;
		}
		else if (key == ORMConstants.KEY_MENSAJE_MEDIA_MENSAJE) {
			return ORM_media_mensaje;
		}
		else if (key == ORMConstants.KEY_MENSAJE_GUSTAMENSAJE) {
			return ORM_gustaMensaje;
		}
		else if (key == ORMConstants.KEY_MENSAJE_RESPUESTA_DE) {
			return ORM_respuesta_de;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_MENSAJE_ENVIA_MENSAJE) {
			this.envia_mensaje = (Usuario) owner;
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
	
	@Column(name="`ID`", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="MENSAJE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MENSAJE_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`UsuarioID`", referencedColumnName="`ID`") }, foreignKey=@ForeignKey(name="FKMensaje983572"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Usuario envia_mensaje;
	
	@ManyToOne(targetEntity=Tema.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`TemaID`", referencedColumnName="`ID`") }, foreignKey=@ForeignKey(name="FKMensaje66743"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Tema mensaje_;
	
	@Column(name="`IdMensaje`", nullable=true, length=20)	
	private Long idMensaje;
	
	@Column(name="`Texto`", nullable=false, length=255)	
	private String texto;
	
	@Column(name="`NumeroMeGusta`", nullable=true, length=10)	
	private int numeroMeGusta;
	
	@Column(name="`NombreUsuario`", nullable=true, length=255)	
	private String nombreUsuario;
	
	@Column(name="`Marcado`", nullable=true, length=1)	
	private boolean marcado;
	
	@Column(name="`FechaCreacion`", nullable=true)	
	private Date fechaCreacion;
	
	@ManyToMany(targetEntity=Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="`Mensaje_Mensaje`", joinColumns={ @JoinColumn(name="`MensajeID2`") }, inverseJoinColumns={ @JoinColumn(name="`MensajeID`") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_respondido_por = new java.util.HashSet();
	
	@OneToMany(mappedBy="mensaje_reporte", targetEntity=Reporte.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_reportes_mensaje = new java.util.HashSet();
	
	@OneToMany(mappedBy="mensaje_media", targetEntity=Media_.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_media_mensaje = new java.util.HashSet();
	
	@ManyToMany(targetEntity=Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="`Usuario_Mensaje`", joinColumns={ @JoinColumn(name="`MensajeID`") }, inverseJoinColumns={ @JoinColumn(name="`UsuarioID`") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_gustaMensaje = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_respondido_por", targetEntity=Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_respuesta_de = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setIdMensaje(long value) {
		setIdMensaje(new Long(value));
	}
	
	public void setIdMensaje(Long value) {
		this.idMensaje = value;
	}
	
	public Long getIdMensaje() {
		return idMensaje;
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
	
	public void setFechaCreacion(Date value) {
		this.fechaCreacion = value;
	}
	
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	
	public void setEnvia_mensaje(Usuario value) {
		if (envia_mensaje != null) {
			envia_mensaje.pertenece.remove(this);
		}
		if (value != null) {
			value.pertenece.add(this);
		}
	}
	
	public Usuario getEnvia_mensaje() {
		return envia_mensaje;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Envia_mensaje(Usuario value) {
		this.envia_mensaje = value;
	}
	
	private Usuario getORM_Envia_mensaje() {
		return envia_mensaje;
	}
	
	private void setORM_Respondido_por(java.util.Set value) {
		this.ORM_respondido_por = value;
	}
	
	private java.util.Set getORM_Respondido_por() {
		return ORM_respondido_por;
	}
	
	@Transient	
	public final MensajeSetCollection respondido_por = new MensajeSetCollection(this, _ormAdapter, ORMConstants.KEY_MENSAJE_RESPONDIDO_POR, ORMConstants.KEY_MENSAJE_RESPUESTA_DE, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Reportes_mensaje(java.util.Set value) {
		this.ORM_reportes_mensaje = value;
	}
	
	private java.util.Set getORM_Reportes_mensaje() {
		return ORM_reportes_mensaje;
	}
	
	@Transient	
	public final ReporteSetCollection reportes_mensaje = new ReporteSetCollection(this, _ormAdapter, ORMConstants.KEY_MENSAJE_REPORTES_MENSAJE, ORMConstants.KEY_REPORTE_MENSAJE_REPORTE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Media_mensaje(java.util.Set value) {
		this.ORM_media_mensaje = value;
	}
	
	private java.util.Set getORM_Media_mensaje() {
		return ORM_media_mensaje;
	}
	
	@Transient	
	public final Media_SetCollection media_mensaje = new Media_SetCollection(this, _ormAdapter, ORMConstants.KEY_MENSAJE_MEDIA_MENSAJE, ORMConstants.KEY_MEDIA__MENSAJE_MEDIA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_GustaMensaje(java.util.Set value) {
		this.ORM_gustaMensaje = value;
	}
	
	private java.util.Set getORM_GustaMensaje() {
		return ORM_gustaMensaje;
	}
	
	@Transient	
	public final UsuarioSetCollection gustaMensaje = new UsuarioSetCollection(this, _ormAdapter, ORMConstants.KEY_MENSAJE_GUSTAMENSAJE, ORMConstants.KEY_USUARIO_MEGUSTA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
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
	
	private void setORM_Respuesta_de(java.util.Set value) {
		this.ORM_respuesta_de = value;
	}
	
	private java.util.Set getORM_Respuesta_de() {
		return ORM_respuesta_de;
	}
	
	@Transient	
	public final MensajeSetCollection respuesta_de = new MensajeSetCollection(this, _ormAdapter, ORMConstants.KEY_MENSAJE_RESPUESTA_DE, ORMConstants.KEY_MENSAJE_RESPONDIDO_POR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
