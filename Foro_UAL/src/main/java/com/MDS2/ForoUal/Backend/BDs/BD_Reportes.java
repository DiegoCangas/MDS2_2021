package com.MDS2.ForoUal.Backend.BDs;

import java.util.Vector;

import org.orm.PersistentException;

import com.MDS2.ForoUal.foroUI;
import com.MDS2.ForoUal.Backend.ORM.src.Mensaje;
import com.MDS2.ForoUal.Backend.ORM.src.MensajeDAO;
import com.MDS2.ForoUal.Backend.ORM.src.Reporte;
import com.MDS2.ForoUal.Backend.ORM.src.ReporteDAO;

public class BD_Reportes {
	public BD_Principal _bd_main_reportes;
	public Vector<ReporteDAO> _unnamed_Reporte_ = new Vector<ReporteDAO>();

	public Reporte Crear_Reporte(int aIdMensaje, String aMensaje) {
		Mensaje m = null;
		try {
			m = MensajeDAO.getMensajeByORMID(aIdMensaje);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(m==null) return null;
		m.setMarcado(true);
		Reporte r = ReporteDAO.createReporte();
		r.setMensaje_reporte(m);
		r.setMotivo(aMensaje);
		r.setUsuario_reporte(foroUI.user);
		try {
			MensajeDAO.save(m);
			ReporteDAO.save(r);
			return r;
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public Reporte Cargar_Reporte (int aId) {
		try {
			return ReporteDAO.loadReporteByQuery("MensajeID = " + aId, null);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public void Eliminar_Reporte(int aIdReporte) {
		throw new UnsupportedOperationException();
	}
}