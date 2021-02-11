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
@Table(name="`Usuario`")
@Inheritance(strategy=InheritanceType.JOINED)
public class Usuario implements Serializable {
	public Usuario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USUARIO_REPORTES_USUARIO) {
			return ORM_reportes_usuario;
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
		else if (key == ORMConstants.KEY_USUARIO_NOTIFICACION_USUARIO) {
			return ORM_notificacion_usuario;
		}
		else if (key == ORMConstants.KEY_USUARIO_MEGUSTA) {
			return ORM_megusta;
		}
		else if (key == ORMConstants.KEY_USUARIO_MEGUSTA_TEMA) {
			return ORM_megusta_tema;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="`ID`", nullable=false, length=20)	
	@Id	
	@GeneratedValue(generator="USUARIO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="USUARIO_ID_GENERATOR", strategy="native")	
	private long ID;
	
	@Column(name="`Email`", nullable=false, length=255)	
	private String email;
	
	@Column(name="`NombreUsuario`", nullable=false, length=255)	
	private String nombreUsuario;
	
	@Column(name="`FotoPerfil`", nullable=true, length=255)	
	private String fotoPerfil;
	
	@Column(name="`Descripcion`", nullable=false, length=255)	
	private String descripcion;
	
	@Column(name="`Contrasenia`", nullable=false, length=255)	
	private String contrasenia;
	
	@Column(name="`Marcado`", nullable=true, length=1)	
	private boolean marcado;
	
	@Column(name="`Baneado`", nullable=true, length=1)	
	private boolean baneado;
	
	@Column(name="`IDusuario`", nullable=true, length=20)	
	private Long IDusuario;
	
	@Column(name="`NombreReal`", nullable=false, length=255)	
	private String nombreReal;
	
	@Column(name="`EsModerador`", nullable=false, length=1)	
	private boolean esModerador;
	
	@OneToMany(mappedBy="usuario_reporte", targetEntity=Reporte.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_reportes_usuario = new java.util.HashSet();
	
	@ManyToMany(targetEntity=Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="`Usuario_Usuario`", joinColumns={ @JoinColumn(name="`UsuarioID2`") }, inverseJoinColumns={ @JoinColumn(name="`UsuarioID`") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_amigo_de = new java.util.HashSet();
	
	@OneToMany(mappedBy="envia_mensaje", targetEntity=Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_pertenece = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_amigo_de", targetEntity=Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_usuarios = new java.util.HashSet();
	
	@OneToMany(mappedBy="crea_tema", targetEntity=Tema.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_creado = new java.util.HashSet();
	
	@OneToMany(mappedBy="usuario_ticket", targetEntity=Notificacion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_notificacion_usuario = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_gustaMensaje", targetEntity=Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_megusta = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_gustaTema", targetEntity=Tema.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_megusta_tema = new java.util.HashSet();
	
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
	
	public void setFotoPerfil(String value) {
		this.fotoPerfil = value;
	}
	
	public String getFotoPerfil() {
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
	
	public void setNombreReal(String value) {
		this.nombreReal = value;
	}
	
	public String getNombreReal() {
		return nombreReal;
	}
	
	public void setEsModerador(boolean value) {
		this.esModerador = value;
	}
	
	public boolean getEsModerador() {
		return esModerador;
	}
	
	private void setORM_Reportes_usuario(java.util.Set value) {
		this.ORM_reportes_usuario = value;
	}
	
	private java.util.Set getORM_Reportes_usuario() {
		return ORM_reportes_usuario;
	}
	
	@Transient	
	public final ReporteSetCollection reportes_usuario = new ReporteSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REPORTES_USUARIO, ORMConstants.KEY_REPORTE_USUARIO_REPORTE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Amigo_de(java.util.Set value) {
		this.ORM_amigo_de = value;
	}
	
	private java.util.Set getORM_Amigo_de() {
		return ORM_amigo_de;
	}
	
	@Transient	
	public final UsuarioSetCollection amigo_de = new UsuarioSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_AMIGO_DE, ORMConstants.KEY_USUARIO_USUARIOS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Pertenece(java.util.Set value) {
		this.ORM_pertenece = value;
	}
	
	private java.util.Set getORM_Pertenece() {
		return ORM_pertenece;
	}
	
	@Transient	
	public final MensajeSetCollection pertenece = new MensajeSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_PERTENECE, ORMConstants.KEY_MENSAJE_ENVIA_MENSAJE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
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
	public final TemaSetCollection es_creado = new TemaSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_ES_CREADO, ORMConstants.KEY_TEMA_CREA_TEMA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Notificacion_usuario(java.util.Set value) {
		this.ORM_notificacion_usuario = value;
	}
	
	private java.util.Set getORM_Notificacion_usuario() {
		return ORM_notificacion_usuario;
	}
	
	@Transient	
	public final NotificacionSetCollection notificacion_usuario = new NotificacionSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_NOTIFICACION_USUARIO, ORMConstants.KEY_NOTIFICACION_USUARIO_TICKET, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Megusta(java.util.Set value) {
		this.ORM_megusta = value;
	}
	
	private java.util.Set getORM_Megusta() {
		return ORM_megusta;
	}
	
	@Transient	
	public final MensajeSetCollection megusta = new MensajeSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_MEGUSTA, ORMConstants.KEY_MENSAJE_GUSTAMENSAJE, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Megusta_tema(java.util.Set value) {
		this.ORM_megusta_tema = value;
	}
	
	private java.util.Set getORM_Megusta_tema() {
		return ORM_megusta_tema;
	}
	
	@Transient	
	public final TemaSetCollection megusta_tema = new TemaSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_MEGUSTA_TEMA, ORMConstants.KEY_TEMA_GUSTATEMA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
