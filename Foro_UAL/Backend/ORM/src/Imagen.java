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
@Table(name="`Imagen`")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Imagen")
@PrimaryKeyJoinColumn(name="`MediaID`", referencedColumnName="`ID`")
public class Imagen extends Media_ implements Serializable {
	public Imagen() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_IMAGEN_CONTIENE_IMAGEN) {
			return ORM_contiene_imagen;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="`TamanoKB`", nullable=false, length=10)	
	private int tamanoKB;
	
	@ManyToMany(mappedBy="ORM_imagen", targetEntity=Mensaje.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contiene_imagen = new java.util.HashSet();
	
	public void setTamanoKB(int value) {
		this.tamanoKB = value;
	}
	
	public int getTamanoKB() {
		return tamanoKB;
	}
	
	private void setORM_Contiene_imagen(java.util.Set value) {
		this.ORM_contiene_imagen = value;
	}
	
	private java.util.Set getORM_Contiene_imagen() {
		return ORM_contiene_imagen;
	}
	
	@Transient	
	public final MensajeSetCollection contiene_imagen = new MensajeSetCollection(this, _ormAdapter, ORMConstants.KEY_IMAGEN_CONTIENE_IMAGEN, ORMConstants.KEY_MENSAJE_IMAGEN, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
