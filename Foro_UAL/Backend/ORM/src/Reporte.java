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
@Table(name="`Reporte`")
public class Reporte implements Serializable {
	public Reporte() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_REPORTE_USUARIO) {
			this.usuario = (Usuario) owner;
		}
		
		else if (key == ORMConstants.KEY_REPORTE_ES_REPORTADO) {
			this.es_reportado = (Mensaje) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="`ID`", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="REPORTE_IDREPORTE_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="REPORTE_IDREPORTE_GENERATOR", strategy="identity")	
	private int idReporte;
	
	@ManyToOne(targetEntity=Mensaje.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`MensajeID`", referencedColumnName="`ID`") }, foreignKey=@ForeignKey(name="FKReporte746593"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Mensaje es_reportado;
	
	@ManyToOne(targetEntity=Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`UsuarioID`", referencedColumnName="`ID`", nullable=false) }, foreignKey=@ForeignKey(name="FKReporte687794"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private Usuario usuario;
	
	@Column(name="`Motivo`", nullable=true, length=255)	
	private String motivo;
	
	private void setIdReporte(int value) {
		this.idReporte = value;
	}
	
	public int getIdReporte() {
		return idReporte;
	}
	
	public int getORMID() {
		return getIdReporte();
	}
	
	public void setMotivo(String value) {
		this.motivo = value;
	}
	
	public String getMotivo() {
		return motivo;
	}
	
	public void setUsuario(Usuario value) {
		if (usuario != null) {
			usuario.reportes.remove(this);
		}
		if (value != null) {
			value.reportes.add(this);
		}
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Usuario(Usuario value) {
		this.usuario = value;
	}
	
	private Usuario getORM_Usuario() {
		return usuario;
	}
	
	public void setEs_reportado(Mensaje value) {
		if (es_reportado != null) {
			es_reportado.corresponden.remove(this);
		}
		if (value != null) {
			value.corresponden.add(this);
		}
	}
	
	public Mensaje getEs_reportado() {
		return es_reportado;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Es_reportado(Mensaje value) {
		this.es_reportado = value;
	}
	
	private Mensaje getORM_Es_reportado() {
		return es_reportado;
	}
	
	public String toString() {
		return String.valueOf(getIdReporte());
	}
	
}
