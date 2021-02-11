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
@Table(name="`Moderador`")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Moderador")
@PrimaryKeyJoinColumn(name="`UsuarioID`", referencedColumnName="`ID`")
public class Moderador extends Usuario implements Serializable {
	public Moderador() {
	}
	
	@Column(name="`IdMod`", nullable=true, length=20)	
	private Long idMod;
	
	public void setIdMod(long value) {
		setIdMod(new Long(value));
	}
	
	public void setIdMod(Long value) {
		this.idMod = value;
	}
	
	public Long getIdMod() {
		return idMod;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
