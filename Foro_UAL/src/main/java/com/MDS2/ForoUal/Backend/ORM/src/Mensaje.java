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
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="`Mensaje`")
public class Mensaje implements Serializable {
	public Mensaje() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == com.MDS2.ForoUal.Backend.ORM.src.ORMConstants.KEY_MENSAJE_RESPONDIDO_POR) {
			return ORM_respondido_por;
		}
		else if (key == com.MDS2.ForoUal.Backend.ORM.src.ORMConstants.KEY_MENSAJE_REPORTES_MENSAJE) {
			return ORM_reportes_mensaje;
		}
		else if (key == com.MDS2.ForoUal.Backend.ORM.src.ORMConstants.KEY_MENSAJE_MEDIA_MENSAJE) {
			return ORM_media_mensaje;
		}
		else if (key == com.MDS2.ForoUal.Backend.ORM.src.ORMConstants.KEY_MENSAJE_GUSTAMENSAJE) {
			return ORM_gustaMensaje;
		}
		else if (key == com.MDS2.ForoUal.Backend.ORM.src.ORMConstants.KEY_MENSAJE_RESPUESTA_DE) {
			return ORM_respuesta_de;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == com.MDS2.ForoUal.Backend.ORM.src.ORMConstants.KEY_MENSAJE_ENVIA_MENSAJE) {
			this.envia_mensaje = (com.MDS2.ForoUal.Backend.ORM.src.Usuario) owner;
		}
		
		else if (key == com.MDS2.ForoUal.Backend.ORM.src.ORMConstants.KEY_MENSAJE_MENSAJE_) {
			this.mensaje_ = (com.MDS2.ForoUal.Backend.ORM.src.Tema) owner;
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
	@GeneratedValue(generator="COM_MDS2_FOROUAL_BACKEND_ORM_SRC_MENSAJE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_MDS2_FOROUAL_BACKEND_ORM_SRC_MENSAJE_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=com.MDS2.ForoUal.Backend.ORM.src.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`UsuarioID`", referencedColumnName="`ID`") }, foreignKey=@ForeignKey(name="FKMensaje983572"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private com.MDS2.ForoUal.Backend.ORM.src.Usuario envia_mensaje;
	
	@ManyToOne(targetEntity=com.MDS2.ForoUal.Backend.ORM.src.Tema.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`TemaID`", referencedColumnName="`ID`") }, foreignKey=@ForeignKey(name="FKMensaje66743"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private com.MDS2.ForoUal.Backend.ORM.src.Tema mensaje_;
	
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
	@Temporal(TemporalType.DATE)	
	private java.util.Date fechaCreacion;
	
	@ManyToMany(targetEntity=com.MDS2.ForoUal.Backend.ORM.src.Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="`Mensaje_Mensaje`", joinColumns={ @JoinColumn(name="`MensajeID2`") }, inverseJoinColumns={ @JoinColumn(name="`MensajeID`") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_respondido_por = new java.util.HashSet();
	
	@OneToMany(mappedBy="mensaje_reporte", targetEntity=com.MDS2.ForoUal.Backend.ORM.src.Reporte.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_reportes_mensaje = new java.util.HashSet();
	
	@OneToMany(mappedBy="mensaje_media", targetEntity=com.MDS2.ForoUal.Backend.ORM.src.Media_.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_media_mensaje = new java.util.HashSet();
	
	@ManyToMany(targetEntity=com.MDS2.ForoUal.Backend.ORM.src.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="`Usuario_Mensaje`", joinColumns={ @JoinColumn(name="`MensajeID`") }, inverseJoinColumns={ @JoinColumn(name="`UsuarioID`") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_gustaMensaje = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_respondido_por", targetEntity=com.MDS2.ForoUal.Backend.ORM.src.Mensaje.class)	
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
	
	public void setFechaCreacion(java.util.Date value) {
		this.fechaCreacion = value;
	}
	
	public java.util.Date getFechaCreacion() {
		return fechaCreacion;
	}
	
	public void setEnvia_mensaje(com.MDS2.ForoUal.Backend.ORM.src.Usuario value) {
		if (envia_mensaje != null) {
			envia_mensaje.pertenece.remove(this);
		}
		if (value != null) {
			value.pertenece.add(this);
		}
	}
	
	public com.MDS2.ForoUal.Backend.ORM.src.Usuario getEnvia_mensaje() {
		return envia_mensaje;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Envia_mensaje(com.MDS2.ForoUal.Backend.ORM.src.Usuario value) {
		this.envia_mensaje = value;
	}
	
	private com.MDS2.ForoUal.Backend.ORM.src.Usuario getORM_Envia_mensaje() {
		return envia_mensaje;
	}
	
	private void setORM_Respondido_por(java.util.Set value) {
		this.ORM_respondido_por = value;
	}
	
	private java.util.Set getORM_Respondido_por() {
		return ORM_respondido_por;
	}
	
	@Transient	
	public final com.MDS2.ForoUal.Backend.ORM.src.MensajeSetCollection respondido_por = new com.MDS2.ForoUal.Backend.ORM.src.MensajeSetCollection(this, _ormAdapter, com.MDS2.ForoUal.Backend.ORM.src.ORMConstants.KEY_MENSAJE_RESPONDIDO_POR, com.MDS2.ForoUal.Backend.ORM.src.ORMConstants.KEY_MENSAJE_RESPUESTA_DE, com.MDS2.ForoUal.Backend.ORM.src.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Reportes_mensaje(java.util.Set value) {
		this.ORM_reportes_mensaje = value;
	}
	
	private java.util.Set getORM_Reportes_mensaje() {
		return ORM_reportes_mensaje;
	}
	
	@Transient	
	public final com.MDS2.ForoUal.Backend.ORM.src.ReporteSetCollection reportes_mensaje = new com.MDS2.ForoUal.Backend.ORM.src.ReporteSetCollection(this, _ormAdapter, com.MDS2.ForoUal.Backend.ORM.src.ORMConstants.KEY_MENSAJE_REPORTES_MENSAJE, com.MDS2.ForoUal.Backend.ORM.src.ORMConstants.KEY_REPORTE_MENSAJE_REPORTE, com.MDS2.ForoUal.Backend.ORM.src.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Media_mensaje(java.util.Set value) {
		this.ORM_media_mensaje = value;
	}
	
	private java.util.Set getORM_Media_mensaje() {
		return ORM_media_mensaje;
	}
	
	@Transient	
	public final com.MDS2.ForoUal.Backend.ORM.src.Media_SetCollection media_mensaje = new com.MDS2.ForoUal.Backend.ORM.src.Media_SetCollection(this, _ormAdapter, com.MDS2.ForoUal.Backend.ORM.src.ORMConstants.KEY_MENSAJE_MEDIA_MENSAJE, com.MDS2.ForoUal.Backend.ORM.src.ORMConstants.KEY_MEDIA__MENSAJE_MEDIA, com.MDS2.ForoUal.Backend.ORM.src.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_GustaMensaje(java.util.Set value) {
		this.ORM_gustaMensaje = value;
	}
	
	private java.util.Set getORM_GustaMensaje() {
		return ORM_gustaMensaje;
	}
	
	@Transient	
	public final com.MDS2.ForoUal.Backend.ORM.src.UsuarioSetCollection gustaMensaje = new com.MDS2.ForoUal.Backend.ORM.src.UsuarioSetCollection(this, _ormAdapter, com.MDS2.ForoUal.Backend.ORM.src.ORMConstants.KEY_MENSAJE_GUSTAMENSAJE, com.MDS2.ForoUal.Backend.ORM.src.ORMConstants.KEY_USUARIO_MEGUSTA, com.MDS2.ForoUal.Backend.ORM.src.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setMensaje_(com.MDS2.ForoUal.Backend.ORM.src.Tema value) {
		if (mensaje_ != null) {
			mensaje_.compone.remove(this);
		}
		if (value != null) {
			value.compone.add(this);
		}
	}
	
	public com.MDS2.ForoUal.Backend.ORM.src.Tema getMensaje_() {
		return mensaje_;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Mensaje_(com.MDS2.ForoUal.Backend.ORM.src.Tema value) {
		this.mensaje_ = value;
	}
	
	private com.MDS2.ForoUal.Backend.ORM.src.Tema getORM_Mensaje_() {
		return mensaje_;
	}
	
	private void setORM_Respuesta_de(java.util.Set value) {
		this.ORM_respuesta_de = value;
	}
	
	private java.util.Set getORM_Respuesta_de() {
		return ORM_respuesta_de;
	}
	
	@Transient	
	public final com.MDS2.ForoUal.Backend.ORM.src.MensajeSetCollection respuesta_de = new com.MDS2.ForoUal.Backend.ORM.src.MensajeSetCollection(this, _ormAdapter, com.MDS2.ForoUal.Backend.ORM.src.ORMConstants.KEY_MENSAJE_RESPUESTA_DE, com.MDS2.ForoUal.Backend.ORM.src.ORMConstants.KEY_MENSAJE_RESPONDIDO_POR, com.MDS2.ForoUal.Backend.ORM.src.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
