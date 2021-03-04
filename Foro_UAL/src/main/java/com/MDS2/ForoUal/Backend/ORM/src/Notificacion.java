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
@Table(name="`Notificacion`")
public class Notificacion implements Serializable {
	public Notificacion() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_NOTIFICACION_USUARIO_TICKET) {
			this.usuario_ticket = (Usuario) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="`Idnotificacion`", nullable=false, length=20)	
	@Id	
	@GeneratedValue(generator="NOTIFICACION_IDNOTIFICACION_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="NOTIFICACION_IDNOTIFICACION_GENERATOR", strategy="native")	
	private Long idnotificacion;
	
	@ManyToOne(targetEntity=Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`UsuarioID`", referencedColumnName="`ID`") }, foreignKey=@ForeignKey(name="FKNotificaci72175"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Usuario usuario_ticket;
	
	@Column(name="`Mensaje`", nullable=false, length=255)	
	private String mensaje;
	
	private void setIdnotificacion(long value) {
		setIdnotificacion(new Long(value));
	}
	
	private void setIdnotificacion(Long value) {
		this.idnotificacion = value;
	}
	
	public Long getIdnotificacion() {
		return idnotificacion;
	}
	
	public Long getORMID() {
		return getIdnotificacion();
	}
	
	public void setMensaje(String value) {
		this.mensaje = value;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	public void setUsuario_ticket(Usuario value) {
		if (usuario_ticket != null) {
			usuario_ticket.notificacion_usuario.remove(this);
		}
		if (value != null) {
			value.notificacion_usuario.add(this);
		}
	}
	
	public Usuario getUsuario_ticket() {
		return usuario_ticket;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Usuario_ticket(Usuario value) {
		this.usuario_ticket = value;
	}
	
	private Usuario getORM_Usuario_ticket() {
		return usuario_ticket;
	}
	
	public String toString() {
		return String.valueOf(getIdnotificacion());
	}
	
}
