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
@Table(name="`Media_`")
@Inheritance(strategy=InheritanceType.JOINED)
public class Media_ implements Serializable {
	public Media_() {
	}
	
	@Column(name="`ID`", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="MEDIA__IDMEDIA_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MEDIA__IDMEDIA_GENERATOR", strategy="identity")	
	private int IDmedia;
	
	@Column(name="`Url`", nullable=true, length=255)	
	private String url;
	
	private void setIDmedia(int value) {
		this.IDmedia = value;
	}
	
	public int getIDmedia() {
		return IDmedia;
	}
	
	public int getORMID() {
		return getIDmedia();
	}
	
	public void setUrl(String value) {
		this.url = value;
	}
	
	public String getUrl() {
		return url;
	}
	
	public String toString() {
		return String.valueOf(getIDmedia());
	}
	
}
