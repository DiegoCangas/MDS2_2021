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
@Table(name="`moderadorbd`")
public class Moderadores implements Serializable {
	public Moderadores() {
	}
	
	@Column(name="`ID`", nullable=false, length=20)	
	@Id	
	@GeneratedValue(generator="MODERADORES_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MODERADORES_ID_GENERATOR", strategy="native")	
	private long ID;
	
	private void setID(long value) {
		this.ID = value;
	}
	
	public long getID() {
		return ID;
	}
	
	public long getORMID() {
		return getID();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
