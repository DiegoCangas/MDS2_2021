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
@Table(name="`Reporte`")
public class Reporte implements Serializable {
	public Reporte() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_REPORTE_USUARIO_REPORTE) {
			this.usuario_reporte = (Usuario) owner;
		}
		
		else if (key == ORMConstants.KEY_REPORTE_MENSAJE_REPORTE) {
			this.mensaje_reporte = (Mensaje) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="`IdReporte`", nullable=false, length=20)	
	@Id	
	@GeneratedValue(generator="REPORTE_IDREPORTE_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="REPORTE_IDREPORTE_GENERATOR", strategy="native")	
	private Long idReporte;
	
	@ManyToOne(targetEntity=Mensaje.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`MensajeID`", referencedColumnName="`ID`") }, foreignKey=@ForeignKey(name="FKReporte746593"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Mensaje mensaje_reporte;
	
	@ManyToOne(targetEntity=Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`UsuarioID`", referencedColumnName="`ID`") }, foreignKey=@ForeignKey(name="FKReporte687794"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Usuario usuario_reporte;
	
	@Column(name="`Motivo`", nullable=false, length=255)	
	private String motivo;
	
	private void setIdReporte(long value) {
		setIdReporte(new Long(value));
	}
	
	private void setIdReporte(Long value) {
		this.idReporte = value;
	}
	
	public Long getIdReporte() {
		return idReporte;
	}
	
	public Long getORMID() {
		return getIdReporte();
	}
	
	public void setMotivo(String value) {
		this.motivo = value;
	}
	
	public String getMotivo() {
		return motivo;
	}
	
	public void setUsuario_reporte(Usuario value) {
		if (usuario_reporte != null) {
			usuario_reporte.reportes_usuario.remove(this);
		}
		if (value != null) {
			value.reportes_usuario.add(this);
		}
	}
	
	public Usuario getUsuario_reporte() {
		return usuario_reporte;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Usuario_reporte(Usuario value) {
		this.usuario_reporte = value;
	}
	
	private Usuario getORM_Usuario_reporte() {
		return usuario_reporte;
	}
	
	public void setMensaje_reporte(Mensaje value) {
		if (mensaje_reporte != null) {
			mensaje_reporte.reportes_mensaje.remove(this);
		}
		if (value != null) {
			value.reportes_mensaje.add(this);
		}
	}
	
	public Mensaje getMensaje_reporte() {
		return mensaje_reporte;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Mensaje_reporte(Mensaje value) {
		this.mensaje_reporte = value;
	}
	
	private Mensaje getORM_Mensaje_reporte() {
		return mensaje_reporte;
	}
	
	public String toString() {
		return String.valueOf(getIdReporte());
	}
	
}
