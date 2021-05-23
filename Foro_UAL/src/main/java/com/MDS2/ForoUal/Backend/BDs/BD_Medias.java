package com.MDS2.ForoUal.Backend.BDs;

import java.util.Vector;

import org.orm.PersistentException;

import com.MDS2.ForoUal.Backend.ORM.src.Media_;
import com.MDS2.ForoUal.Backend.ORM.src.Media_DAO;

public class BD_Medias {
	public BD_Principal _bd_main_medias;
	public Vector<Media_> _unnamed_Media__ = new Vector<Media_>();

	public Long Insertar_Media(String aUrl) {
		Media_ m = Media_DAO.createMedia_();
		m.setUrl(aUrl);
		try {
			Media_DAO.save(m);
			return ((Long)m.getORMID());
		} catch (PersistentException e) {
			return (long) -1;
		}
	}

	public Media_ Cargar_Media(Long aId) {
		try {
			return(Media_DAO.loadMedia_ByORMID(aId));
			
		} catch (PersistentException e) {
			return null;
		}
	}

	public int Tipo_Media(String aM) {
		String[] formatosImagen = new String[] {".jpg", ".png",".jpeg"};
		String[] formatoVideo = new String[] {".mp4",".avi",".mov"};
		
		for(String s : formatosImagen)
			if(aM.toLowerCase().contains(s)) return 0;
		for(String s : formatoVideo)
			if(aM.toLowerCase().contains(s)) return 1;
		return -1;
		
	}
}