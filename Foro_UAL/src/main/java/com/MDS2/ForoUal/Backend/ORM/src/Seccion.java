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
@Table(name="`Seccion`")
public class Seccion implements Serializable {
	public Seccion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_SECCION_TEMAS) {
			return ORM_temas;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_SECCION_CREA) {
			this.crea = (Administrador) owner;
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
	@GeneratedValue(generator="SECCION_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="SECCION_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`AdministradorUsuarioID`", referencedColumnName="`UsuarioID`") }, foreignKey=@ForeignKey(name="FKSeccion97224"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Administrador crea;
	
	@Column(name="`IDseccion`", nullable=true, length=20)	
	private Long IDseccion;
	
	@Column(name="`Titulo`", nullable=false, length=255)	
	private String Titulo;
	
	@Column(name="`Subtitulo`", nullable=false, length=255)	
	private String subtitulo;
	
	@Column(name="`FechaCreacion`", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fechaCreacion;
	
	@Column(name="`NumMensajes`", nullable=true, length=10)	
	private int numMensajes;
	
	@Column(name="`Marcado`", nullable=true, length=1)	
	private boolean marcado;
	
	@OneToMany(mappedBy="contiene", targetEntity=Tema.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_temas = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setIDseccion(long value) {
		setIDseccion(new Long(value));
	}
	
	public void setIDseccion(Long value) {
		this.IDseccion = value;
	}
	
	public Long getIDseccion() {
		return IDseccion;
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
	
	public void setNumMensajes(int value) {
		this.numMensajes = value;
	}
	
	public int getNumMensajes() {
		return numMensajes;
	}
	
	public void setMarcado(boolean value) {
		this.marcado = value;
	}
	
	public boolean getMarcado() {
		return marcado;
	}
	
	private void setORM_Temas(java.util.Set value) {
		this.ORM_temas = value;
	}
	
	private java.util.Set getORM_Temas() {
		return ORM_temas;
	}
	
	@Transient	
	public final TemaSetCollection temas = new TemaSetCollection(this, _ormAdapter, ORMConstants.KEY_SECCION_TEMAS, ORMConstants.KEY_TEMA_CONTIENE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setCrea(Administrador value) {
		if (crea != null) {
			crea.es_creada.remove(this);
		}
		if (value != null) {
			value.es_creada.add(this);
		}
	}
	
	public Administrador getCrea() {
		return crea;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Crea(Administrador value) {
		this.crea = value;
	}
	
	private Administrador getORM_Crea() {
		return crea;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
